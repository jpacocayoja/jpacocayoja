/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.estado;

import negocio.Mario;
import negocio.Estado;

/**
 *
 * @author JUAN
 */
public class MarioTanookiPiedra extends Estado {

    public MarioTanookiPiedra(Mario miMario) {
        super(miMario);
    }

    @Override
    public void recibirDaño() {
        miMario.setMensaje("No recibi ningun daño");
    }

    @Override
    public void recogerHongo() {
        miMario.setMensaje("no puedo recoger porque soy una piedra");
    }

    @Override
    public void recogerPluma() {
        miMario.setMensaje("no puedo recoger porque soy una piedra");
    }

    @Override
    public void recogerTraje() {
        miMario.setMensaje("no puedo recoger porque soy una piedra");
    }

    @Override
    public void convertirTraje() {
        miMario.setMensaje("ya soy una piedra");
    }

    @Override
    public void revertirTraje() {
        miMario.setEstado(new MarioTanooki(miMario));
        miMario.setMensaje("ya no soy una piedra");
        miMario.setImagen("/img/mariotanooki.png");
    }
}
