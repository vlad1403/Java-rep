package ru.java_2_1;

import java.util.Scanner;

public class Square extends Rectangle implements Template {

	@Override
	public  int areaperimetr () {
		Scanner scanner = new Scanner (System.in);
		System.out.println ("Please, enter parametrs of side");
		String side = scanner.nextLine();
		
		int s = Integer.parseInt(side);
		int resultA, resultP; 
		
		resultA = s * s;
		resultP = s * 4;
        System.out.println ("Area is = " + resultA + "." + " Perimetr is = " + resultP);
		return 0;
	}
}
