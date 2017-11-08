package ru.java_2_1;

import java.util.Scanner;

public class Triangle implements Template {

	@Override
	public  int areaperimetr () {
		Scanner scanner = new Scanner (System.in);
		System.out.println ("Please, enter parametrs of side 1");
		String side1 = scanner.nextLine();
		System.out.println ("Please, enter parametrs of side 2");
		String side2 = scanner.nextLine();
		System.out.println ("Please, enter parametrs of side 3");
		String side3 = scanner.nextLine();
		
		int s1 = Integer.parseInt(side1);
		int s2 = Integer.parseInt(side2);
		int s3 = Integer.parseInt(side3);
		double resultA;
		int resultP, p, helpvar;
		
		resultP = s1 + s2 +s3;
		p = resultP / 2;
		helpvar = p * (p - s1) * (p - s2) * (p - s3);
		resultA = Math.sqrt(helpvar);
        System.out.println ("Area is = " + resultA + "." + " Perimetr is = " + resultP);
		return 0;
	}
}
