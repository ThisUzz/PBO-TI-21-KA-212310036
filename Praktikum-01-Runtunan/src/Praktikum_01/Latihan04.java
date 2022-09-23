package Praktikum_01;

import java.util.Scanner;

public class Latihan04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan kalimat : ");
		String kata = input.next();
		
		System.out.print("Kalimat setelah di UpperCase : ");
		System.out.println(kata.toUpperCase());
	}

}