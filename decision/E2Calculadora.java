import javax.swing.JOptionPane;

class E2Calculadora{
	public static void main(String args[]){
	
		float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		System.out.println(n1);
		float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo numero: "));
		System.out.println(n2);
		String operacao = JOptionPane.showInputDialog("Escolha a operacao desejada: ");
		System.out.println(operacao);
		float valor = 0;

		if (operacao.equals("+")){
			System.out.println("Resultado: " + (n1 + n2));
		}else if (operacao.equals("-")){
			System.out.println("Resultado: " + (n1 - n2));
		}else if (operacao.equals("*")){
			System.out.println("Resultado: " + (n1 * n2));
		}else if (operacao.equals("/")){
			System.out.println("Resultado: " + (n1 / n2));
		}else {
			System.out.println("Operacao invalida");
		}
	}
}