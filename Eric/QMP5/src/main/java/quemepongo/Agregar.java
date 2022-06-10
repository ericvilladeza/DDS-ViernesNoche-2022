package quemepongo;

public class Agregar implements ModificarGuardarropa {
    private Prenda prenda;
    private Guardarropas guardarropas;

    public Agregar(Prenda prenda, Guardarropas guardarropas) {
        this.prenda = prenda;
        this.guardarropas = guardarropas;
    }

    @Override
    public void aceptar(){
        guardarropas.agregarPrenda(prenda);
    }
    @Override
    public void redo(){guardarropas.sacarPrenda(prenda);}


}
