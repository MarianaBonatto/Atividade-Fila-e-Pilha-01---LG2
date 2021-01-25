package exerccio.pilha.e.fila;

import java.util.LinkedList;
import java.util.List;

public class Pilha 
{
    private List<String> nomes = new LinkedList<String>();
    
    public void Push(String nome)
    {
        nomes.add(nome);
    }
    public String Pop()
    {
        return nomes.remove(nomes.size()-1);
    }
    public Boolean Vazia()
    {
        return nomes.isEmpty();
    }

    @Override
    public String toString() {
        return "Pilha{" + "Nomes = " + nomes + '}';
    }
    
}
