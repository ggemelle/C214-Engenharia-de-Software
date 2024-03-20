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
            }else{
                return false;
            }
        }

        return false;
    }
}