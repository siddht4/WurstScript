//generated by parseq
package de.peeeq.wurstscript.ast;

public interface FuncSignature extends AstElement {
	AstElement getParent();
	void setSource(WPos source);
	WPos getSource();
	void setName(String name);
	String getName();
	void setParameters(WParameters parameters);
	WParameters getParameters();
	void setTyp(OptTypeExpr typ);
	OptTypeExpr getTyp();
	FuncSignature copy();
	public abstract void accept(WPackage.Visitor v);
	public abstract void accept(NativeFunc.Visitor v);
	public abstract void accept(NameDef.Visitor v);
	public abstract void accept(ClassMember.Visitor v);
	public abstract void accept(WEntities.Visitor v);
	public abstract void accept(TopLevelDeclaration.Visitor v);
	public abstract void accept(WScope.Visitor v);
	public abstract void accept(ClassSlots.Visitor v);
	public abstract void accept(ClassDef.Visitor v);
	public abstract void accept(WEntity.Visitor v);
	public abstract void accept(JassToplevelDeclaration.Visitor v);
	public abstract void accept(ClassSlot.Visitor v);
	public abstract void accept(FunctionDefinition.Visitor v);
	public abstract void accept(TypeDef.Visitor v);
	public abstract void accept(FuncDef.Visitor v);
	public abstract void accept(PackageOrGlobal.Visitor v);
	public abstract void accept(AstElementWithModifier.Visitor v);
	public abstract void accept(FuncSignature.Visitor v);
	public abstract void accept(CompilationUnit.Visitor v);
	public interface Visitor {
		void visit(ExprNewObject exprNewObject);
		void visit(OpDivInt opDivInt);
		void visit(NoTypeExpr noTypeExpr);
		void visit(ExprFunctionCall exprFunctionCall);
		void visit(WParameters wParameters);
		void visit(ExprBinary exprBinary);
		void visit(ExprBoolVal exprBoolVal);
		void visit(ExprNull exprNull);
		void visit(ExprIntVal exprIntVal);
		void visit(OpMult opMult);
		void visit(ExprFuncRef exprFuncRef);
		void visit(ExprVarArrayAccess exprVarArrayAccess);
		void visit(OpLess opLess);
		void visit(OpOr opOr);
		void visit(OpNot opNot);
		void visit(ExprUnary exprUnary);
		void visit(OpLessEq opLessEq);
		void visit(ExprThis exprThis);
		void visit(OpEquals opEquals);
		void visit(OpModReal opModReal);
		void visit(WPos wPos);
		void visit(OpDivReal opDivReal);
		void visit(OpAnd opAnd);
		void visit(TypeExpr typeExpr);
		void visit(OpGreaterEq opGreaterEq);
		void visit(ExprMemberMethod exprMemberMethod);
		void visit(ExprCast exprCast);
		void visit(Indexes indexes);
		void visit(ArraySizes arraySizes);
		void visit(OpModInt opModInt);
		void visit(OpUnequals opUnequals);
		void visit(FuncSignature funcSignature);
		void visit(ExprRealVal exprRealVal);
		void visit(ExprMemberArrayVar exprMemberArrayVar);
		void visit(ExprVarAccess exprVarAccess);
		void visit(ExprStringVal exprStringVal);
		void visit(WParameter wParameter);
		void visit(ExprMemberVar exprMemberVar);
		void visit(Arguments arguments);
		void visit(OpGreater opGreater);
		void visit(OpPlus opPlus);
		void visit(OpMinus opMinus);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(ExprNewObject exprNewObject) {}
		@Override public void visit(OpDivInt opDivInt) {}
		@Override public void visit(NoTypeExpr noTypeExpr) {}
		@Override public void visit(ExprFunctionCall exprFunctionCall) {}
		@Override public void visit(WParameters wParameters) {}
		@Override public void visit(ExprBinary exprBinary) {}
		@Override public void visit(ExprBoolVal exprBoolVal) {}
		@Override public void visit(ExprNull exprNull) {}
		@Override public void visit(ExprIntVal exprIntVal) {}
		@Override public void visit(OpMult opMult) {}
		@Override public void visit(ExprFuncRef exprFuncRef) {}
		@Override public void visit(ExprVarArrayAccess exprVarArrayAccess) {}
		@Override public void visit(OpLess opLess) {}
		@Override public void visit(OpOr opOr) {}
		@Override public void visit(OpNot opNot) {}
		@Override public void visit(ExprUnary exprUnary) {}
		@Override public void visit(OpLessEq opLessEq) {}
		@Override public void visit(ExprThis exprThis) {}
		@Override public void visit(OpEquals opEquals) {}
		@Override public void visit(OpModReal opModReal) {}
		@Override public void visit(WPos wPos) {}
		@Override public void visit(OpDivReal opDivReal) {}
		@Override public void visit(OpAnd opAnd) {}
		@Override public void visit(TypeExpr typeExpr) {}
		@Override public void visit(OpGreaterEq opGreaterEq) {}
		@Override public void visit(ExprMemberMethod exprMemberMethod) {}
		@Override public void visit(ExprCast exprCast) {}
		@Override public void visit(Indexes indexes) {}
		@Override public void visit(ArraySizes arraySizes) {}
		@Override public void visit(OpModInt opModInt) {}
		@Override public void visit(OpUnequals opUnequals) {}
		@Override public void visit(FuncSignature funcSignature) {}
		@Override public void visit(ExprRealVal exprRealVal) {}
		@Override public void visit(ExprMemberArrayVar exprMemberArrayVar) {}
		@Override public void visit(ExprVarAccess exprVarAccess) {}
		@Override public void visit(ExprStringVal exprStringVal) {}
		@Override public void visit(WParameter wParameter) {}
		@Override public void visit(ExprMemberVar exprMemberVar) {}
		@Override public void visit(Arguments arguments) {}
		@Override public void visit(OpGreater opGreater) {}
		@Override public void visit(OpPlus opPlus) {}
		@Override public void visit(OpMinus opMinus) {}
	}
}
