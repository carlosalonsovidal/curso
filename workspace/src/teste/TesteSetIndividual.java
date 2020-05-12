package teste;

import javax.swing.JOptionPane;

import modelo.Aluno;
import modelo.Endereco;

public class TesteSetIndividual {

	public static void main(String[] args) {
		// instanciou o objeto
		Endereco objetoEndereco = new Endereco();
		Aluno objetoAluno = new Aluno();
		
//		preenchendo e exibindo um a um
		objetoAluno.setNome(JOptionPane.showInputDialog("Digite o nome").toUpperCase());
		objetoAluno.setNumeroMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da matricula")));
		objetoAluno.setEmail(JOptionPane.showInputDialog("Digite o email").toLowerCase());

		System.out.println("O nome eh: " + objetoAluno.getNome());
		System.out.println("A matricula eh: " + objetoAluno.getNumeroMatricula());
		System.out.println("O email eh: " + objetoAluno.getEmail());
		System.out.println("Ate logo");

	}

}
