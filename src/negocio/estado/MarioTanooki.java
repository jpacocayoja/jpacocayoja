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
public class MarioTanooki extends Estado {

    public MarioTanooki(Mario miMario) {
        super(miMario);
    }

    @Override
    public void recibirDaño() {
        miMario.setEstado(new MarioGrande(miMario));
        miMario.setMensaje("acabo de recibir daño");
        miMario.setImagen("/img/mariogrande.png");
    }

    @Override
    public void recogerHongo() {
        miMario.setMensaje("no lo necesito");
    }

    @Override
    public void recogerPluma() {
        miMario.setEstado(new MarioMapache(miMario));
        miMario.setMensaje("acabo de recoger una pluma");
        miMario.setImagen("/img/mariomapache.png");
    }

    @Override
    public void recogerTraje() {
        miMario.setMensaje("otra vez lo mismo? , No gracias");
    }

    @Override
    public void convertirTraje() {
        miMario.setEstado(new MarioTanookiPiedra(miMario));
        miMario.setMensaje("voy a convertirme en piedra");
        miMario.setImagen("/img/mariotanookipiedra.png");
    }

    @Override
    public void revertirTraje() {
        miMario.setMensaje("necesito convertirme en piedra primero");
    }
}
