import java.util.Scanner;

class DescansoGraduacao{

	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o tipo de graduacao que realiza: ");
		String nome = teclado.next().toLowerCase();
		System.out.println(nome);
		
		if (nome.indexOf("@") >=0) {
			System.out.println("Nao digite um email");
		} else {
		
			if (nome.equals("tecnologo")){
// existe o equalsIgnoreCase()
				System.out.println("2 a 3 anos");
			} else if (nome.toUpperCase().equals("BACHARELADO")){
				System.out.println("4 a 6 anos");
			} else {
				System.out.println("So temos Tecnologo ou Bacharelado");
			}
		}
		
// && = and, || = OR
	}
}