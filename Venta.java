import java.util.Calendar;
import java.util.Date;

public class Venta extends Vendedor {
    private String Vendedor;
    private String Cliente;
    private String vehiculoComprado;
    private String obtenerLineasPDF;
    private String Fecha;
    private String Vehiculo;
    private String nombre;

    public Venta(String Vendedor, String Cliente, String vehiculoComprado, String obtenerLineasPDF, String Fecha) {
        super();
        this.Vendedor = Vendedor;
        this.Cliente = Cliente;
        this.vehiculoComprado = vehiculoComprado;
    }

    public Venta(Vehiculo vehiculo, Persona comprador, Vendedor vendedor) {
    }

    public Venta(Vehiculo vehiculo, Cliente comprador, Vendedor vendedor) {
    }

    public Venta(Vehiculo vehiculo, Vendedor comprador, Vendedor vendedor) {
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getVehiculoComprado() {
        return vehiculoComprado;
    }

    public void setVehiculoComprado(String vehiculoComprado) {
        this.vehiculoComprado = vehiculoComprado;
    }

    public String getobtenerLineasPDF(String obtenerLineasPDF) {
        return obtenerLineasPDF;
    }

    public void setobtenerLineasPDF() {
        this.obtenerLineasPDF = obtenerLineasPDF;
    }
    public Date getFecha(){
        Date Fecha = Calendar.getInstance().getTime();
        return Fecha;
    }

    public void setFecha(){
        this.Fecha = Fecha;
    }

    public String getVehiculo(){
        return Vehiculo;
    }

    public void setVehiculo(){
        this.Vehiculo = Vehiculo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

	/**
	 * 
	 * @param Fecha
	 */
	public String getFecha(String Fecha) {
		// TODO - implement Venta.getFecha
		throw new UnsupportedOperationException();
	}
}