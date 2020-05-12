import javax.swing.JOptionPane;

class Salario{

	public static void main(String args[]){

		float valorAula = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da hora aula do professor: "));
		float qdeAulasSemana = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de horas aula da semana:"));
		double salarioBase = qdeAulasSemana * 4.5 * valorAula;
		double horaAtividade = salarioBase * 1.05;
		double dsr = (salarioBase + horaAtividade) / 6;
		double salarioMensal = salarioBase + horaAtividade + dsr;
		
		System.out.println("Salario base: " + salarioBase);
		System.out.println("Hora atividade: " + horaAtividade);
		System.out.println("Descanso Semanal Remunerado: " + dsr);
		System.out.println("Salario Mensal: " + salarioMensal);

	}
}