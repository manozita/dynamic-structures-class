import java.util.Scanner;

public class SegundoGrau  {
    public static void main() {
        //novo scanner
        Scanner sc = new Scanner (System.in);
        //axx + bx + c = 0
        System.out.println("\n\nDado que ax^2 + bx + c = 0,\nForneca os valores de a, b e c, separados por espaço: ");
        String valores = sc.nextLine();
        String[] arrayValores = valores.split(" ");
        if (arrayValores.length != 3) {
            System.out.println("Insira os valores de a, b, c.\n");
            return;
        }
        for (int i = 0; i < arrayValores.length; i++) {
            if (!isNumeric(arrayValores[i])) {
                System.out.println("Insira valores inteiros para a, b, c.\n");
                return;
            }
        }
	int a = Integer.parseInt(arrayValores[0]);
	int b = Integer.parseInt(arrayValores[1]);
	int c = Integer.parseInt(arrayValores[2]);
	int delta = ((b*b)-(4*a*c));
	double raiz, x1, x2;
	
	if (delta < 0) {
	    delta = delta*(-1);
	    raiz = java.lang.Math.sqrt((double)delta);
	    System.out.println("X e um numero complexo.\n");
	    System.out.printf("X1 = (-%d + %.2fi)/%d \nX2 = (%d + %.2fi)/%d", b, raiz, (2*a), b, raiz, (2*a));
        }
        else {
            raiz = java.lang.Math.sqrt((double)delta);
            x1 = ((-1*b)+raiz)/(2*a);
            x2 = ((-1*b)-raiz)/(2*a);
            System.out.printf("X1 = %.2f \nX2 = %.2f", x1, x2);
        }
    }
	
    public static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) { // percorre a string
            if (!Character.isDigit(c) && c != '-') // verifica se eh digito
                return false;
	}			
        return true;
    }
}