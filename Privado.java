public class Privado extends Avion implements IComercialXprivado{
    private boolean jacuzzi;
    private String claveWifi;

    public Privado(){
        super();
        this.jacuzzi = false;
        this.claveWifi = "";
    }

    public Privado(String nombre, String modelo, String marca, double capacidadCombustible, String tipoMotor, int cantidadAsientos,boolean jacuzzi, String claveWifi){
        super(nombre, modelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.jacuzzi = jacuzzi;
        this.claveWifi = claveWifi;
    }

    public boolean isJacuzzi() {
        return jacuzzi;
    }

    public void setJacuzzi(boolean jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    public String getClaveWifi() {
        return claveWifi;
    }

    public void setClaveWifi(String claveWifi) {
        this.claveWifi = claveWifi;
    }

    @Override
    public boolean verMundial() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() +" Privado" +
                " jacuzzi=" + jacuzzi +
                " claveWifi='" + claveWifi + '\'' +
                '}';
    }

    @Override
    public String servirComida() {
        return "SE EMPEZO A SERVIR LA COMIDA";
    }

    @Override
    public String darMantas() {
        return "SE LE DIO MANTAS A LOS PASAJEROS";
    }
}
