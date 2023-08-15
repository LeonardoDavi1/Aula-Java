package aulaexe6;

/**
 * Exercicio 6
 * Disciplina: Linguagem de Programação
 * Aula: 15/08/2023
 * @author Leonardo Davi Chagas Barbosa
 */
public class Aula06 {
   public static void main(String[] args){ 

    float  nota1 = 8;
    float  nota2 = 6;
    float  nota3 = 5;
    float  nota4 = 6;   
    
    float media, soma = 0;
    
    soma = nota1 + nota2 + nota3 + nota4;
    media = soma / 4;
    
    
    System.out.println("Soma: "+ soma);
    System.out.println("Media: "+ media);
   
   }
}