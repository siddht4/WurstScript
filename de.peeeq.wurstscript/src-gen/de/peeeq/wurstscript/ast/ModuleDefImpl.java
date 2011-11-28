//generated by parseq
package de.peeeq.wurstscript.ast;

class ModuleDefImpl implements ModuleDef, AstElementIntern {
	ModuleDefImpl(WPos source, Modifiers modifiers, String name, ClassSlots slots) {
		if (source == null) throw new IllegalArgumentException();
		((AstElementIntern)source).setParent(this);
		this.source = source;
		if (modifiers == null) throw new IllegalArgumentException();
		((AstElementIntern)modifiers).setParent(this);
		this.modifiers = modifiers;
		if (name == null) throw new IllegalArgumentException();
		this.name = name;
		if (slots == null) throw new IllegalArgumentException();
		((AstElementIntern)slots).setParent(this);
		this.slots = slots;
	}

	private AstElement parent;
	public AstElement getParent() { return parent; }
	public void setParent(AstElement parent) {
		if (parent != null && this.parent != null) { 			throw new Error("Parent of " + this + " already set: " + this.parent + "\ntried to change to " + parent); 		}
		this.parent = parent;
	}

	private WPos source;
	public void setSource(WPos source) {
		if (source == null) throw new IllegalArgumentException();
		((AstElementIntern)this.source).setParent(null);
		((AstElementIntern)source).setParent(this);
		this.source = source;
	} 
	public WPos getSource() { return source; }

	private Modifiers modifiers;
	public void setModifiers(Modifiers modifiers) {
		if (modifiers == null) throw new IllegalArgumentException();
		((AstElementIntern)this.modifiers).setParent(null);
		((AstElementIntern)modifiers).setParent(this);
		this.modifiers = modifiers;
	} 
	public Modifiers getModifiers() { return modifiers; }

	private String name;
	public void setName(String name) {
		if (name == null) throw new IllegalArgumentException();
		this.name = name;
	} 
	public String getName() { return name; }

	private ClassSlots slots;
	public void setSlots(ClassSlots slots) {
		if (slots == null) throw new IllegalArgumentException();
		((AstElementIntern)this.slots).setParent(null);
		((AstElementIntern)slots).setParent(this);
		this.slots = slots;
	} 
	public ClassSlots getSlots() { return slots; }

	public AstElement get(int i) {
		switch (i) {
			case 0: return source;
			case 1: return modifiers;
			case 2: return slots;
			default: throw new IllegalArgumentException("Index out of range: " + i);
		}
	}
	public int size() {
		return 3;
	}
	public ModuleDef copy() {
		return new ModuleDefImpl(source.copy(), modifiers.copy(), name, slots.copy());
	}
	@Override public void accept(WScope.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		slots.accept(v);
		v.visit(this);
	}
	@Override public void accept(WEntities.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		slots.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassOrModule.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		slots.accept(v);
		v.visit(this);
	}
	@Override public void accept(TopLevelDeclaration.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		slots.accept(v);
		v.visit(this);
	}
	@Override public void accept(CompilationUnit.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		slots.accept(v);
		v.visit(this);
	}
	@Override public void accept(NameDef.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		slots.accept(v);
		v.visit(this);
	}
	@Override public void accept(ModuleDef.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		slots.accept(v);
		v.visit(this);
	}
	@Override public void accept(WEntity.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		slots.accept(v);
		v.visit(this);
	}
	@Override public void accept(PackageOrGlobal.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		slots.accept(v);
		v.visit(this);
	}
	@Override public void accept(WPackage.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		slots.accept(v);
		v.visit(this);
	}
	@Override public <T> T match(NameDef.Matcher<T> matcher) {
		return matcher.case_ModuleDef(this);
	}
	@Override public void match(NameDef.MatcherVoid matcher) {
		matcher.case_ModuleDef(this);
	}

	@Override public <T> T match(WEntity.Matcher<T> matcher) {
		return matcher.case_ModuleDef(this);
	}
	@Override public void match(WEntity.MatcherVoid matcher) {
		matcher.case_ModuleDef(this);
	}

