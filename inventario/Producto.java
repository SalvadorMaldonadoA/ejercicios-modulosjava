package inventario;

public class Producto {
    private String referencia;
    private int cantidad;
    private double precioUnitario;

    public Producto(String referencia, int cantidad, double precioUnitario) {
        this.referencia = referencia;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getReferencia() {
        return referencia; }
    public int getCantidad() {
        return cantidad; }
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    public void setReferencia(String referencia){
        this.referencia=referencia;
    }
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    public void setPrecioUnitario(double precioUnitario){
        this.precioUnitario=precioUnitario;
    }

    public String agregarStock(int entrada) {
        cantidad += entrada;
        return "Se han agregado " + entrada + " unidades al stock.";
    }

    public String mostrarValorTotal() {
        double total = cantidad * precioUnitario;
        return "Valor total del stock: $" + total;
    }
    public String resumenProducto() {
        return "Referencia: " + referencia +
                "\nCantidad en stock: " + cantidad +
                "\nPrecio unitario: $" + precioUnitario;
    }
}
