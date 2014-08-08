package de.peeeq.wurstscript.types;

import java.util.Collections;
import java.util.Map;

import de.peeeq.wurstscript.ast.AstElement;
import de.peeeq.wurstscript.ast.TypeParamDef;
import de.peeeq.wurstscript.jassIm.ImExprOpt;
import de.peeeq.wurstscript.jassIm.ImType;
import de.peeeq.wurstscript.jassIm.JassIm;

public final class WurstTypeFreeTypeParam extends WurstType {

	private TypeLink<TypeParamDef> def;

	public WurstTypeFreeTypeParam(TypeParamDef t) {
		this.def = TypeLink.to(t);
	}

	@Override
	public boolean isSubtypeOfIntern(WurstType other, AstElement location) {
		if (other instanceof WurstTypeFreeTypeParam) {
			WurstTypeFreeTypeParam other2 = (WurstTypeFreeTypeParam) other;
			return other2.def == this.def;
		}
		return false;
	}

	@Override
	public String getName() {
		return def.getName();
	}

	@Override
	public String getFullName() {
		return getName() + " (free type parameter)";
	}

	@Override
	public Map<TypeParamDef, WurstType> getTypeArgBinding(AstElement loc) {
		return Collections.emptyMap();
	}

	@Override
	public WurstType setTypeArgs(Map<TypeParamDef, WurstType> typeParamBounds) {
		if (typeParamBounds.containsKey(def)) {
			WurstType t = typeParamBounds.get(def);
			return new WurstTypeBoundTypeParam(def, t);
		} 
		return this;
	}

	@Override
	public ImType imTranslateType(AstElement location) {
		return TypesHelper.imInt();
	}

	@Override
	public ImExprOpt getDefaultValue(AstElement location) {
		return JassIm.ImNull();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((def == null) ? 0 : def.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WurstTypeFreeTypeParam other = (WurstTypeFreeTypeParam) obj;
		if (def == null) {
			if (other.def != null)
				return false;
		} else if (!def.equals(other.def))
			return false;
		return true;
	}
	
	
	
	
}
