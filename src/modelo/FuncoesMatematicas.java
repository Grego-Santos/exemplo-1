/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author italo
 */
public class FuncoesMatematicas {
    
    public boolean isEquilateralTriangle(String param) {
        String[] dates = convertDates(param);
        float ladoA = Float.valueOf(dates[0]);
        float ladoB = Float.valueOf(dates[1]);
        float ladoC = Float.valueOf(dates[2]);
        
        return ladoA == ladoB && ladoB == ladoC;
    }
    
    public boolean isIsoscelesTriangle(String param) {
        String[] dates = convertDates(param);
        float ladoA = Float.valueOf(dates[0]);
        float ladoB = Float.valueOf(dates[1]);
        float ladoC = Float.valueOf(dates[2]);
        
        return ladoA == ladoB && ladoB != ladoC
            || ladoA == ladoC && ladoA != ladoB
            || ladoB == ladoC && ladoB != ladoA;
    }
    
    public boolean isScaleneTriangle(String param) {
        String[] dates = convertDates(param);
        float ladoA = Float.valueOf(dates[0]);
        float ladoB = Float.valueOf(dates[1]);
        float ladoC = Float.valueOf(dates[2]);
        
        return ladoA != ladoB &&
               ladoB != ladoC &&
               ladoC != ladoA;
    }
    
    private String[] convertDates(String param) {
        return param.split(",");
    }
}
