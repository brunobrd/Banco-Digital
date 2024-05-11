public class contaPoupanca extends conta {
    private static final cliente cliente = null;

    public contaPoupanca() {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("== Extrato da Conta Poupança ==");
        super.ImprimirInfosComuns();
    }

}
