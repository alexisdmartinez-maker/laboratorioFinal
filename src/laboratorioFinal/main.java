package laboratorioFinal;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================================================");
        System.out.println("   SISTEMA DE VENTAS - INSTITUTO NACIONAL SONZACATE  ");
        System.out.println("=====================================================");

        // Llamamos a los métodos separados para registrar cada entidad
        Cliente cliente = registrarCliente(scanner);
        Empleados empleado = registrarEmpleado(scanner);
        Categoria categoria = registrarCategoria(scanner);
        Producto producto = registrarProducto(scanner, categoria);
        
        Venta venta = registrarVenta(scanner, cliente, empleado);
        DetalleVenta detalle = registrarDetalleVenta(scanner, producto);
        
        venta.agregarDetalle(detalle);

        // Imprimir comprobante
        System.out.println("\n=== TICKET DE VENTA ===");
        System.out.println("Total a pagar: $" + venta.calcularTotal());
        System.out.println("=======================");

        scanner.close();
    }

    // --- MÉTODOS SEPARADOS PARA EL SCANNER ---

    public static Cliente registrarCliente(Scanner sc) {
        System.out.println("\n--- DATOS DEL CLIENTE ---");
        System.out.print("ID: "); int id = sc.nextInt(); sc.nextLine();
        System.out.print("Nombre: "); String nombre = sc.nextLine();
        System.out.print("Teléfono: "); String tel = sc.nextLine();
        return new Cliente();
    }

    public static Empleados registrarEmpleado(Scanner sc) {
        System.out.println("\n--- DATOS DEL EMPLEADO ---");
        System.out.print("ID: "); int id = sc.nextInt(); sc.nextLine();
        System.out.print("Nombre: "); String nombre = sc.nextLine();
        System.out.print("Cargo: "); String cargo = sc.nextLine();
        return new Empleados ();
    }

    public static Categoria registrarCategoria(Scanner sc) {
        System.out.println("\n--- DATOS DE CATEGORÍA ---");
        System.out.print("ID: "); int id = sc.nextInt(); sc.nextLine();
        System.out.print("Nombre: "); String nombre = sc.nextLine();
        return new Categoria();
    }

    public static Producto registrarProducto(Scanner sc, Categoria cat) {
        System.out.println("\n--- DATOS DEL PRODUCTO ---");
        System.out.print("ID: "); int id = sc.nextInt(); sc.nextLine();
        System.out.print("Nombre: "); String nombre = sc.nextLine();
        System.out.print("Precio Compra: $"); double pC = sc.nextDouble();
        System.out.print("Precio Venta: $"); double pV = sc.nextDouble(); sc.nextLine();
        return new Producto();
    }

    public static Venta registrarVenta(Scanner sc, Cliente cli, Empleados emp) {
        System.out.println("\n--- INICIAR VENTA ---");
        System.out.print("ID Venta: "); int id = sc.nextInt(); sc.nextLine();
        System.out.print("Fecha: "); String fecha = sc.nextLine();
        return new Venta(id, fecha, cli, emp);
    }

    public static DetalleVenta registrarDetalleVenta(Scanner sc, Producto prod) {
        System.out.println("\n--- AGREGAR PRODUCTO A VENTA ---");
        System.out.print("ID Detalle: "); int id = sc.nextInt();
        System.out.print("Cantidad: "); int cant = sc.nextInt(); sc.nextLine();
        return new DetalleVenta(id, cant, prod);
    }
}