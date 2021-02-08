package listaarray;
public class Ex3 
{
    public static void main (String[]args)
    {
        Integer array[][];
        Integer i = new Integer(0);
        Integer j = new Integer(0);
        
        array = new Integer[100][100];
        
        array = new Integer [50][100];
        
     for(i=0; i<array.length; ++i)
     {
         for(j=0; j<array.length; ++j)
         {
             array[i][j] = i-j;
         }
         
     }
      for(i=0; i<array.length; ++i)
     {
         for(j=0; j<array.length; ++j)
         {
        System.out.println(array[i][j]);
        
         }
     }
      
        System.out.println("");
      
       for(i=0; i<array.length; ++i)
     {
         for(j=0; j<array.length; ++j)
         {
             array[i][j] = array[i][j]*7;
         }
         
     }
      for(i=0; i<array.length; ++i)
     {
         for(j=0; j<array.length; ++j)
         {
        System.out.println(array [i][j]);
        System.out.println("");
         }
     }
    }
    
    }
  
