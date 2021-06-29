package com.company;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Data {

    private Date data;

    public Data(int dia, int mes, int ano) {
        this.data = new Date(ano-1900, mes-1, dia);
    }

    public Date getData() {
        return data;
    }

    public void setData(int dia, int mes, int ano){
        this.data = new Date(ano-1900, mes-1, dia);
    }

    public static boolean verificaData(int dia, int mes, int ano){

        List<Integer> mes_30 = new ArrayList<Integer>();

        mes_30.add(3);
        mes_30.add(5);
        mes_30.add(8);
        mes_30.add(10);

        if(mes == 2 && dia > 28)
            return false;
        else if (mes_30.contains(mes) && dia > 30)
            return false;
        else if(dia > 31)
            return false;
        else
            return true;

    }

    @Override
    public String toString() {
        return DateFormat.getInstance().format(this.data);
    }
}
