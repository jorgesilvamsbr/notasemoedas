package test.caixa;

import main.caixa.Nota;
import main.caixa.Moeda;
import main.caixa.Caixa;
import main.caixa.RelatorioDeContagem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaixaTest {

    @Test
    public void deve_retornar_duas_notas_de_dois(){
        Caixa caixa = new Caixa(4d);

        RelatorioDeContagem relatorioDeContagem = caixa.gerarRelatorioDeContagem();

        assertEquals(2, relatorioDeContagem.obterQtdDeNotasNoValorDe(Nota.DOIS));
    }

    @Test
    public void deve_retornar_duas_notas_de_cem_e_uma_de_cinquenta(){
        Caixa caixa = new Caixa(250d);

        RelatorioDeContagem relatorioDeContagem = caixa.gerarRelatorioDeContagem();

        assertEquals(2, relatorioDeContagem.obterQtdDeNotasNoValorDe(Nota.CEM));
        assertEquals(1, relatorioDeContagem.obterQtdDeNotasNoValorDe(Nota.CINQUENTA));
    }

    @Test
    void deve_retornar_uma_nota_de_cinquenta_duas_de_vinte_uma_de_um_real_e_uma_moeda_de_um_centavo() {
        Caixa caixa = new Caixa(91.01);

        RelatorioDeContagem relatorioDeContagem = caixa.gerarRelatorioDeContagem();

        assertEquals(1, relatorioDeContagem.obterQtdDeNotasNoValorDe(Nota.CINQUENTA));
        assertEquals(2, relatorioDeContagem.obterQtdDeNotasNoValorDe(Nota.VINTE));
        assertEquals(1, relatorioDeContagem.obterQtdDeMoedasNoValorDe(Moeda.UM_REAL));
        assertEquals(1, relatorioDeContagem.obterQtdDeMoedasNoValorDe(Moeda.UM_CENTAVO));
    }

    @Test
    void deve_retornar_cinco_notas_de_cem_uma_de_cinquenta_uma_de_vinte_uma_de_cinco_uma_moeda_de_um_uma_moeda_de_cinquenta_duas_de_dez_e_tres_de_um_centavo() {
        Caixa caixa = new Caixa(576.73);

        RelatorioDeContagem relatorioDeContagem = caixa.gerarRelatorioDeContagem();

        assertEquals(5, relatorioDeContagem.obterQtdDeNotasNoValorDe(Nota.CEM));
        assertEquals(1, relatorioDeContagem.obterQtdDeNotasNoValorDe(Nota.CINQUENTA));
        assertEquals(1, relatorioDeContagem.obterQtdDeNotasNoValorDe(Nota.VINTE));
        assertEquals(1, relatorioDeContagem.obterQtdDeNotasNoValorDe(Nota.CINCO));
        assertEquals(1, relatorioDeContagem.obterQtdDeMoedasNoValorDe(Moeda.UM_REAL));
        assertEquals(1, relatorioDeContagem.obterQtdDeMoedasNoValorDe(Moeda.CINQUENTA_CENTAVOS));
        assertEquals(2, relatorioDeContagem.obterQtdDeMoedasNoValorDe(Moeda.DEZ_CENTAVOS));
        assertEquals(3, relatorioDeContagem.obterQtdDeMoedasNoValorDe(Moeda.UM_CENTAVO));
    }
}
