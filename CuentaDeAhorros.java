public class CuentaDeAhorros {
    private int numCuenta;
    private String titular;
    private double saldoActual = 3500;



    public CuentaDeAhorros(int numCuenta, String titular, double saldoActual) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        this.saldoActual = saldoActual;

    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double deposito(double monto) {
        this.saldoActual = this.saldoActual + monto;
        return saldoActual;
    }

    public double retiro(double monto) {
        if (monto <= saldoActual) {
            this.saldoActual = saldoActual - monto;
            System.out.println("Retiro exitoso!");
            return saldoActual;
        } else {
            System.out.println("El retiro excede el saldo actual");
            return saldoActual;
        }
    }
    }



