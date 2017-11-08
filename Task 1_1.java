public class Task1 {
 	public static void main (String [] args) {
		try {
			int chislo1 = Integer.parseInt(args[0]);
			int chislo2 = Integer.parseInt(args[1]);
			int summa = chislo1 + chislo2;
			System.out.println ("Сумма чисел = " + summa);
		    }
		catch (Exception e) {
			System.out.println ("Некорректный ввод");
		    }
	}
}