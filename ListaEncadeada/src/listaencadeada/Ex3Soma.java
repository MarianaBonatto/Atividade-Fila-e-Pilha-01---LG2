package listaencadeada;

import java.util.LinkedList;

public class Ex3Soma
{
    public static void main(String[] args)
    {
        LinkedList<Integer> lista1 = new LinkedList<Integer>();
        Integer resultado = new Integer(0);
        
        lista1.add(2);
        lista1.add(2);
        lista1.add(2);
        lista1.add(2);
        lista1.add(2);
        lista1.add(2);
        lista1.add(2);
        lista1.add(2);
        lista1.add(2);
        lista1.add(2);

        for(Integer i=0; i<10; ++i)
        {
         resultado = resultado + lista1.get(i);
        }
         System.out.println(resultado); 
           
       

    }
}
