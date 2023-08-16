
package aulaexe8;

/**
 * Exercicio 8
 * Materia: Operadores relacionais, Logicos e Estruturas Condicionais
 * Disciplina: Linguagem de Programação
 * Aula: 15/08/2023
 * @author Leonardo Davi Chagas Barbosa
 */
public class Aula08 {
  public static void main (String[] args){   
   int a = 10;
   int b = 5;
      
   System.out.println(a > b && a < b);
  
    if (a > b){
    
        System.out.println("Maior");
    }else if(a < b){    
        System.out.println("Menor");
    }else{   
        System.out.println("Igual");
    }  
  }
}  