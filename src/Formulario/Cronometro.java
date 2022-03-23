
package Formulario;

import javax.swing.JLabel;


public class Cronometro extends Thread {
    
    JLabel eti;
    
    Cronometro(JLabel cronometro) {
       this.eti=cronometro;
    }
    
    public void run(){
        try{
            int x=0;
            
            while(Orden.iniciohilo){
                Thread.sleep(1);
                ejecutarHiloCronometro(x);
                x++;
            }
        }catch(Exception e){
            System.out.println("error");
        }
    }

    private void ejecutarHiloCronometro(int x) {
              Orden.milisegundo++;
              
              if(Orden.milisegundo>399){
                  Orden.milisegundo=0;
                  Orden.segundo++;
              }
              if(Orden.segundo>59){
                  Orden.segundo=0;
                  Orden.minuto++;
              }
              if(Orden.minuto>59){
                  Orden.minuto=0;
                  Orden.hora++;
              }
              
              String txtsegundo="",txtmin="",txthora="",txtmilisegundo="";
              
              if(Orden.milisegundo<10){
                  txtmilisegundo="0"+Orden.milisegundo;
              }else{
                  txtmilisegundo=""+Orden.milisegundo;
              }
              if(Orden.segundo<10){
                  txtsegundo="0"+Orden.segundo;
              }else{
                  txtsegundo=""+Orden.segundo;
              }if(Orden.minuto<10){
                  txtmin="0"+Orden.minuto;
              }else{
                  txtmin=""+Orden.minuto;
              }if(Orden.hora<10){
                  txthora="0"+Orden.hora;
              }else{
                  txthora=""+Orden.hora;
              }
              String reloj=txtmin+":"+txtsegundo+":"+txtmilisegundo;
              
              eti.setText(reloj);
    }
    
}
