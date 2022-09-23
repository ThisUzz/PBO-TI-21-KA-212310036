package Praktikum_01;

import java.util.Scanner;

public class Latihan07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan NPM : ");
		int npm = input.nextInt();
		
		System.out.print("Masukan Nama Lengkap : ");
		String nama = input.next();
		
		System.out.print("Masukan Nama Kelas : ");
		String kelas = input.next();
		
		System.out.print("Masukan Semester : ");
		String semester = input.next();
		
		System.out.print("Masukan IPK : ");
		double ipk = input.nextDouble();
		
		System.out.println("------------------------------------");
		
		System.out.println("NPM 	 : "+npm);
		System.out.println("Nama 	 : "+nama);
		System.out.println("Kelas 	 : "+kelas);
		System.out.println("Semester : "+semester);
		System.out.println("IPK 	 : "+ipk);
	
	}

}
