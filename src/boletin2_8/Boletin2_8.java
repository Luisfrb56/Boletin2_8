
package boletin2_8;

import java.util.Scanner;


public class Boletin2_8 {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int b100,b20,b5,m1,total;
        System.out.println("Teclea la cantidad de billetes de 100 :");
        b100=sc.nextInt();
        System.out.println("Teclea la cantidad de billeres de 20 :");
        b20=sc.nextInt();
        System.out.println("Teclea la cantidad de billetes de 5 :");
        b5=sc.nextInt();
        System.out.println("Teclea la cantidad de monedas de 1 :");
        m1=sc.nextInt();
        total=100*b100+20*b20+5*b5+1*m1;
        System.out.println("La suma total del dinero es de "+total+"€");
    }
    
}
