package Session1_Activity1;

import java.util.Arrays;

public class activity1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10, 77, 10, 54, -11, 10};
		System.out.println("Printing Original Array Values" + Arrays.toString(a));
		
		int Num1 = 10;
		int Num2 = 30;
		
		System.out.println("Result:" + result (a, Num1, Num2));
		

	}

	private static boolean result(int[] nums, int Num1, int Num2) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int number : nums) {
			if (number == Num1) {
				sum += Num1;
			}
			if (sum > Num2) {
                break;
            }
		}
		return sum == Num2;
	}
}
