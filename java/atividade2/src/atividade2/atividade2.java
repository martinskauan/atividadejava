package atividade2;
import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a idade em dias: ");
        int idadeEmDias = scanner.nextInt();
        
        int anos = idadeEmDias / 365;
        int meses = (idadeEmDias % 365) / 30;
        int diasRestantes = (idadeEmDias % 365) % 30;
        
        System.out.println("Idade: " + anos + " anos, " + meses + " meses, " + diasRestantes + " dias");
        
        scanner.close();
    }
}
