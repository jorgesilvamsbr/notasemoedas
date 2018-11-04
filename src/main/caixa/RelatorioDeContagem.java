package main.caixa;

import java.util.HashMap;
import java.util.Map;

public class RelatorioDeContagem {
    private Map<Nota, Integer> notas;
    private Map<Moeda, Integer> moedas;

    public RelatorioDeContagem() {
        this.notas = new HashMap<>();
        this.notas.put(Nota.CEM, 0);
        this.notas.put(Nota.CINQUENTA, 0);
        this.notas.put(Nota.VINTE, 0);
        this.notas.put(Nota.DEZ, 0);
        this.notas.put(Nota.CINCO, 0);
        this.notas.put(Nota.DOIS, 0);

        this.moedas = new HashMap<>();
        this.moedas.put(Moeda.UM_REAL, 0);
        this.moedas.put(Moeda.CINQUENTA_CENTAVOS, 0);
        this.moedas.put(Moeda.VINTE_E_CINCO, 0);
        this.moedas.put(Moeda.DEZ_CENTAVOS, 0);
        this.moedas.put(Moeda.CINCO_CENTAVOS, 0);
        this.moedas.put(Moeda.UM_CENTAVO, 0);
    }

    public int obterQtdDeNotasNoValorDe(Nota notaDesejada){
        return this.notas.get(notaDesejada);
    }

    public int obterQtdDeMoedasNoValorDe(Moeda moedaDesejada){
        return this.moedas.get(moedaDesejada);
    }

    public void adicionarNota(Nota nota) {
        this.notas.put(nota, obterQtdDeNotasNoValorDe(nota) + 1);
    }

    public void adicionarMoeda(Moeda moeda) {
        this.moedas.put(moeda, obterQtdDeMoedasNoValorDe(moeda) + 1);
    }
}
