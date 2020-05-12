import javax.swing.JOptionPane;


class AnoNascimento{

	public static void main(String args[]){

		float anoNasc = Float.parseFloat(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
		float anoAtual = Float.parseFloat(JOptionPane.showInputDialog("Digite o ano atual:"));
		float idade = anoAtual - anoNasc;
		float idade50 = 2050 - anoNasc;
		System.out.println("A idade atual eh: " + idade);
		System.out.println("A idade em 2050 eh: " + idade50);

	}
}