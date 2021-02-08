package listaarray;
public class Ex4 
{
    public static void main (String[]args)
    {
        Integer array[][];
        Integer i = new Integer(0);
        Integer j = new Integer(0);
        
        array = new Integer[50][100];
        
        for(i=49; i>=0; --i)
        {
            for(j=99; j>=0; --j)
            {
                array[i][j] = i+j;
            }
        }
        
        for(i=0; i<array.length; ++i)
        {
            for(j=0; j<array.length; ++j)
            {
                System.out.println(array[i][j]);
            }
        }
    }
    
}
