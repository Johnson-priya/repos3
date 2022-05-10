package com.cg.Collection;

import java.util.Objects;

public class Marksheet {
	float eng;
	float sci;
	float maths;
	

	
	@Override
	public String toString() {
		return "Marksheet [eng=" + eng + ", sci=" + sci + ", maths=" + maths + "]";
	}

	public Marksheet(float eng, float sci, float maths) {
		super();
		this.eng = eng;
		this.sci = sci;
		this.maths = maths;
	}

	public float getEng() {
		return eng;
	}

	public void setEng(float eng) {
		this.eng = eng;
	}

	public float getSci() {
		return sci;
	}

	public void setSci(float sci) {
		this.sci = sci;
	}

	public float getMaths() {
		return maths;
	}

	public void setMaths(float maths) {
		this.maths = maths;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
