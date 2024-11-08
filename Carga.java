import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;

public class Carga <T extends Producto> extends Avion implements ICargaXmilitar{
    private static final int CANTIDAD_ASIENTOS = 0;
    private double cantidadKilos;
    private List<T> lista;

    public Carga(){
        super();
        this.cantidadKilos = 0;
        this.lista = new ArrayList<>();
    }

    public Carga(String nombre, String modelo, String marca, double capacidadCombustible, String tipoMotor,double cantidadKilos){
        super(nombre,modelo,marca,capacidadCombustible,tipoMotor,CANTIDAD_ASIENTOS);
        this.cantidadKilos = cantidadKilos;
        this.lista = new ArrayList<>();
    }

    public double getCantidadKilos() {
        return cantidadKilos;
    }

    @Override
    public boolean verMundial() {
        return false;
    }



   public void agregarProducto(T producto) {
       lista.add(producto);

   }


   public void mostrarProductos(){
        Iterator<T> it = lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
   }

    @Override
    public String toString() {
        return super.toString()+" Carga" +
                " cantidadKilos=" + cantidadKilos +
                " productos=" + lista +
                '}';
    }

    @Override
    public boolean devolverTrueXfalse() {
        return true ;
    }

    public String descargarContenido(){
        return "DESCARGANDO EL CONTENIDO DEL AVION...";
    }
}
