import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			double peso, altura, imc;
			System.out.print("Informe seu peso: ");
			peso = input.nextDouble();
			System.out.print("Informe sua altura em metros (ex: 1,80) ");
			altura = input.nextDouble();
			imc = peso/(altura*2);
			System.out.print("Seu IMC é de " + imc);
			if (imc < 18.5) {
			System.out.println(" Abaixo do peso ");
			}
			if (imc >= 18.5 && imc < 25) {
				System.out.println(" Dentro da normalidade ");
			}
			if (imc >= 25 && imc < 30) {
				System.out.println(" Acima do peso ");
			}
			if (imc >= 30) {
				System.out.println(" Obeso ");
			}
	}
}