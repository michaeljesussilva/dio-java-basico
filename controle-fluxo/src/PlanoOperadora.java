public class PlanoOperadora {
    public static void main(String[] args) {
        //Sistema Plano de Operadora usando a estrutura condicional "SWITCH CASE".
        String plano = "B";

        switch (plano) {
            case "B":
                System.out.println("BASIC : 100 minutos de Ligação.");                
                break;
            case "M":
                System.out.println("MIDIA : 100 minutos de Ligação + WhatsApp e Intagran");               
                break;
            case "T":
                System.out.println("TURBO : 100 minutos de Ligação + WhatsApp e Intagran + 5Gb YouTube" );           
                break;        
            default:
            System.out.println("PLANO INEXISTENTE!");
        }
    }
}
