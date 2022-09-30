import java.util.Scanner;

public class Latihan02 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Masukan NPM :");
		int npm = input.nextInt();
		
		if(npm % 2 == 0) {
			System.out.println("Bukan Termasuk Bilangan Prima Karna Dapat Dibagi 2");
		}else {
			System.out.print("Termasuk Bilangan Prima");
		}
		input.close();
	}

}
