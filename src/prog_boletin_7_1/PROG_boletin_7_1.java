package prog_boletin_7_1;

import java.util.Scanner;

public class PROG_boletin_7_1 {

    public static void main(String[] args) {
        Scanner obj=new Scanner (System.in);
        System.out.println("teclea un número negativo o positivo");
        double num=obj.nextDouble();
        Numero obj1=new Numero();
        obj1.numPositivo(num);
            
        
    }
    
}
