import javax.swing.JOptionPane;

class Area{

	public static void main(String args[]){

		float base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do retangulo: "));
		float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do retangulo"));
		float areaRet = base * altura;
		System.out.println("A area eh: " + areaRet + "\n\n");

		float raio = Float.parseFloat(JOptionPane.showInputDialog("Digite o raio do circulo: "));
		double areaCir = 3.14 * raio * raio;
		System.out.println("A area doo circulo eh: " + areaCir);

	}
}