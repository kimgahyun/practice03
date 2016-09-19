package prob1;

public class Prob1 {
	
	public static void main(String args[]) {
		
		char[] array1 = reverse("Hello World");
		printCharArray(array1);
		
		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);
		
	}
	
	public static char[] reverse(String str){
		/* 구현코드 */
		char[] arr1 = str.toCharArray();
		char[] arr2 = new char[arr1.length];
		int j = 0;
		for( int i = arr1.length - 1 ; i >= 0; i--)
		{
		  arr2[j] = arr1[i];
		  j++;
		}
		return arr2;
	}
	
	public static void printCharArray(char[] array){
		/* 구현코드 */
		for(int i = 0 ; i < array.length; i++)
		{
			System.out.print(array[i]);
		}
	}
}
