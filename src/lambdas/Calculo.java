package lambdas;

@FunctionalInterface
public interface Calculo {
	//public abstract double executar(double a, double b);
	double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "Muito legal";
	}
	
}
