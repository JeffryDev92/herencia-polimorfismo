public class Automovil extends Vehiculo {

    private int numPuertas;

    public Automovil(String marca, String modelo, int año, int numPuertas) {
        super(marca, modelo, año);
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Automóvil:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Número de puertas: " + numPuertas);
    }
}
