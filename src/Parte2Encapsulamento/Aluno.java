package Parte2Encapsulamento;

public class Aluno {
  String nome;
  String matricula;
  double nota1;
  double nota2;
  double notaReavaliacao;

  Aluno() {
    System.out.println("passei pelo método construtor");
  }

  Aluno(String nom, String mat, double n1, double n2, double nReavaliação) {//posso criar 2 metodos contrutores
    nome = nom;
    matricula = mat;
    nota1 = n1;
    nota2 = n2;
    notaReavaliacao = nReavaliação;
  }
}
