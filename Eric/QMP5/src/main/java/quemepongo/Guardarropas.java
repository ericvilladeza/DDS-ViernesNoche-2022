package quemepongo;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Guardarropas {
  private List<Prenda> prendas;
  private ServicioMeteorologico servicioMeteorologico;

  public Guardarropas(List<Prenda> prendas, ServicioMeteorologico servicioMeteorologico) {
    this.prendas = prendas;
    this.servicioMeteorologico = servicioMeteorologico;
  }

  public void agregarPrenda(Prenda prenda){
    this.prendas.add(prenda);
  }

  public void sacarPrenda(Prenda prenda){
    this.prendas.remove(prenda);
  }

  public Atuendo sugerirAtuendo(){
  Prenda parte_Sup =sugerirPrenda(Categoria.SUPERIOR);
    Prenda parte_Inf =sugerirPrenda(Categoria.INFERIOR);
    Prenda parte_Cal =sugerirPrenda(Categoria.CALZADO);
    Prenda parte_Acc =sugerirPrenda(Categoria.ACCESORIO);
    Atuendo atuendoNuevo= new Atuendo(parte_Sup,parte_Inf,parte_Cal,parte_Acc);

    return atuendoNuevo;
  }

  public Prenda sugerirPrenda(Categoria categoria){
    List<Prenda> prendasPosibles = getPrendasSugeribles(categoria);
    return prendasPosibles.get(ThreadLocalRandom.current().nextInt(prendasPosibles.size())%prendasPosibles.size());
  }

  private List<Prenda> getPrendasSugeribles(Categoria categoria){
    return prendas.stream().filter(pren->pren.apta(servicioMeteorologico.getTemperatura()))
        .filter(Prenda::sugerible)
        .filter(pren-> pren.getCategoria().equals(categoria))
        .collect(Collectors.toList());
  }



}
