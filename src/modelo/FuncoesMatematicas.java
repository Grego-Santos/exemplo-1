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
    
    private String[] convertDates(String param) {
        return param.split(",");
    }
    
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
    
    public float[] calcularGastoTotalDaViagem(String viagem) {
        String[] vetor                   = convertDates(viagem);
        float[]  gastos                  = new float[5];
        float    quilometrosIraPercorrer = Float.valueOf(vetor[0]);
        float    quilometrosCarroFaz     = Float.valueOf(vetor[1]);
        float    precoCombustivel        = Float.valueOf(vetor[2]);
        float    valorTotalDePedagio     = Float.valueOf(vetor[3]);
        
        gastos[0] = quilometrosIraPercorrer;
        gastos[1] = quilometrosCarroFaz;
        gastos[2] = precoCombustivel;
        gastos[3] = valorTotalDePedagio;
        gastos[4] = quilometrosIraPercorrer / quilometrosCarroFaz * precoCombustivel + valorTotalDePedagio;
        
        return gastos;
    }
    
    public String calcularIMC(String imc) {
        String[] vetor = convertDates(imc);
        float altura = Float.valueOf(vetor[0]);
        float peso   = Float.valueOf(vetor[1]);
        float valor_imc = peso / (altura * altura);
        
        if (valor_imc < 20.0) {
            return "abaixo do peso";
        } else if (valor_imc >= 20 && valor_imc <= 24) {
            return "saudável";
        } else if (valor_imc >= 25 && valor_imc <= 29) {
            return "acima do peso";
        } else {
            return "obeso";
        }
    }
    
}
