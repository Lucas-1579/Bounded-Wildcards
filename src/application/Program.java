package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import interfaces.Shape;

public class Program {

	public static void main(String[] args) {
		
		List<Shape> myShape = new ArrayList<>();
		myShape.add(new Rectangle(2.0, 3.0));
		myShape.add(new Circle(2.0));
		
		List<Circle> myCircle = new ArrayList<>();
		myCircle.add(new Circle(2.0));
		myCircle.add(new Circle(3.0));
		
		//para o metodo calcArea receber a list do tipo Circle, temos que aplicar o coringa.
		System.out.println("Total area: " + calcArea(myCircle));

	}
		//metodo auxiliar para calcular a soma das areas.
	public static double calcArea(List<? extends Shape> list) {
		double sum = 0.0;
		for(Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
