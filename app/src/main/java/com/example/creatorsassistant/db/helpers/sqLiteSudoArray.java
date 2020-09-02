package com.example.creatorsassistant.db.helpers;

public class sqLiteSudoArray {
    public sqLiteSudoArray(){}

    public String arrayToString(int[] array){
        String csv = "";
        int i = 0;
        for(int num: array){
            if(i != 0) {
                csv = csv.concat("," + Integer.toString(num));
            }else{
                csv = Integer.toString(num);
            }
            i = i + 1;
        }
        return(csv);
    }

    public int[] stringToArray(String csv){
        String[] values = csv.split(",");
        int[] array = {0};
        int i = 0;
        for(String value: values) {
            array[i] = Integer.parseInt(value);
            i = i + 1;
        }
        return array;
    }
}
