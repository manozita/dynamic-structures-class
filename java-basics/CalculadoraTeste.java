public class CalculadoraTeste {

	public static void main (String[] args) {
		if (args.length != 3) {
			System.out.println("Insira 3 argumentos de entrada.");
			return;
		}
		
		if (!isNumber(args[0]) || (!isNumber(args[2]))) {
			System.out.println("Insira no formato 'numero operacao numero'");
			return;
		}
		
		float n1 = Float.parseFloat(args[0]);
		float n2 = Float.parseFloat(args[2]);
			
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
		
	}
	
	public static boolean isNumber(String str) {
		//checar se contem uma virgula/ponto + checar se os caracteres sao numerais
		boolean check = false;
		char c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c == '.' || c == ',') {
				if (check)
					return false;
				else
					check = true;
			}
			else if (c < '0' || c > '9')
				return false;
		}
		return true;
	}
}