/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problemarioisc;
import java.util.Scanner;
/**
 7. Algoritmo que lea 10 números enteros y nos muestre el máximo, el mínimo y
la media de todos ellos.
 */
public class problema7 {
  public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int num, max = 0, min = 0, suma=0;
       double media=0;
 
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un número entero ");
            num = entrada.nextInt();
              //La variable suma almacenara los valores que se vayan pasando por teclado
                suma=suma+num;
            if (min != 0 && max != 0) {
             
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }
            else {
                min = num;
                max = num;
            }
          
            media=(double)suma/5;
        }
        System.out.println("El número máximo es " + max);
        System.out.println("El número mínimo es " + min);
        System.out.println("La media es de "+ media);
    }
}
