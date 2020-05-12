import java.util.Scanner;

class DescansoSimples{

	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do produto: ");
		String nome = teclado.next();
		System.out.println("Digite a quantidade: ");
		int qde = teclado.nextInt();
		System.out.println("Digite o valor: ");
		float valor = teclado.nextFloat();
		
		if (qde > 0){
			if (valor == 0) {
				System.out.println("Gratis");
			} else if (valor > 100){
				System.out.println("CARO");
			} else if (valor < 70){
				System.out.println("BARATO");
			} else {
				System.out.println("MEDIO");
			}
		} else {
			System.out.println("Quantidade zero");
		}
// && = and, || = OR
	}
}