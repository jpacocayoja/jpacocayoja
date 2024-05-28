/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import negocio.estado.MarioNormal;

/**
 *
 * @author JUAN
 */
public class Mario {

    private Estado state;
    private String mensaje;
    private String imagen;

    public Mario() {
         this.state = new MarioNormal(this);
        setImagen("/img/marionormal.png");
         
    }

    public void setEstado(Estado state) {
        this.state = state;
    }

    public Estado getEstado() {
        return state;
    }

    public void recibirDaño() {
        this.state.recibirDaño();
    }

    public void recogerHongo() {
        this.state.recogerHongo();
    }

    public void recogerPluma() {
        this.state.recogerPluma();
    }

    public void recogerTraje() {
        this.state.recogerTraje();
    }
    
    public  void convertirTraje(){
        this.state.convertirTraje();
    }
    
    public  void revertirTraje(){
        this.state.revertirTraje();
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getImagen() {
        return imagen;
    }
}
