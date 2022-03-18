
package Formulario;


public class Ordenamiento {
    
    
    
        public void burbujaAscendente(int[] arreglo) {
        int limite = arreglo.length;
        int auxiliar;

        for(int i = 0; i < limite; i++) {
            for(int j = 0; j < limite  - 1; j++ ) {
                if(arreglo[j] > arreglo[j + 1]) {
                   auxiliar = arreglo[j];
                   arreglo[j] = arreglo[j + 1];
                   arreglo[j + 1] = auxiliar;
                }
            }
        }
    } 

    public void seleccionAscendente(int[] arreglo) {
        int limite = arreglo.length;
        int auxiliar, indiceMinimo;

        for(int i = 0; i < limite; i++) {
            indiceMinimo = i;
            for(int j = i + 1; j < limite; j++ ) {
                if(arreglo[j] < arreglo[indiceMinimo]) {
                   indiceMinimo = j;
                }
            }
            auxiliar = arreglo[i];
            arreglo[i] = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = auxiliar;
        }
    } 

    public void insercionAscendente(int[] arreglo) {
        int limite = arreglo.length;
        int auxiliar;
        int pos;

        for(int i = 0; i < limite; i++) {
            pos = i;
            auxiliar = arreglo[pos];
            while((pos > 0) && arreglo[pos -1] > auxiliar){
                arreglo[pos] = arreglo[pos - 1];
                pos--;
            }
            arreglo[pos] = auxiliar;
        }
    } 

    public static void quicksort(int[] arreglo, int izq, int der) {
    
        // ELEGIR PIVOTE
        int pivote = arreglo[izq];
        
        // LOS ELEMENTOS > AL PIVOTE VAN A LA DERECHA, LOS < A LA IZQUIERDA
        // VARIABLES AUXILIARES: 
        // i PARA LOS ELEMENTOS DE LA IZQUIERDA
        // j PARA LOS ELEMENTOS DE LA DERECHA
        int i = izq;
        int j = der;
        
        int swap;
        
        // SE EVALUAN LOS ELEMENTOS PARA UBICAR EL NUEVO PIVOTE
        while(i < j) {
            // MIENTRAS QUE arreglo[i] SEA MENOR O IGUAL AL PIVOTE SE AUMENTA EL VALOR DE i
            // CUANDO NO SE CUMPLE EL WHILE, EL ELEMENTO EN arreglo[i] ES MAYOR AL PIVOTE
            // Y DEBE IR A LA DERECHA
            while(arreglo[i] <= pivote && i < j) {
                i++;
            }
            // MIENTRAS QUE EL arreglo[j] SEA MAYOR AL PIVOTE SE DISMINUYE j
            // CUANDO NO SE CUMPLE EL WHILE EL ELEMENTO EN arreglo[j] ES MENOR O IGUAL AL PIVOTE
            // Y DEBE IR A LA IZQUIERDA
            while(arreglo[j] > pivote) {
                j--;
            }
            // SIEMPRE Y CUANDO i SEA MENOR A j, SE HACE UN CAMBIO DE LOS ELEMENTOS
            if(i < j) {
                swap = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = swap;
                
              
            }
        }
        arreglo[izq] = arreglo[j];
        arreglo[j] = pivote;
        
        if(izq < j - 1) {
            quicksort(arreglo, izq, j - 1);
        }
        if(j + 1 < der) {
            quicksort(arreglo, j + 1, der);
        }   
    }
    
}
