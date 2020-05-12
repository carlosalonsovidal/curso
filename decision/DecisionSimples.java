import java.util.Scanner;

class DecisionSimples{

	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a nota 1: ");
		float nota1 = teclado.nextFloat();
		System.out.println("Digite a nota 2: ");
		float nota2 = teclado.nextFloat();
		float media = (nota1 + nota2) / 2;
		System.out.println("Sua media e: " + media);
		if (media >= 5) {
			System.out.println("Parabens voce foi aprovado !!!");
		}
		else {
			System.out.println("Reprovado !!");
		}
	
	}
}