
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;


public class Comercial <T extends Servicio> extends Avion implements IComercialXprivado{
    private int capacidadAzafatas;
    private List<T> lista;

    public Comercial(){
        super();
        this.capacidadAzafatas = 0;
        this.lista = new ArrayList<>();
    }

    public Comercial(String nombre, String modelo, String marca, double capacidadCombustible, String tipoMotor, int cantidadAsientos,int capacidadAzafatas){
        super(nombre, modelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.capacidadAzafatas = capacidadAzafatas;
        this.lista = new ArrayList<>();
    }


    public int getCapacidadAzafatas() {
        return capacidadAzafatas;
    }

    public void setCapacidadAzafatas(int capacidadAzafatas) {
        this.capacidadAzafatas = capacidadAzafatas;
    }



    @Override
    public String toString() {
        return super.toString() +" Comercial" +
                " CapacidadAzafatas=" + capacidadAzafatas +
                " Servicios=" + lista +
                '}';
    }

    @Override
    public boolean verMundial() {
        return false;
    }

    public void agregarServicio(T servicio) {
        lista.add(servicio);

    }

    public void mostrarListaServicios(){
        Iterator it = lista.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
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
