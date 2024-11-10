import java.util.ArrayList;
import java.util.List;
public class Banco {
    private String nomedoBanco;
    protected List<Conta> contas;

    public Banco(){
        this.nomedoBanco = "";
        this.contas = new ArrayList<>();
    }

    public String getNomedoBanco() {
        return nomedoBanco;
    }
    public void setNomedoBanco(String nomedoBanco) {
        this.nomedoBanco = nomedoBanco;
    }
    public List<Conta> getContas() {
        return contas;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
