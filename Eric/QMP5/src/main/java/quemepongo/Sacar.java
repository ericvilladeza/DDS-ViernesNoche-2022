package quemepongo;

public class Sacar implements ModificarGuardarropa {

    private Prenda prenda;
    private Guardarropas guardarropas;

    public Sacar(Prenda prenda, Guardarropas guardarropas) {
        this.prenda = prenda;
        this.guardarropas = guardarropas;
    }

    @Override
    public void redo(){guardarropas.agregarPrenda(prenda);}

    @Override
    public void aceptar(){
        guardarropas.sacarPrenda(prenda);
    }
}
