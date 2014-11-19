package model;

import expr.Environment;
import expr.Expr;

public class ExprSlot implements Slot {
	private Expr e;
	
	public ExprSlot(Expr e) {
		this.e = e;
	}
	
	@Override
	public double value(Environment env) {
		try {
			return e.value(env);
		} catch (XLException e) {
			throw e;
		}
	}

	@Override
	public String toString(Environment env) throws XLException {
		return "" + value(env);
	}
	
	public String editorString(Environment env) throws XLException {
		return e.toString();
	}
}
