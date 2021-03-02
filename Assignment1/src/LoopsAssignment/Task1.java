package LoopsAssignment;

public class Task1 {
//1)Try all the loops by yourself with some use case of your own
	public static void main(String[] args) {
		// for loop
		System.out.println("For loop");
		for(int i = 0; i <= 10; i++) {
			i*=2;
			System.out.print(i+ " ");
		}
		System.out.println("\n \n"+"While loop");
		//while loop
		int x = 0;
		while(x <= 20) {
			x+=2;
			System.out.print(x+ " ");
		}
		System.out.println("\n \n"+"Do While loop");
		// do while loop
		int y = 0;
		do {
			System.out.println("My number is: " + y);
			y+=1;
		}while(y < 10);
	}

}
