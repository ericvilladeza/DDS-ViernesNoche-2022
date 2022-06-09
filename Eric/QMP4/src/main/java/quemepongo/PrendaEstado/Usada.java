package quemepongo.PrendaEstado;

public class Usada implements Estado{
  @Override
  public boolean sugerible() {
    return true;
  }

  @Override
  public Estado usar() {
    return new Sucia(0);
  }

  @Override
  public Estado lavar() {
    return this;
  }
}
