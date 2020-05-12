import javax.swing.JOptionPane;

class Exercicio4{

	public static void main(String args[]){
		String nome="", maisNova="", maisVelha="";
		int idade=0, totalIdades=0, qdePessoas=0, idadeMaisNova=0, idadeMaisVelha=0, maioresIdade=0;
		char resposta=0;
		
		do {
			nome = JOptionPane.showInputdialog("Digite o Nome:").toUpperCase();
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
			totalIdades += idade;
			qdePessoas++;
			if (idade >= 18){
				maioresIdade++;
			}
			if (idade > idadeMaisVelha){
				idadeMaisVelha = idade;
				maisVelha = nome;
			}
			if (qdePessoas == 1){
				idadeMaisNova = idade;
				maisNova = nome;
			}else if (idade < idadeMaisNova){
				idadeMaisNova = idade;
				maisNova = nome;
			}
			
			resposta = JOptionPane.showInputDialog("Deseja continuar ?").toUpperCase().charAt(0);
		}while(reposta=='S');
		
		System.out.printf("Pessoa mais velha %s", maisVelha);
		System.out.printf("Pessoa mais nova %s", maisNova);
		System.out.printf("Pessoa maiores de idade %d", maioresIdade);
		System.out.printf("Media de idade %d", maioresIdade);
	}
}