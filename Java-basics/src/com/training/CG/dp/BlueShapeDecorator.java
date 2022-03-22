package com.training.CG.dp;

public abstract class BlueShapeDecorator extends ShapeDecorator{

	public BlueShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
		
	}
	public void draw() {
		decoratedShape.draw();
		setBlueBorder(decoratedShape);
	}
	private void setBlueBorder(Shape decoratedShape) {
		System.out.println("Shape border color: Blue");
	}
	

}
