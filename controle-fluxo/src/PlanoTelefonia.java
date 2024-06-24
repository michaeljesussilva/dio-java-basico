public class PlanoTelefonia {
    public static void main(String[] args) {
        //Sistema Plano de Operadora usando a estrutura condicional "IF" e "ELSE".
        String plano = "B";

        if (plano == "B")
            System.out.println("BASIC : 100 minutos de Ligação.");
        else if (plano == "M")
            System.out.println("MIDIA : 100 minutos de Ligação + WhatsApp e Intagran");
        else if (plano == "T")
            System.out.println("TURBO : 100 minutos de Ligação + WhatsApp e Intagran + 5Gb YouTube" );
        else
        System.out.println("PLANO INEXISTENTE!");
   }
}
