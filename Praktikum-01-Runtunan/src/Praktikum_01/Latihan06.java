package Praktikum_01;

import java.util.Scanner;

public class Latihan06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan Nama Lengkapn : ");
		String nama = input.next();
		
		
		nama = nama.replace("a", "X");
		nama = nama.replace("i", "X");
		nama = nama.replace("u", "X");
		nama = nama.replace("e", "X");
		nama = nama.replace("o", "X");
		nama = nama.replace("A", "X");
		nama = nama.replace("I", "X");
		nama = nama.replace("U", "X");
		nama = nama.replace("E", "X");
		nama = nama.replace("O", "X");
		System.out.print("Huruf Vokal Di Ubah : " +nama);
	}

}
