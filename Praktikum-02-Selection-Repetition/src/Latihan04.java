import java.util.Scanner;

public class Latihan04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan Nilai : ");
		int f = input.nextInt();
		
		int fk = 0;
		
		System.out.print("Faktor "+f+" adalah " );
		
		for (int i=1;i<=f;i++) {
			fk ++;
			if (f % fk == 0) {
				String faktorisasi  = (i == f) ? " ":"," ;
				System.out.print(fk+faktorisasi);
			}
			
		}

	}

}
