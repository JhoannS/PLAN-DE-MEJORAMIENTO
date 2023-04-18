package Daviplata;

public class Retiro_dinero extends Logica {
    @Override
    public void Transacciones() {
        System.out.print("¿Cuanto deseas retirar? : $");
        Retirar();
        if (retirar <= getSaldo()) {
            transaccion = getSaldo();
            System.out.println("----------------------------------");
            setSaldo(transaccion - retirar);
            System.out.println("Retiraste: " + retirar);
            System.out.println("Tu saldo actual ahora es de: $" + getSaldo());
            System.out.println("----------------------------------");
        } else {
            System.out.println("----------------------------------");
            System.out.println("Error, saldo insufiente");
            System.out.println("----------------------------------");

        }
    }
}
