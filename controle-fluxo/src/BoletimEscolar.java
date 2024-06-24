public class BoletimEscolar {
    public static void main(String[] args) {
       // Boletim Escolar usando Condição Ternária.
        int nota = 9;
        String resultado = nota >= 7 ? "APROVADO" : nota >=5 && nota <7 ? "PROVA DE RECUPERAÇÃO " : "REPROVADO";

        System.out.println(resultado);

      
    }
}
