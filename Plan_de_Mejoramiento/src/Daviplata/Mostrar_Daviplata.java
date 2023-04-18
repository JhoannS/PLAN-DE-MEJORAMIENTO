package Daviplata;

public class Mostrar_Daviplata {
    public static void main(String[] args) {
        Logica conexion = new consulta_saldo();
        conexion.setSaldo(100000);
        conexion.logica();
    }
}
