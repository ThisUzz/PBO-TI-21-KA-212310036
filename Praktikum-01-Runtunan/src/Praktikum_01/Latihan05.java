package Praktikum_01;

import java.util.Scanner;

public class Latihan05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Usia :");
		String usia = input.nextLine();
		System.out.print("Firstname :");
		String fName = input.nextLine();
		System.out.print("Lastname :");
		String lName = input.nextLine();
		System.out.print("NPM :");
		String npm = input.nextLine();
		
		System.out.print("Result : ");
		System.out.print(usia.concat(fName).concat(lName).concat(npm));
		}

}
