package beans;

import java.util.Random;

public class Pergunta {


		
	public String [][] questionario = new String[5][15];
	Random r = new Random();
	public int numero=0;
	public int numeroR=0;
	
	
	public void pergunta(){
		
		
	
		numero = r.nextInt(15);
		numeroR =r.nextInt(4);
	
	
	questionario[0][0]="Quanto é 5x5 ?";
	questionario[1][0]="20";
	questionario[2][0]="35";
	questionario[3][0]="30";
	//certa
	questionario[4][0]="25";
	
	questionario[0][1]="quanto é 79÷0 ?";
	questionario[1][1]="0";
	questionario[2][1]="1";
	//certa
	questionario[3][1]="∉";
	questionario[4][1]="-1";
	
	questionario[0][2]="Se aumentarmos um número em 25%, que porcentagem precisamos diminuir do novo número para obter o primeiro?";
	questionario[1][2]="25%";
	questionario[2][2]="55%";
	//certa
	questionario[3][2]="75%";
	questionario[4][2]="50%";
	
	questionario[0][3]="se a filha  de tereza é filha da mae da minha filha,o q sou de tereza?";
	//certa
	questionario[1][3]="filha de tereza";
	
	questionario[0][4]="O refrigerante está para a lata assim como a carta está para:";
	questionario[1][4]="Os Correios";
	questionario[2][4]="O lapis";
	questionario[3][4]="O Selo";
	//certa
	questionario[4][4]="O envelope";
	
	questionario[0][5]="Qual destes animais não pertence ao mesmo grupo?";
	questionario[1][5]="Esquilo";
	questionario[2][5]="Morcego";
	questionario[3][5]="Onitorrinco";
	//certa
	questionario[4][5]="Avestruz";
	
	
	questionario[0][6]="Vc tem 2 malas, a maior possui 2x a capacidade da outra e armazena 25 quilos. Juntando as 2, quantos quilos vc pode levar nas malas?";
	//certa
	questionario[1][6]="37,5 quilos?";
	questionario[2][6]="50 quilos";
	questionario[3][6]="12,5 quilos";
	questionario[4][6]="30 quilos";
	
	questionario[0][7]="Amora está para aroma assim como 71913 está para:";
	questionario[1][7]="37119";
	//certa
	questionario[2][7]="31917";
	questionario[3][7]="17193";
	questionario[4][7]="31971";
	
	
	questionario[0][8]="Simpatia está para antipatia assim como certo está para:";
	questionario[1][8]="erro";
	//certa
	questionario[2][8]="Errado";
	questionario[3][8]="certeiro";
	questionario[4][8]="correto";

	
	questionario[0][9]="Leandro tem 40 balas chupou 12 e deu 10 para sua irmã. Com quantas balas ele ficou?";
	questionario[1][9]="15";
	questionario[2][9]="14";
	//certa
	questionario[3][9]="18";
	questionario[4][9]="16";
	
	
	}
	
}
