package Session1_Activity1;

import java.util.Arrays;

public class activity1_4 {
	
	static void ascendingSort(int array[])
	{
		int size = array.length, i;
		for (i=1;i<size;i++)
		{
			int k=array[i];
			int j=i-1;
			while (j >= 0 && k < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = k;
        }
    }
    
    public static void main(String args[]) {
        int[] data = { 2, 6, 0, 8, 10 };
        ascendingSort(data);
        System.out.println("Displaying Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));			
		}
}
