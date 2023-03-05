package services;

public class Applicationn {

	public static void main(String[] args) {

		int entrada = 0;
		LeitorService leitorService = new LeitorService();

		if (args.length > 0) {
			try {
				entrada = Integer.parseInt(args[0]);
			} catch (NumberFormatException e) {
				entrada = leitorService.lerDoConsole();
			}
		} else {
			entrada = leitorService.lerDoConsole();
		}
		FibonacciService service = new FibonacciService();
		boolean ehValido = service.isFibonacciValid(entrada);

		if (ehValido) {
			System.out.println("É um número fibonacci valido!");
			return;
		}
		System.out.println("Não é um número fibonacci valido!");
	}

}
