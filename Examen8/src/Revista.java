
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author capacitacion15
 */
public class Revista {
    private List<Articulo> elemento;
    private String titulo;
    private int ejemplar;

    public Revista(String titulo, int ejemplar) {
        this.titulo = titulo;
        this.ejemplar = ejemplar;
        this.elemento = new ArrayList<Articulo>();
    }
    
    public boolean addElemento(Articulo articulo){
        return elemento.add(articulo);
        
        
    }
    
    public 
    
}
