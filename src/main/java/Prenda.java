package prenda;

public class Prenda {
  private TipoPrenda tipo;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;

  public Prenda(TipoPrenda tipo, Material material, Color colorPrimario) throws PrendaInvalidaException{
    if (tipo == null || material == null || colorPrimario == null) {
      throw new PrendaInvalidaException("Faltan datos requeridos");
    }
    this.tipo = tipo;
    this.material = material;
    this.colorPrimario = colorPrimario;
  }

  public Prenda(TipoPrenda tipo, Material material, Color colorPrimario, Color colorSecundario) {
    this(tipo, material, colorPrimario);
    this.colorSecundario = colorSecundario;
  }

  public TipoPrenda getTipo() {
    return tipo;
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
    return tipo.getCategoria();
  }
}
