import java.util.Scanner;

public class SequenciaFibonacci {
	public static void main(String[] args) {
		
	
	 Integer numeroAntigo = 0;
     Integer numeroAnterior = 0;
     Integer resultado = 0;

     Integer index;

     Scanner scanner = new Scanner(System.in);

     System.out.println("Digite o indice do numero fibonacci: ");
     index = scanner.nextInt();

     if (index > 0) {
         for (int i = 0; i < index; i++) {
             if (resultado == 0) {
                 resultado += 1;
                 continue;
             }
             if(numeroAnterior == 0){
                 resultado += numeroAnterior;
                 numeroAnterior = resultado;
                 continue;
             }
             if(numeroAntigo == 0){
                 resultado += numeroAnterior;
                 numeroAntigo = numeroAnterior;
                 numeroAnterior = resultado;
                 continue;
             }
             resultado = numeroAnterior+numeroAntigo;

             numeroAntigo = numeroAnterior;
             numeroAnterior = resultado;

         }
     }
     System.out.println(resultado);
	}
}