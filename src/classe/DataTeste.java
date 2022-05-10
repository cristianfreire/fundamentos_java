package classe;

public class DataTeste {
	
	//static int a = 3;
	public static void main(String[] args) {
		//System.out.println(a);
		Data dt = new Data();
		
		dt.dia = 13;
		dt.mes = 12;
		dt.ano = 2021;
		
		System.out.println(dt.dataEspecial());
		
		// System.out.printf("Um dia especial: %d/%d/%d", dt.dia, dt.mes, dt.ano);
		
		
		
	}
}
