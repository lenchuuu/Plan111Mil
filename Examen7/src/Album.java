
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Album {
    private List<Foto> foto;
    private String nombre;
    private int cantidadMaxima;
    private Date fechaCreacion = new Date();

    public Album(String nombre, int cantidadMaxima) {
        this.nombre = nombre;
        this.cantidadMaxima = cantidadMaxima;
        this.foto = new ArrayList<Foto>();
    }

    public List<Foto> getFoto() {
        return foto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    
    public boolean tieneFotoConTamañoMenor(int umbral){
        //recorremos toda la lista que contiene las fotos.
        for (Foto fotoVerificar : foto)
            if (fotoVerificar.getTamaño() <= umbral)
        //realizanos un if en donde si fotoVerificar es menor al umbral es verdadero, es decir que es de tamaño menor.
        return true;
        return false;
        
    }
    
    
}
