package LoopsAssignment;

public class Task3 {
	// 3)Find all the odd numbers between 100 and 199
	public static void main(String[] args) {
		for (int i = 100; i <= 199; i++) {
			if(!(i%2==0)) {
				System.out.println(i+ " ");
			}
		}

	}

}
