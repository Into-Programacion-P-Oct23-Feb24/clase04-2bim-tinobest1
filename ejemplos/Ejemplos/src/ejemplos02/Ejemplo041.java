/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo041 {

    public static void main(String[] args) {
        // 
        String cadenaFinal = "";
        int[][] one  = {{1, 2, 3}, {3, 2, 4}, {2, 6, 2}};
        int[][] tho = {{1, 2, 3}, {2, 2, 2}, {3, 2, 1}};
        int[][] tree = new int[3][3];

        for (int i = 0; i < one.length; i++) {
            for (int j = 0; j < tho[i].length; j++) {
                tree[i][j] = obtenerMultiplicacion(one[i][j],
                        tho[i][j]);
            }
        }
        for (int i = 0; i < one.length; i++) {
            for (int j = 0; j < one[i].length; j++) {
                tree[i][j] = obtenerMultiplicacion(one[i][j],
                        tho[i][j]);
            }
        }
        for (int i = 0; i < tho.length; i++) {
            for (int j = 0; j < one[i].length; j++) {
                System.out.printf(" %s %d", cadenaFinal,
                        tree[i][j]);
                if (j == 2) {
                    System.out.print("\n");
                }
            }
        }

    }

    public static int obtenerMultiplicacion(int a, int b) {
        int multiplicacion;
        multiplicacion = a * b;
        return multiplicacion;
    }

}
