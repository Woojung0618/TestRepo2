import java.util.Scanner;
public class MainProgram {

    public static void main(String[] args) {
        MainProgram mainProgram = new MainProgram();
        mainProgram.printBanner();
        while (true) {
            int studentID = mainProgram.receiveStudentID();
            mainProgram.runModule(studentID);
        }
    }

    public void printBanner() {
        System.out.println("[2020-Fall Software Engineering]");
        System.out.println("Simple Software Development Project");
        System.out.println();
    }

    public int receiveStudentID() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a student ID: ");
        return input.nextInt();
    }

    public void runModule(int studentID) {
        if (studentID == 11530)
            System.out.println("No. It is the professor ID.\n");
        
        else if (studentID == 1816913) {
        	System.out.println("[Student ID: 1816913]");
        	System.out.println("1. Calculate Power");
        	System.out.println("2. Calculate Factorial");
        	
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter menu number: ");
        	int menu = sc.nextInt();
        	
        	if (menu == 1) {
        		System.out.print("Enter two positive integers to calculate power: ");
        		int n1 = sc.nextInt();
        		int n2 = sc.nextInt();
        		if (n1<=0 || n2<=0) 
            		System.out.println("Please enter positive integer. \n");
        		else if (n2 == 0)
        			System.out.println("Please enter two numbers. \n");
        		else
        			System.out.println("The Power of " + n1 + " to the " + n2 + " is " + power_1816913(n1, n2) + "\n");
        	}
        	else if (menu == 2) {
        		System.out.print("Enter a positive integer to calculate factorial: ");
        		int n = sc.nextInt();
        		if (n<0)
        			System.out.println("Please enter positive integer. \n");
        		else 
        			System.out.println( "The Factorial of " + n + " is " + factorial_1816913(n) + "\n");
        	}
        }
        
        else {
            System.out.println("To be developed...\n");
        	System.out.println("This is Testrepo2_2");
        }
    }
}
