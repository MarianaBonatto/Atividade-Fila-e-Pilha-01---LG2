package exerccio.pilha.e.fila;

import java.util.LinkedList;
import java.util.List;

public class Fila
{
    private List<String> alunos = new LinkedList<String>();
    
    public void Adiciona(String aluno)
    {
        alunos.add(aluno);
    }
    public String Remove()
    {
        return alunos.remove(0);
    }
    public Boolean Vazia()
    {
        return alunos.isEmpty();
    }
    @Override
    public String toString() {
        return "Fila{" + "Alunos = " + alunos + '}';
    }
    
}
