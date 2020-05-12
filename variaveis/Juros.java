import javax.swing.JOptionPane;


class Juros{

	public static void main(String args[]){

		float capital = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do capital: "));
		float taxaJuros = Float.parseFloat(JOptionPane.showInputDialog("Digite a o valor da taxa de juros:"));
		float meses = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de meses que o capital ficara aplicado:"));
		float montante = capital * (float) Math.pow((1 +taxaJuros / 100), meses);
		
		System.out.printf("O montante serah de: R$ %.2f", montante);

	}
}