package com.example.unittest;



public class Validator {

    public float converterFahrenheitToCelsius(float farenheit){

        float result =((farenheit-32)*5/9);
        return result;
    }


    public int all_days(int number){

        int result = number*10;
        return result;
    }



    public Boolean lenght(String name){

        if(name.equals("")){
            return false;
        }else if(name.length()>10){
            return  false;
        }
        return true;
    }




    public String name(String name){

        if(name.equals("hassan")){
            return "hassan";
        }
        return "not_mach";
    }



}
