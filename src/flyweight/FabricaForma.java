
package flyweight;


import java.util.HashMap;

public class FabricaForma
{
  private static final HashMap<String, Forma> formaMap = new HashMap<String, Forma>();

  public static Forma getShape( String shapeType )
  {
    Forma forma=null;
    if( shapeType.equalsIgnoreCase("circulo") )
    {
      forma = (Circulo) formaMap.get("circulo");

      if( forma == null )
      {
        forma = new Circulo();
        formaMap.put("circulo", forma);
        System.out.println("Creando el objeto circulo en la Fabrica de Formas: " + forma
                        + "\n");
      }
    }
    return forma;
  }
}
