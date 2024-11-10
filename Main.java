public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNomeCliente("Lautaro Martinez");

        Conta cc = new ContaCorrente(cliente);
        Conta cpoupanca = new ContaPoupanca(cliente);
        Conta cInvestimento = new ContaInvestimento(cliente);
        cc.imprimirExtrato();
        cpoupanca.imprimirExtrato();
        cInvestimento.imprimirExtrato();
    }
}
