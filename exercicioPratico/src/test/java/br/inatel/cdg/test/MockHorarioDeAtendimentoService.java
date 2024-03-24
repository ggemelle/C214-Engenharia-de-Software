package br.inatel.cdg.test;

import java.util.ArrayList;
import br.inatel.cdg.HorarioDeAtendimentoService;

public class MockHorarioDeAtendimentoService implements HorarioDeAtendimentoService {

    @Override
    public String buscaHorarioDeAtendimento(String nomeDoProfesor) {

        if (nomeDoProfesor == "Chris"){
            return HorarioDeAtendimentoConst.CHRIS;
        }else if (nomeDoProfesor == "RenZo"){
            return HorarioDeAtendimentoConst.RENZO;
        }else if (nomeDoProfesor == "Aquino"){
            return HorarioDeAtendimentoConst.AQUINO;
        }else if(nomeDoProfesor == "Marcelo"){
            return HorarioDeAtendimentoConst.MARCELO;
        }else if(nomeDoProfesor == "Samuel"){
            return HorarioDeAtendimentoConst.SAMUEL;
        }else if(nomeDoProfesor == "Soned"){
            return HorarioDeAtendimentoConst.SONED;
        }else if(nomeDoProfesor == "Renan"){
            return HorarioDeAtendimentoConst.RENAN;
        }else{
            return HorarioDeAtendimentoConst.INEXISTENTE;
        }
    }

    @Override
    public boolean horarioDeAtendimentoExistente(String nomeDoProfesor) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Chris");
        list.add("RenZo");
        list.add("Aquino");
        list.add("Marcelo");
        list.add("Samuel");
        list.add("Soned");
        list.add("Renan");

        for (int i=0; i < list.size(); i++){
            if (list.get(i).equals(nomeDoProfesor) || list.get(i).equals(nomeDoProfesor)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean verificarNomeDoProfessor(String nomeDoProfesor) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Chris");
        list.add("RenZo");
        list.add("Aquino");
        list.add("Marcelo");
        list.add("Samuel");
        list.add("Soned");
        list.add("Renan");

        for (int i=0; i < list.size(); i++){
            if (list.get(i).equals(nomeDoProfesor) || list.get(i).equals(nomeDoProfesor)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String getNomeDoProfessor() {
        
        if (verificarNomeDoProfessor("Chris")){
            return "Chris";
        }else if (verificarNomeDoProfessor("RenZo")){
            return "RenZo";
        }else if (verificarNomeDoProfessor("Aquino")){
            return "Aquino";
        }else if (verificarNomeDoProfessor("Marcelo")){
            return "Marcelo";
        }else if (verificarNomeDoProfessor("Samuel")){
            return "Samuel";
        }else if (verificarNomeDoProfessor("Soned")){
            return "Soned";
        }else if (verificarNomeDoProfessor("Renan")){
            return "Renan";
        }else{
            return "Inexistente";
        }
    }

    @Override
    public String getPredio() {
        if (verificarPredioProfessor("Chris")){
            return "3";
        }else if (verificarPredioProfessor("RenZo")){
            return "4";
        }else if (verificarPredioProfessor("Aquino")){
            return "2";
        }else if (verificarPredioProfessor("Marcelo")){
            return "1";
        }else if (verificarPredioProfessor("Samuel")){
            return "1";
        }else if (verificarPredioProfessor("Soned")){
            return "5";
        }else if (verificarPredioProfessor("Renan")){
            return "1";
        }else{
            return "Inexistente";
        }
    }

    @Override
    public boolean verificarPredioProfessor(String nomeDoProfesor) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Chris");
        list.add("RenZo");
        list.add("Aquino");
        list.add("Marcelo");
        list.add("Samuel");
        list.add("Soned");
        list.add("Renan");

        for (int i=0; i < list.size(); i++){
            if (list.get(i).equals(nomeDoProfesor) || list.get(i).equals(nomeDoProfesor)){
                return true;
            }
        }
        return false;
    }
}