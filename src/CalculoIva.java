//Nelson De Abreu

//Escribir un programa en Java que calcule el IVA de una 
//compra realizada por el usuario. Considere el IVA en 16%

import java.util.Scanner;

public class CalculoIva {
    public static void main(String[] args) {

        Scanner monto = new Scanner(System.in);
        System.out.print("Ingrese el monto de la compra: ");
        
        double montoCompra = monto.nextDouble();
        double iva = montoCompra * 0.16;
        double totalAPagar = montoCompra + iva;

        System.out.println("Monto del IVA (16%): $" + iva);
        System.out.println("Total a pagar: $" + totalAPagar);

        monto.close();
    }
}