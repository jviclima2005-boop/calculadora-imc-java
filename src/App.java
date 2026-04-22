import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner num = new Scanner(System.in);
        System.out.print("Digite seu peso(kg):");
        double peso = num.nextDouble();

        System.out.print("Digite sua altura(m):");
        double altura = num.nextDouble();
        
        if(altura <= 0 || peso <= 0){
            System.out.println("Valores inválidos. A altura e o peso devem ser maiores que zero.");
            num.close();
            return;
        }
        double imc = peso/(altura * altura);
        System.out.printf("Seu IMC é: %.2f%n", imc);
        if(imc < 18.5){
            System.out.println("Você está abaixo do peso.");
        }else if( imc >= 18.5 && imc <= 24.9){
            System.out.println("Você está com peso normal.");
        }else if(imc >= 25 && imc <= 29.9){
            System.out.println("Você está com sobrepeso.");
        }else{
            System.out.println("Você está com obesidade.");
        }
        num.close();
    }
}
