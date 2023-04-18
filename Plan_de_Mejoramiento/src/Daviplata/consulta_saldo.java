package Daviplata;

public class consulta_saldo extends Logica {

    @Override
    public void Transacciones() {
        System.out.println("----------------------------------");
        System.out.println("Tu saldo actual es: $" + getSaldo());
        System.out.println("----------------------------------");
    }

}
