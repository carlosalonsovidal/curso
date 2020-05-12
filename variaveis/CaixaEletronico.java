import javax.swing.JOptionPane;


class CaixaEletronico{

	public static void main(String args[]){

		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser sacado: "));
		int notas100 = 0;
		int notas50 = 0;
		int notas20 = 0;
		int notas10 = 0;
		int notas5 = 0;
		int notas2 = 0;
		int notas1 = 0;
		int resto = 0;

		System.out.printf("Valor a ser sacado: %d \n", valor);

		resto = valor % 100;
		notas100 = (valor - resto) / 100;
		valor = resto;
		resto = valor % 50;
		notas50 = (valor - resto) / 50;
		valor = resto;
		resto = valor % 20;
		notas20 = (valor - resto) / 20;
		valor = resto;
		resto = valor % 10;
		notas10 = (valor - resto) / 10;
		valor = resto;
		resto = valor % 5;
		notas5 = (valor - resto) / 5;
		valor = resto;
		resto = valor % 2;
		notas2 = (valor - resto) / 2;
		notas1 = resto;

		
		System.out.printf("Quantidade de notas de 100: %d\n", notas100);
		System.out.printf("Quantidade de notas de 50: %d\n", notas50);
		System.out.printf("Quantidade de notas de 20: %d\n", notas20);
		System.out.printf("Quantidade de notas de 10: %d\n", notas10);
		System.out.printf("Quantidade de notas de 5: %d\n", notas5);
		System.out.printf("Quantidade de notas de 2: %d\n", notas2);
		System.out.printf("Quantidade de notas de 1: %d\n", notas1);

// pode fazer assim tambem:
// int nota2 = valor / 2;
// valor = valor % 2;

	}
}