package Daviplata;

public class Recargar_cuenta extends Logica{
    @Override
    public void Transacciones(){
        System.out.print("¿Cuanto deseas depositar?: $");
        Recargar_cuenta();

        transaccion = getSaldo();
        setSaldo(transaccion + recargar);
         System.out.println("Depositaste: $" + recargar);
        System.out.println("----------------------------------");
        System.out.println("Tu saldo actual es: $"+ getSaldo());
        System.out.println("----------------------------------");

    }
}
