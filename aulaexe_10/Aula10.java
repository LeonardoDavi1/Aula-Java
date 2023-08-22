package aulaexe_10;

import java.util.Scanner;

/**
 * Exercicio 10
 * Data: 21/08/2023
 * @author Leonardo Davi Chagas Barbosa
 */
public class Aula10 {
  public static void main(String[] args){          
   Scanner scanner = new Scanner(System.in);
    int escolha;  
       

  do{               
     System.out.println("Menu");        
     System.out.println("1. Opcao 1");               
     System.out.println("2. Opcao 2");      
     System.out.println("3. Opcao 3");       
     System.out.println("0. Sair");
     System.out.print("Escolha");
     escolha = scanner.nextInt();
    
     switch (escolha)
     {
     case 1:
     System.out.println("Voce escolheu a opcao 1.");
     break;
     case 2:

     System.out.println("Voce escolheu a opcao 2.");
     break;
    
         case 3:
     System.out.println("Voce escolheu 3.");
     break;
    
         case 0:
     System.out.println("Saindo do programa...");
     break;
    default: 
     System.out.println("Opcao Invalida");
     break;
    
     }
       System.out.println();
      
   } while (escolha != 0);
 }
} 