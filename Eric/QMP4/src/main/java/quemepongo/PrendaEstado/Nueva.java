package quemepongo.PrendaEstado;

public class Nueva implements Estado{

  public boolean sugerible(){
    return true;
  }

  public Estado usar() {
    return new Usada();
  }

  public Estado lavar() {
    return this;
  }
}
