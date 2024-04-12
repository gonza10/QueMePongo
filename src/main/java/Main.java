package prenda;
import prenda.*;

public class Main {

  public static void main(String[] args) {

    Prenda camisa = new Prenda(TipoPrenda.CAMISA, Material.ALGODON, Color.ROJO);
    Prenda pantalon = new Prenda(TipoPrenda.PANTALON, Material.JEAN, Color.AZUL, Color.GRIS);
    Prenda zapato = new Prenda(TipoPrenda.ZAPATO, Material.CUERO, Color.NEGRO);

    System.out.println(camisa.getTipo());
    System.out.println(pantalon.getMaterial());
    System.out.println(zapato.getColorPrimario());
    System.out.println(camisa.getCategoria());

    try {
      Prenda camisa_test = new Prenda(TipoPrenda.CAMISA, Material.ALGODON, Color.ROJO);
    } catch (PrendaInvalidaException e) {
      System.out.println(e.getMessage());
    }

  }

}