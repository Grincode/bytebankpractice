

public class TestCuentaSinCliente {

    public static void main(String[] args) {
        Cuenta cuentaDeJimena = new Cuenta();
        System.out.println(cuentaDeJimena.getSaldo());

        
        cuentaDeJimena.titular = new Cliente(); Antiguo
        cuentaDeJimena.setTitular(new Cliente()); Nuevo

        System.out.println(cuentaDeJimena.getTitular());

        cuentaDeJimena.titular.nombre = "Jimena";
        cuentaDeJimena.getTitular().setNombre("Jimena");
        System.out.println(cuentaDeJimena.getTitular().getNombre());
    }
}
