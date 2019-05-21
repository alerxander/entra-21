package exemplo08;

public class Principal {

	public static void main(String[] args) {

		// Condicional aninhada

		double valor = 500;
		String segmento = "limpeza";
		String forma_Pagamenbto = "a vista";

		if (segmento.equals("Limpeza")) {

			if (valor > 100) {
				System.out.println("desconto de 10%,R$ " + (valor * 0.9));
			} else {
				System.out.println("sem desconto,R$ " + valor);
			}

		} else {
			if (valor > 100) {
				System.out.println("Desconto de 5%, R$" + (valor * 0.95));

			} else {
				System.out.println("sem desconto,R$ " + valor);
			}
		}
	}
}