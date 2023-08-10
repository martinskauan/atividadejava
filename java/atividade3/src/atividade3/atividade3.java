package atividade3;
import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        
        double pesoNota1 = 2.0;
        double pesoNota2 = 3.0;
        double pesoNota3 = 5.0;
        
        double mediaPonderada = (nota1 * pesoNota1 + nota2 * pesoNota2 + nota3 * pesoNota3) / (pesoNota1 + pesoNota2 + pesoNota3);
        
        System.out.println("Média final: " + mediaPonderada);
        
        scanner.close();
    }
}
