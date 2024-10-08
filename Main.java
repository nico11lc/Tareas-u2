import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        // Genera números aleatorios
        int num1 = rand.nextInt(100) + 1;
        int num2 = rand.nextInt(100) + 1;
        int num3 = rand.nextInt(100) + 1;
        int num4 = rand.nextInt(100) + 1;
        int num5 = rand.nextInt(100) + 1;
        int num6 = rand.nextInt(100) + 1;
        int num7 = rand.nextInt(100) + 1;
        int num8 = rand.nextInt(100) + 1;
        int num9 = rand.nextInt(100) + 1;
        int num10 = rand.nextInt(100) + 1;

        // Suma de los números
        double suma = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;

        // Calcula las raíces cuadradas
        double raiz1 = Math.sqrt(num1);
        double raiz2 = Math.sqrt(num2);
        double raiz3 = Math.sqrt(num3);
        double raiz4 = Math.sqrt(num4);
        double raiz5 = Math.sqrt(num5);
        double raiz6 = Math.sqrt(num6);
        double raiz7 = Math.sqrt(num7);
        double raiz8 = Math.sqrt(num8);
        double raiz9 = Math.sqrt(num9);
        double raiz10 = Math.sqrt(num10);

        // Eleva los números al cuadrado
        double cuadrado1 = Math.pow(num1, 2);
        double cuadrado2 = Math.pow(num2, 2);
        double cuadrado3 = Math.pow(num3, 2);
        double cuadrado4 = Math.pow(num4, 2);
        double cuadrado5 = Math.pow(num5, 2);
        double cuadrado6 = Math.pow(num6, 2);
        double cuadrado7 = Math.pow(num7, 2);
        double cuadrado8 = Math.pow(num8, 2);
        double cuadrado9 = Math.pow(num9, 2);
        double cuadrado10 = Math.pow(num10, 2);

        // Calcula la media
        double media = suma / 10;

        // Calcula la desviación estándar
        double sumaDesviaciones = Math.pow(num1 - media, 2) + Math.pow(num2 - media, 2) + Math.pow(num3 - media, 2)
                + Math.pow(num4 - media, 2) + Math.pow(num5 - media, 2) + Math.pow(num6 - media, 2)
                + Math.pow(num7 - media, 2) + Math.pow(num8 - media, 2) + Math.pow(num9 - media, 2)
                + Math.pow(num10 - media, 2);

        double desviacionEstandar = Math.sqrt(sumaDesviaciones / 10);

        // Muestra los resultados
        System.out.println("Números generados: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + ", " + num6 + ", " + num7 + ", " + num8 + ", " + num9 + ", " + num10);
        System.out.println("Raíces cuadradas: " + raiz1 + ", " + raiz2 + ", " + raiz3 + ", " + raiz4 + ", " + raiz5 + ", " + raiz6 + ", " + raiz7 + ", " + raiz8 + ", " + raiz9 + ", " + raiz10);
        System.out.println("Cuadrados: " + cuadrado1 + ", " + cuadrado2 + ", " + cuadrado3 + ", " + cuadrado4 + ", " + cuadrado5 + ", " + cuadrado6 + ", " + cuadrado7 + ", " + cuadrado8 + ", " + cuadrado9 + ", " + cuadrado10);
        System.out.println("Media: " + media);
        System.out.println("Desviación estándar: " + desviacionEstandar);
    }
}