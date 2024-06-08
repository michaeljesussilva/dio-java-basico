package edu.michael.segundasemana;

public class MinhaClasse {
    
    public static void main(String[] args) {

        String primeiroNome = "Michael ";
        String segundoNome = "Jesus da Silva";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {

        return "Resultado do Método: " + primeiroNome.concat("").concat(segundoNome);
    }
}
