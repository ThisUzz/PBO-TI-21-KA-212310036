package Praktikum_01;

import java.util.Scanner;

public class Latihan02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int luasL,kelilingL;
		int d1,d2;
		
		
		System.out.println("1. Layang - layang ");
		System.out.println("2. Prisma Segitiga");
		System.out.print("Masukan Pilihan : ");
		int pilih = input.nextInt();
		
		switch(pilih){
			case 1 :
				System.out.print("Masukan Diagonal 1 : ");
				d1 = input.nextInt();
				System.out.print("Masukan Diagonal 2 : ");
				d2 = input.nextInt();
				
				luasL = (d1*d2*1/2);
				kelilingL = (2*(d1+d2));
				
				System.out.println("Luas Layang-layang : " +luasL);
				System.out.print("Keliling Layang-layang : " +kelilingL);
				
				break;
			case 2 :
				System.out.print("Masukan Tinggi : ");
				int t = input.nextInt();
				System.out.print("Masukan alas  : ");
				int a = input.nextInt();
				System.out.print("Masukan Tinggi Alas  : ");
				int ts = input.nextInt();
				System.out.print("Masukan Sisi 3  : ");
				int s = input.nextInt();
				
				int luasP = (t*(a*3)+(2*(a*t*1/2)));
				int volumeP = ((a*t*1/2)*t);
				
				System.out.println("Luas Permukaan Prisma : " +luasP);
				System.out.println("Volume Prisma : "+ volumeP);
				
				
		}
		
		
	}

}
