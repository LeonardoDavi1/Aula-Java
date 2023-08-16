package aulaexe9;

import java.util.Scanner;

/**
 * Exercicio 9
 * Materia: Operadores relacionais, Logicos e Estruturas Condicionais
 * Disciplina: Linguagem de Programação
 * Aula: 15/08/2023
 * @author Leonardo Davi Chagas Barbosa 
 */
public class Aula09 {
  public static void main (String[] args){  
    Scanner ler = new Scanner(System.in); 
    System.out.println("Informe um valor");
     int num = ler.nextInt();
  
    if (num > 0)
    {
            System.out.println("Positivo");
    }
    else if(num < 0)
    {    
        System.out.println("Negativo");
    }
    else
    {   
        System.out.println("Igual 0");
    }
  }
}