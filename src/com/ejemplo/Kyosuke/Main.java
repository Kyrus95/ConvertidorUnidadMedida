package com.ejemplo.Kyosuke;
import java.math.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String Opcion = "y"; //Condicion inicial para ejecutar por primera vez el ciclo while
        while (Opcion.compareTo("n") != 0 ) { //Permite usar el convertidor mientras el usuario no indique "n" que es la opcion para finalizar el programa
            System.out.println("Digite pies para convertir de [Pies a Centimetros] o pulgadas para convertir de [Pulgadas a Centimetros]");
            String seleccion = teclado.next().toLowerCase();
            System.out.println("Ingrese el valor de la longitud: ");
            double longitud = teclado.nextDouble();
            System.out.println("Indique la cantidad maxima de decimales que quiere obtener: ");
            int maxDecimales = teclado.nextInt(); //El usuario define hasta cuantas decimales quiere ver
            String strValue1 = Double.toString(longitud);
            BigDecimal bigValue1 = new BigDecimal(strValue1);
            BigDecimal ValorCentimetro = null;
            switch (seleccion) {
                case "pies":
                    ValorCentimetro = bigValue1.divide(BigDecimal.valueOf(0.032808), maxDecimales, RoundingMode.HALF_UP);
                    break;
                case "pulgadas":
                    ValorCentimetro = bigValue1.divide(BigDecimal.valueOf(0.39370), maxDecimales, RoundingMode.HALF_UP);
                    break;
            }
            System.out.println(bigValue1 + " " + seleccion + " = " + ValorCentimetro + " centimetros");
            System.out.println("¿Desea continuar?: Digite Y para continuar o N para finalizar"); //El usuario elige si se desea seguir usando el programa o finalizarla
            Opcion = teclado.next().toLowerCase();
        }
    }
}