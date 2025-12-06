package vuelo;

public class vuelo {
        private String codigoDeVuelo;
        private int capacidadMaxima;
        private int numeroTotalAsientos;
        private int costoVoleto;

        public vuelo(String codigoDeVuelo, int capacidadMaxima, int numeroTotalAsientos, int costoVoleto){
            this.codigoDeVuelo = codigoDeVuelo;
            this.capacidadMaxima = capacidadMaxima;
            this.numeroTotalAsientos = numeroTotalAsientos;
            this.costoVoleto = costoVoleto;
        }

        public String getCodigoDeVuelo(){
            return codigoDeVuelo;
        }
        public int getCapacidadMaxima(){
            return capacidadMaxima;
        }
        public int getNumeroTotalAsientos(){
            return numeroTotalAsientos;
        }
        public int getCostoVoleto(){
            return costoVoleto;
        }

        public void setCodigoDeVuelo(String codigoDeVuelo){
            this.codigoDeVuelo = codigoDeVuelo;
        }
        public void setCapacidadMaxima(int capacidadMaxima){
            this.capacidadMaxima = capacidadMaxima;
        }
        public void setNumeroTotalAsientos(int numeroTotalAsientos){
            this.numeroTotalAsientos = numeroTotalAsientos;
        }
        public void setCostoVoleto(int costoVoleto){
            this.costoVoleto = costoVoleto;
        }


        public String reservarAsiento(int cantidad) {
            if (numeroTotalAsientos + cantidad <= capacidadMaxima) {
                numeroTotalAsientos += cantidad;
                return "Reserva exitosa";
            } else {
                return "Error: no hay suficientes asientos disponibles";
            }
        }

        public int porcentajeOcupacion(){

            return (numeroTotalAsientos * 100) / capacidadMaxima;
        }


        }


