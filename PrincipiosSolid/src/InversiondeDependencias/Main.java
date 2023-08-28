package InversiondeDependencias;


public class Main {
    public static void main(String[] args) {

        INotificador notificador = new NotificadorEmail("soporte@example.com");
        Pedido pedido = new Pedido(notificador);


        Producto producto1 = new Producto("Producto 1", 10);
        Producto producto2 = new Producto("Producto 2", 20);
        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);


        System.out.println("Total a pagar: " + pedido.calcularTotal());
        pedido.realizarPedido();
    }
}

