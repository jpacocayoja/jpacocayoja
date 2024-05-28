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
public class MarioNormal extends Estado {

    public MarioNormal(Mario miMario) {
        super(miMario);
    }

    @Override
    public void recibirDaño() {
        miMario.setMensaje("no puedo perder tengo que seguir intentandolo");
    }

    @Override
    public void recogerHongo() {
        miMario.setEstado(new MarioGrande(miMario));
        miMario.setMensaje("acabo de recoger un hongo");
        miMario.setImagen("/img/mariogrande.png");
    }

    @Override
    public void recogerPluma() {
         miMario.setMensaje("Necesito recoger un hongo primero");
    }

    @Override
    public void recogerTraje() {
        miMario.setMensaje("Necesito recoger un hongo primero");
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
