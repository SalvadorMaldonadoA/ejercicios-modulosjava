package tareapendiente;

public class tareapendiente {
    private String descripción;
    private String prioridad;
    private boolean avance;

    public tareapendiente(String descripción, String prioridad, boolean avance){
        this.descripción= descripción;
        this.prioridad=prioridad;
        this.avance=avance;
    }
    public String getDescripción(){
        return descripción;
    }
    public void setDescripción(String descripción){
        this.descripción=descripción;
    }
    public String getPrioridad(){
        return prioridad;
    }
    public void setPrioridad(String prioridad){
        this.prioridad= prioridad;
    }
    public boolean getAvance(){
        return  avance;
    }
    public void setAvance(boolean avance){
        this.avance= avance;
    }
    public String verificarAvance() {
        if (this.avance) {
            return "Completada!";
        } else {
            return "Incompleto";
        }
    }
    public String urgencia(){

        if(this.avance){
            return "No hay pendientes";
        }
        else if(this.prioridad.equalsIgnoreCase("Alta") && !this.avance) {
            return "Tarea con urgencia!";
        }else{
            return "Tarea pendiente sin urgencia";
        }

    }

}

