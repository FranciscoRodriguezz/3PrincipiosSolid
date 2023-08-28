package InversiondeDependencias;

import java.util.ArrayList;
import java.util.List;


class Pedido {
    private INotificador notificador;
    private List<Producto> productos;

    public Pedido(INotificador notificador) {
        this.notificador = notificador;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    public double calcularTotal() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }

    public void realizarPedido() {

        notificador.enviarNotificacion("Su pedido ha sido realizado");
    }
}
