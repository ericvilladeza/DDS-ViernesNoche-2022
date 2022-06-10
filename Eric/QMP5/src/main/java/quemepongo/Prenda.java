package quemepongo;

import quemepongo.PrendaEstado.Estado;

import java.util.Set;

public class Prenda {
  private TipoDePrenda tipoDePrenda;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;
  private Estado estado;
  private Trama trama;
  private Set<Integer> temperaturas;
  private Boolean lavando;

  public Prenda(TipoDePrenda tipoDePrenda,
                Material material,
                Color colorPrimario,
                Color colorSecundario,
                Trama trama, Set<Integer>temperaturas,Estado estado, Boolean lavando) {
    this.tipoDePrenda = tipoDePrenda;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
    this.temperaturas=temperaturas;
    this.estado=estado;
    this.lavando=lavando;
  }

  public Material getMaterial() {
    return material;
  }

  public Color getColorPrimario() {
    return colorPrimario;
  }

  public Color getColorSecundario() {
    return colorSecundario;
  }

  public Categoria getCategoria() {
    return tipoDePrenda.getCategoria();
  }

  public Trama getTrama() {
    return trama;
  }

  public Boolean sugerible(){
    return !lavando && estado.sugerible();
  }
  public void usar(){
    estado=estado.usar();
  }

  public void ponerALavar(){
    lavando=true;
  }
  public void lavar(){
    estado=estado.lavar();
    lavando=false;
  }

  public Boolean apta(Integer temperatura){
    return temperaturas.contains(temperatura);
  }


}
