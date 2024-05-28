/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author JUAN
 */
public abstract class Estado {

    protected Mario miMario;

    public Estado(Mario miMario) {
        this.miMario = miMario;
    }

    public abstract void recibirDaño();

    public abstract void recogerHongo();

    public abstract void recogerPluma();

    public abstract void recogerTraje();
    
    public abstract void convertirTraje();
    
    public abstract void revertirTraje();

}
