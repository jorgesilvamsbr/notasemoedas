package main.caixa;

public enum Moeda {
    UM_REAL(1d),
    CINQUENTA_CENTAVOS(0.50),
    VINTE_E_CINCO(0.25),
    DEZ_CENTAVOS(0.1),
    CINCO_CENTAVOS(0.05),
    UM_CENTAVO(0.01);

    private double valor;

    Moeda(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
