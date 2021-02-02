package listaencadeada;

import java.util.LinkedList;

public class Ex4Maior 
{
    public static void main (String[] args)
    {
        LinkedList<Integer> lista1 = new LinkedList<Integer>();
        Integer resultado = new Integer(0);
        
        lista1.add(0);
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        lista1.add(15);
        lista1.add(6);
        lista1.add(7);
        lista1.add(8);
        lista1.add(9);
        
        for (Integer i=0; i<10; i++)
        {
            if(resultado<lista1.get(i))
            {
                resultado = lista1.get(i);
            } 
        }
        System.out.println(resultado);
    }
}
