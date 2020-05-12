import javax.swing.JOptionPane;

class FormaInput{

	public static void main(String args[]){

		String nome = JOptionPane.showInputDialog("Digite nome: ");
		float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura: "));
		float peso= Integer.parseInt(JOptionPane.showInputDialog("Digite a peso"));
		float idade= Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		float imc = peso / altura / altura;
		System.out.println(nome);
		System.out.println(altura);
		System.out.println(peso);
		System.out.println(idade);
		System.out.println(imc);

	}
}