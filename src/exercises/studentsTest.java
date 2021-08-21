package exercises;

public class studentsTest {
  public static void main(String[] args) {
    students aluno1 = new students();
    students aluno2 = new students();
    students aluno3 = new students();

    System.out.println("aluno1");

    aluno1.setCpf("12345678910");
    aluno1.setEndereco("Rua Javari, 117");
    aluno1.setMatricula(1983);
    aluno1.setNascimento(1924);
    aluno1.setNome("Rodolfo Crespi");
    aluno1.setRa("81622073BBC");
    aluno1.print();

    System.out.println();

    System.out.println("aluno2");

    aluno2.setCpf("78945612310");
    aluno2.setEndereco("Rua São Jorge, 777");
    aluno2.setMatricula(1990);
    aluno2.setNascimento(1910);
    aluno2.setNome("Afredo Schürig");
    aluno2.setRa("15974866BBA");
    aluno2.print();

    System.out.println("");

    System.out.println("aluno3");

    aluno3.setCpf("45678912310");
    aluno3.setEndereco("Rua Filadelfia, 96");
    aluno3.setMatricula(1943);
    aluno3.setNascimento(1906);
    aluno3.setNome("Valentino Mazzola");
    aluno3.setRa("37492114BAA");
    aluno3.print();
  }
}
