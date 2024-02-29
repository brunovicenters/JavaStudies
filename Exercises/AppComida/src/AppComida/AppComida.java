package AppComida;

public class AppComida {
    public int codigoPedido;
    public String comida;
    public int quantidade;
    public float precoFinal;
    public int status;
    public String restaurante;

    public void getStatus(){
        java.lang.String situacao = "";
        if (status == 0) {
            situacao = "em Análise";
        } else if (status == 1) {
            situacao = "em Preparo";
        } else if (status == 2) {
            situacao = "a Caminho";
        } else if (status == 3) {
            situacao = "Entregue";
        }
        System.out.println("O pedido " + codigoPedido + " está " + situacao);
    }

    public void addValor(float pedido){
        precoFinal += pedido;
    }

    public String getRestaurante() {
        return restaurante;
    }
}
