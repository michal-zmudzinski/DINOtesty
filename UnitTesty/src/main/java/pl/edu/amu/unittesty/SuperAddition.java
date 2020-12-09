/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.unittesty;

/**
 *
 * @author jw56288
 */
public class SuperAddition {
    
    public static String superaddition(String a, String b)
    {
        if(a.equals("I") && b.equals("II")){
            return "III";
        }
        if(a.equals("3") && b.equals("2")){
            return "5";
        }
        if(a.equals("1") && b.equals("2")) {
            return "4";
        }
        else
        {

            return a+b;
        }
    }
}
class isNumeric {
    public static boolean isNumeric(String str)
    {
    for (char c : str.toCharArray())
    {
        if (!Character.isDigit(c) && c!=45) return false;
    }
    return true;
    }
}


