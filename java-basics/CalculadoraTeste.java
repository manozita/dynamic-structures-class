public class CalculadoraTeste {

	public static void main (String[] args) {
		if (args.length != 3) {
			System.out.println("Insira 3 argumentos de entrada.");
			return;
		}
		
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[2]);
			
			char operacao = args[1].charAt(0);
		
			switch (operacao) {
				case '+':
					System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
					break;
				case '-':
					System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
					break;
				case 'x':
				case '*':
					System.out.println(n1 + " x " + n2 + " = " + (n1*n2));
					break;
				case '/':
					System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
					break;
				default:
					System.out.println("Operacao invalida. Tente +, -, x ou /");
			}
		} catch (NumberFormatException e) {
			System.out.println("Insira no formato 'numero operacao numero'");
		}
		
	}

}