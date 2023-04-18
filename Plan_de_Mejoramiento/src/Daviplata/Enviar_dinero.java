package Daviplata;

public class Enviar_dinero extends Logica {

    @Override
    public void Transacciones() {
        System.out.print("digita el numero de la cuenta: #");
        n_cuenta = Lector.nextInt();
        System.out.print("¿Cuanto deseas enviar?: $");
        Enviar_dinero();

        if (envio <= getSaldo()) {
            transaccion = getSaldo();
            System.out.println("----------------------------------");
            setSaldo(transaccion - envio);
            System.out.println("Enviaste:$ " + envio);
            System.out.println("Tu saldo actual ahora es de: $" + getSaldo());
            System.out.println("----------------------------------");
        } else {
            System.out.println("----------------------------------");
            System.out.println("Error, saldo insufiente");
            System.out.println("----------------------------------");

        }
    }

}
