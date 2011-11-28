//generated by parseq
package de.peeeq.wurstscript.ast;

public interface OpBinary extends AstElement, Op{
	AstElement getParent();
	<T> T match(Matcher<T> s);
	void match(MatcherVoid s);
	public interface Matcher<T> {
		T case_OpMinus(OpMinus opMinus);
		T case_OpModInt(OpModInt opModInt);
		T case_OpLessEq(OpLessEq opLessEq);
		T case_OpOr(OpOr opOr);
		T case_OpPlus(OpPlus opPlus);
		T case_OpMult(OpMult opMult);
		T case_OpDivReal(OpDivReal opDivReal);
		T case_OpGreaterEq(OpGreaterEq opGreaterEq);
		T case_OpGreater(OpGreater opGreater);
		T case_OpAnd(OpAnd opAnd);
		T case_OpEquals(OpEquals opEquals);
		T case_OpLess(OpLess opLess);
		T case_OpModReal(OpModReal opModReal);
		T case_OpUnequals(OpUnequals opUnequals);
		T case_OpDivInt(OpDivInt opDivInt);
	}

	public interface MatcherVoid {
		void case_OpMinus(OpMinus opMinus);
		void case_OpModInt(OpModInt opModInt);
		void case_OpLessEq(OpLessEq opLessEq);
		void case_OpOr(OpOr opOr);
		void case_OpPlus(OpPlus opPlus);
		void case_OpMult(OpMult opMult);
		void case_OpDivReal(OpDivReal opDivReal);
		void case_OpGreaterEq(OpGreaterEq opGreaterEq);
		void case_OpGreater(OpGreater opGreater);
		void case_OpAnd(OpAnd opAnd);
		void case_OpEquals(OpEquals opEquals);
		void case_OpLess(OpLess opLess);
		void case_OpModReal(OpModReal opModReal);
		void case_OpUnequals(OpUnequals opUnequals);
		void case_OpDivInt(OpDivInt opDivInt);
	}

	OpBinary copy();
	public abstract void accept(TypeRef.Visitor v);
	public abstract void accept(ClassSlots.Visitor v);
	public abstract void accept(LocalVarDef.Visitor v);
	public abstract void accept(Expr.Visitor v);
	public abstract void accept(WScope.Visitor v);
	public abstract void accept(ExprMemberMethod.Visitor v);
	public abstract void accept(FuncDef.Visitor v);
	public abstract void accept(GlobalVarDef.Visitor v);
	public abstract void accept(ClassMember.Visitor v);
	public abstract void accept(ArraySizes.Visitor v);
	public abstract void accept(StmtCall.Visitor v);
	public abstract void accept(StmtSet.Visitor v);
	public abstract void accept(ExprFunctionCall.Visitor v);
	public abstract void accept(WEntities.Visitor v);
	public abstract void accept(JassGlobalBlock.Visitor v);
	public abstract void accept(OnDestroyDef.Visitor v);
	public abstract void accept(ClassOrModule.Visitor v);
	public abstract void accept(VarDef.Visitor v);
	public abstract void accept(StmtIf.Visitor v);
	public abstract void accept(WParameter.Visitor v);
	public abstract void accept(ExprVarArrayAccess.Visitor v);
	public abstract void accept(NativeFunc.Visitor v);
	public abstract void accept(StmtReturn.Visitor v);
	public abstract void accept(ExprAssignable.Visitor v);
	public abstract void accept(NameRef.Visitor v);
	public abstract void accept(TopLevelDeclaration.Visitor v);
	public abstract void accept(StmtWhile.Visitor v);
	public abstract void accept(JassToplevelDeclaration.Visitor v);
	public abstract void accept(CompilationUnit.Visitor v);
	public abstract void accept(Op.Visitor v);
	public abstract void accept(OpBinary.Visitor v);
	public abstract void accept(TypeDef.Visitor v);
	public abstract void accept(ConstructorDef.Visitor v);
	public abstract void accept(FunctionDefinition.Visitor v);
	public abstract void accept(FuncRef.Visitor v);
	public abstract void accept(NameDef.Visitor v);
	public abstract void accept(WStatement.Visitor v);
	public abstract void accept(ClassDef.Visitor v);
	public abstract void accept(ModuleDef.Visitor v);
	public abstract void accept(WParameters.Visitor v);
	public abstract void accept(ExprBinary.Visitor v);
	public abstract void accept(WEntity.Visitor v);
	public abstract void accept(PackageOrGlobal.Visitor v);
	public abstract void accept(StmtLoop.Visitor v);
	public abstract void accept(ExprCast.Visitor v);
	public abstract void accept(InitBlock.Visitor v);
	public abstract void accept(FuncSignature.Visitor v);
	public abstract void accept(OptExpr.Visitor v);
	public abstract void accept(WStatements.Visitor v);
	public abstract void accept(NativeType.Visitor v);
	public abstract void accept(OptTypeExpr.Visitor v);
	public abstract void accept(ExprAtomic.Visitor v);
	public abstract void accept(ExprUnary.Visitor v);
	public abstract void accept(ClassSlot.Visitor v);
	public abstract void accept(StmtExitwhen.Visitor v);
	public abstract void accept(Arguments.Visitor v);
	public abstract void accept(TypeExpr.Visitor v);
	public abstract void accept(WPackage.Visitor v);
	public abstract void accept(ExprMemberVar.Visitor v);
	public abstract void accept(Indexes.Visitor v);
	public abstract void accept(StmtDestroy.Visitor v);
	public abstract void accept(ExprNewObject.Visitor v);
	public abstract void accept(AstElementWithModifier.Visitor v);
	public abstract void accept(ExprMemberArrayVar.Visitor v);
	public interface Visitor {
		void visit(OpMinus opMinus);
		void visit(OpModInt opModInt);
		void visit(OpLessEq opLessEq);
		void visit(OpOr opOr);
		void visit(OpPlus opPlus);
		void visit(OpMult opMult);
		void visit(OpDivReal opDivReal);
		void visit(OpGreaterEq opGreaterEq);
		void visit(OpGreater opGreater);
		void visit(OpLess opLess);
		void visit(OpModReal opModReal);
		void visit(OpAnd opAnd);
		void visit(OpEquals opEquals);
		void visit(OpUnequals opUnequals);
		void visit(OpDivInt opDivInt);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(OpMinus opMinus) {}
		@Override public void visit(OpModInt opModInt) {}
		@Override public void visit(OpLessEq opLessEq) {}
		@Override public void visit(OpOr opOr) {}
		@Override public void visit(OpPlus opPlus) {}
		@Override public void visit(OpMult opMult) {}
		@Override public void visit(OpDivReal opDivReal) {}
		@Override public void visit(OpGreaterEq opGreaterEq) {}
		@Override public void visit(OpGreater opGreater) {}
		@Override public void visit(OpLess opLess) {}
		@Override public void visit(OpModReal opModReal) {}
		@Override public void visit(OpAnd opAnd) {}
		@Override public void visit(OpEquals opEquals) {}
		@Override public void visit(OpUnequals opUnequals) {}
		@Override public void visit(OpDivInt opDivInt) {}
	}
}
