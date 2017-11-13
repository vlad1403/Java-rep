package ru.java_2_2;

import java.util.Scanner;

public class Program {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println ("Please, enter the figure: 1 - rectangle, 2 - square, 3 - triangle, 4 - circle");
		String figure = sc.nextLine();
		
		Template tm;
		
		if (figure.equals("1")) {
			tm = new Rectangle();
			tm.areaperimetr();
		}
		if (figure.equals("2")) {
			tm = new Square();
			tm.areaperimetr();
		}
		if (figure.equals("3")) {
			tm = new Triangle();
			tm.areaperimetr();
		}
		if (figure.equals("4")) {
			tm = new Circle();
			tm.areaperimetr();
		}
	}
}
