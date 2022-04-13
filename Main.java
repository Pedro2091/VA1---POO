class Main {
  public static void main(String[] args) {

    //1° PARTE
    //6 disciplinas + 6 professores
    Disciplina anatomia = new Disciplina("Anatomia","Prof. Roberto", 55);
    Disciplina sisNervoso = new Disciplina("Sistema Nervoso","Prof. Ronaldo", 70);
    Disciplina incisoes = new Disciplina("Incisões","Profa. Cátia", 80);

    Disciplina gramatica = new Disciplina("Gramática","Prof. Gustavo", 30);
    Disciplina vocabulario = new Disciplina("Vocabulário","Profa. Sônia", 85);
    Disciplina fonoaudiologia = new Disciplina("Fonoaudiólogia","Prof. Adaulto", 12);
      
    //2 cursos
    Curso enfermagem = new Curso("Enfermagem", anatomia, sisNervoso, incisoes);
    Curso letras = new Curso("Letras",gramatica, vocabulario, fonoaudiologia);
                             
    //2 alunos  
    Aluno alunoFlavio = new Aluno("Flavio", 1523, enfermagem);
    Aluno alunoAugusto = new Aluno("Augusto", 2124, letras);


    //2° PARTE
    System.out.println("A média de " + alunoFlavio.nome + " é " + alunoFlavio.curso.calcularMedia());
    System.out.println("A média de " + alunoAugusto.nome + " é " + alunoAugusto.curso.calcularMedia());

    System.out.println("\n\n");
    
    //3° PARTE
    System.out.println("A nota de " + alunoFlavio.nome + " em " + alunoFlavio.curso.disciplina1.nome + " é " + alunoFlavio.curso.notaPorDisciplina(1));

    System.out.println("\n\n");

    //4° PARTE
    System.out.println("O relatório de " + anatomia.nome + " é:");   
    anatomia.exibirRelatorioDisc();
    System.out.println("\nO relatório de " + vocabulario.nome + " é:");   
    vocabulario.exibirRelatorioDisc();
    
    System.out.println("\n\n");

    //5° PARTE
    System.out.println("O relatório final de " + alunoFlavio.nome + " é:");   
    alunoFlavio.exibirRelatorio();
  
    System.out.println("\nO relatório final de " + alunoAugusto.nome + " é:");   
    alunoAugusto.exibirRelatorio();

    System.out.println("\n\n");
  }
}