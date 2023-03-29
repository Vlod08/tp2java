package com.Tp2;

import java.util.ArrayList;

public class MultipleNumberFormatException extends RuntimeException{

    public MultipleNumberFormatException(String str){
        super(str);
    }
    public static ArrayList<String> probValues(String [] str) {
        ArrayList<String> probval = new ArrayList<String>();
        for(int i = 0;i<str.length;i++){
            try{
                Integer.parseInt(str[i]);
            }
            catch (Exception e){

                probval.add(str[i]);

            }
        }
        return probval;
    }

}
