package ArvoreExercicio;
public class Teste 
{
    public static void main(String [] args)
    {
        Arvore<Integer> arvore = new Arvore<Integer>();
        
        arvore.adicionar(10);
        arvore.adicionar(8);
        arvore.adicionar(5);
        arvore.adicionar(9);
        arvore.adicionar(7);
        arvore.adicionar(18);
        arvore.adicionar(13);
        arvore.adicionar(20);
        
        System.out.println("\nEM ORDEM :");
        arvore.emOrdem(arvore.getRaiz());
        
        System.out.println("\nPRÉ ORDEM :");
        arvore.preOrdem(arvore.getRaiz());
        
        System.out.println("\nPÓS ORDEM :");
        arvore.posOrdem(arvore.getRaiz());
    }
    
}
