public class ContaInvestimento extends Conta{
    public ContaInvestimento (Cliente cliente){
        super(cliente);
    }
    public void imprimirExtrato(){
        System.out.println("### Extrato Conta de Investimentos ###");
        super.imprimirDados();
    }
}
