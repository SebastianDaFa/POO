public class Cuenta {
    private String numero;
    private String tipo;
    private double saldoActual;
    private double saldoMinimo;
    public Cuenta(int numero, String tipo, double valorInicial){
        String StrNumero = String.valueOf(numero);
        this.numero = StrNumero;
        this.tipo = tipo;
        saldoActual = valorInicial;
        saldoMinimo = valorInicial*0.10;
    }

    public String getNumero() {
        return numero;
    }
    public void consignar(double monto){
        saldoActual += monto;
        System.out.println("Se ha ingresado "+monto+" correctamente\nSaldo actual: "+saldoActual);
    }
    public void retirar(double monto){
        if(saldoActual > saldoMinimo){
            if( saldoActual - monto < saldoMinimo){
                saldoActual = saldoMinimo;
                System.out.println("Solo se podra retirar "+(saldoActual-saldoMinimo)+" ya que la cuenta siembre debe tener "+saldoMinimo+" de saldo\nSaldo actual: "+saldoActual);
            }else {
                saldoActual -= monto;
                System.out.println("Se ha retirado "+monto+" correctamente\nSaldo actual: "+saldoActual);
            }
        }else {
            System.out.println("No puede retirar ya que el saldo actual es el saldo minimo\nSaldo actual: "+saldoActual);
        }
    }
    public double getSaldo(){
        return saldoActual;
    }
    public double getSaldoMinimo(){
        return saldoMinimo;
    }
    public double getCapacidadCredito(){
        if (tipo.equalsIgnoreCase("ahorro")){
            return saldoActual-saldoMinimo;
        }else {
            return saldoActual*3;
        }
    }

}

