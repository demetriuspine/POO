package exercises;

public class Main {
  public static void main(String[] args) {
    car carro1 = new car();
    car carro2 = new car();

    System.out.println("carro1");
    
    carro1.setMarca("Volkswagen");
    carro1.setModelo("Fusca");
    carro1.setCor("Azul calcinha");
    carro1.setAno(1976);

    System.out.println("\n");
    System.out.println("carro2");
    
    carro2.setMarca("Fiat");
    carro2.setModelo("147");
    carro2.setCor("Bege");
    carro2.setAno(1978);
  }
}
