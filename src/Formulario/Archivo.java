
package Formulario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Archivo {
    
    
    
    
    public String obtenerTexto(String ruta) {//path o ruta del textfield2
      String texto = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta)); 
            String linea; 
            while((linea = br.readLine()) != null) { //leer
                //área de lectura línea por línea, estructura: categoria,valor  [Salto de linea]  pollo,10
                String columnas[] = linea.split(",");
                texto += columnas[0] + "," + columnas[1]+"\n";
            } 
            br.close(); //cerrar el flujo y liberar recursos
        } catch(IOException e) {
           //en caso de error 
        }
        
        return texto; 

    }
    
}
