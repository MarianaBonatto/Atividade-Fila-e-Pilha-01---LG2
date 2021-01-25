package exerccio.pilha.e.fila;

import java.util.Stack;

public class Teste 
{
    public static void main(String[]args)
    {
        Pilha pilha = new Pilha();
        
       // Inserindo nomes na Pilha//
        pilha.Push("Mariana");
        System.out.println(pilha);
        pilha.Push("Guilherme");
        System.out.println(pilha);
        
        //Removendo nomes na pilha//
        String r1 = pilha.Pop();
        System.out.println(r1);
        String r2 = pilha.Pop();
        System.out.println(r2);
        System.out.println(pilha);
        System.out.println(pilha.Vazia());
        
        pilha.Push("Jorge");
        System.out.println(pilha);
        System.out.println(pilha.Vazia());
        
        //Utilizando o Stack//
        Stack<String> stack = new Stack<String>();
        //Inserindo//
        stack.push("Mariana");
        stack.push("Guilherme");
        System.out.println(stack);
        
        //Removendo//
        System.out.println(stack.pop());
        System.out.println(stack);
        stack.push("Jorge");
        
        //Peek//
        String nome = stack.peek();
        System.out.println(nome);
        System.out.println(stack);
    }
}
