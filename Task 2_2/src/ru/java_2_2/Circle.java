package ru.java_2_2;

import java.util.Scanner;

public class Circle implements Template {

	@Override
	public int areaperimetr () {
		Scanner scanner = new Scanner (System.in);
		System.out.println ("Please, enter X coordinate of centre");
		String x1s = scanner.nextLine();
		System.out.println ("Please, enter Y coordinate centre");
		String y1s = scanner.nextLine();
		System.out.println ("Please, enter the X coordinate of point on circle");
		String x2s = scanner.nextLine();
		System.out.println ("Please, enter the Y coordinate of point on circle");
		String y2s = scanner.nextLine();
		
		int x1 = Integer.parseInt(x1s);
		int y1 = Integer.parseInt(y1s);
		int x2 = Integer.parseInt(x2s);
		int y2 = Integer.parseInt(y2s);
		int st = 2;
		double resultA, radius, resultP, sx, sy;
		
		sx = Math.pow((x2-x1), st);
		sy = Math.pow((y1-y2), st);
		radius = Math.sqrt(sx*sy);
		//side1a = ((x2-x1)*(x2-x1));
		//side1 = Math.abs(((x2-x1)*(x2-x1)));
		//side2a = ((y1-y2)*(y2-y1));
		//side2 = Math.abs(((y1-y2)*(y2-y1)));
		//radius = Math.sqrt(side1 * side2);
        resultA = Math.PI * radius * radius;
        resultP = 2 * Math.PI * radius;
        System.out.println ("Area is = " + resultA + "." + " Perimetr is = " + resultP);
		return 0;
	}
}
