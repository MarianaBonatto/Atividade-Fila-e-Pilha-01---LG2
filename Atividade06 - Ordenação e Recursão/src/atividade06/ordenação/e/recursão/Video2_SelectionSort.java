package atividade06.ordenação.e.recursão;

import java.util.Arrays;
import java.util.Random;


public class Video2_SelectionSort 
{
    public static void main(String [] args)
    {
        Integer []v = gerarVetor(10);
        selectionStart(v);
        System.out.println(Arrays.toString(v));
    }

    private static void selectionStart(Integer[] v) {
       for(Integer i= 0; i<v.length; i++)
       {
           Integer menor = i;
           for(Integer j = i+1; j<v.length; j++)
           {
               if(v[j]<v[menor])
               {
                   menor = j;
               }
           }
           trocar(v, i, menor);
       }
    }

    public static Integer[] gerarVetor(Integer n) 
    {
        Integer []v = new Integer[n];
        Random gerador = new Random();
        for(Integer i=0; i<n; ++i)
        {
            v[i] = gerador.nextInt(100);
        }
       return v;
    }

    private static void trocar(Integer[] v, Integer i, Integer menor) {
       Integer aux = v[i];
       v[i] = v[menor];
       v[menor] = aux;
    }
}

