package Parte1;

public class circles {
  //atributos ou propriedades
  public float radius;
  public float x;
  public float y;

  //métodos
  public void move(float a, float b) {
    x = a;
    y = b;
  }

  public void resize(float r) {
    radius = r;
  }

  public void print() {
    System.out.println("x: " + x + ", y: " + y + " e raio: "+ radius);
  }
}
