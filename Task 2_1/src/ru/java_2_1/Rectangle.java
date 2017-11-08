package ru.java_2_1;

import java.util.Scanner;

public class Rectangle implements Template {

	@Override
	public int areaperimetr () {
		Scanner scanner = new Scanner (System.in);
		System.out.println ("Please, enter parametrs of side 1");
		String side1 = scanner.nextLine();
		System.out.println ("Please, enter parametrs of side 2");
		String side2 = scanner.nextLine();
		
		int s1 = Integer.parseInt(side1);
		int s2 = Integer.parseInt(side2);
		int resultA, resultP; 
		
		resultA = s1 * s2;
		resultP = (s1 * 2) + (s2 * 2);
        System.out.println ("Area is = " + resultA + "." + " Perimetr is = " + resultP);
		return 0;
	}


	

}