	@Override public <T> T match(WScope.Matcher<T> matcher) {
		return matcher.case_ModuleDef(this);
	}
	@Override public void match(WScope.MatcherVoid matcher) {
		matcher.case_ModuleDef(this);
	}

	@Override public <T> T match(ClassOrModule.Matcher<T> matcher) {
		return matcher.case_ModuleDef(this);
	}
	@Override public void match(ClassOrModule.MatcherVoid matcher) {
		matcher.case_ModuleDef(this);
	}

	@Override public String toString() {
		return "ModuleDef(" + source + ", " +modifiers + ", " +name + ", " +slots+")";
	}
	private boolean attr_attrScopeNames_isCached = false;
	private java.util.Map<String, NameDef> attr_attrScopeNames_cache;
	public java.util.Map<String, NameDef> attrScopeNames() {
		if (!attr_attrScopeNames_isCached) {
			attr_attrScopeNames_cache = de.peeeq.wurstscript.attributes.AttrScopeNames.calculate(this);
			attr_attrScopeNames_isCached = true;
		}
		return attr_attrScopeNames_cache;
	}
	private boolean attr_attrScopePackageNames_isCached = false;
	private java.util.Map<String, NameDef> attr_attrScopePackageNames_cache;
	public java.util.Map<String, NameDef> attrScopePackageNames() {
		if (!attr_attrScopePackageNames_isCached) {
			attr_attrScopePackageNames_cache = de.peeeq.wurstscript.attributes.AttrScopeNames.calculatePackage(this);
			attr_attrScopePackageNames_isCached = true;
		}
		return attr_attrScopePackageNames_cache;
	}
	private boolean attr_attrScopePublicNames_isCached = false;
	private java.util.Map<String, NameDef> attr_attrScopePublicNames_cache;
	public java.util.Map<String, NameDef> attrScopePublicNames() {
		if (!attr_attrScopePublicNames_isCached) {
			attr_attrScopePublicNames_cache = de.peeeq.wurstscript.attributes.AttrScopeNames.calculatePublic(this);
			attr_attrScopePublicNames_isCached = true;
		}
		return attr_attrScopePublicNames_cache;
	}
	private boolean attr_attrScopePublicReadNamess_isCached = false;
	private java.util.Map<String, NameDef> attr_attrScopePublicReadNamess_cache;
	public java.util.Map<String, NameDef> attrScopePublicReadNamess() {
		if (!attr_attrScopePublicReadNamess_isCached) {
			attr_attrScopePublicReadNamess_cache = de.peeeq.wurstscript.attributes.AttrScopeNames.calculatePublicRead(this);
			attr_attrScopePublicReadNamess_isCached = true;
		}
		return attr_attrScopePublicReadNamess_cache;
	}
	private boolean attr_attrScopeFunctions_isCached = false;
	private com.google.common.collect.Multimap<String, de.peeeq.wurstscript.attributes.FuncDefInstance> attr_attrScopeFunctions_cache;
	public com.google.common.collect.Multimap<String, de.peeeq.wurstscript.attributes.FuncDefInstance> attrScopeFunctions() {
		if (!attr_attrScopeFunctions_isCached) {
			attr_attrScopeFunctions_cache = de.peeeq.wurstscript.attributes.AttrScopeFunctions.calculate(this);
			attr_attrScopeFunctions_isCached = true;
		}
		return attr_attrScopeFunctions_cache;
	}
	private boolean attr_attrScopePackageFunctions_isCached = false;
	private com.google.common.collect.Multimap<String, de.peeeq.wurstscript.attributes.FuncDefInstance> attr_attrScopePackageFunctions_cache;
	public com.google.common.collect.Multimap<String, de.peeeq.wurstscript.attributes.FuncDefInstance> attrScopePackageFunctions() {
		if (!attr_attrScopePackageFunctions_isCached) {
			attr_attrScopePackageFunctions_cache = de.peeeq.wurstscript.attributes.AttrScopeFunctions.calculatePackage(this);
			attr_attrScopePackageFunctions_isCached = true;
		}
		return attr_attrScopePackageFunctions_cache;
	}
	private boolean attr_attrScopePublicFunctions_isCached = false;
	private com.google.common.collect.Multimap<String, de.peeeq.wurstscript.attributes.FuncDefInstance> attr_attrScopePublicFunctions_cache;
	public com.google.common.collect.Multimap<String, de.peeeq.wurstscript.attributes.FuncDefInstance> attrScopePublicFunctions() {
		if (!attr_attrScopePublicFunctions_isCached) {
			attr_attrScopePublicFunctions_cache = de.peeeq.wurstscript.attributes.AttrScopeFunctions.calculatePublic(this);
			attr_attrScopePublicFunctions_isCached = true;
		}
		return attr_attrScopePublicFunctions_cache;
	}
	private boolean attr_attrTyp_isCached = false;
	private de.peeeq.wurstscript.types.PscriptType attr_attrTyp_cache;
	public de.peeeq.wurstscript.types.PscriptType attrTyp() {
		if (!attr_attrTyp_isCached) {
			attr_attrTyp_cache = de.peeeq.wurstscript.attributes.AttrVarDefType.calculate(this);
			attr_attrTyp_isCached = true;
		}
		return attr_attrTyp_cache;
	}
	private boolean attr_attrNearestPackage_isCached = false;
	private PackageOrGlobal attr_attrNearestPackage_cache;
	public PackageOrGlobal attrNearestPackage() {
		if (!attr_attrNearestPackage_isCached) {
			attr_attrNearestPackage_cache = de.peeeq.wurstscript.attributes.AttrNearestPackage.calculate(this);
			attr_attrNearestPackage_isCached = true;
		}
		return attr_attrNearestPackage_cache;
	}
	private boolean attr_attrNearestFuncDef_isCached = false;
	private FuncDef attr_attrNearestFuncDef_cache;
	public FuncDef attrNearestFuncDef() {
		if (!attr_attrNearestFuncDef_isCached) {
			attr_attrNearestFuncDef_cache = de.peeeq.wurstscript.attributes.AttrNearestFuncDef.calculate(this);
			attr_attrNearestFuncDef_isCached = true;
		}
		return attr_attrNearestFuncDef_cache;
	}
	private boolean attr_attrNearestClassDef_isCached = false;
	private ClassDef attr_attrNearestClassDef_cache;
	public ClassDef attrNearestClassDef() {
		if (!attr_attrNearestClassDef_isCached) {
			attr_attrNearestClassDef_cache = de.peeeq.wurstscript.attributes.AttrNearestClassDef.calculate(this);
			attr_attrNearestClassDef_isCached = true;
		}
		return attr_attrNearestClassDef_cache;
	}
	private boolean attr_attrNearestClassOrModule_isCached = false;
	private ClassOrModule attr_attrNearestClassOrModule_cache;
	public ClassOrModule attrNearestClassOrModule() {
		if (!attr_attrNearestClassOrModule_isCached) {
			attr_attrNearestClassOrModule_cache = de.peeeq.wurstscript.attributes.AttrNearestClassDef.nearestClassOrModule(this);
			attr_attrNearestClassOrModule_isCached = true;
		}
		return attr_attrNearestClassOrModule_cache;
	}
	private boolean attr_attrAllFunctions_isCached = false;
	private com.google.common.collect.Multimap<String, de.peeeq.wurstscript.attributes.FuncDefInstance> attr_attrAllFunctions_cache;
	public com.google.common.collect.Multimap<String, de.peeeq.wurstscript.attributes.FuncDefInstance> attrAllFunctions() {
		if (!attr_attrAllFunctions_isCached) {
			attr_attrAllFunctions_cache = de.peeeq.wurstscript.attributes.AttrAllFunctions.calculate(this);
			attr_attrAllFunctions_isCached = true;
		}
		return attr_attrAllFunctions_cache;
	}
	private boolean attr_attrUsedModules_isCached = false;
	private java.util.Collection<ModuleDef> attr_attrUsedModules_cache;
	public java.util.Collection<ModuleDef> attrUsedModules() {
		if (!attr_attrUsedModules_isCached) {
			attr_attrUsedModules_cache = de.peeeq.wurstscript.attributes.AttrUsedModules.calculate(this);
			attr_attrUsedModules_isCached = true;
		}
		return attr_attrUsedModules_cache;
	}
}
