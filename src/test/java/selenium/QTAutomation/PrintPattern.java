package selenium.QTAutomation;

import java.util.Scanner;

public class PrintPattern {

//	public static void main(String[] args) {
//		int i,j;
//		for(i=0;i<=5;i++) {
//			for(j=1;j<=i;j++) {
//				System.out.print("*");
//		}
//			System.out.println();
//		}
//	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        System.out.println("Print all the number smaller than " +number);

        do {
            number--;
            System.out.println(number);

        }
        while(number>1);

    }
}
		
	


