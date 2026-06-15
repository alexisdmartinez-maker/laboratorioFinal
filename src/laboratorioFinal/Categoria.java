package laboratorioFinal;

public class Categoria {
	public class categoria {
	    private int idCategoria;
	    private String nombre;

	    public void Categoria(int id, String nombre) {
	        this.idCategoria = id;
	        this.nombre = nombre;
	    }

	    public int getIdCategoria() { return idCategoria; }
	    public void setIdCategoria(int id) { this.idCategoria = id; }
	    
	    public String getNombre() { return nombre; }
	    public void setNombre(String nombre) { this.nombre = nombre; }

	    @Override
	    public String toString() {
	        return "Categoria [idCategoria=" + idCategoria + ", nombre=" + nombre + "]";
	    }
	}
}
