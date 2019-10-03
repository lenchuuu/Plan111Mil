/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author capacitacion15
 */
class Foto {
    
    private String personaEnFoto;
    private String nombreArchivo;
    private int tamaño;
    private String descripcion;

    public Foto(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getPersonaEnFoto() {
        return personaEnFoto;
    }

    public void setPersonaEnFoto(String personaEnFoto) {
        this.personaEnFoto = personaEnFoto;
    }

    public int getTamaño() {
        return tamaño;
    }
    
    
    
}
