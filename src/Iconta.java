public interface Iconta {

    public void depositar(double valor);
    public void transferir (double valor, Iconta contaDestino);
    public void sacar(double valor);
    public void imprimirExtrato();
}
