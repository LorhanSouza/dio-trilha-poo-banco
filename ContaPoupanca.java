public class ContaPoupanca extends Conta{
    ContaPoupanca (Cliente cliente){
        super(cliente);
    }
    public void imprimirExtrato(){
        System.out.println("### Extrato Conta Poupanca ###");
        super.imprimirDados();
    }
}
