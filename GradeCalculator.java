import java.util.Scanner;

class Student_Grade_Calculator {
	int n, marks[], a;
	double sum = 0.0, avg_percentage;
	char g;

	void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of subjects:");
		n = sc.nextInt();
		marks = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter marks obtained in subject " + (i + 1) + " :");
			marks[i] = sc.nextInt();
		}
		sc.close();
		;
	}

	void Total_Marks() {
		for (int i = 0; i < n; i++) {
			sum = sum + marks[i];
		}
	}

	void Average_Percentage() {
		avg_percentage = sum / n;
	}

	void Grade() {
		a = (int) avg_percentage / 10;
		switch (a) {
			case 10:
			case 9:
				g = 'O';
				break;
			case 8:
				g = 'E';
				break;
			case 7:
				g = 'A';
				break;
			case 6:
				g = 'B';
				break;
			case 5:
				g = 'C';
				break;
			case 4:
				g = 'D';
				break;
			default:
				g = 'F';
		}
	}

	void Results() {
		System.out.println("____________________________\n");
		System.out.println("Total Marks:- " + sum);
		System.out.println("Average Percentage:- " + avg_percentage);
		System.out.println("Grade:- " + g);
		System.out.println("____________________________");
	}
}

class Main {
	public static void main(String args[]) {
		Student_Grade_Calculator ob = new Student_Grade_Calculator();
		ob.Input();
		ob.Total_Marks();
		ob.Average_Percentage();
		ob.Grade();
		ob.Results();
	}
}