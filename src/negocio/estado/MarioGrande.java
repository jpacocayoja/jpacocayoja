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
public class MarioGrande extends Estado {

    public MarioGrande(Mario miMario) {
        super(miMario);
    }

    @Override
    public void recibirDaño() {
        miMario.setEstado(new MarioNormal(miMario));
        miMario.setMensaje("recibi daño");
        miMario.setImagen("/img/marionormal.png");
    }

    @Override
    public void recogerHongo() {
        miMario.setMensaje("otra vez lo mismo?, No gracias");
    }
    

    @Override
    public void recogerPluma() {
        miMario.setEstado(new MarioMapache(miMario));
        miMario.setMensaje("acabo de recoger una pluma");
        miMario.setImagen("/img/mariomapache.png");
    }

    @Override
    public void recogerTraje() {
        miMario.setEstado(new MarioTanooki(miMario));
        miMario.setMensaje("acabo de recoger un traje");
        miMario.setImagen("/img/mariotanooki.png");
    }

    @Override
    public void convertirTraje() {
        miMario.setMensaje("Necesito recoger un traje");
    }

    @Override
    public void revertirTraje() {
        miMario.setMensaje("Necesito recoger un traje");
    }
}
