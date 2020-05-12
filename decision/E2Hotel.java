import javax.swing.JOptionPane;

class E2Hotel{
	public static void main(String args[]){
	
	String nome = JOptionPane.showInputDialog("Digite o nome: ");
	System.out.println(nome);
	int dias = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos dias vai ficar: "));
	System.out.println(dias);
	float taxa = 0;

	if (dias > 15){
		taxa = 5.5f;
	}else if (dias == 15){
		taxa = 6;
	} else {
		taxa = 8;
	}
	
	System.out.printf("Valor Total: R$ %.2f\n", dias * (taxa + 80));
	System.out.printf("Valor Total: R$ %.2f\n", i);
	
	}

}