
package exer13;

import java.util.Scanner;

public class Exer13 {

    /**
     salario com aumento de 25%
     */
    
    public static void main(String[] args) {
        Scanner leia;
        leia  = new Scanner (System.in);
        float salario_inicial;
        float acrescimo;
        float total;
        
        System.out.println("Digite o salario inicial");
        salario_inicial = Float.parseFloat(leia.nextLine());
        System.out.println("Digite o aumento percentual");
        acrescimo= Float.parseFloat(leia.nextLine());
        
        total = salario_inicial + (acrescimo/100 * salario_inicial);
        System.out.println("O salario total é"+"="+ total);
        
         
        
    }
    
}
