package atividade.exceções.e.controle.de.erros;
public class Try_Catch 
{
    public static void main(String[]args)
    {
        try
        {
        Integer[] vetor = new Integer[4];
        System.out.println("ANTES DA EXCEPTION");
        
        vetor[4] = 1;
        System.out.println("ESSE TEXTO NÃO SERÁ IMPRESSO");
        }
        catch(ArrayIndexOutOfBoundsException exeption)
        {
            System.out.println("EXCEÇÃO AO ACESSAR ÍNDICE DO VETOR QUE NÃO EXISTE");
        }
        
        System.out.println("ESSE TEXTO SERÁ IMPRESSO APÓS A EXEPTION");
    }
    
}
