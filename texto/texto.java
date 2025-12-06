package texto;

public class texto {

        private String textoActual;
        private String idModulo;
        private int longitudMaxima;

        public texto(String textoInicial, String idModulo, int longitudMaxima) {
            this.textoActual = textoInicial;
            this.idModulo = idModulo;
            this.longitudMaxima = longitudMaxima;
        }

        public String agregarPrefijo(String prefijo) {
            String nuevaCadena = prefijo + textoActual;
            if (nuevaCadena.length() <= longitudMaxima) {
                textoActual = nuevaCadena;
            }
            return textoActual;
        }

        public int contarEspacios() {
            int contador = 0;
            for (int i = 0; i < textoActual.length(); i++) {
                if (textoActual.charAt(i) == ' ') {
                    contador++;
                }
            }
            return contador;
        }

        public String getTextoActual() {
            return textoActual;
        }

        public String getIdModulo() {
            return idModulo;
        }

        public int getLongitudMaxima() {
            return longitudMaxima;
        }
    }



