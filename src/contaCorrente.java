public class contaCorrente extends conta {
    private static final cliente cliente = null;

    public contaCorrente() {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("== Extrato da Conta Poupança ==");
        super.ImprimirInfosComuns();
    }
}
