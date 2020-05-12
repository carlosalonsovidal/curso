import java.util.Scanner;

class Variavel2{

	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = teclado.next() + teclado.nextLine();
		System.out.print("Digite sua idade: ");
		int idade = teclado.nextInt();
		System.out.print("Digite sua altura: ");
		float altura = teclado.nextFloat();
		System.out.print("Digite seu peso: ");
		float peso = teclado.nextFloat();
		float imc = peso / (altura * altura);

		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		System.out.println("IMC: " + (peso / altura / altura));
		System.out.printf("\nIMC: %.2f\n", imc);
		System.out.printf("O %s tem o IMC igual a %.2f\n", nome, imc);
		System.out.println("O " + nome + " tem o IMC igual a " + imc);
		System.out.print("Nome: " + nome + "\n" + "Idade: " + idade + "\n");

	}
}