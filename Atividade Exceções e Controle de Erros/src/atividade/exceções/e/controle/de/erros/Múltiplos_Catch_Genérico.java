package atividade.exceções.e.controle.de.erros;
public class Múltiplos_Catch_Genérico 
{
    public static void main (String[]args)
    {
        Integer[] numeros = {4,8,16,32, 64, 128};
        Integer[] denominador = {2,0,4,8,0};
        
        for(Integer i = 0; i<numeros.length; i++)
        {
            try{
            System.out.println(numeros[i] + "/" + denominador[i] + " = " + (numeros[i]/denominador[i]));
            }
            catch(ArithmeticException e1){
                System.out.println("ERRO AO DIVIDIR POR ZERO");
            }
            catch(Throwable e2){
                System.out.println("OCORREU UM ERRO");
            }
        }  
    }
}
