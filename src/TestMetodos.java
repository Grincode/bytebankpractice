public class TestMetodos {

    public static void main(String[] args) {
        Cuenta cuentaDeDiego = new Cuenta();
        cuentaDeDiego.saldo = 100;
        cuentaDeDiego.deposita(50);
        System.out.println(cuentaDeDiego.saldo);

        boolean consigioRetirar = cuentaDeDiego.saca(20);
        System.out.println(cuentaDeDiego.saldo);
        System.out.println(consigioRetirar);

        Cuenta cuentaDeJimena = new Cuenta();
        cuentaDeJimena.deposita(1000);

        boolean exitoTransferencia = cuentaDeJimena.transfiere(300, cuentaDeDiego);
        if (exitoTransferencia) {
            System.out.println("transferencia exitosa");
        } else {
            System.out.println("falto dinero");
        }
    }

}
