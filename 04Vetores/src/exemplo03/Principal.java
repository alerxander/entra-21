package exemplo03;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {
public static void main(String[] args) {
	
	//vetor de numeros
	int []numeros = new int[10];
	java.util.Scanner obter = new Scanner(System.in);
	//laço For
	for(int i =0;i<numeros.length;i++) {
		System.out.println("informe o "+(i+1)+"º numero");
		numeros[i]=obter.nextInt();
	}
	
//	exibir numeros
//	for(int i=0;i<numeros.length;i++) {
//		System.out.println((i+1)+"º numero é"+numeros[i]);
//		i++;
//	}

	
	//Exibir numero usando ForEach
	
	for (int n : numeros) {
		System.out.println(n);
		
	}
	
}}
