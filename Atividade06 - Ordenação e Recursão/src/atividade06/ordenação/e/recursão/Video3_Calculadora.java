package atividade06.ordenação.e.recursão;
public class Video3_Calculadora 
{
    public static Integer fatorialNaoRecursivo(Integer num)
    {
        if(num == 0)
        {
            return 1;
        }
        
        Integer total = 1;
        for(Integer i = num; i>1; i--)
        {
            total *= i;
        }
        return total;
    }
    public static Integer fatorial(Integer num)
    {
        if(num == 0)
        {
            return 1;
        }
        return num*fatorial(num-1);
    }
    
}
