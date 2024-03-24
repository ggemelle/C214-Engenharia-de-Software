package br.inatel.cdg;

public interface HorarioDeAtendimentoService {

    public String buscaHorarioDeAtendimento(String nomeDoProfessor);
    
    public boolean horarioDeAtendimentoExistente(String nomeDoProfessor);

    public String getNomeDoProfessor();

    public boolean verificarNomeDoProfessor(String nomeDoProfessor);

    public String getPredio();

    public boolean verificarPredioProfessor(String nomeDoProfessor);
}