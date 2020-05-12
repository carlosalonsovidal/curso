import java.util.Scanner;

class RepeticaoDo2{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		int resto = 0;
		do{
			System.out.println("Digite um numero par: ");
			numero = teclado.nextInt();
			resto = numero % 2;
		}while(resto==1);
		System.out.println("Voce acertou");
	}

}