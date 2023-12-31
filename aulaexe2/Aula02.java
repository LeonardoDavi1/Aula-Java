package aulaexe2;

/**
 * Exercício 02
 * Aula:10/07/2023
 * Disciplina: Linguagem de Programação
 * Materia: Manipulação de String
 * @author: Leonardo Davi Chagas Barbosa
 */
public class Aula02 {
   public static void main(String[] args) {
  //Concatenação de Strings
        String saudacao = "Olá";
        String nome = "Maria";
        String mensagem = saudacao + ", " + nome + "!";
        
        System.out.println(mensagem);
        
        //Tamanho de uma String
        String texto = "Hello, World!";
        int tamanho = texto.length(); 
        
        System.out.println(tamanho);
        
        //Transformação de uma String em letras Maiusculas e Minusculas
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());   
        System.out.println(txt.toLowerCase());    

    }
}

