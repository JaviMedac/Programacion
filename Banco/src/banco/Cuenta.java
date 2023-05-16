package banco;

public class Cuenta {

    private String titular;
    private int numero;
    private double saldo;

    public Cuenta(String t, int n, double s) throws SaldoInsuficienteException {
        if (s < 0) {
            throw new SaldoInsuficienteException("Saldo inicial negativo");
        }
        titular = t;
        numero = n;
        saldo = s;
    }

    public void movimiento(double valor) throws SaldoInsuficienteException {
        if (saldo + valor < 0) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        saldo += valor;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular= " + titular + ", numero= " + numero + ", saldo= " + saldo + "}";
    }
}
