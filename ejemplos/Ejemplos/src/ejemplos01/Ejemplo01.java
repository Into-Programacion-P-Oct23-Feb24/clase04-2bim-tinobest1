/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //String miCiudad = obtenerCiudadMayuscula("Loja");
        //System.out.printf("%s\n", miCiudad);
        obtenerMultiplicacion(7, 50);
        //E

        String Mensaje = obtenerMultiplicacion(7, 50);
        System.out.printf("%s\n", Mensaje);

   // public static String obtenerCiudadMayuscula(String m) {
   //Aqui el error nos daba que no teniamos el static ya que no tenia que volver
       // String m2 = m.toUpperCase();
       // return m2;
    }

    public static String obtenerMultiplicacion(int tabla, int limite) {

        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena,
                    tabla, i,
                    operacion);
        }

        return cadena;
    }

}
