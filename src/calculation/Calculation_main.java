package calculation;

import java.util.Scanner;

public class Calculation_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
        System.out.print("Input Number m > ");
        int m = Integer.parseInt(scan.next());        
        System.out.print("Input Number n > ");
        int n = Integer.parseInt(scan.next());
        
        Calculation_lib clib = new Calculation_lib(m,n);
        System.out.print(" m + n = "+clib.getPlus());
        
        System.out.print(", m - n = "+clib.getMinus()); 
        
        System.out.print(", m Å~ n = "+clib.getTime());
        
        System.out.print(", m ÅÄ n = "+clib.getDivide());
        
        System.out.print(", m % n = "+clib.getMod());
	}

}
