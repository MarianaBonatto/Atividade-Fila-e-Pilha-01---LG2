package exerccio.pilha.e.fila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFila 
{
    public static void main (String[]args)
    {
        Fila fila = new Fila();
        
        fila.Adiciona("Mariana");
        fila.Adiciona("Guilherme");
        System.out.println(fila);
        
        String a1 = fila.Remove();
        System.out.println(a1);
        System.out.println(fila);
        System.out.println(fila.Vazia());
        
        Queue<String> filaDoJava = new LinkedList<String>();
        
        filaDoJava.add("Mariana");
        String a2 = filaDoJava.poll();
        System.out.println(a2);
        System.out.println(filaDoJava);
        
    }
    
}
