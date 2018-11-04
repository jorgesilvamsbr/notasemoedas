package main.caixa;

public enum Nota {
    CEM(100),
    CINQUENTA(50),
    VINTE(20),
    DEZ(10),
    CINCO(5),
    DOIS(2);

    private int valor;

    Nota(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
