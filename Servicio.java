public class Servicio {
    private String nombre;
    private String descripcion;
    private double precio;

    public Servicio(){
        this.nombre = "";
        this.descripcion = "";
        this.precio = 0.0;
    }

    public Servicio(String nombre, String descripcion, double precio){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Servicios{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
