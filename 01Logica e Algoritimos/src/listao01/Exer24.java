package listao01;

import java.util.Arrays;



public class Exer24 {

	public static void main(String[] args) {
		int valor1=1;
		int valor2=2;
		int valor3=3;
		
		
		
		int[] num = new int[3];
		num[0]=valor1;
		num[1]=valor2;
		num[2]=valor3;
		
		Arrays.parallelSort(num);
		for(int i =0;i< num.length;i++) {
			System.out.println(num[i]);	
		}
		
		
	}

}
