
package Formulario;


public class Dato {
  
    private String categoria;
    private int valor;
    
     public Dato (String categoria, String valor) {
        this.categoria = categoria;
        this.valor  = Integer.parseInt(valor);
    }
     
     
     /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
