package exemplo12;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner armazenar = new Scanner(System.in);
		System.out.println("qual é seu nome?");
		String nome = armazenar.nextLine();
		System.out.println("o nome informado é " + nome);

	}
}
