package br.inatel.cdg;

public class HorarioDeAtendimento {

    private String nomeDoProfessor;
    private String horarioDeAtendimento;
    private String periodo;
    private String sala;
    private String predio;

    public HorarioDeAtendimento(String nomeDoProfessor, String horarioDeAtendimento, String periodo, String sala, String predio) {
        this.nomeDoProfessor = nomeDoProfessor;
        this.horarioDeAtendimento = horarioDeAtendimento;
        this.periodo = periodo;
        this.sala = sala;
        this.predio = predio;
    }

    public String getnomeDoProfessor() {
        return nomeDoProfessor;
    }

    public void setnomeDoProfessor(String nomeDoProfessor) {
        this.nomeDoProfessor = nomeDoProfessor;
    }

    public String gethorarioDeAtendimento() {
        return horarioDeAtendimento;
    }

    public void sethorarioDeAtendimento(String horarioDeAtendimento) {
        this.horarioDeAtendimento = horarioDeAtendimento;
    }

    public String getperiodo() {
        return periodo;
    }

    public void setperiodo(String periodo) {
        this.periodo = periodo;
    }

    public String getsala() {
        return sala;
    }

    public void setsala(String sala) {
        this.sala = sala;
    }

    public String getpredio() {
        return predio;
    }

    public void setpredio(String predio) {
        this.predio = predio;
    }
}