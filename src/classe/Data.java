package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(int dia, int mes, int ano){
		this.dia = 1;
		this.mes = 1;
		this.ano = 1970;
	}
	
	Data(){
		this(1,1,1970);
	}
	
	String dataEspecial() {
		String data = "Um dia especial: " + dia+ "/"+ mes+"/"+ ano;
		return data;
	}
	
}
