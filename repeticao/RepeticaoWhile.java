import javax.swing.JOptionPane;

class RepeticaoWhile{
	public static void main(String args[]){
		int repeticoes = 1;
		String email = JOptionPane.showInputDialog("Digite um email: ");
		while (email.indexOf("@") == -1) {
			repeticoes +=1;
			email = JOptionPane.showInputDialog("Digite um email: ");
		}
		if (repeticoes == 1){
			System.out.println("Voce tentou " + repeticoes + " vez");
		}else{
			System.out.println("Voce tentou " + repeticoes + " vezes");
		}
	}

}