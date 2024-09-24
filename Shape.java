package Oops;

import java.util.Scanner;

abstract class Shape{
//	public Shape(double raduis, double pi) {
//	}

	abstract void calculateArea();
}

class Circle extends Shape{
	double radius;
	final double pi = 3.14159; 
	
	Circle(double raduis){
		this.radius=raduis;
	}
	
	@Override
	void calculateArea() {
		double Area = pi * radius * radius;
		System.out.println("The Area of the Triangle: "+ Area);
	}
	
}

class Recatangle extends Shape{
	int length;
	int width;
	
	Recatangle(int length,int width){
		this.length=length;
		this.width=width;
	}
	
	@Override
	void calculateArea() {
		double RArea = length * width;
		System.out.println("The Area of the Rectangle: "+ RArea);
	}
}

class Triangle extends Shape{
	int base;
	int height;
	
	Triangle(int base,int height){
		this.base=base;
		this.height=height;
	}
	
	void calculateArea() {
		double TArea = 0.5 * base * height;
		System.out.println("Area of the Triagnle: "+TArea);
	}
	
}

class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Calculating the Area of the Circle");
		System.out.println("                       ");
		System.out.print("Enter the Raduis: ");
		int r = sc.nextInt();
		Circle c = new Circle(r);
		c.calculateArea();
		
		System.out.println("                       ");
		System.out.println("2.Calculating the Area of the Rectangle");
		System.out.print("Enter the legth: ");
		int le = sc.nextInt();
		
		System.out.print("Enter the Width: ");
		int ba = sc.nextInt();
		Recatangle rec = new Recatangle(le,ba);
		rec.calculateArea();
		
		System.out.println("                       ");
		System.out.println("3.Calculating the Area of the Triangle");
		System.out.print("Enter the base: ");
		int baseing = sc.nextInt();
		System.out.print("Enter the Height: ");
		int hei = sc.nextInt();
		Triangle t = new Triangle(baseing, hei);
		t.calculateArea();
	}

}
