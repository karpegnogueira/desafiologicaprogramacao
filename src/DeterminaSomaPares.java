
public class DeterminaSomaPares {
	public static void main(String[] args) {
		
		//Sequência de numeros:
		int[] numeros = {2,4,10,7,8,6,2,5,8};
		int soma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]%2 == 0) {
				soma += numeros[i];
			}
			
		}
		System.out.println(soma);
		
		
	}
}
