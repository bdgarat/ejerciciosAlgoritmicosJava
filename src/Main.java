

public class Main {
    public static void main(String[] args) {
        Functions f = new Functions();
        String str1 = "Hola Mundo";
        String str2 = "Reconocer";
        System.out.println("El reverso del string " + str1 + " es: " + f.reverse(str1, false));
        System.out.println("El reverso del string " + str1 + " es (case sensitive): " + f.reverse(str1, true));
        System.out.println("El reverso del string " + str2 + " es: " + f.reverse(str2, false));
        System.out.println("El reverso del string " + str2 + " es (case sensitive): " + f.reverse(str2, true));

        System.out.println("El string " + str1 + " es palindromo?: " + f.palindrome(str1, false));
        System.out.println("El string " + str1 + " es palindromo (case sensitive)?: " + f.palindrome(str1,true));
        System.out.println("El string " + str2 + " es palindromo?: " + f.palindrome(str2,false));
        System.out.println("El string " + str2 + " es palindromo (case sensitive)?: " + f.palindrome(str2,true));

    }
}