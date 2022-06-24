package org.profesional.arreglosMultidi;

public class LibroCalificaciones {
    private String nombreCurso;
    private int[][] calificaciones;

    public LibroCalificaciones(String nombreCurso, int[][] calificaciones) {
        this.nombreCurso = nombreCurso;
        this.calificaciones = calificaciones;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int[][] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int[][] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public void operacionAll() {
        //obvio imprime
        imprimirCalificaiones();

        //llama a los metodo obtenerMininima Y Maxima
        System.out.printf("%n%s %d%s %d", "la calificacion mas baja es ", getMinima(), " la calificacion mas alta es ", getMaxima());
        System.out.println();

        //imprimir grafico
        // imprimirGraficoBarras();

    }
    /*
    * s para las cadenas
    * d para los enteros
    * n para salto de linea
    * f para los decimales
    * */

    private void imprimirCalificaiones() {
        System.out.println("...... imprimir calificaciones ............");
        for (int i = 0; i <calificaciones[0].length ; i++) {
            System.out.printf("Prueba %d ",i+1);
        }
    }

    /*Obtiene la calificacion maxima de la matris
     * */
    private int getMaxima() {
        int califAlta = calificaciones[0][0];
        for (int[] arreCalifi : calificaciones) {
            for (int a : arreCalifi) {
                if (a > califAlta) {
                    califAlta = a;
                }
            }
        }
        return califAlta;
    }

    private int getMinima() {
        //obtengo calificacion de los indices ceros
        int califBaja = calificaciones[0][0];
        //itera el arreglo general
        for (int[] califi : calificaciones) {
            //itera el arreglo interno o multidimecion
            for (int calif : califi) {
                //si la que itero es mas baja se la asigno
                if (calif < califBaja) {
                    califBaja = calif;
                }
            }
        }
        return 0;
    }

}//fin clase
