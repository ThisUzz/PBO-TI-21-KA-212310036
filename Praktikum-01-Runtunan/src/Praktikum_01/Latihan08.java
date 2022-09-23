package Praktikum_01;

import java.util.Scanner;

class Students{
	
	public int getNPM(int NPM){
		return NPM;
	}
	public String getFullname(String fullname) {
		return fullname;
	}
	public String getClassName(String ClassName) {
		return ClassName;
	}
	public int getSemester(int semester) {
		return semester;
	}
	public float getGPA(float GPA) {
		return GPA;
	}
	
}	
public class Latihan08 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Students myBio = new Students();
	
	System.out.print("Masukan NPM : ");
	myBio.getNPM(input.nextInt());
	
	System.out.print("Masukan Nama Lengkap : ");
	myBio.getFullname(input.next());
	
	System.out.print("Masukan Nama Kelas : ");
	myBio.getClassName(input.next());
	
	System.out.print("Masukan Semester : ");
	myBio.getSemester(input.nextInt());
	
	System.out.print("Masukan GPA : ");
	myBio.getGPA(input.nextFloat());
	
	System.out.println("------------------------------------");
	

	}

}
