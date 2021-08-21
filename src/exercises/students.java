package exercises;

import java.text.MessageFormat;

public class students {
  public String cpf, ra, nome, endereco;
  public int anoNascimento, anoMatricula;

  public void setCpf(String CPF) {
    cpf = CPF;
  }
  public void setRa(String RA) {
    ra = RA;
  }
  public void setNome(String name) {
    nome = name;
  }
  public void setEndereco(String adress) {
    endereco = adress;
  }
  public void setNascimento(Integer birthYear) {
    anoNascimento= birthYear;
  }
  public void setMatricula(Integer enrollmentYear) {
    anoMatricula = enrollmentYear;
  }

  public void print() {
    String message = MessageFormat.format("CPF: {0}\nRA: {1}\nNOME: {2}\nANO DE NASCIMENTO: {3}\nANO DE MATRÍCULA: {4}\nENDEREÇO: {5}", cpf, ra, nome, anoNascimento, anoMatricula, endereco);
    System.out.println(message);
  }
}
