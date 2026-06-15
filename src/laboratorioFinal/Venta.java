package laboratorioFinal;
import java.util.ArrayList;
public class Venta {
	
	    private int idVenta;
	    private String fecha;
	    private double total;
	    private Cliente cliente;
	    private Empleados empleado;
	    private ArrayList<DetalleVenta> detalles;

	    public Venta(int id, String fecha, Cliente cli, Empleados emp) {
	        this.idVenta = id;
	        this.fecha = fecha;
	        this.cliente = cli;
	        this.empleado = emp;
	        this.detalles = new ArrayList<>();
	        this.total = 0.0;
	    }

	    public int getIdVenta() { return idVenta; }

	    public String getFecha() { return fecha; }
	    public void setFecha(String fecha) { this.fecha = fecha; }

	    public Cliente getCliente() { return cliente; }
	    public void setCliente(Cliente cli) { this.cliente = cli; }

	    public Empleados getEmpleado() { return empleado; }
	    public void setEmpleado(Empleados emp) { this.empleado = emp; }

	    public void agregarDetalle(DetalleVenta det) {
	        this.detalles.add(det);
	        this.total = calcularTotal();
	    }

	    public double calcularTotal() {
	        double suma = 0;
	        for (DetalleVenta dv : detalles) {
	            suma += dv.getSubtotal();
	        }
	        return suma;
	    }

	    public ArrayList<DetalleVenta> getDetalles() { return detalles; }

	    @Override
	    public String toString() {
	        return "Venta [idVenta=" + idVenta + ", fecha=" + fecha + ", total=" + total + "]";
	    }
	}

