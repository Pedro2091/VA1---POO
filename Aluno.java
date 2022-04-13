class Aluno{
  String nome;
  int matricula;
  Curso curso;

  Aluno(String nome, int matricula, Curso curso){
    this.nome = nome;
    this.matricula = matricula;
    this.curso = curso;
  }
  
  void exibirRelatorio(){
    String aprovado = curso.estaAprovado() ? "Sim" : "Não";
  
    System.out.println(
      "Nome: " + this.nome +
      "\nCurso: " + this.curso.nome +
      "\nAprovado: " + aprovado
    );
  }
}