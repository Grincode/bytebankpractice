
public class TestCuentaConCliente {

	public static void main(String[] args) {
		Cliente juan = new Cliente();
		juan.nombre = "Juan Doe";
		juan.documento = "27987321";
		juan.telefono = "987654321";

		Cuenta cuentaDeJuan = new Cuenta();
		cuentaDeJuan.deposita(100);

        cuentaDeJuan.setTitular(juan);
        System.out.println(cuentaDeJuan.getTitular().getNombre());
	}

}
