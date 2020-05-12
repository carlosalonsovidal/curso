class Variavel{

// Identificadores de variaveis
// Regras:
// 1 - Nao comecaras com numero
// 2 - Nao usaras palavras reservadas
// 3 - Nao usaras caracteres especiais (só _)

// Padroes
// 1 - comeca com letra minuscula
// 2 - nomes significativos
// 3 - padrao para nomes compostos (camel case) dataDeNascimento

// Tipos
// Numericos
// Alfanumericos


	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		String nome = "Carlos Alonso Vidal";
		int idade = 18;
		float altura = 1.65f;
		float peso = 58.5f;
		float imc = peso / (altura * altura);

		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		System.out.println("IMC: " + (peso / altura / altura));
		System.out.printf("IMC: %.2f\n", imc);
		System.out.printf("O %s tem o IMC igual a %.2f\n", nome, imc);
		System.out.println("O " + nome + " tem o IMC igual a " + imc);
		System.out.print("Nome: " + nome + "\n" + "Idade: " + idade + "\n");

	}
}