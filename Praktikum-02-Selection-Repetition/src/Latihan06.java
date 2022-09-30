import java.util.Scanner;

public class Latihan06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char ulang;
		do {
		System.out.println("-------------------");
		System.out.println("==Selamat Datang==");
		System.out.println("-------------------");
		System.out.println("1. Nasi Goreng");
		System.out.println("2. Bubur Ayam");
		System.out.println("3. Soto Ayam");
		System.out.println("-------------------"); 
		System.out.print("Pilih Menu : ");
		int menu = input.nextInt();
		
		switch (menu) {
		case 1 : {
			
			System.out.print("Anda memesan Nasi Goreng dengan harga Rp.22.000,-");
			break;
		}
		case 2 : {
			
			System.out.print("Anda memesan Bubur Ayam dengan harga Rp.15.000,-");
			break;
		}
		case 3 : {
	
			System.out.print("Anda memesan Soto Ayam dengan harga Rp.25.000,-");
			break;
}
		default:
			System.out.println("-------------------");
			System.out.print("Maaf menu yang anda masukan salah");
			break;
		}
		System.out.println(" ");
		System.out.println("-------------------");
		System.out.print("Ingin memilih menu lain (y/t)? ");
	      ulang = input.next().charAt(0);
		
		
		}
		while(ulang!= 't');
		System.out.print("Terimakasih.....");
		input.close(); 
	}

}
