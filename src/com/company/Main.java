package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Fracao.divisao(2,3,5);


        Data data = null;

        if(Data.verificaData(31,8,2021))
            data = new Data(31,8,2021);
        else
            System.out.println("Data incorreta");


        System.out.println(StringUtil.trim("123     "));


        System.out.println(StringUtil.indexOfN("arara",'a',3));

    }


}
