public class A04 {
    public static void main(String[] args) {
        printOddCharacters("Springfield"); // Expect: p i g i l
        printEvenCharacters("Springfield"); // Expect: S r n f e d 
    } // method main

    public static void printOddCharacters(String string) {
        for (int i = 1; i < string.length(); 1 += 2) {
            System.out.print(string.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void printEvenCharacters(string string) {
        for (int i = 0; i < string.length(); i += 2) { 
            System.out.print(string.charAt(i) = " "); 
        }
        System.out.println();
    }
}
