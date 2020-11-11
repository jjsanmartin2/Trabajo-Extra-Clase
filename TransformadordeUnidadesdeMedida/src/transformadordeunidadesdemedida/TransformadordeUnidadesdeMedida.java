/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transformadordeunidadesdemedida;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class TransformadordeUnidadesdeMedida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner leer = new Scanner(System.in);
        double metr, cem, kim, pies, pulg;
        
        metr = 0; cem = 0; kim = 0; pies = 0; pulg = 0;
        System.out.println("     Transformando Unidades de Medida     ");
        
        System.out.println("");
        
        System.out.println("Ingrese la cantidad de metros que desee"
                + " transformar");
        metr = leer.nextDouble();
        
        cem = (metr * 100);
        kim = (metr / 1000);
        pies = (metr * 3.28);
        pulg = (metr * 39.3701);
        
        System.out.println("Los resultados de las conversiones son los"
                + " siguientes\n"
                + "\n" +metr+ " = " +cem+ "centimetros"
                + "\n" +metr+ " = " +kim+ "kilometros"
                + "\n" +metr+ " = " +pies+ "pies"
                + "\n" +metr+ " = " +pulg+ "pulg"
                + "\nGracias por usar nuestro codigo, que tengas un buen dia");
    
    
    
    }
    
}
