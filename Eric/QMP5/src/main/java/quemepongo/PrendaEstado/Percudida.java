package quemepongo.PrendaEstado;

public class Percudida implements Estado{

  @Override
  public boolean sugerible() {
    return false;
  }

  @Override
  public Estado usar() {
    return this;
  }

  @Override
  public Estado lavar() {
    return this;
  }
}
