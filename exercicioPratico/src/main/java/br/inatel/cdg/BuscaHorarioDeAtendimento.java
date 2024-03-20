package br.inatel.cdg;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaHorarioDeAtendimento {

    HorarioDeAtendimentoService horarioDeAtendimentoService;

    public BuscaHorarioDeAtendimento(HorarioDeAtendimentoService horarioDeAtendimentoService) {
        this.horarioDeAtendimentoService = horarioDeAtendimentoService;
    }

    public HorarioDeAtendimento buscaHorarioDeAtendimento(String nomeDoProfessor){
        String horarioDeAtendimentoJSON = horarioDeAtendimentoService.buscaHorarioDeAtendimento(nomeDoProfessor);

        JsonObject jsonObject = JsonParser.parseString(horarioDeAtendimentoJSON).getAsJsonObject();

        return new HorarioDeAtendimento(jsonObject.get("nomeDoProfessor").getAsString(),
                jsonObject.get("horarioDeAtendimento").getAsString(),
                jsonObject.get("periodo").getAsString(),
                jsonObject.get("sala").getAsString(),
                jsonObject.get("predio").getAsString());
    }

    public boolean verificarArrayListExistente(String nomeDoProfessor){
        boolean horarioDeAtendimentoExistente = horarioDeAtendimentoService.horarioDeAtendimentoExistente(nomeDoProfessor);

        if (horarioDeAtendimentoExistente){
            return true;
        }
        else{
            return false;
        }
    }
}