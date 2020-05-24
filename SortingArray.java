package array;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<5;i++) {
			a[i]=s.nextInt();
		}
		Arrays.parallelSort(a);//Arrays.sort();
		for(int i:a){
			System.out.print(i+" ");
		}
	}

}
