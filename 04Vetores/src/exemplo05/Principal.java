package exemplo05;

public class Principal {

	public static void main(String[] args) {
		
		//vetor contendo numeros inteiros
		int [] numeros = {3,1,5,2,4};
		
		
		//metodo de ordenação - bubble sort| Método bolha
		int maiornumero;
		
		for(int i1=0;i1<4;i1++) {		
			for(int i2=i1+1;i2<5;i2++) {
				if(numeros[i2]<numeros[i1]) {
					maiornumero= numeros[i1];
					numeros[i1]=numeros[i2];
					numeros[i2]=maiornumero;
					
				}
			}
		}
		
		//Arrays.sort(numeros);
		
		//exibir dados do vetor
		for (int n : numeros) {
			System.out.println(n);
		}
	}
}
