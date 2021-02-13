
package flyweight;

/**
 *
 * @author Daniel
 */
public class Flyweight
{
  private static final String colors[] = { "Rojo", "Verde", "Azul", "Naranja", "Negro" };

  public static void main( String[] args )
  {

    System.out.println("\n################ Circulos color rojo ####################");
    for( int i = 0; i < 10; ++i )
    {
      Circulo circulo = (Circulo) FabricaForma.getShape("circulo");
      circulo.setColor(colors[0]);
      circulo.draw();
    }
    System.out.println("\n############### Circulos color verde ####################");
    for( int i = 0; i < 10; ++i )
    {
      Circulo circulo = (Circulo) FabricaForma.getShape("circulo");
      circulo.setColor(colors[1]);
      circulo.draw();
    }
    System.out.println("\n################ Circuclos color azul ####################");
    
    for( int i = 0; i < 10; ++i )
    {
      Circulo circulo = (Circulo) FabricaForma.getShape("circulo");
      circulo.setColor(colors[2]);
      circulo.draw();
    }
    System.out.println("\n################ Circulos color naranja ####################");
    for( int i = 0; i < 10; ++i )
    {
      Circulo circulo = (Circulo) FabricaForma.getShape("circulo");
      circulo.setColor(colors[3]);
      circulo.draw();
    }
    System.out.println("\n################ Black color Circles ####################");
    for( int i = 0; i < 10; ++i )
    {
      Circulo circulo = (Circulo) FabricaForma.getShape("circulo");
      circulo.setColor(colors[4]);
      circulo.draw();
    }
  }
}