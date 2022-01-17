/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package distribucionfrecuencia;

/*
 * @author David
 */
public class DistribucionFrecuencia {

    public static void main(String[] args) {
        int[] salarios = {63, 82, 36, 49, 56, 64, 59, 35, 78, 43, 51, 70, 57, 62, 43, 68, 62, 26, 64, 72, 52, 51, 62, 60, 71, 61, 55, 59, 60, 67, 57, 67, 61, 67, 51, 81, 50, 64, 76, 44, 73, 56, 62, 63, 60};
        
        int size = salarios.length;
        
        int maximo = 0;
        
        int minimo = 0;
        
        for(int i = 0; i < salarios.length; i++){
            if(salarios[i] == 82){
                maximo++;
            }
            if(salarios[i] == 26){
                minimo++;
            }
        }
        System.out.println("La cantidad de datos (N) es: "+size);
        
        System.out.println("El numero mayor es: "+maximo);
        System.out.println("El numero menor es: "+minimo);
        
        System.out.println();
    }
}
