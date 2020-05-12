import java.util.Scanner;

class Exercicio1{

	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		int dia = 0;
		int mes = 0;
		int ano = 0;
		int diam = 0;
		boolean bisexto = false;

		do {
			System.out.println("Digite o ano (AAAA): ");
			ano = teclado.nextInt();
		} while(ano < 1);
		
		if ((ano % 4) == 0){
			bisexto = true;
		}
		
		do{
			System.out.println("Digite o mes: ");
			mes = teclado.nextInt();
		} while (mes < 1 || mes > 12);

		if (mes == 2){
			if (bisexto){
				diam=29;
			}else{
				diam=28;
			}
		}else if (mes==4 || mes==6 || mes==9 || mes==11){
			diam = 30;
		}else{
			diam = 31;
		}
		
		do {
			System.out.println("Digite o dia: ");
			dia = teclado.nextInt();
		} while (dia <1 || dia > diam);
		
	System.out.println("Data correta");
	
	
	}
}