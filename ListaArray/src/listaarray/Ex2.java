package listaarray;

import java.util.Scanner;

public class Ex2 
{
    public static void main (String [] args)
    {
        Scanner teclado = new Scanner(System.in);
        Integer vetor[];
        Integer i = new Integer(0);
        
        vetor = new Integer[10];
        
        //Preenchendo o array
        for(i=9; i>=0; --i)
        {
            System.out.println("Digite 10 números:");
            vetor[i] = teclado.nextInt();
        }
       
        System.out.println("");
        
        for(i=0; i<vetor.length; ++i)
        {
        System.out.println(vetor[i]);
        }
        
        
    }
    
}
