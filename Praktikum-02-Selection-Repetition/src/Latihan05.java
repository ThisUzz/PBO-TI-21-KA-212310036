import java.util.Scanner;

public class Latihan05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		  
		System.out.print("Enter the number of row : ");
	    x = input.nextInt();
	    

		for (int i = 1; i <= x; i++) {
			for (int j = i; j <= x; j++) {
				System.out.print("*");
			}
			for (int k = 1; k <= i*2-2; k++) {
				System.out.print("0");
			}
			for (int l = i; l <= x; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= x; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            for (int k = i*2-2; k < x*2-2; k++)
            {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
