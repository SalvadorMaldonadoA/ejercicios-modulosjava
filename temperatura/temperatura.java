package temperatura;

public class temperatura {
        private double temperatura;
        private String unidadDeMedida;
        private String fechaRegistro;

        public temperatura(double temperatura, String unidadDeMedida, String fechaRegistro) {
            this.temperatura = temperatura;
            this.unidadDeMedida = unidadDeMedida;
            this.fechaRegistro = fechaRegistro;
        }

        public double getTemperatura() {
            return temperatura;
        }

        public void setTemperatura(double temperatura) {
            this.temperatura = temperatura;
        }

        public String getUnidadDeMedida() {
            return unidadDeMedida;
        }

        public void setUnidadDeMedida(String unidadDeMedida) {
            this.unidadDeMedida = unidadDeMedida;
        }

        public String getFechaRegistro() {
            return fechaRegistro;
        }

        public void setFechaRegistro(String fechaRegistro) {
            this.fechaRegistro = fechaRegistro;
        }

        public double conversion() {
            if (unidadDeMedida.equalsIgnoreCase("Celsius")) {
                temperatura = (temperatura * 1.8) + 32;
                unidadDeMedida = "Fahrenheit";
            } else if (unidadDeMedida.equalsIgnoreCase("Fahrenheit")) {
                temperatura = (temperatura - 32) * 5.0 / 9.0;
                unidadDeMedida = "Celsius";
            }
            return temperatura;
        }

        public String evaluarTemperatura() {
            if (unidadDeMedida.equalsIgnoreCase("Celsius") && temperatura >= 40) {
                return "Temperatura extrema!";
            } else if (unidadDeMedida.equalsIgnoreCase("Fahrenheit") && temperatura >= 104) {
                return "Temperatura extrema!";
            } else {
                return "Temperatura adecuada";
            }
        }

    }

