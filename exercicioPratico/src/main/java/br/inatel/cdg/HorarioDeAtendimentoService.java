package br.inatel.cdg;

public interface HorarioDeAtendimentoService {

    public String buscaHorarioDeAtendimento(String nomeDoProfessor);
    
    public boolean horarioDeAtendimentoExistente(String nomeDoProfessor);
}