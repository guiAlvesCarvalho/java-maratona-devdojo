package academy.devdojo.maratonajava.javacore.Gassociacao.test;

// Crie um sistema que gerencie seminários
//
// O sistema deverá cadastrar seminários, estudantes, professores e local onde será realizado
//
// Um aluno poderá estar em apenas um seminário
// Um seminário poderá ter nenhum ou vários alunos
// Um professor poderá ministrar vários seminários
// Um seminário deve ter um local
//
// Campos básicos (excluindo relacionamento)
// seminário: título
// aluno: nome e idade
// professor: nome, especialidade
// local: endereço

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das folhas");
        Aluno aluno = new Aluno("Naruto", 16);
        Professor professor = new Professor("Kakashi", "Ninja");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Trabalho em equipe", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
















