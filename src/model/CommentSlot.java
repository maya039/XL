package model;

import expr.Environment;

public class CommentSlot implements Slot {
	private String txt;
	
	//TODO ska man lägga till en '#' när man kallar toString eller ska den finnas med i txt-String:en hela tiden?
	public CommentSlot(String txt) {
		this.txt = txt;
	}

	public double value(Environment env) {
		return 0;
	}
	
	public String toString(Environment env) {
		return txt;
	}
	
	public String editorString(){
		return "#" + txt;
	}
}
