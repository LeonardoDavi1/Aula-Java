package aulaexe_14;

import java.util.Scanner;

/**
 * Exercicio: 14
 * Data: 21/08/2023
 * @author Leonardo Davi Chagas Barbosa
 */
public class Aula14 {
  public static void main(String[] args)
 {  
    Scanner scan = new Scanner(System.in);
    int escolha;      
          
    do      
{          
    System.out.println("CARDAPIO");          
    System.out.println("1 - Hamburge");      
    System.out.println("2 - Cheeseburger");      
    System.out.println("3 - Fritas");      
    System.out.println("4 - Refrigerante");      
    System.out.println("5 - Milkshake");
    System.out.println("0 - Sair");
    System.out.println("");
    escolha = scan.nextInt();     
    switch(escolha)      
{          
   case 1:          
       System.out.println("1 - Hamburger: R$ 30,00");    
       break;   
   
   case 2:       
       System.out.println("2 - Cheeseburger: R$35,00");     
       break;   
          
   case 3:          
       System.out.println("3 - Fritas: R$ 20,00");    
       break;   
          
   case 4:          
       System.out.println("4 - Refrigerante: R$ 10,00");    
       break;   
          
   case 5:          
       System.out.println("5 - Milkshake: R$ 30,00");    
       break;   
   default:
       System.out.println("Opcao Invalida");
       break;
    }    
    System.out.println("---------------------------");   
    }
    while(escolha !=0);               
}  
}