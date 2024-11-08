public abstract class Avion implements IAvion {
    private String nombre;
    private String modelo;
    private String marca;
    private double capacidadCombustible;
    private String tipoMotor;
    private int cantidadAsientos;

    public Avion(){
        this.nombre = "";
        this.modelo = "";
        this.marca = "";
        this.capacidadCombustible = 0.0;
        this.tipoMotor = "";
        this.cantidadAsientos = 0;
    }

    public Avion(String nombre, String modelo, String marca, double capacidadCombustible, String tipoMotor, int cantidadAsientos) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.marca = marca;
        this.capacidadCombustible = capacidadCombustible;
        this.tipoMotor = tipoMotor;
        this.cantidadAsientos = cantidadAsientos;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(double capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public abstract boolean verMundial();

    @Override
    public String toString() {
        return "Avion{" +
                "nombre='" + nombre + '\'' +
                " modelo='" + modelo + '\'' +
                " marca='" + marca + '\'' +
                " capacidadCombustible=" + capacidadCombustible +
                " tipoMotor='" + tipoMotor + '\'' +
                " cantidadAsientos=" + cantidadAsientos +
                " TipoAvion=";
    }

    @Override
    public String despegar() {
        return "ESTOY DESPEGANDO DE LA PISTA";
    }

    @Override
    public String aterrizar() {
        return "ESTOY ATERRIZANDO EN LA PISTA DE DESTINO";
    }

    @Override
    public String volar() {
        return "ACTUALMENTE ESTOY VOLANDO";
    }
}
