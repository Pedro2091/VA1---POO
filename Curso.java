class Curso{
  String nome;
  Disciplina disciplina1;
  Disciplina disciplina2;
  Disciplina disciplina3;

  Curso(String nome, Disciplina disciplina1, Disciplina disciplina2, Disciplina disciplina3){
    this.nome = nome;
    this.disciplina1 = disciplina1;
    this.disciplina2 = disciplina2;
    this.disciplina3 = disciplina3;
  }
  
  float calcularMedia(){
    float nota1 = this.disciplina1.retornarNotaFinal();
    float nota2 = this.disciplina2.retornarNotaFinal();
    float nota3 = this.disciplina3.retornarNotaFinal();

    return (nota1 + nota2 + nota3)/3;
  }
  boolean estaAprovado(){
    float media = calcularMedia();
    
    if (media>=60){
      return true;
    }
    return false;
  }
  float notaPorDisciplina(int disciplina){
    switch(disciplina){
      case 1:
        return this.disciplina1.retornarNotaFinal();
      case 2:
        return this.disciplina2.retornarNotaFinal();
      case 3:
        return this.disciplina3.retornarNotaFinal();
    }
    return -1;
  }
}