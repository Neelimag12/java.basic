package com.training.CG.dp;

public abstract class ShapeDecorator implements Shape {
	protected Shape decoratedShape;
	
	public ShapeDecorator(Shape DecoratedShape) {
		this.decoratedShape=decoratedShape;
	}
	public void draw() {
		decoratedShape.draw();
	}
	

}
