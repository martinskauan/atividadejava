package atividade1;

import java.util.Scanner;

public class TempoEvento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tempo de duração em segundos: ");
        int segundos = scanner.nextInt();
        
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;
        
        System.out.println("Tempo de duração: " + horas + " horas, " + minutos + " minutos, " + segundosRestantes + " segundos");
        
        scanner.close();
    }
}

