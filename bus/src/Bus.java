public class Bus {
    private String placa;
    private int capacidadPasajeros;
    private double precioPasaje;
    private int pasajerosActuales;
    private int totalPasajeros;
    public Bus(String placa, int capacidadPasajeros, double precioPasaje){
        this.placa = placa;
        this.capacidadPasajeros = capacidadPasajeros;
        this.precioPasaje = precioPasaje;
    }

    public String getPlaca() {
        return placa;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public double getPrecioPasaje() {
        return precioPasaje;
    }

    public int getPasajerosActuales() {
        return pasajerosActuales;
    }

    public int getTotalPasajeros() {
        return totalPasajeros;
    }

    public void subirPasajeros(int pasajeros){
        if (pasajerosActuales == capacidadPasajeros) {
            System.out.println("Error.... No se pueden subir ya que excedio la capacidad de pasajeros!\nCapacidad pasajeros: "+capacidadPasajeros);
        }else {
            if (pasajerosActuales + pasajeros > capacidadPasajeros){
                System.out.println("Solo se pueden subir "+(capacidadPasajeros-pasajerosActuales)+"pasajeros porque si no excede la capacidad de pasajeros\nCapacidad pasajeros: "+capacidadPasajeros);
                pasajerosActuales = capacidadPasajeros;
                System.out.println("\nPasajeros actuales: "+pasajerosActuales);
            }else {
                totalPasajeros += pasajeros;
                pasajerosActuales += pasajeros;
                if(pasajeros>1){
                    System.out.println("Se han subido "+pasajeros+" pasajeros");
                }else {
                    System.out.println("Se ha subido un pasajero");
                }
            }

        }

    }
    public void bajarPasajeros(int pasajeros){
        if (pasajerosActuales<1){
            System.out.println("Error... No puedes bajar pasajeros ya que no tienes ninguno!");
        }else {
            if (pasajerosActuales - pasajeros < 0){
                System.out.println("No puedes bajar "+pasajeros+" pasajeros porque solo tienes "+pasajerosActuales);
            }else {
                pasajerosActuales -= pasajeros;

                if(pasajeros>1){
                    System.out.println("Se han bajado "+pasajeros+" pasajeros");
                }else {
                    System.out.println("Se ha bajado un pasajero");
                }
            }

        }
    }
}
