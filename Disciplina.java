class Disciplina{
  String nome;
  Professor professor;
  float notaFinal;

  Disciplina(String nome, String professor, float notaFinal){
    this.nome = nome;
    this.professor = new Professor(professor);
    this.notaFinal = notaFinal;
  }
  
  void exibirRelatorioDisc(){
    System.out.println(
      "Nome da Disciplina: " + this.nome +
      "\nNome do Professor: " + this.professor.exibirNome() +
      "\nNota Final: " + this.notaFinal
    );
  }
  float retornarNotaFinal(){
    return this.notaFinal;
  }
}