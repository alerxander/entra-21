package exemplo10;

public class Principal {

	public static void main(String[] args) {

		// operadores logicos &&=E,||=ou,!=não

		double valor = 500;
		String segmento = "eletrônico";

		if (valor >= 500 && segmento.equals("eletronico")) {
			System.out.println("Desconto de 20%, total a pagar " + valor * 0.8);
		} else {
			System.out.println("Sem desconto,total a pagar" + valor);
		}

	}
}
