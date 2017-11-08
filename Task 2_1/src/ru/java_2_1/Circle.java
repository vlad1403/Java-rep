package ru.java_2_1;

import java.util.Scanner;

public class Circle implements Template {
	@Override
	public int areaperimetr () {
		Scanner scanner = new Scanner (System.in);
		System.out.println ("Please, enter the raduis of circle ");
		String radius = scanner.nextLine();
		
		double rad = Double.parseDouble(radius);
		double resultA, resultP; 
		
		resultA = Math.PI * rad * rad;
		resultP = 2 * Math.PI * rad;
        System.out.println ("Area is = " + resultA + "." + " Perimetr is = " + resultP);
		return 0;
	}
}
