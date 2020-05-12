import javax.swing.JOptionPane;

class E2Preco{
	public static void main(String args[]){
	
	float preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o preco do produto: "));
	System.out.println(preco);
	int condicao = Integer.parseInt(JOptionPane.showInputDialog("Digite condicao de pagamento: "));
	System.out.println(condicao);
	float valor = 0;

	switch (condicao) {
		case 1: {
			valor = preco * 0.9f;
			break;}
		case 2: {
			valor = preco * 0.95f;
			break;}
		case 3: {
			valor = preco;
			break;}
		case 4: {
			valor = preco * 1.1f;
			break;}
		default: {
			System.out.println("Opcao errada");
			}
	}
	
	System.out.printf("Valor Total: R$ %.2f\n", valor);
	
	}

}
// JOptionPane.showConfirmDialog(null, "", JOptionPane.YES_NO_OPTION);