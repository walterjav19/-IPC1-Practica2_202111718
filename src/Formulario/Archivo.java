
package Formulario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author walte
 */
public class Archivo {
    
    public String obtenerTexto(String ruta) {

        String texto = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta)); 
            String linea; 
            while((linea = br.readLine()) != null) { 
                //área de lectura línea por línea, estructura: categoria,valor  [Salto de linea]  pollo,10
                String columnas[] = linea.split(",");
                texto += "Categoria: " + columnas[0] + "   |    Valor:" + columnas[1]+"\n";
            } 
            br.close(); //cerrar el flujo y liberar recursos
        } catch(IOException e) {
           //en caso de error 
        }
        
        return texto; //retornar lectura de las lineas concatenadas del archivo 
    }
    
}
