package br.inatel.cdg.test;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import br.inatel.cdg.HorarioDeAtendimento;
import br.inatel.cdg.BuscaHorarioDeAtendimento;
import br.inatel.cdg.HorarioDeAtendimentoService;

public class TesteBuscaHorarioDeAtendimento {

    HorarioDeAtendimentoService horarioDeAtendimentoService;
    BuscaHorarioDeAtendimento buscaHorarioDeAtendimento;

    @Before
    public void setup(){
        horarioDeAtendimentoService = new MockHorarioDeAtendimentoService();
        buscaHorarioDeAtendimento = new BuscaHorarioDeAtendimento(horarioDeAtendimentoService);
    }


    @Test
    public void testeBuscaChris(){
        HorarioDeAtendimento chris = buscaHorarioDeAtendimento.buscaHorarioDeAtendimento("Chris");
        assertEquals("Chris", chris.getnomeDoProfessor());
        assertEquals("17h30", chris.gethorarioDeAtendimento());
        assertEquals("Integral", chris.getperiodo());
        assertEquals("Sala 15", chris.getsala());
        assertEquals("3", chris.getpredio());
    }

    @Test
    public void testeBuscaRenzo(){
        HorarioDeAtendimento renzo = buscaHorarioDeAtendimento.buscaHorarioDeAtendimento("RenZo");
        assertEquals("RenZo", renzo.getnomeDoProfessor());
        assertEquals("19h30", renzo.gethorarioDeAtendimento());
        assertEquals("Noturno", renzo.getperiodo());
        assertEquals("Sala 20", renzo.getsala());
        assertEquals("4", renzo.getpredio());
    }

    @Test
    public void testePredioAquino() {
        HorarioDeAtendimento aquino = buscaHorarioDeAtendimento.buscaHorarioDeAtendimento("Aquino");
        assertEquals("2", aquino.getpredio());
    }

    @Test
    public void testePeriodoMarcelo() {
        HorarioDeAtendimento marcelo = buscaHorarioDeAtendimento.buscaHorarioDeAtendimento("Marcelo");
        assertEquals("Integral", marcelo.getperiodo());
    }

    @Test
    public void testePeriodoSamuel() {
        HorarioDeAtendimento samuel = buscaHorarioDeAtendimento.buscaHorarioDeAtendimento("Samuel");
        assertEquals("Integral", samuel.getperiodo());
    }

    @Test
    public void testePredioSoned() {
        HorarioDeAtendimento soned = buscaHorarioDeAtendimento.buscaHorarioDeAtendimento("Soned");
        assertEquals("5", soned.getpredio());
    }

    @Test
    public void testeBuscaRenan(){
        HorarioDeAtendimento renan = buscaHorarioDeAtendimento.buscaHorarioDeAtendimento("Renan");
        assertEquals("Renan", renan.getnomeDoProfessor());
        assertEquals("19h30", renan.gethorarioDeAtendimento());
        assertEquals("Noturno", renan.getperiodo());
        assertEquals("Sala 5", renan.getsala());
        assertEquals("1", renan.getpredio());
    }

    @Test
    public void testeSalaRenan() {
        HorarioDeAtendimento renan = buscaHorarioDeAtendimento.buscaHorarioDeAtendimento("Renan");
        assertEquals("Sala 5", renan.getsala());
    }

    @Test
    public void testeBuscaYnoguti() {
        HorarioDeAtendimento ynoguti = buscaHorarioDeAtendimento.buscaHorarioDeAtendimento("Ynoguti");
        assertEquals("Inexistente", ynoguti.getnomeDoProfessor());
    }

    @Test
    public void testeBuscaFalse(){
        // Faz a busca de um professor que não existe
        boolean horarioDeAtendimentoExistente = buscaHorarioDeAtendimento.verificarArrayListExistente("Ynoguti");
        
        assertFalse(horarioDeAtendimentoExistente);  
    }

    @Test
    public void testeBuscaTrue(){
        // Faz a busca de um professor que existe
        boolean horarioDeAtendimentoExistente = buscaHorarioDeAtendimento.verificarArrayListExistente("Renan");
        
        assertTrue(horarioDeAtendimentoExistente);  
    }
}