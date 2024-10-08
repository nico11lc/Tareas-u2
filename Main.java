
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //delcarion de variables
        String productoUno;
        String productoDos;
        String productoTres;
        int cantidadUno;
        int cantidadDos;
        int cantidadTres;
        double precioUno;
        double precioDos;
        double precioTres;
        double descUno;
        double descDos;
        double descTes;
        double impuestoUno;
        double impuestoDos;
        double impuestoTres;

        //entrada de datos
        System.out.println("ingrese el producto 1 : ");
        productoUno = sc.nextLine();
        System.out.println("ingresa la catidad de productos : ");
        cantidadUno = sc.nextInt();
        System.out.println("ingrese precio unitario del producto : ");
        precioUno = sc.nextDouble();
        System.out.println("ingrese el porcentaje del descuento : ");
        descUno = sc.nextDouble();
        System.out.println("ingrese los impuestos aplicables en porcentaje : ");
        impuestoUno = sc.nextDouble();
        sc.nextLine();// Limpiar buffer
        System.out.println("\n");

        //entrada de datos
        System.out.println("ingresa el producto 2 : ");
        productoDos = sc.nextLine();
        System.out.println("ingresa la catidad de productos : ");
        cantidadDos = sc.nextInt();
        System.out.println("ingrese el precio unitario del producto : ");
        precioDos = sc.nextDouble();
        System.out.println("ingresa el porcentaje del descuento : ");
        descDos = sc.nextDouble();
        System.out.println("ingrese los impuestos  aplicables en porcentaje : ");
        impuestoDos = sc.nextDouble();
        sc.nextLine();// Limpiar buffer
        System.out.println("\n");

        //entrada de datos
        System.out.println("ingresa el producto 3 : ");
        productoTres = sc.nextLine();
        System.out.println("ingresa la catidad de productos : ");
        cantidadTres = sc.nextInt();
        System.out.println("ingrese el precio unitario del producto : ");
        precioTres = sc.nextDouble();
        System.out.println("ingresa el porcentaje del descuento : ");
        descTes = sc.nextDouble();
        System.out.println("ingrese los impuestos  aplicables en porcentaje : ");
        impuestoTres = sc.nextDouble();
        sc.nextLine();// Limpiar buffer
        System.out.println("\n");

        //salida producto uno
        System.out.println("resumen del pedido :");
        System.out.println("producto 1 : " + productoUno);
        System.out.println("cantidad 1: " + cantidadUno);
        double precioTotalUno = precioUno * cantidadUno;
        System.out.println("precio total sin descuento  : " + precioTotalUno);
        descUno = precioTotalUno * (descUno / 100);
        System.out.println("descuento: " + descUno);
        double precioDescUno = precioTotalUno - descUno;
        System.out.println("precio con descuento : " + precioDescUno);
        impuestoUno = precioDescUno * (impuestoUno / 100);
        System.out.println("impuesto aplicado ; " + impuestoUno);
        double TotalAPagarUno = precioDescUno + impuestoUno;
        System.out.println("total a pagar : " + TotalAPagarUno);
        System.out.println("\n");

        //salida producto Dos
        System.out.println("producto 2: " + productoDos);
        System.out.println("cantidad 2: " + cantidadDos);
        double precioTotalDos = precioDos * cantidadDos;
        System.out.println("precio total sin descuento  : " + precioTotalDos);
        descDos = precioTotalDos * (descDos / 100);
        System.out.println("descuento: " + descDos);
        double precioDescDos = precioTotalDos - descDos;
        System.out.println("precio con descuento : " + precioDescDos);
        impuestoDos = precioDescDos * (impuestoDos / 100);
        System.out.println("impuesto aplicado ; " + impuestoDos);
        double TotalAPagarDos = precioDescDos + impuestoDos;
        System.out.println("total a pagar : " + TotalAPagarDos);
        System.out.println("\n");

        //salida producto tres
        System.out.println("producto 3: " + productoTres);
        System.out.println("cantidad 3: " + cantidadTres);
        double precioTotalTres = precioTres * cantidadTres;
        System.out.println("precio total sin descuento  : " + precioTotalTres);
        descTes = precioTotalTres * (descTes / 100);
        System.out.println("descuento: " + descTes);
        double precioDescTres = precioTotalTres - descTes;
        System.out.println("precio con descuento : " + precioDescTres);
        impuestoTres = precioDescTres * (impuestoTres / 100);
        System.out.println("impuesto aplicado ; " + impuestoTres);
        double TotalAPagarTres = precioDescTres + impuestoTres;
        System.out.println("total a pagar : " + TotalAPagarTres);


    }
}