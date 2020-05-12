import javax.swing.JOptionPane;

class E2Sort{
	public static void main(String args[]){
	
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		System.out.println(n1);
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
		System.out.println(n2);
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero: "));
		System.out.println(n3);

		int s1=0, s2=0, s3=0;
		int p1=0, p2=0, p3=0;
		if (n1 > n2){
			if (n1 > n3){
				s1 = n1;
				p1=1;
			}else{
				s1 = n3;
				p3=1;
			}
		}else if (n2 > n3){
				s1 = n2;
				p2=1;
			}else {
				s1 = n3;
				p3=1;
			}
		
		if (n1 < n2){
			if (n1 < n3){
				s3 = n1;
				p1=1;
			}else{
				s3 = n3;
				p3=1;
			}
		}else if (n2 < n3){
				s3 = n2;
				p2=1;
			}else{
				s3 = n3;
				p3=1;
			}
			
		if (p1 == 0){
			s2 = n1;
		}else if (p2 == 0){
			s2 = n2;
		} else {
			s2 = n3;
		}
		
		System.out.printf("Resultado: %d - %d - %d\n", s1, s2, s3);
	}
}