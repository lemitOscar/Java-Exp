package org.profesional.arrayMultidimecion;

public class Piloto {
    public static void main(String[] args) {
        int[][] arregloCal = {{87, 96, 70}, {68, 87, 90}, {94, 100, 90}, {100, 81, 82}, {83, 65, 85}, {78, 87, 65}, {85, 75, 83}, {91, 94, 100}, {76, 72, 84}, {87, 93, 73}};

        //operations

        //este es el primer arreglo
        System.out.println("usando un foreach");
        for (int[] a : arregloCal) {
            //este es el segundo arreglo
            for (int ados : a) {
                System.out.println("general a " + a + " ados " + ados);
            }
        }


        //
        System.out.println();
        System.out.println("usando un for tradicional");
        //primer arreglo
        for (int i = 0; i < arregloCal.length; i++) {
            //segundo arreglo
            for (int j = 0; j < arregloCal[i].length; j++) {
                System.out.println("posicion general " + i + " datos de esa posicion " + arregloCal[i][j]);
            }
        }
    }


}
