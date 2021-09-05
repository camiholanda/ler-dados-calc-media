import java.util.Scanner;
public class Inform_Media {
     
    public static void main(String[] args) {
        // All code application logic here
        
        //Declaração variáveis
        
        String nome;
        char serie;
        String telefone;
        float media;
        double nota1, nota2, nota3;
        
        //Entrada de Dados
         
         Scanner leitor = new Scanner(System.in);
                System.out.println("Para obter o resultado da sua média, preencha as informações a seguir\n - Nome:  ");
                    nome = leitor.next();
                         System.out.println("- Série: ");
                             serie = (char) leitor.nextInt();
                                    System.out.println(" - Telefone: ");
                                         telefone = leitor.next();
                                               System.out.println(" - Nota da Prova 1: ");
                                                   nota1 = leitor.nextDouble(); 
                                                            System.out.println(" - Nota da Prova 2: ");
                                                                 nota2 = leitor.nextDouble();
                                                                      System.out.println(" - Nota da Prova 3: ");
                                                                              nota3 = leitor.nextDouble();
                                                                              
                                                                              //Processamento
                                                                              
                                                                                           System.out.println(" Sua média é: "+ (nota1 + nota2 + nota3) / 3);
                                                 
    }
    
}
