import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = 258.59844;
		System.out.println(x);
		System.out.printf("%.2f\n", x);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("%.2f\n", x);
		System.out.println("Foram o total de" + x + " Metros");
		System.out.printf("Foram o total de %.2f Metros %n", x);
		
		System.out.println("");
		System.out.println("=============");
		System.out.println("");
		
		String nome = "Mateus";
		int idade = 20;
		double sal = 880.00;
		
		System.out.printf("%s tem %d anos e ganha um salario de: %.2f", nome, idade, sal);
		
		
	}

}
