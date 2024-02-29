import AppComida.AppComida;

public class Main {
    public static void main(String[] args) {
        AppComida pedido1 = new AppComida();
        pedido1.codigoPedido = 1;
        pedido1.comida = "Almondega";
        pedido1.quantidade = 3;
        pedido1.precoFinal = 13.5F;
        pedido1.status = 1;
        pedido1.restaurante = "Seu Almon";

        pedido1.getStatus();
        System.out.println(pedido1.getRestaurante());

        AppComida pedido2 = new AppComida();
        pedido2.codigoPedido = 2;
        pedido2.comida = "Coxinhas";
        pedido2.quantidade = 7;
        pedido2.precoFinal = 25.99F;
        pedido2.status = 2;
        pedido2.restaurante = "Seu Coxinha";

        pedido2.getStatus();
        System.out.println(pedido2.getRestaurante());

        AppComida pedido3 = new AppComida();
        pedido3.codigoPedido = 3;
        pedido3.comida = "Kebabi";
        pedido3.quantidade = 2;
        pedido3.precoFinal = 56.55F;
        pedido3.status = 0;
        pedido3.restaurante = "Al Comida";

        pedido3.getStatus();
        System.out.println(pedido3.getRestaurante());
    }
}