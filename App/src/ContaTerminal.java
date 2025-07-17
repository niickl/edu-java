public class ContaTerminal {
    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    // Construtor
    public ContaTerminal(int numeroConta, String agencia, String nomeCliente, double saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    // Getters
    public int getNumeroConta() { return numeroConta; }
    public String getAgencia() { return agencia; }
    public String getNomeCliente() { return nomeCliente; }
    public double getSaldo() { return saldo; }
}
