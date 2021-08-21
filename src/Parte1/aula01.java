package Parte1;

public class aula01 {
  public static void main(String[] args) {
    circles circle1 = new circles();// criando (instanciando) objetos
    circles circle2 = new circles();

    circle1.move(4f, 2f);
    circle1.resize(14.4f);

    System.out.print("circulo1 -> ");
    circle1.print();

    circle2.move(8f, 4f);
    circle2.resize(28.4f);
    
    System.out.print("circulo2 -> ");
    circle2.print();

    //acessando atributos/propriedades
    System.out.println("circulo2 radius-> "+ circle2.radius);
    System.out.println("circulo1 x-> "+ circle1.x);

    //alterando valores - para atribuir a scanners
    circle1.radius = 152.54f;
    circle1.print();

  }
}
