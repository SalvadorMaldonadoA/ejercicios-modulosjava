package rectangulo;

public class rectangulo {
    private double longitudB;
    private double altura;
    private String id;

    public rectangulo(double longitudB, double altura, String id) {
        this.longitudB = longitudB;
        this.altura = altura;
        this.id = id;
    }

    public double getLongitudB() { return longitudB; }
    public void setLongitudB(double longitudB) { this.longitudB = longitudB; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public double area() {
        return longitudB * altura;
    }

    public double perimetro() {
        return 2 * (longitudB + altura);
    }
}