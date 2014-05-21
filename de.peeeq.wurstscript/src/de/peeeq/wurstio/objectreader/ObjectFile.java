package de.peeeq.wurstio.objectreader;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

import de.peeeq.wurstscript.WLogger;

public class ObjectFile {

	private ObjectFileType fileType;
	private ObjectTable origTable;
	private ObjectTable modifiedTable;
	private int version;

	public ObjectFileType getFileType() {
		return fileType;
	}

	public ObjectTable getOrigTable() {
		return origTable;
	}

	public ObjectTable getModifiedTable() {
		return modifiedTable;
	}

	public ObjectFile(File file, ObjectFileType fileType) throws FileNotFoundException {
		this(new BinaryDataInputStream(file, true), fileType);
	}
	
	public ObjectFile(byte[] w3_, ObjectFileType filetype) {
		this(new BinaryDataInputStream(new ByteArrayInputStream(w3_), true), filetype);
	}
	
	private ObjectFile(BinaryDataInputStream in, ObjectFileType fileType) {
		this.fileType = fileType;
		try {
			version = in.readInt();

			this.origTable = ObjectTable.readFromStream(in, fileType);
			this.modifiedTable = ObjectTable.readFromStream(in, fileType);
		} catch (FileNotFoundException e) {
			WLogger.severe(e);
			throw new Error(e);
		} catch (IOException e) {
			WLogger.severe(e);
			throw new Error(e);
		} finally {
			if (in != null) {
				in.close();
			}
		}
	}

	public ObjectFile(ObjectFileType fileType) {
		this.fileType = fileType;
		version = 2;
		origTable = new ObjectTable(fileType);
		modifiedTable = new ObjectTable(fileType);
	}

	

	public void writeTo(File file) {
		try (BinaryDataOutputStream out = new BinaryDataOutputStream(file, true)) {
			writeTo(out);
		} catch (IOException e) {
			WLogger.severe(e);
			throw new Error(e);
		}
	}
	
	public byte[] writeToByteArray() {
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		try (BinaryDataOutputStream out = new BinaryDataOutputStream(os, true)) {
			writeTo(out);
			return os.toByteArray();
		} catch (IOException e) {
			WLogger.severe(e);
			throw new Error(e);
		}
	}

	public void writeTo(BinaryDataOutputStream out) throws IOException {
		out.writeInt(version);
		this.origTable.writeToStream(out, fileType);
		this.modifiedTable.writeToStream(out, fileType);
		out.flush();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("version = " + version + "\n");
		sb.append(" original Table(modified standard units):\n");
		sb.append("##################\n");
		origTable.prettyPrint(sb);
		sb.append(" modified Table(newly created unit):\n");
		sb.append("##################\n");
		modifiedTable.prettyPrint(sb);
		
		return sb.toString();
	}

	
	public void exportToWurst(Appendable out, ObjectFileType fileType ) throws IOException {
		out.append("package WurstExportedObjects_"+ fileType.getExt() +"\n");
		out.append("import ObjEditingNatives\n\n");
//		out.append("//origTable: \n\n");
//		origTable.exportToWurst(out);
		out.append("//modifiedTable: \n\n");
		modifiedTable.exportToWurst(out);
	}
	

	public String exportToWurst(ObjectFileType fileType) {
		StringBuilder sb = new StringBuilder();
		try {
			exportToWurst(sb, fileType);
		} catch (IOException e) {
			WLogger.severe(e);
		}
		return sb.toString();
	}
	
	public boolean isEmpty() {
		return origTable.isEmpty() && modifiedTable.isEmpty();
	}
	
}
