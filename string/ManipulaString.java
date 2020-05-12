import javax.swing.JOptionPane;

class ManipulaString{
	public static void main(String args[]){
	
	String nome = JOptionPane.showInputDialog("Digite o nome: ");
	System.out.println(nome);
	System.out.println(nome.toUpperCase());
	System.out.println(nome.toLowerCase());
	System.out.println(nome.length());

// Procura a primeira aparicao do caracter/string dentro da string (retornar -1 nao localizou) (primeiro caracter eh zero)
	System.out.println(nome.indexOf("a"));
	System.out.println(nome.indexOf("@"));
	
// Retornar parte da string (inicio e fim(nao mostra))
	System.out.println(nome.substring(1,5));
	System.out.println(nome.substring(0, nome.length()/2));
	
// Mostra o primeiro nome
	System.out.println(nome.substring(0, nome.indexOf(" ")));
	
// Mostrar sem o primeiro nome	
	System.out.println(nome.substring(nome.indexOf(" ")+1, nome.length()));
	
// comparar strings
	System.out.println(nome.equals("carlos alonso"));
	
// comparar primitivos
	int valor1 = 10;
	int valor2 = 10;
	System.out.println(valor1 == valor2);
	
	}

}