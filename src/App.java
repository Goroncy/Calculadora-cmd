import java.util.*;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        operacoes operacao = new operacoes();

        Scanner scNum = new Scanner(System.in);
        Scanner scChar = new Scanner(System.in);
        char opcao;
        float num1;
        float num2;

        System.out.print("Informe um número a ser utilizado na operação: ");
        num1 = scNum.nextFloat();

        System.out.println("\nInforme a operação a ser realizada, sendo elas as abaixo:");
        System.out.println(" ----------------------------------------- ");
        System.out.println("|1- Soma \t 2-Subtração \t3-Divisão |\n|4-Multiplicação 5-Potencia\t6-Raiz    |\n|7-Cosseno\t 8-Seno      \t9-Tangente|");
        System.out.println(" ----------------------------------------- ");

        System.out.print("\nSua escolha é: ");
        opcao = scChar.nextLine().charAt(0);
        


        switch(opcao)
        {
            //Soma
            case '1': 
            System.out.print("\nA operação escolhida foi de soma, informe o segundo número: ");
            num2 = scNum.nextFloat();
            System.out.println("\nA operação é " + num1 + " + " + num2 + " possuindo resultado: " + operacao.soma(num1, num2));
            break;

            //Subtração
            case '2':
            System.out.print("\nA operação escolhida foi de subtração, informe o segundo número: ");
            num2 = scNum.nextFloat();
            System.out.println("\nA operação é " + num1 + " - " + num2 + " possuindo resultado: " + operacao.subtracao(num1, num2));
            break;

            //Divisão
            case '3':
            System.out.print("\nA operação escolhida foi de divisão, informe o segundo número: ");
            num2 = scNum.nextFloat();
            System.out.println("\nA operação é " + num1 + " / " + num2 + " possuindo resultado: " + operacao.divisao(num1, num2));
            break;
            
            //Multiplicação
            case '4':
            System.out.print("\nA operação escolhida foi de multiplicação, informe o segundo número: ");
            num2 = scNum.nextFloat();
            System.out.println("\nA operação é " + num1 + " * " + num2 + " possuindo resultado: " + operacao.multiplicacao(num1, num2));
            break;
            
            //Potencia
            case '5':
            System.out.print("\nA operação escolhida foi de potência, informe a qual será elevado: ");
            num2 = scNum.nextFloat();
            System.out.println("\nA operação é " + num1 + " elevado na " + num2 + " possuindo resultado: " + operacao.potencia(num1, num2));
            break;
            
            //Raiz
            case '6':
            System.out.print("\nA operação escolhida foi de radiciação.");
            System.out.println("\nA operação é a raiz de " + num1 + " possuindo assim resultado: " + operacao.raiz(num1));
            break;
            
            //Cosseno
            case '7':
            System.out.print("\nA operação escolhida foi de identificação do cosseno.");
            System.out.println("\nO resultado da operação é: "+ operacao.cos(num1));
            break;
            
            //Senno
            case '8':
            System.out.print("\nA operação escolhida foi de identificação do senno.");
            System.out.println("\nO resultado da operação é: "+ operacao.sin(num1));
            break;
            
            //Tangente
            case '9':
            System.out.print("\nA operação escolhida foi de identificação da tangente.");
            System.out.println("\nO resultado da operação é: "+ operacao.tan(num1));
            break;
        }
        scNum.close();
        scChar.close();


    }
}
