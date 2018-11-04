package main.caixa;

import static java.util.Arrays.stream;

public class Caixa {

    private final RelatorioDeContagem relatorioDeContagem;
    private Double valor;

    public Caixa(Double valor) {
        this.relatorioDeContagem = new RelatorioDeContagem();
        this.valor = valor;
    }

    public RelatorioDeContagem gerarRelatorioDeContagem() {
        contarNotas();
        contarMoedas();
        return relatorioDeContagem;
    }

    private void contarMoedas() {
        stream(Moeda.values()).forEach(moeda -> {
            while ((valor / moeda.getValor()) >= 1) {
                relatorioDeContagem.adicionarMoeda(moeda);
                valor = valor - moeda.getValor();
            }
        });
    }

    private void contarNotas() {
        stream(Nota.values()).forEach(nota -> {
            while ((valor / nota.getValor()) >= 1) {
                relatorioDeContagem.adicionarNota(nota);
                valor = valor - nota.getValor();
            }
        });
    }
}
