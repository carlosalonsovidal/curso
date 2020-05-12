import javax.swing.JOptionPane;

class DecisaoWhile2{
	public static void main(String args[]){
		
		int qde = 0;
		int i = 1;
		String email = "";
		while (i <= 3){
			email = JOptionPane.showInputDialog("Digite um email: ").toLowerCase();
			i +=1;		
			if (email.indexOf("@itau-unibanco.com.br") >= 0){
				qde++;
			}
		}
		System.out.println("Voce digitou " + qde + " email do Itau-unibanco");
	}

}