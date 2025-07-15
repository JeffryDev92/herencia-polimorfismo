public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Automovil("Toyota", "Corolla", 2020, 4);
        Vehiculo v2 = new Camion("Volvo", "FH16", 2019, 18.0);

        System.out.println("Demostración de polimorfismo:");
        System.out.println("--------------------------------");
        v1.mostrarInfo();  // Llama al método de Automovil
        System.out.println("--------------------------------");
        v2.mostrarInfo();  // Llama al método de Camion
    }
}
