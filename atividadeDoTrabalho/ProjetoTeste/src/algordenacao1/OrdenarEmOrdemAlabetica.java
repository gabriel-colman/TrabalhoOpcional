package algordenacao1;

public class OrdenarEmOrdemAlabetica {

    public static int[] Ordenarstr(String string_) {
        int i = 0;
        int j = 0;
        int temp = 0;
        char valor;
        int[] letras = new int[string_.length()];
        for (i = 0; i < string_.length(); i++) {
            for (j = 0; j < i; j++) {

                if (string_.charAt(i) < string_.charAt(j)) {
                    temp = i;
                    letras[i] = j;
                    letras[j] = temp;
                    System.out.println(i + j);
                }
            }
        }

        for (int a = 0; a < letras.length; a++) {
            System.out.println(string_.charAt(letras[a]));
        }
        return letras;
    }

    public static void main(String args[]) {
        String string_ = new String("Micael");
        int[] string_1 = new int[string_.length()];
        string_1 = Ordenarstr(string_);
        System.out.println("String Introduzida: " + string_);
        for (int x : string_1) {
            System.out.println("-" + x);
        }
    }

}
