package entities;

public class Produtos {
    private String nomeproduto;
    private double precoproduto;
    private int quantidadeproduto;

    public Produtos(String nomeproduto, double precoproduto, int quantidadeproduto){
        this.nomeproduto = nomeproduto;
        this.precoproduto = precoproduto;
        this.quantidadeproduto = quantidadeproduto;
    }

    public void realizarvenda(int quantidadevendida){
        if (quantidadevendida > quantidadeproduto){
            System.out.println("\n[!] ESTOQUE INSUFICIENTE PARA REALIZAR A VENDA.");
        }else {
            quantidadeproduto -= quantidadevendida;
            System.out.println("\n[!] Venda processada com sucesso!.");
        }
    }
    @Override
    public String toString(){
        return "Produto: " + nomeproduto + " | Preço: R$ " + String.format("%.2f", precoproduto) +
                " | Estoque Atual: " + quantidadeproduto + " unidades";

    }
}

