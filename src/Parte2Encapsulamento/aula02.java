package Parte2Encapsulamento;

public class aula02 {
  public static void main(String[] args) {
    Aluno aluno1 = new Aluno();//método construtor
    aluno1.nome = "bartolomeu";

    System.out.println(aluno1.toString());

    Aluno aluno2 = new Aluno("pedro", "81622073", 7, 8, 0);

    System.out.println(aluno2);//toString está implícito

    Aluno aluno3 = new Aluno("mefistófoles", "58218-yu", 4, 2, 9);

    System.out.println(aluno3);

    System.out.println(aluno2.calcularMedia());
    System.out.println(aluno3.calcularMedia());


  }
}
