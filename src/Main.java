import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Functions f = new Functions();
        Scanner in = new Scanner(System.in);
        System.out.println("Vamos a ejecutar un par de funciones que calculan el reverso, palindromo y ocurrencias de letras sobre una cadena de textos");
        System.out.println("Podes escribir la que quieras. Una recomendacion es 'Reconocer' o 'Menem' para palindromos");
        System.out.println();
        System.out.print("Escriba una cadena de texto a analizar, o 'fin' para salir: ");
        String strAnalize = in.nextLine();
        while(!strAnalize.equals("fin")) {
            System.out.println();
            System.out.println("El reverso del string '" + strAnalize + "', siendo case sensitive: " + false + ", es: " + f.reverse(strAnalize, false));
            System.out.println("El reverso del string '" + strAnalize + "', siendo case sensitive: " + true + ", es: " + f.reverse(strAnalize, true));
            System.out.println();
            System.out.println("El string '" + strAnalize + "', siendo case sensitive: " + false + ", es palindromo?: " + f.palindrome(strAnalize, false));
            System.out.println("El string '" + strAnalize + "', siendo case sensitive: " + true + ", es palindromo?: " + f.palindrome(strAnalize,true));
            System.out.println();
            System.out.println("El string '" + strAnalize + "', siendo case sensitive: " + false + ", tiene las siguientes occuriencias: " + f.ocurrences(strAnalize, false).toString());
            System.out.println("El string '" + strAnalize + "', siendo case sensitive: " + true + ", tiene las siguientes occuriencias: " + f.ocurrences(strAnalize, true).toString());
            System.out.println();
            System.out.print("Escriba otra cadena de texto a analizar, o 'fin' para salir: ");
            strAnalize = in.nextLine();
        }
    }
}