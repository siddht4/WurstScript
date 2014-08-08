package de.peeeq.wurstscript.attributes;

import java.util.Collection;
import java.util.Map;

import org.eclipse.jdt.annotation.Nullable;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;

import de.peeeq.wurstscript.ast.AstElement;
import de.peeeq.wurstscript.ast.ClassDef;
import de.peeeq.wurstscript.ast.CompilationUnit;
import de.peeeq.wurstscript.ast.InterfaceDef;
import de.peeeq.wurstscript.ast.TypeExpr;
import de.peeeq.wurstscript.ast.TypeParamDef;
import de.peeeq.wurstscript.types.WurstType;
import de.peeeq.wurstscript.types.WurstTypeInterface;
import de.peeeq.wurstscript.utils.Utils;

public class InterfaceInstances {

	public static Multimap<InterfaceDef, ClassDef> getInterfaceInstances(CompilationUnit cu) {
		Multimap<InterfaceDef, ClassDef> result = HashMultimap.create();
		for (ClassDef c : cu.attrGetByType().classes) {
			for (WurstTypeInterface i : c.attrImplementedInterfaces()) {
				result.put(i.getDef(cu), c);
			}
		}
		return result;
	}

	public static Collection<WurstTypeInterface> getImplementedInterfaces(ClassDef c) {
		Collection<WurstTypeInterface> result = Lists.newArrayList();
		for (TypeExpr t : c.getImplementsList()) {
			addInterface(result, t, null, t);
		}
		return result;
	}

	public static Collection<WurstTypeInterface> getExtendedInterfaces(InterfaceDef in) {
		Collection<WurstTypeInterface> result = Lists.newArrayList();
		for (TypeExpr t : in.getExtendsList()) {
			addInterface(result, t, in, t);
		}
		return result;
	}
	
	private static void addInterface(Collection<WurstTypeInterface> result, TypeExpr t, @Nullable InterfaceDef in, AstElement location) {
		if (t.attrTyp() instanceof WurstTypeInterface) {
			WurstTypeInterface i = (WurstTypeInterface) t.attrTyp();
			if (i.getDef(location) == in) {
				t.addError("Interfaces must not extend themselves.");
				return;
			}
			result.add(i);
			Map<TypeParamDef, WurstType> typeParamBounds = i.getTypeArgBinding(location);
			for (WurstTypeInterface i2 : i.getDef(location).attrExtendedInterfaces()) {
				result.add((WurstTypeInterface) i2.setTypeArgs(typeParamBounds));
			}
			
		} else {
			t.addError(Utils.printElement(t) + " is not an interface.");
		}
	}

}
