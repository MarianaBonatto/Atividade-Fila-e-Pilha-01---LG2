package listaarray;
public class Ex1 
{
    public static void main (String[]args)
    {
        Integer vetor[];
        Integer i = new Integer(0);
        
        vetor = new Integer[9];
        
        //Preenchendo o array
        for(i=0; i<vetor.length; ++i)
        {
            vetor[i] = i;
        }
        //Imprimindo os resultados 
        for(i=0; i<vetor.length; ++i)
        {
          System.out.println("" + vetor[i]);
        }
        System.out.println("");
        //Multiplicando por 3
        for(i=0; i<vetor.length; ++i)
        {
            vetor[i] = i*3;
        }
        //Imprimindo resulatado
        for(i=0; i<vetor.length; ++i)
        {
            System.out.println("" + vetor[i]);
        }
       
    }
    
}
