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
public class MarioMapache extends Estado {
     public MarioMapache(Mario miMario) {
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
         miMario.setMensaje("otra vez lo mismo? ");
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
