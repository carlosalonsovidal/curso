class Cronometro{

	public static void main(String args[]){
	
		int min=10;
		int seg=0;
	
		while (min >=0){
			while(seg >= 0){
				System.out.printf("Tempo disponivel %02d:%02d\n", min, seg);
				seg--;
			}
			min--;
			seg = 60;
		}
	
	}

}