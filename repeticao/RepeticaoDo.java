import javax.swing.JOptionPane;

class RepeticaoDo{
	public static void main(String args[]){
		int repeticoes = 0;
		String email = JOptionPane.showInputDialog("Digite um email: ");
		do{
			email = JOptionPane.showInputDialog("Digite um email: ");
			repeticoes++;
		} while (email.indexOf("@") == -1)
			
		if (repeticoes == 1){
			System.out.println("Voce tentou " + repeticoes + " vez");
		}else{
			System.out.println("Voce tentou " + repeticoes + " vezes");
		} 
	}

}