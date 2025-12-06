package cadenaCaracteres;

public class cadenaCaracteres {
    private String textoActual;
    private String identificadorModulo;
    private final int longitudMaxima = 100;

    public cadenaCaracteres(String textoActual, String identificadorModulo) {
        this.textoActual = textoActual;
        this.identificadorModulo = identificadorModulo;
    }

    public String getTextoActual() {
        return textoActual;
    }

    public void setTextoActual(String textoActual) {
        this.textoActual = textoActual;
    }

    public String getIdentificadorModulo() {
        return identificadorModulo;
    }

    public void setIdentificadorModulo(String identificadorModulo) {
        this.identificadorModulo = identificadorModulo;
    }

    public int getLongitudMaxima() {
        return longitudMaxima;
    }

    // Comportamiento 1: añadir prefijo
    public String añadirPrefijo(String prefijo) {
        textoActual = prefijo + textoActual;
        return textoActual;
    }

    // Comportamiento 2: contar espacios en blanco
    public int contarEspacios() {
        int contador = 0;
        for (int i = 0; i < textoActual.length(); i++) {
            if (textoActual.charAt(i) == ' ') {
                contador++;
            }
        }
        return contador;
    }
}

