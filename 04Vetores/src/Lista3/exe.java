package Lista3;

import java.util.Random;

import javax.swing.JOptionPane;

public class exe {
public static void main(String[] args) {
	
Random numero =new Random();
	int[]vetor=new int[5];
	int num =0;
	for(int i = 0;i<vetor.length;i++) {
		num = numero.nextInt(0-100);
		for(int i2=0;i2<vetor.length;i2++) {
		if(!(vetor[i2]==num)) {
			vetor[i2]=num;
		}
		
		}
	}
}
}