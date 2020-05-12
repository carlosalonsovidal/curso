import javax.swing.JOptionPane;

class RepeticaoWhile3{
	public static void main(String args[]){
		
		int fem = 0;
		int mas = 0;
		String cont = "S";
		String sexo = "";
		while (cont.equals("S")){
			sexo = JOptionPane.showInputDialog("Digite o sexo (F ou M): ").toUpperCase();
			if (sexo.equals("F")){
				fem++;
			}else if (sexo.equals("M")){
				mas++;
			}
			cont = JOptionPane.showInputDialog("Continua ? (S ou N): ").toUpperCase();
		}
		System.out.printf("%d pessoas do sexo Feminino\n%d pessoas do sexo Masculino", fem, mas);
	}

}