package atividade06.ordenação.e.recursão;
public class Video1_BubbleSort
{
    public static void main(String[] args) 
    {
       Integer vetor[] = {3, 6, 2, 1, 8, 4};
       Integer aux;
       Boolean controle;
       
       for(Integer i=0; i<vetor.length; ++i)
       {
           controle = true;
           for(Integer j=0; j<(vetor.length-1); ++j)
           {
              if(vetor[j]>vetor[j+1])
              {
                  aux = vetor[j];
                  vetor[j] = vetor[j+1];
                  vetor[j+1] = aux;
                  controle = false;
              }
           }
           if (controle)
           {
               break;
           }
       }
       for(Integer i=0; i<vetor.length; ++i)
           System.out.print(vetor[i] + "");
       
    }
    
}
