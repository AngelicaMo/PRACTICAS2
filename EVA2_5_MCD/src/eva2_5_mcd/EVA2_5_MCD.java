/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_mcd;

/**
 *
 * @author Angelica
 */
public class EVA2_5_MCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iVal1=180;
        int iVal2=48;
        System.out.println("El Maximo Comun Divisor de: " + iVal1 +","+ iVal2+" es: " + calcularMCD(iVal1, iVal2));        
    }
    public static int calcularMCD(int vDendo, int vDsor){
        if(vDsor==0){
            return vDendo;
        }else{
            int vResiduo = vDendo % vDsor;
            return calcularMCD(vDsor, vResiduo);
        }
    }
    
}
