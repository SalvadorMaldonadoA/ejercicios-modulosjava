package Empleo;

public class Empleo {
    private String claveEmpleado;
    private double salarioMensual;
    private double porcentajeRetencion;

    public Empleo(String claveEmpleado, double salarioMensual, double porcentajeRetencion) {
        this.claveEmpleado = claveEmpleado;
        this.salarioMensual = salarioMensual;
        this.porcentajeRetencion = porcentajeRetencion;
    }

    public String getClaveEmpleado() {
        return claveEmpleado;
    }

    public void setClaveEmpleado(String claveEmpleado) {
        this.claveEmpleado = claveEmpleado;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public double getPorcentajeRetencion() {
        return porcentajeRetencion;
    }

    public void setPorcentajeRetencion(double porcentajeRetencion) {
        this.porcentajeRetencion = porcentajeRetencion;
    }


    public double calcularSalarioNeto() {
        double impuestos = salarioMensual * (porcentajeRetencion / 100);
        return salarioMensual - impuestos;
    }


    public double aplicarAumento(double porcentajeAumento) {
        double aumento = salarioMensual * (porcentajeAumento / 100);
        salarioMensual += aumento;
        return salarioMensual;
    }
}


