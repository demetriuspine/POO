package exercises;

public class car {
  public String marca, modelo, cor;
  public int ano;

  public void setMarca(String brand) {
    marca = brand;
    System.out.println("marca: " + marca);
  }
  public void setModelo(String model) {
    modelo = model;
    System.out.println("modelo: " + modelo);
  }
  public void setCor(String color) {
    cor = color;
    System.out.println("cor: " + cor);
  }
  public void setAno(int year) {
    ano = year;
    System.out.println("ano: " + ano);
  }
}
