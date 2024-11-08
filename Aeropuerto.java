import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aeropuerto {
    private String nombre;
    private CodigosInternacionales codigoInternacional;
    private String direccion;
    private int capacidadOperacion;
    private List<Avion> cantidadAviones;

    public Aeropuerto() {
        this.nombre = "";
        this.codigoInternacional = null;
        this.direccion = "";
        this.capacidadOperacion = 0;
       this.cantidadAviones = new ArrayList<>();

    }

    public Aeropuerto(String nombre,CodigosInternacionales codigoInternacional, String direccion, int capacidadOperacion) {
        this.nombre = nombre;
        this.codigoInternacional = codigoInternacional;
        this.direccion = direccion;
        this.capacidadOperacion = capacidadOperacion;
        this.cantidadAviones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CodigosInternacionales getCodigoInternacional() {
        return codigoInternacional;
    }

    public void setCodigoInternacional(CodigosInternacionales codigoInternacional) {
        this.codigoInternacional = codigoInternacional;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidadOperacion() {
        return capacidadOperacion;
    }

    public void setCapacidadOperacion(int capacidadOperacion) {
        this.capacidadOperacion = capacidadOperacion;
    }


  public void cargarAviones(Avion avion) throws CapacidadMaximaException{
        if(cantidadAviones.size() <capacidadOperacion){
            cantidadAviones.add(avion);
            System.out.println("AVION AGREGADO CON EXITO.");

        }else{
            throw new CapacidadMaximaException("ERROR, NO SE PUEDE AGREGAR EL AVION: "+avion.toString()+" SUPERA LA CANTIDAD MAXIMA DE OPERACIONES.");
        }
  }

    @Override
    public String toString() {
        return "Aeropuerto{" +
                "nombre='" + nombre + '\'' +
                ", codigoInternacional=" + codigoInternacional +
                ", direccion='" + direccion + '\'' +
                ", capacidadOperacion=" + capacidadOperacion +
                '}';
    }


    public void despegarAviones(int hangar){
        for (Avion avion : cantidadAviones) {
            System.out.println("EL AVION: "+ avion.toString()+" Esta despegando del hangar: "+hangar);
            System.out.println(avion.despegar());

        }
    }

    public void listarAvionesAeropuerto(){
        if(cantidadAviones.isEmpty()){
            System.out.println("no hay aviones en el aeropuerto.");
        }else{
            System.out.println("aviones en el aeropuerto: ");
            for(Avion avion : cantidadAviones){
                System.out.println(avion);
            }
        }
    }
}
