package com.company;

public abstract class Fracao {

    // inteiros
    public static void soma(int a, int b){
        System.out.println(a + b);
    }

    public static void subtracao(int a, int b){
        System.out.println(a - b);
    }

    public static void divisao(int a, int b){
        System.out.println(a / b);
    }

    public static void multiplicacao(int a, int b){
        System.out.println(a * b);
    }



    // fracoes
    public static void soma(int aNumerador, int aDenominador, int bNumerador, int bDenominador){


            int nMmc;

            nMmc = mmc(aDenominador, bDenominador);

            System.out.println( (aNumerador+bNumerador) + "/" + nMmc);


    }

    public static void subtracao(int aNumerador, int aDenominador, int bNumerador, int bDenominador){

            int nMmc;

            nMmc = mmc(aDenominador, bDenominador);

            System.out.println( (aNumerador-bNumerador) + "/" + nMmc);

    }

    public static void divisao(int aNumerador, int aDenominador, int bNumerador, int bDenominador){

        System.out.println((aNumerador*bDenominador) + "/" + (aDenominador*bNumerador));

    }

    public static void multiplicacao(int aNumerador, int aDenominador, int bNumerador, int bDenominador){

        System.out.println((aNumerador*bNumerador) + "/" + (aDenominador*bDenominador));

    }

    // inteiros , fracoes
    public static void soma(int aNumerador, int aDenominador, int inteiro){

            int nMmc;

            nMmc = mmc(aDenominador, 1);

            System.out.println( (aNumerador+inteiro) + "/" + nMmc);

    }

    public static void subtracao(int aNumerador, int aDenominador, int inteiro){

            int nMmc;

            nMmc = mmc(aDenominador, 1);

            System.out.println( (aNumerador-inteiro) + "/" + nMmc);

    }

    public static void divisao(int aNumerador, int aDenominador, int inteiro){
        System.out.println((aNumerador*1) + "/" + (aDenominador*inteiro));
    }

    public static void multiplicacao(int aNumerador, int aDenominador, int inteiro){
        System.out.println((aNumerador*inteiro) + "/" + (aDenominador*1));
    }

    // mmc e mdc
    // referencia: https://www.blogcyberini.com/2018/03/algoritmo-para-calcular-o-mmc.html
    private static int mdc(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    private static int mmc(int a, int b){
        return a * (b / mdc(a, b));
    }


}
