//generated by parseq
package de.peeeq.wurstscript.jassAst;

class JassExprVarAccessImpl implements JassExprVarAccess, JassAstElementIntern {
	JassExprVarAccessImpl(String varName) {
		if (varName == null) throw new IllegalArgumentException();
		this.varName = varName;
	}

	private JassAstElement parent;
	public JassAstElement getParent() { return parent; }
	public void setParent(JassAstElement parent) {
		if (parent != null && this.parent != null) { 			throw new Error("Parent of " + this + " already set: " + this.parent + "\ntried to change to " + parent); 		}
		this.parent = parent;
	}

	private String varName;
	public void setVarName(String varName) {
		if (varName == null) throw new IllegalArgumentException();
		this.varName = varName;
	} 
	public String getVarName() { return varName; }

	public JassAstElement get(int i) {
		switch (i) {
			default: throw new IllegalArgumentException("Index out of range: " + i);
		}
	}
	public int size() {
		return 0;
	}
	public JassExprVarAccess copy() {
		return new JassExprVarAccessImpl(varName);
	}
	@Override public void accept(JassStmtLoop.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassStatements.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassExprAtomic.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassExprVarAccess.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassExpr.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassExprBinary.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassStmtSet.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassExprFunctionCall.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassProg.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassExprUnary.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassExprlist.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassFunction.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassStmtSetArray.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassExprVarArrayAccess.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassStatement.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassFunctions.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassStmtReturn.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassStmtIf.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassStmtExitwhen.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassStmtCall.Visitor v) {
		v.visit(this);
	}
	@Override public <T> T match(JassExprAtomic.Matcher<T> matcher) {
		return matcher.case_JassExprVarAccess(this);
	}
	@Override public void match(JassExprAtomic.MatcherVoid matcher) {
		matcher.case_JassExprVarAccess(this);
	}

	@Override public <T> T match(JassExpr.Matcher<T> matcher) {
		return matcher.case_JassExprVarAccess(this);
	}
	@Override public void match(JassExpr.MatcherVoid matcher) {
		matcher.case_JassExprVarAccess(this);
	}

	@Override public String toString() {
		return "JassExprVarAccess(" + varName+")";
	}
}
