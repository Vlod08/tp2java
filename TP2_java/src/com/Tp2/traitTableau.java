package com.Tp2;


import javax.management.StringValueExp;
import java.util.ArrayList;

public class traitTableau {
    public static void aff(int tab[]){
        for(int i = 0; i<tab.length;i++)
        {
            System.out.println(tab[i]);

        }
    }

    public static int[] StoI (String[] string){
        int[] tab = new int[string.length];
        for(int i=0;i<string.length;i++)
        {
            tab[i] = Integer.parseInt(string[i]);

        }
        return tab;
    }

    public static int[] Stoitc (String[] string) throws MultipleNumberFormatException  {
        int[] tab = new int[string.length];
        try{
            for(int i=0;i<string.length;i++)
            {
                tab[i] = Integer.parseInt(string[i]);

            }

        }
        catch (Exception e){
            ArrayList<String> probVals = MultipleNumberFormatException.probValues(string);
            String excepstr ="";
            for(int i=0;i<probVals.size();i++)
            {
                excepstr += probVals.get(i)+ " , ";
            }
            throw new MultipleNumberFormatException(excepstr);
            // System.out.println(probVals);


        }
        return tab;
    }

    public static int max (int[] tab ){
        if(tab.length>0){
            int max = tab[0];
            for (int i=1;i< tab.length;i++)
            {
                max = (tab[i]>max)? tab[i] : max;
            }
            return max;
        }
        else{
            return Integer.MIN_VALUE;
        }

    }

    public static void main(String[] args) {
        aff(Stoitc(args));
    }


}

