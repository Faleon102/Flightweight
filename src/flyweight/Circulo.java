package flyweight;

public class Circulo implements Forma {

    private String color;
    private final int x = 10;
    private final int y = 20;
    private final int radius = 30;

    public Circulo() {
    }

    public Circulo(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println(this + " : Circulo: Dibujo() [Color : " + color + ", x : " + x + ", y :" + y + ", radio :"
                + radius);
    }
}
