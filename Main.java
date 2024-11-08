import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ///INSTANCIA DE CLASE DEL AEROPUERTO
     Aeropuerto aeropuerto = new Aeropuerto("AEROPUERTO ASTOR PIAZZOLLA",CodigosInternacionales.MDQ,"Autovía 2 Km 398.5, Mar del Plata, Provincia de Buenos Aires",5);

     ///INSTANCIA DE CLASE DE UN AVION COMERCIAL
        Comercial comercial = new Comercial("Airbus","747","Freighter",300.2,"Pratt & Whitney PW4000",200,15);
        Comercial comercial2 = new Comercial("Airbus","300","ST",300.2,"Turbofán",120,11);

        ///INSTANCIA DE CLASE DE UN AVION DE CARGA
        Carga carga = new Carga("Anatov","225","Mriya",140.6,"Progress D-18T",13205.2);

        ///INSTANCIA DE CLASE DE UN AVION MILITAR
        Militar militar = new Militar("F-35","Lightning","II",70,"Pratt & Whitney F135",2,400,SistemaArmas.AIRE_AIRE);


        ///INSTANCIA DE CLASE DE UN AVION PRIVADO
        Privado privado = new Privado("Gulfstream","G550","Luxury",69,"Rolls-Royce BR700",8,true,"tinc7435");

        ///INSTANCIAS DE CLASE PRODUCTO
        Producto mouse = new Producto("Mouse logitech G pro X superlight","mouse ultraliviano con el mejor sensor del mercado",150.000);
        Producto monitor = new Producto("Monitor gigabyte 144hz","monitor con alta tasa de refresco",250000);

        ///INSTANCIAS DE CLASE SERVICIO
        Servicio dutyFree = new Servicio("DUTY FREE","tienda dentro del avion",50);
        Servicio BuisnessClass = new Servicio("BUISNESS CLASS","Mejor posicion dentro del avion y mayor comodidad",1600);
        int opc = 0;


        do {
            System.out.println("------------INGRESE UNA OPCION------------");
            System.out.println("-> 1.PROBAR METODOS AVION COMERCIALES.");
            System.out.println("-> 2.PROBAR METODOS AVION DE CARGA");
            System.out.println("-> 3.PROBAR METODOS AVION MILITAR");
            System.out.println("-> 4.PROBAR METODOS AVION PRIVADO");
            System.out.println("-> 5.PROBAR METODOS DEL AEROPUERTO");
            System.out.println("-> 6.SALIR DEL SISTEMA ");
            opc = scanner.nextInt();
            scanner.nextLine();

            switch(opc){

                case 1:
                    System.out.println(comercial.despegar());
                    System.out.println(comercial.aterrizar());
                    System.out.println(comercial.volar());
                    System.out.println(comercial.servirComida());
                    System.out.println(comercial.darMantas());
                    comercial.agregarServicio(dutyFree);
                    comercial.agregarServicio(BuisnessClass);
                    System.out.println(comercial2.verMundial());
                    System.out.println(comercial.toString());

                    break;

                case 2:
                    System.out.println(carga.despegar());
                    System.out.println(carga.aterrizar());
                    System.out.println(carga.volar());
                    System.out.println(carga.verMundial());
                    try{
                       carga.agregarProducto(mouse);
                       carga.agregarProducto(monitor);
                    }catch (InputMismatchException e){
                        System.out.println(e.getMessage());
                    }
                    System.out.println("¿Puede ingresar mercancía en el avión de carga?: " + carga.devolverTrueXfalse());
                    System.out.println(carga.descargarContenido());
                    System.out.println(carga.toString());


                    break;

                case 3:
                    System.out.println(militar.despegar());
                    System.out.println(militar.volar());
                    System.out.println(militar.aterrizar());
                    System.out.println("se puede ver el mundial? "+militar.verMundial());
                    System.out.println("¿Puede ingresar personal en el avión militar?: " + militar.devolverTrueXfalse());
                    System.out.println(militar.toString());
                    break;

                case 4:
                    System.out.println(privado.despegar());
                    System.out.println(privado.volar());
                    System.out.println(privado.aterrizar());
                    System.out.println("se puede ver el mundial? "+privado.verMundial());
                    System.out.println("tiene jacuzzi? "+privado.isJacuzzi());
                    System.out.println(privado.servirComida());
                    System.out.println(privado.darMantas());
                    System.out.println("La clave WIFI es: "+privado.getClaveWifi());
                    System.out.println(privado.toString());


                    break;

                case 5:
                    System.out.println("BIENVENIDO AL "+aeropuerto.toString());
                    try{
                        aeropuerto.cargarAviones(comercial);
                        aeropuerto.cargarAviones(carga);
                        aeropuerto.cargarAviones(militar);
                        aeropuerto.cargarAviones(privado);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }

                    System.out.println("---------LISTA DE AVIONES ACTUALES EN EL AEROPUERTO-----------");
                    aeropuerto.listarAvionesAeropuerto();

                    System.out.println("----------DESPEGAR AVIONES DEL HANGAR ESPECIFICO----------");
                    System.out.println();
                    System.out.println("ingrese el numero de hangar para hacer despegar a los aviones:");
                    int hangar = scanner.nextInt();
                    scanner.nextLine();

                    aeropuerto.despegarAviones(hangar);

                    break;

                case 6:
                    System.out.println("SALIENDO DEL SISTEMA...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("OPCION INVALIDA.");
                    break;

            }

        }while(opc <8);

    }
}