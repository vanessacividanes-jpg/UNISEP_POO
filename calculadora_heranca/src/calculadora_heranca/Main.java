package calculadora_heranca;

public class Main {

	public static void main(String[] args) {

		Soma somar = new Soma(10, 20);
		somar.soma();
		
		Subtracao subtrair = new Subtracao(50,30);
		subtrair.subtracao();
		
		Multiplicacao multiplicar = new Multiplicacao(10,20);
		multiplicar.multiplicacao();
		
		Divisao dividir = new Divisao(50,30);
		dividir.divisao();
	}
}
