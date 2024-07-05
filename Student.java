import java.util.*;
public class Student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of five subject ");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int m5 = sc.nextInt();
		double total = m1+m2+m3+m4+m5;
		double avg = total/5;
		double per = total/5*100;
		char grade;
		if(avg>=90)
			grade = 'A';
		else if(avg>=80 && avg <90)
			grade = 'B';
		else if(avg>=70 && avg <80)
			grade = 'C';
		else if(avg>=60 && avg <70)
			grade = 'D';
		else 
			grade = 'E';
		
		System.out.println("The Total marks = "+total);
		System.out.println("The Average marks = "+avg);
		System.out.println("The Percentage = "+per+"%");
		System.out.println("The Grade = "+"'"+grade+"'");
		
	}

}

