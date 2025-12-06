package articulo;

import java.time.LocalDate;

public class articulo {
    private String identificador;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;


    public articulo(String identificador, String autor, int anioPublicacion) {
        this.identificador = identificador;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = true;
    }


    public String getIdentificador() { return identificador; }
    public void setIdentificador(String identificador) { this.identificador = identificador; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getAnioPublicacion() { return anioPublicacion; }
    public void setAnioPublicacion(int anioPublicacion) { this.anioPublicacion = anioPublicacion; }

    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }


    public String reservar() {
        if (disponible && calcularAntiguedad() > 5) {
            disponible = false;
            return "El libro ha sido reservado.";
        } else {
            return "El libro no está disponible debido al tiempo o la disponibilidad.";

        }
    }

    public int calcularAntiguedad() {
        int anioActual = LocalDate.now().getYear();
        return anioActual - anioPublicacion;
    }

    public String verificarPrestamo() {
        if (calcularAntiguedad() >5 ) {
            return "El libro es apto para préstamo.";
        } else {
            return "El libro NO es apto para préstamo.";
        }
    }
}
