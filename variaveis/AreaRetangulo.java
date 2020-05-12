import javax.swing.JOptionPane;

class NotaMedia{

	public static void main(String args[]){

		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		float notaPrimeiroSemestre = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do primeiro semestre"));
		float notaSegundoSemestre = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do segundo semestre"));
		float media = (notaPrimeiroSemestre + notaSegundoSemestre) / 2;
		double mediaComPeso = (notaPrimeiroSemestre * 0.4 + notaSegundoSemestre * 0.6);
		System.out.println(nome);
		System.out.println(notaPrimeiroSemestre);
		System.out.println(notaSegundoSemestre);
		System.out.println(media);
		System.out.println(mediaComPeso);

	}
}