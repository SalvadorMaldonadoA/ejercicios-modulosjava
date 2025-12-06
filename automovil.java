public class automovil {
    private String marcaVehiculo;
    private int anioFabricacion;
    private double velocidadMaxima;


    public automovil(String marcaVehiculo, int anioFabricacion, double velocidadMaxima) {
        this.marcaVehiculo = marcaVehiculo;
        this.anioFabricacion = anioFabricacion;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }


    public String encender(int anioActual) {
        int antiguedad = anioActual - anioFabricacion;
        if (antiguedad < 25) {
            return "El vehículo ha encendido con éxito!";
        } else {
            return "Error al intentar encender: vehículo demasiado antiguo.";
        }
    }


    public int calcularAntiguedad(int anioActual) {
        return anioActual - anioFabricacion;
    }
}




