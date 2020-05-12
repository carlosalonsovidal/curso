package teste;

import javax.swing.JOptionPane;

import modelo.Endereco;
import modelo.Professor;

public class TesteConstrutorCheio {

// Crio um metodo estatico para facilitar minha vida (tipo um alias )
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	
//  Crio outro metodo para captura de numeros inteiros
	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}
	
	public static void main(String[] args) {
		Professor objetoProfessor = new Professor(
				JOptionPane.showInputDialog("Digite o nome"),
				// ou pode utilizar o metodo criado acima s
				s("Digite o apelido"),
				s("Digite a materia"),
				new Endereco(
						s("Digite o logradouro"), 
						s("Digite o numero"), 
						s("Digite o bairro"), 
						s("Digite a cidade"),
						s("Digite o estado"),
						s("Digite o cep"))
				);
		System.out.println(objetoProfessor.getAll());
	}

}
