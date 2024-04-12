package prenda;

public enum TipoPrenda {
  ZAPATO(Categoria.CALZADO),
  CAMISA(Categoria.SUPERIOR),
  PANTALON(Categoria.INFERIOR);

  private Categoria categoria;

  private TipoPrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return categoria;
  }
}
