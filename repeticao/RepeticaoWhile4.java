import javax.swing.JOptionPane;

class RepeticaoWhile4{
	public static void main(String args[]){
		
		int fem = 0;
		int mas = 0;
		char cont = 'S';
		char sexo = ' ';
		while (cont == 'S'){
			sexo = JOptionPane.showInputDialog("Digite o sexo (F ou M): ").toUpperCase().charAt(0);
			if (sexo == 'F'){
				fem++;
			}else if (sexo == 'M'){
				mas++;
			}
			cont = JOptionPane.showInputDialog("Continua ? (S ou N): ").toUpperCase().charAt(0);
		}
		System.out.printf("%d pessoas do sexo Feminino\n%d pessoas do sexo Masculino", fem, mas);
	}

}