class Hello {
	public static void main(String args[]) {
		if (args.length == 0)
			System.out.println("Bem vindo ao LED");
		else {
			String nome = args[0];
			System.out.println("Bem vindo ao LED, " + nome);
		}
	}
}