//generated by parseq
package de.peeeq.wurstscript.ast;

public interface TopLevelDeclaration extends AstElement{
	AstElement getParent();
	<T> T match(Matcher<T> s);
	void match(MatcherVoid s);
	public interface Matcher<T> {
		T case_JassGlobalBlock(JassGlobalBlock jassGlobalBlock);
		T case_WPackage(WPackage wPackage);
		T case_NativeFunc(NativeFunc nativeFunc);
		T case_FuncDef(FuncDef funcDef);
		T case_NativeType(NativeType nativeType);
	}

	public interface MatcherVoid {
		void case_JassGlobalBlock(JassGlobalBlock jassGlobalBlock);
		void case_WPackage(WPackage wPackage);
		void case_NativeFunc(NativeFunc nativeFunc);
		void case_FuncDef(FuncDef funcDef);
		void case_NativeType(NativeType nativeType);
	}

	TopLevelDeclaration copy();
	public abstract void accept(WScope.Visitor v);
	public abstract void accept(TopLevelDeclaration.Visitor v);
	public abstract void accept(CompilationUnit.Visitor v);
	public abstract void accept(PackageOrGlobal.Visitor v);
	public interface Visitor {
		void visit(ExprStringVal exprStringVal);
		void visit(ClassSlots classSlots);
		void visit(LocalVarDef localVarDef);
		void visit(NoTypeExpr noTypeExpr);
		void visit(OpGreaterEq opGreaterEq);
		void visit(OpEquals opEquals);
		void visit(FuncDef funcDef);
		void visit(ExprMemberMethod exprMemberMethod);
		void visit(GlobalVarDef globalVarDef);
		void visit(ArraySizes arraySizes);
		void visit(StmtSet stmtSet);
		void visit(ExprFunctionCall exprFunctionCall);
		void visit(ExprVarAccess exprVarAccess);
		void visit(WEntities wEntities);
		void visit(JassGlobalBlock jassGlobalBlock);
		void visit(OnDestroyDef onDestroyDef);
		void visit(StmtIf stmtIf);
		void visit(WParameter wParameter);
		void visit(ModuleUse moduleUse);
		void visit(ExprVarArrayAccess exprVarArrayAccess);
		void visit(NativeFunc nativeFunc);
		void visit(ExprBoolVal exprBoolVal);
		void visit(OpLess opLess);
		void visit(ExprIntVal exprIntVal);
		void visit(StmtReturn stmtReturn);
		void visit(ModOverride modOverride);
		void visit(ExprRealVal exprRealVal);
		void visit(OpModInt opModInt);
		void visit(StmtWhile stmtWhile);
		void visit(ExprThis exprThis);
		void visit(ModStatic modStatic);
		void visit(ConstructorDef constructorDef);
		void visit(VisibilityPrivate visibilityPrivate);
		void visit(WPos wPos);
		void visit(OpLessEq opLessEq);
		void visit(OpPlus opPlus);
		void visit(OpDivReal opDivReal);
		void visit(ClassDef classDef);
		void visit(OpMinus opMinus);
		void visit(ExprFuncRef exprFuncRef);
		void visit(ModuleDef moduleDef);
		void visit(WParameters wParameters);
		void visit(VisibilityPublicread visibilityPublicread);
		void visit(OpOr opOr);
		void visit(ExprBinary exprBinary);
		void visit(OpMult opMult);
		void visit(OpNot opNot);
		void visit(WImports wImports);
		void visit(StmtLoop stmtLoop);
		void visit(StmtErr stmtErr);
		void visit(InitBlock initBlock);
		void visit(ExprCast exprCast);
		void visit(OpAnd opAnd);
		void visit(OpUnequals opUnequals);
		void visit(FuncSignature funcSignature);
		void visit(WStatements wStatements);
		void visit(OpAssign opAssign);
		void visit(NativeType nativeType);
		void visit(ExprUnary exprUnary);
		void visit(NoExpr noExpr);
		void visit(StmtExitwhen stmtExitwhen);
		void visit(ExprNull exprNull);
		void visit(VisibilityProtected visibilityProtected);
		void visit(Arguments arguments);
		void visit(TypeExpr typeExpr);
		void visit(WPackage wPackage);
		void visit(ExprMemberVar exprMemberVar);
		void visit(VisibilityDefault visibilityDefault);
		void visit(VisibilityPublic visibilityPublic);
		void visit(WImport wImport);
		void visit(Indexes indexes);
		void visit(StmtDestroy stmtDestroy);
		void visit(ExprNewObject exprNewObject);
		void visit(OpGreater opGreater);
		void visit(OpModReal opModReal);
		void visit(OpDivInt opDivInt);
		void visit(ExprMemberArrayVar exprMemberArrayVar);
		void visit(Modifiers modifiers);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(ExprStringVal exprStringVal) {}
		@Override public void visit(ClassSlots classSlots) {}
		@Override public void visit(LocalVarDef localVarDef) {}
		@Override public void visit(NoTypeExpr noTypeExpr) {}
		@Override public void visit(OpGreaterEq opGreaterEq) {}
		@Override public void visit(OpEquals opEquals) {}
		@Override public void visit(FuncDef funcDef) {}
		@Override public void visit(ExprMemberMethod exprMemberMethod) {}
		@Override public void visit(GlobalVarDef globalVarDef) {}
		@Override public void visit(ArraySizes arraySizes) {}
		@Override public void visit(StmtSet stmtSet) {}
		@Override public void visit(ExprFunctionCall exprFunctionCall) {}
		@Override public void visit(ExprVarAccess exprVarAccess) {}
		@Override public void visit(WEntities wEntities) {}
		@Override public void visit(JassGlobalBlock jassGlobalBlock) {}
		@Override public void visit(OnDestroyDef onDestroyDef) {}
		@Override public void visit(StmtIf stmtIf) {}
		@Override public void visit(WParameter wParameter) {}
		@Override public void visit(ModuleUse moduleUse) {}
		@Override public void visit(ExprVarArrayAccess exprVarArrayAccess) {}
		@Override public void visit(NativeFunc nativeFunc) {}
		@Override public void visit(ExprBoolVal exprBoolVal) {}
		@Override public void visit(OpLess opLess) {}
		@Override public void visit(ExprIntVal exprIntVal) {}
		@Override public void visit(StmtReturn stmtReturn) {}
		@Override public void visit(ModOverride modOverride) {}
		@Override public void visit(ExprRealVal exprRealVal) {}
		@Override public void visit(OpModInt opModInt) {}
		@Override public void visit(StmtWhile stmtWhile) {}
		@Override public void visit(ExprThis exprThis) {}
		@Override public void visit(ModStatic modStatic) {}
		@Override public void visit(ConstructorDef constructorDef) {}
		@Override public void visit(VisibilityPrivate visibilityPrivate) {}
		@Override public void visit(WPos wPos) {}
		@Override public void visit(OpLessEq opLessEq) {}
		@Override public void visit(OpPlus opPlus) {}
		@Override public void visit(OpDivReal opDivReal) {}
		@Override public void visit(ClassDef classDef) {}
		@Override public void visit(OpMinus opMinus) {}
		@Override public void visit(ExprFuncRef exprFuncRef) {}
		@Override public void visit(ModuleDef moduleDef) {}
		@Override public void visit(WParameters wParameters) {}
		@Override public void visit(VisibilityPublicread visibilityPublicread) {}
		@Override public void visit(OpOr opOr) {}
		@Override public void visit(ExprBinary exprBinary) {}
		@Override public void visit(OpMult opMult) {}
		@Override public void visit(OpNot opNot) {}
		@Override public void visit(WImports wImports) {}
		@Override public void visit(StmtLoop stmtLoop) {}
		@Override public void visit(StmtErr stmtErr) {}
		@Override public void visit(InitBlock initBlock) {}
		@Override public void visit(ExprCast exprCast) {}
		@Override public void visit(OpAnd opAnd) {}
		@Override public void visit(OpUnequals opUnequals) {}
		@Override public void visit(FuncSignature funcSignature) {}
		@Override public void visit(WStatements wStatements) {}
		@Override public void visit(OpAssign opAssign) {}
		@Override public void visit(NativeType nativeType) {}
		@Override public void visit(ExprUnary exprUnary) {}
		@Override public void visit(NoExpr noExpr) {}
		@Override public void visit(StmtExitwhen stmtExitwhen) {}
		@Override public void visit(ExprNull exprNull) {}
		@Override public void visit(VisibilityProtected visibilityProtected) {}
		@Override public void visit(Arguments arguments) {}
		@Override public void visit(TypeExpr typeExpr) {}
		@Override public void visit(WPackage wPackage) {}
		@Override public void visit(ExprMemberVar exprMemberVar) {}
		@Override public void visit(VisibilityDefault visibilityDefault) {}
		@Override public void visit(VisibilityPublic visibilityPublic) {}
		@Override public void visit(WImport wImport) {}
		@Override public void visit(Indexes indexes) {}
		@Override public void visit(StmtDestroy stmtDestroy) {}
		@Override public void visit(ExprNewObject exprNewObject) {}
		@Override public void visit(OpGreater opGreater) {}
		@Override public void visit(OpModReal opModReal) {}
		@Override public void visit(OpDivInt opDivInt) {}
		@Override public void visit(ExprMemberArrayVar exprMemberArrayVar) {}
		@Override public void visit(Modifiers modifiers) {}
	}
}
