package entities;

import interfaces.Shape;

public class Rectangle implements Shape {
	
	private Double width;
	private Double heigh;
	
	
	public Rectangle(Double width, Double heigh) {
		this.width = width;
		this.heigh = heigh;
	}


	public Double getWidth() {
		return width;
	}


	public void setWidth(Double width) {
		this.width = width;
	}


	public Double getHeigh() {
		return heigh;
	}


	public void setHeigh(Double heigh) {
		this.heigh = heigh;
	}


	@Override
	public double area() {
		return width * heigh;
	}
	
	

}
