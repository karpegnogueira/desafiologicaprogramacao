import java.util.Scanner;

public class NotasPossiveis {
	public static void main(String[] args) {
	
		
		int valor = 0;
		int qtd100 = 0; 
		int qtd50 = 0;
		int qtd20 = 0;
		int qtd10 = 0;
		int qtd5 = 0;
		int qtd2 = 0;
		int qtd1 = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor:  ");
		valor = scan.nextInt();
		
		
		while (valor >= 100) {
			valor -= 100;
			qtd100 ++;
		}
			
		while (valor >= 50) {
			valor -= 50;
			qtd50 ++;
		}	
		
		while (valor >= 20) {
			valor -= 20;
			qtd20 ++;
		}
		
		while (valor >= 10) {
			valor -= 10;
			qtd10 ++;
		}
		
		while (valor >= 5) {
			valor -= 5;
			qtd5 ++;
		}
		
		while (valor >= 2) {
			valor -= 2;
			qtd2 ++;
		}
		
		while (valor >= 1) {
			valor -= 1;
			qtd1 ++;
		}
			
	
		System.out.println("Quantidade de cedulas de R$ 100,00 : " + qtd100);
		System.out.println("Quantidade de cedulas de R$ 50,00 : " + qtd50);
		System.out.println("Quantidade de cedulas de R$ 20,00 : " + qtd20);
		System.out.println("Quantidade de cedulas de R$ 10,00 : " + qtd10);
		System.out.println("Quantidade de cedulas de R$ 5,00 : " + qtd5);
		System.out.println("Quantidade de cedulas de R$ 2,00 : " + qtd2);
		System.out.println("Quantidade de cedulas de R$ 1,00 : " + qtd1);
		
		
		
	}
}
