package br.inatel.cdg.test.mockito;

import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import br.inatel.cdg.HorarioDeAtendimento;
import br.inatel.cdg.BuscaHorarioDeAtendimento;
import br.inatel.cdg.HorarioDeAtendimentoService;
import br.inatel.cdg.test.HorarioDeAtendimentoConst;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


@RunWith(MockitoJUnitRunner.class)
public class TesteBuscaHorarioDeAtendimento {

    @Mock
    private HorarioDeAtendimentoService horarioDeAtendimentoService;
    private BuscaHorarioDeAtendimento buscaHorarioDeAtendimento;

    @Before
    public void setup(){
        buscaHorarioDeAtendimento = new BuscaHorarioDeAtendimento(horarioDeAtendimentoService);
    }


    @Test
    public void testeBuscaMarcelo(){
        Mockito.when(horarioDeAtendimentoService.buscaHorarioDeAtendimento("Marcelo")).thenReturn(HorarioDeAtendimentoConst.MARCELO);
        HorarioDeAtendimento marcelo = buscaHorarioDeAtendimento.buscaHorarioDeAtendimento("Marcelo");
        assertEquals("Marcelo", marcelo.getnomeDoProfessor());
    }

     @Test
    public void testeBuscaSoned(){
        Mockito.when(horarioDeAtendimentoService.buscaHorarioDeAtendimento("Soned")).thenReturn(HorarioDeAtendimentoConst.SONED);
        HorarioDeAtendimento soned = buscaHorarioDeAtendimento.buscaHorarioDeAtendimento("Soned");
        assertEquals("Soned", soned.getnomeDoProfessor());
    }

    @Test
    public void testeBuscaInexistente(){
        Mockito.when(horarioDeAtendimentoService.buscaHorarioDeAtendimento("Inexistente")).thenReturn(HorarioDeAtendimentoConst.INEXISTENTE);
        HorarioDeAtendimento inexistente = buscaHorarioDeAtendimento.buscaHorarioDeAtendimento("Inexistente");
        assertEquals("Inexistente", inexistente.getnomeDoProfessor());
    }

    @Test
    public void testeNomeChrisFalse(){
        Mockito.when(horarioDeAtendimentoService.getNomeDoProfessor()).thenReturn("Chris");
        assertFalse(buscaHorarioDeAtendimento.verificarNomeDoProfessor("RenZo"));
    }

    @Test
    public void testeNomeRenZoFalse(){
        Mockito.when(horarioDeAtendimentoService.getNomeDoProfessor()).thenReturn("RenZo");
        assertFalse(buscaHorarioDeAtendimento.verificarNomeDoProfessor("Chris"));
    }

    @Test
    public void testeNomeRenanFalse(){
        Mockito.when(horarioDeAtendimentoService.getNomeDoProfessor()).thenReturn("Renan");
        assertFalse(buscaHorarioDeAtendimento.verificarNomeDoProfessor("RenZo"));
    }

    @Test
    public void testeNomeSonedFalse(){
        Mockito.when(horarioDeAtendimentoService.getNomeDoProfessor()).thenReturn("Soned");
        assertFalse(buscaHorarioDeAtendimento.verificarNomeDoProfessor("RenZo"));
    }

    @Test
    public void testeNomeAquinoFalse(){
        Mockito.when(horarioDeAtendimentoService.getNomeDoProfessor()).thenReturn("Aquino");
        assertFalse(buscaHorarioDeAtendimento.verificarNomeDoProfessor("RenZo"));
    }

    @Test
    public void testeNomeMarceloFalse(){
        Mockito.when(horarioDeAtendimentoService.getNomeDoProfessor()).thenReturn("Marcelo");
        assertFalse(buscaHorarioDeAtendimento.verificarNomeDoProfessor("RenZo"));
    }

    @Test
    public void testeNomeSamuelFalse(){
        Mockito.when(horarioDeAtendimentoService.getNomeDoProfessor()).thenReturn("Samuel");
        assertFalse(buscaHorarioDeAtendimento.verificarNomeDoProfessor("RenZo"));
    }
}