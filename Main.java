//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Capturando datos de domicilio
        System.out.println("Ingrese los datos de su domicilio:");
        System.out.print("Calle: ");
        String calle = sc.nextLine();
        System.out.print("Número: ");
        String numero = sc.nextLine();
        System.out.print("Colonia: ");
        String colonia = sc.nextLine();
        System.out.print("Ciudad: ");
        String ciudad = sc.nextLine();
        System.out.print("Código Postal: ");
        String codigoPostal = sc.nextLine();

        // Capturando datos escolares
        System.out.println("\nIngrese los datos de su educación:");
        System.out.print("Primaria (nombre): ");
        String primaria = sc.nextLine();
        System.out.print("Secundaria (nombre): ");
        String secundaria = sc.nextLine();
        System.out.print("Preparatoria (nombre): ");
        String preparatoria = sc.nextLine();

        // Capturando datos del deporte favorito
        System.out.println("\nIngrese los datos de su deporte favorito:");
        System.out.print("Nombre del deporte: ");
        String deporte = sc.nextLine();
        System.out.print("Equipo o jugador favorito: ");
        String equipoJugador = sc.nextLine();
        System.out.print("Frecuencia con la que lo practica: ");
        String frecuencia = sc.nextLine();

        // Mostrando todos los datos ingresados
        System.out.println("\n--- Datos ingresados ---");
        System.out.println("Domicilio:");
        System.out.println("Calle: " + calle + ", Número: " + numero + ", Colonia: " + colonia + ", Ciudad: " + ciudad + ", Código Postal: " + codigoPostal);
        System.out.println("\nEducación:");
        System.out.println("Primaria: " + primaria);
        System.out.println("Secundaria: " + secundaria);
        System.out.println("Preparatoria: " + preparatoria);
        System.out.println("\nDeporte favorito:");
        System.out.println("Deporte: " + deporte);
        System.out.println("Equipo o jugador favorito: " + equipoJugador);
        System.out.println("Frecuencia de práctica: " + frecuencia);
    }
}