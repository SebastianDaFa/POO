public class Cita{
    private int numero;
    private int tipo;
    private double tarifa;
    private double valorFinal;
    public Cita(int numero, int tipo, double tarifa){
        this.numero = numero;
        this.tipo = tipo;
        this.tarifa = tarifa;
    }

    public int getNumero(){
        return numero;
    }
    public String getTipo(){
        if (tipo>3){
            return "Especialista";
        }else{
            return "General";
        }
    }
    public double getTarifa(){
        return tarifa;
    }
    public double calcularValorFinal(){
        if (tipo > 3) {
            return tarifa * 1.5;
        } else {
            return tarifa - (tarifa * 0.5);
        }
    }
}