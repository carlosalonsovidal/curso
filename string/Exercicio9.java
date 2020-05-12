import javax.swing.JOptionPane;

class Exercicio9{
	
	public static void main(String args[]){
	
		int nrVeiculos = 0, nrAcidentes = 0;
		float maiorAcidentes=0, menorAcidentes=0, mediaVeiculos=0, mediaAcidentes=0, mediaMenos2000=0;
		String codCidade="", cidadeMaiorAcidente="", cidadeMenorAcidente=""
	
		for (int i=1; i<6; i++){
			codCidade = JOptionPane.showInputDialog("Codigo cidade:");
			nrVeiculos = Integer.parseInt(JOptionPane.showInputDialog("Numero de veiculos de passeio:"));
			nrAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Codigo cidade:"));
			
			if (i == 1){
				mediaVeiculos = nrVeiculos;
			}else{
				mediaVeiculos = (mediaVeiculos + nrVeiculos) / 2;
			}
			
			if (nrVeiculos >= 2000){
				
			}
		}
	}


}