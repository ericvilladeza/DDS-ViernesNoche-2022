package quemepongo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private List<Guardarropas> guardarropasList;


    private List<ModificarGuardarropa> modificacionesAAceptar;

    private List<ModificarGuardarropa> modificacionesAceptadas;


    public Usuario(List<Guardarropas> guardarropasList) {
        this.guardarropasList = guardarropasList;
        this.modificacionesAAceptar=new ArrayList<>();
        this.modificacionesAceptadas=new ArrayList<>();
    }

    public List<Guardarropas> getGuardarropasList() {
        return guardarropasList;
    }


    public void agregarGuardarropas(Guardarropas guardarropas){
        this.guardarropasList.add(guardarropas);
    }

    public void agregarModificacionPendiente(ModificarGuardarropa modificarGuardarropa){
        modificacionesAAceptar.add(modificarGuardarropa);
    }


    public void aceptarModificacion(ModificarGuardarropa modificarGuardarropa){
        ModificarGuardarropa.aceptar();
        modificacionesAceptadas.add(modificarGuardarropa);
    }

    public void reDoModificacion(ModificarGuardarropa modificarGuardarropa){
        ModificarGuardarropa.redo();
        modificacionesAceptadas.remove(modificarGuardarropa);

    }

}
