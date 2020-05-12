package teste;

import modelo.Aluno;
import modelo.Endereco;

public class TesteSetAll {

	public static void main(String[] args) {
		// instanciou o objeto
		Endereco objetoEndereco = new Endereco();
		Aluno objetoAluno = new Aluno();
		
//		Endereco objetoEndereco = new Endereco();
		objetoEndereco.setAll("Rua Gen Osorio", "494", "Sta Paula", "SCS", "SP", "09541-320");
		objetoAluno.setAll("bruno", 1256, "bruno@uol", objetoEndereco);
		System.out.println(objetoAluno.getAll());

	}

}
