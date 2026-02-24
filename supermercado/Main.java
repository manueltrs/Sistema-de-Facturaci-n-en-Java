import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese nombre del cliente:");
        String nombreCliente = sc.nextLine();

        Factura factura = new Factura(nombreCliente);

        System.out.println("¿Cuántos productos va a comprar?");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= cantidad; i++) {

            System.out.println("\nProducto " + i);

            System.out.print("Nombre: ");
            String nombreProducto = sc.nextLine();

            double precioProducto;
            do {
                System.out.print("Precio: ");
                precioProducto = sc.nextDouble();
                sc.nextLine();
                if (precioProducto <= 0) {
                    System.out.println("El precio debe ser mayor que 0.");
                }
            } while (precioProducto <= 0);

            factura.agregarProducto(new Producto(nombreProducto, precioProducto));
        }

        factura.mostrarResumen();
        sc.close();
    }
}