import java.util.Scanner;

class RepeticaoDo3{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		int tentativa = 0;
		int qde = 0;
		System.out.println("Digite um numero: ");
		numero = teclado.nextInt();
		do{
			System.out.println("Tente acertar o numero que foi digitado: ");
			tentativa = teclado.nextInt();
			qde++;
			if (tentativa < numero) {
				System.out.println("O seu numero eh menor do que o digitado");
			}else if(tentativa > numero) {
				System.out.println("O seu numero eh maior do que o digitado");
			}
		}while(numero != tentativa);
		System.out.printf("Voce acertou em %d tentativas", qde);
	}

}