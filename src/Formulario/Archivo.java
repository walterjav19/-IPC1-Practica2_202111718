
package Formulario;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Archivo {
    
    public void crearArchivo(String nombre, String texto) {

        File nuevoArchivo=new File(nombre); //crear archivo
         
        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter(nuevoArchivo));
            bw.write(texto); //escribir
            bw.close(); //cerrar el flujo y liberar recursos
            Desktop.getDesktop().open(nuevoArchivo);
        }catch(IOException a){
            //en caso de error
        }
    }
    
    
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
