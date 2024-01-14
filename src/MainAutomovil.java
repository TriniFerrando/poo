public class MainAutomovil {
    public static void main(String[] args) {

        //Creo el objeto Auto que tiene la clase Automovil la cual contiene los atributos y métodos.
        Automovil camioneta = new Automovil();

        camioneta.fabricante="Honda";
        camioneta.modelo="CRV";
        camioneta.cilindrada=2.0;
        camioneta.color="Negra";


        System.out.println(camioneta.detalle());

    }
}