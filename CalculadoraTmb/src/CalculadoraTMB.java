import java.util.Scanner;

public class CalculadoraTMB {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sexo;       
        double peso, altura, idade, tmb = 0;
        System.out.println("Qual seu gênero? ");
        System.out.println("Digite 1 para masculino e 2 para feminino: ");
        sexo = input.nextInt();
        System.out.println("Digite seu peso: ");
        peso = input.nextDouble();
        System.out.println("digite sua altura em centímetros: ");
        altura = input.nextDouble();
        System.out.println("Digite sua idade: ");
        idade = input.nextDouble();
        input.close();
        
        //Metodo de Harris-Benedict
        if(sexo == 1) {
        	tmb = 88.362 + (13.397 * peso) + (4.799 * altura) - (5.677 * idade);
        }else if (sexo == 2) {
        	tmb = 447.593 + (9.247 * peso) + (3.098 * altura) - (4.330 * idade);
        }
        System.out.println("Sua Taxa metabólica basal é de " + tmb);

    } 
}