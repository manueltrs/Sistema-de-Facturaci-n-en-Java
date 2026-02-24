import java.util.ArrayList;

public class Factura {

    private String cliente;
    private ArrayList<Producto> productos;

    private static final double DESCUENTO_MEDIO = 0.10;
    private static final double DESCUENTO_ALTO = 0.15;

    public Factura(String cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularSubtotal() {
        return productos.stream()
                .mapToDouble(Producto::getPrecio)
                .sum();
    }

    public double calcularDescuento(double subtotal) {
        if (subtotal > 200000) {
            return subtotal * DESCUENTO_ALTO;
        } else if (subtotal > 100000) {
            return subtotal * DESCUENTO_MEDIO;
        }
        return 0;
    }

    public void mostrarResumen() {
        double subtotal = calcularSubtotal();
        double descuento = calcularDescuento(subtotal);
        double total = subtotal - descuento;

        System.out.println("\n=================================");
        System.out.println("         FACTURA DE COMPRA");
        System.out.println("=================================");
        System.out.println("Cliente: " + cliente);
        System.out.println("---------------------------------");

        productos.forEach(System.out::println);

        System.out.println("---------------------------------");
        System.out.println("Subtotal:     $" + String.format("%,.2f", subtotal));
        System.out.println("Descuento:    $" + String.format("%,.2f", descuento));
        System.out.println("TOTAL:        $" + String.format("%,.2f", total));
        System.out.println("=================================");
    }
}
