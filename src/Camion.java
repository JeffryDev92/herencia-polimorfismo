public class Camion extends Vehiculo {

    private double capacidadCarga; // en toneladas

    public Camion(String marca, String modelo, int año, double capacidadCarga) {
        super(marca, modelo, año);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Camión:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Capacidad de carga: " + capacidadCarga + " toneladas");
    }
}
