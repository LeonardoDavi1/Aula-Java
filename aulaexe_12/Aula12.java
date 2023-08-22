package aulaexe_12;

import java.util.Scanner;

/**
 * Exercicio: 12
 * Data: 21/08/2023
 * @author Leonardo Davi Chagas Barbosa
 */
public class Aula12 {
  public static void main (String[] args)  
{
   Scanner ler = new Scanner(System.in);       
  int idade;        
          
    System.out.println("Qual sua idade: ");
    idade = ler.nextInt();

 if(idade >= 18)
{
  System.out.println("Maior de idade: ");
}
 else  
{
  System.out.println("Menor de idade");    
    
    
}
}
}  