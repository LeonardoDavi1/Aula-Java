package aulaexe_13;

import java.util.Scanner;

/**
 * Exercicio: 13
 * Data: 21/08/2023
 * @author Leonardo Davi Chagas Barbosa
 */
public class Aula13 {
  public static void main(String[] args){
   Scanner ler = new Scanner(System.in);        
   int numero, resto;       
          
   System.out.println("Digite um numero inteiro");       
   numero = ler.nextInt();       
          
   resto = numero % 2;        
          
   if(resto != 0)       
   {       
    System.out.println("O numero e Impar");       
   }       
   else       
   {       
    System.out.println("O numero e par");          
  }          
 }          
}
