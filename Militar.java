public class Militar extends Avion implements ICargaXmilitar{
    private int cantidadBalas;
    private SistemaArmas sistema;

    public Militar(){
        super();
        this.cantidadBalas = 0;
        this.sistema = null;
    }

    public Militar(String nombre, String modelo, String marca, double capacidadCombustible, String tipoMotor, int cantidadAsientos,int cantidadBalas,SistemaArmas sistema){
        super(nombre, modelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.cantidadBalas = cantidadBalas;
        this.sistema = sistema;
    }

    public int getCantidadBalas() {
        return cantidadBalas;
    }

    public void setCantidadBalas(int cantidadBalas) {
        this.cantidadBalas = cantidadBalas;
    }

    public SistemaArmas getSistema() {
        return sistema;
    }

    public void setSistema(SistemaArmas sistema) {
        this.sistema = sistema;
    }

    @Override
    public boolean verMundial() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" Militar" +
                " cantidadBalas=" + cantidadBalas +
                " sistema=" + sistema +
                '}';
    }

    @Override
    public boolean devolverTrueXfalse() {
        return false;
    }
}
