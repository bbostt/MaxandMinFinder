import java.util.Scanner;
public class MinandMaxFind {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Kaç tane sayý gireceksiniz : ");
		int n = scan.nextInt();
		
		int[]arr = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print((i+1)+". sayýyý giriniz : ");
			arr[i] = scan.nextInt();
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for(int j=0; j<arr.length; j++) {
			if(arr[j] < min) {
				min = arr[j];
			}
		}
		
		for(int m=0; m<arr.length; m++) {
			if(arr[m] > max) {
				max = arr[m];
			}
		}
		
		System.out.println("Max number : " +max);
		System.out.println("Min number : " +min);
		

	}

}
