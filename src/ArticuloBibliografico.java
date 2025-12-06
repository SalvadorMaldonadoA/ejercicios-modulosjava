public class ArticuloBibliografico {        //1-Separacion de el metodo principal y la creación del objeto
    private String id;                      // 2- declaración de variables de tipo private
    private String autor;
    private boolean prestado;
    private int aniopublicación;

    public ArticuloBibliografico(String id, String autor, boolean disponiblidad, int añopublicación){
        this.id=id;
        this.autor=autor;
        this.aniopublicación=añopublicación;   //3-Creación del constructor para inicializar los atributos.

        this.prestado=false;
    }
  public String getId(){                      //4- Declaración de los getters y setters (optencion y cambio)
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAñopublicación(){
        return aniopublicación;
    }
    public void setAñopublicación(int añopublicación) {
        this.aniopublicación = añopublicación;
    }
    public boolean reservar() {                          //5. Funcion 1
        if (!prestado) {
            this.prestado = true;
            return true;
        } else {
            return false;
        }
    }
        public boolean esApto ( int añoActual){             //6. Función 2
            int antiguedad = añoActual - this.aniopublicación;
            if (antiguedad > 5) {
                return true;
            } else {
                return false;
            }
        }
    }