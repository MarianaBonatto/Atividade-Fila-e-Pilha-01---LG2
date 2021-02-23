package atividade.exceções.e.controle.de.erros;

import java.util.Scanner;

public class Throws 
{
    public static void main(String[]args)
    {
        System.out.println("ENTRE COM UM NÚMERO DECIMAL");
        try {
            Double num = leNumero();
            System.out.println("VOCÊ DIGITOU " + num);
        } catch (Exception ex) {
            System.out.println("ENTRADA INVÁLIDA");
             ex.printStackTrace();
        }
    }
    public static Double leNumero() throws Exception
    {
        Scanner teclado = new Scanner(System.in);
        Double num = teclado.nextDouble();
        return num;
    }
}
