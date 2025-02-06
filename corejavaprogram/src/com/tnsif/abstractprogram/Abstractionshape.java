package com.tnsif.abstractprogram;

public abstract class Abstractionshape {
	protected float area;
	abstract void calarea();
	void show() {
		System.out.println("area of shape"+area);
	}

}
