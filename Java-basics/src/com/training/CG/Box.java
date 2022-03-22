package com.training.CG;

public class Box {
	int ln,bd,hg;
	Box(int l,int b,int h){
		this.ln=l;
		this.bd=b;
	    this.hg=h;
	}
	Box(Box bx){
		this.ln=bx.ln;
		this.bd=bx.bd;
		this.hg=bx.hg;
		
	}
	int volume() {
		int volume=ln*bd*hg;
		return volume;
	}

}
