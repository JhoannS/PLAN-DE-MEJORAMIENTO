package Daviplata;

import java.util.Scanner;

//clase abstracta y tambien super clase
public abstract class Logica {
    protected int usuario, contraseña, transaccion, retirar, recargar, envio, n_cuenta; // variable ambito global
    private static int saldo; // encapsulacion tipo privada, que solo esta clase tiene acceso a ella

    Scanner Lector = new Scanner(System.in);

    // metodo logica
    public void logica() {
        int terminar = 0;
        int seleccion = 0; // variable local

        System.out.println("Usuario: ");
        usuario = Lector.nextInt();

        System.out.println("Contraseña: ");
        contraseña = Lector.nextInt();
        do {
            do {

                if (usuario == 1013 && contraseña == 2806) {
                    System.out.println("Bienvenido a su Monedero Digita Daviplata");
                    System.out.println("Selecione una opcion: ");
                    System.out.println("    1. Meter dinero ");
                    System.out.println("    2. Retirar dinero ");
                    System.out.println("    3. Consultar saldo ");
                    System.out.println("    4. Enviar dinero ");
                    System.out.println("    5. Salir ");
                    seleccion = Lector.nextInt();

                    if (seleccion >= 1 && seleccion <= 5) {
                        terminar = 1;
                    } else {
                        System.out.println("------------------------");
                        System.out.println("Opcion no disponible");
                        System.out.println("------------------------");
                    }
                } else {
                    terminar = 2;
                    System.out.println("----------------------------------");
                    System.out.println("lo siento, el usuario no existe.");
                    System.out.println("----------------------------------");
                }

            } while (terminar == 0);

            if (seleccion == 1) {
                Logica conexion = new Recargar_cuenta();
                conexion.Transacciones();
            } else if (seleccion == 2) {
                Logica conexion = new Retiro_dinero();
                conexion.Transacciones();
            } else if (seleccion == 3) {
                Logica conexion = new consulta_saldo();
                conexion.Transacciones();
            } else if (seleccion == 4) {
                Logica conexion = new Enviar_dinero();
                conexion.Transacciones();
            } else if (seleccion == 5) {
                System.out.println("------------------------");
                System.out.println("Adios Jhoan ");
                System.out.println("------------------------");
                terminar = 2;
            }
        } while (terminar != 2);
    }

    // metodo retiro
    public void Retirar() {
        retirar = Lector.nextInt();
    }

    // metodo recargar cuenta
    public void Recargar_cuenta() {
        recargar = Lector.nextInt();
    }

    // metodo para hacer hacer recargas
    public void Enviar_dinero() {
        envio = Lector.nextInt();
    }

    // metodo abstracto de la clase Logica
    public abstract void Transacciones();

    // usamos el get y set para el saldo
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
