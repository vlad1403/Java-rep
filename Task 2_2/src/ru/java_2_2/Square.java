package ru.java_2_2;

import java.util.Scanner;

public class Square extends Rectangle implements Template {

	@Override
	public int areaperimetr () {
		Scanner scanner = new Scanner (System.in);
		System.out.println ("Please, enter X coordinate left bottom point");
		String x1s = scanner.nextLine();
		System.out.println ("Please, enter Y coordinate left bottom point");
		String y1s = scanner.nextLine();
		System.out.println ("Please, enter X coordinate left top point");
		String x2s = scanner.nextLine();
		System.out.println ("Please, enter Y coordinate left top point");
		String y2s = scanner.nextLine();
		System.out.println ("Please, enter the X coordinate of right top point");
		String x3s = scanner.nextLine();
		System.out.println ("Please, enter the Y coordinate of right top point");
		String y3s = scanner.nextLine();
		System.out.println ("Please, enter the X coordinate of right bottom point");
		String x4s = scanner.nextLine();
		System.out.println ("Please, enter the Y coordinate of right bottom point");
		String y4s = scanner.nextLine();
		
		int x1 = Integer.parseInt(x1s);
		int y1 = Integer.parseInt(y1s);
		int x2 = Integer.parseInt(x2s);
		int y2 = Integer.parseInt(y2s);
		int x3 = Integer.parseInt(x3s);
		int y3 = Integer.parseInt(y3s);
		int x4 = Integer.parseInt(x4s);
		int y4 = Integer.parseInt(y4s);
		double resultA, resultP, side1, side2, side3, side4, s1, s2, s3, s4; 
		
		s1 = ((y2-y1)*(y2-y1)) + ((x2-x1)*(x2-x1));
		s2 = ((y3-y2)*(y3-y2)) + ((x3-x2)*(x3-x2));
		s3 = ((y4-y3)*(y4-y3)) + ((x4-x3)*(x4-x3));
		s4 = ((y1-y4)*(y1-y4)) + ((x1-x4)*(x1-x4));
		side1 = Math.sqrt(s1);
		//side2 = Math.sqrt(s2);
		//side3 = Math.sqrt(s2);
		//side4 = Math.sqrt(s4);
		resultA = side1 * side1;
		resultP = side1 * 4;
        System.out.println ("Area is = " + resultA + "." + " Perimetr is = " + resultP);
		return 0;
	}
}
