package Praktikum_01;

import java.util.Date;
import java.util.Scanner;

public class Latihan03 {

	public static void main(String[] args) {
		int harga = 6300;
		Scanner input = new Scanner(System.in);
		System.out.println("========================================================");
		System.out.println("\t\tTOKO SERBAGUNA IBIK");
		System.out.println("========================================================");
		System.out.print("Masukan Jumlah Produk Yang Dibeli : ");
		int produk = input.nextInt();
		
		System.out.println("");
		Date time = new Date();
		System.out.println(time.toString());
		System.out.print("ITEM");
		System.out.print("\t\tQTY");
		System.out.print("\tHARGA");
		System.out.println("\t\tTOTAL");
		System.out.println("========================================================");
		System.out.print("Roti Enak");
		System.out.print("\t"+produk);
		System.out.print("\tRp."+harga+",-");
		
		int total = harga*produk;
		System.out.println("\t"+total);
		System.out.println("-------------------------------------------------------");
		
		int diskon = 5;
		int subTotal = total-(total/100*(diskon*(produk/3)));
		if(produk % 3 == 0 ) {
			System.out.print("Diskon : ");
			System.out.println(diskon*(produk/3)+"%");
			System.out.print("Subtotal : ");
			System.out.println(subTotal);
		}else if(produk % 3 !=0){
			System.out.print("Diskon : ");
			System.out.println(diskon*(produk/3)+"%");
			System.out.print("Subtotal : ");
			System.out.println(subTotal);
			
		}
	}

}
