import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicitar las coordenadas del primer punto
        System.out.println("Ingresa las coordenadas del primer punto (x1 y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        // Solicitar las coordenadas del segundo punto
        System.out.println("Ingresa las coordenadas del segundo punto (x2 y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Calcular la distancia utilizando la fórmula de distancia euclidiana
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("La distancia entre los puntos es: " + distancia);

        // Calcular el ángulo en radianes usando atan2
        double anguloRadianes = Math.atan2(y2 - y1, x2 - x1);
        System.out.println("El ángulo en radianes es: " + anguloRadianes);

        // Convertir el ángulo de radianes a grados
        double anguloGrados = Math.toDegrees(anguloRadianes);
        System.out.println("El ángulo en grados es: " + anguloGrados);
    }
}