package ru.java_2_2;

import java.util.Scanner;

public class Triangle implements Template {

	@Override
	public int areaperimetr () {
		Scanner scanner = new Scanner (System.in);
		System.out.println ("Please, enter X coordinate left bottom point");
		String x1s = scanner.nextLine();
		System.out.println ("Please, enter Y coordinate left bottom point");
		String y1s = scanner.nextLine();
		System.out.println ("Please, enter the X coordinate of top point");
		String x2s = scanner.nextLine();
		System.out.println ("Please, enter the Y coordinate of top point");
		String y2s = scanner.nextLine();
		System.out.println ("Please, enter the X coordinate of right bottom point");
		String x3s = scanner.nextLine();
		System.out.println ("Please, enter the Y coordinate of right bottom point");
		String y3s = scanner.nextLine();
		
		int x1 = Integer.parseInt(x1s);
		int y1 = Integer.parseInt(y1s);
		int x2 = Integer.parseInt(x2s);
		int y2 = Integer.parseInt(y2s);
		int x3 = Integer.parseInt(x3s);
		int y3 = Integer.parseInt(y3s);
		int st = 2;
		double resultA, resultP, side1, side2, side3, s1, s2, s3, s1x, s1y, s2x, s2y, s3x, s3y, p, helpvar, area2;
		
		s1x = Math.pow((x2-x1),st);
		s1y = Math.pow((y2-y1), st);
		s1 = s1x * s1y;
		//s1 = ((y2-y1)*(y2-y1)) + ((x2-x1)*(x2-x1));
		s2x = Math.pow((x3-x2), st);
		s2y = Math.pow((y3-y2), st);
		s2 = s2x * s2y;
		//s2 = ((y3-y2)*(y3-y2)) + ((x3-x2)*(x3-x2));
		s3x = Math.pow((x3-x1), st);
		s3y = Math.pow((y3-y1), st);
		s3 = s3x * s3y;
		//s3 = ((y3-y1)*(y3-y1)) + ((x3-x1)*(x3-x1));
		side1 = Math.sqrt(s1);
		side2 = Math.sqrt(s2);
		side3 = Math.sqrt(s3);
		resultP = side1 +side2 +side3;	
		p = 0.5 * resultP;
		//helpvar = (x2-x1)*(y3-y1) - (x3-x1)*(y2-y1);
		//resultA = Math.abs(helpvar);
		area2 = p * (p - side1) * (p - side2) * (p - side3);
		resultA = Math.sqrt(area2);
        System.out.println ("Area is = " + resultA + "." + " Perimetr is = " + resultP);
        return 0;
	}
}
