public class TiposMedida {
    public static void main(String[] args) {
        //Estrutura Condicional "SWITCH CASE".
        String sigla = "H";
        switch (sigla) {
            case "P":
                System.out.println("PEQUENO");                            
                break;
            case "M":
                System.out.println("MÉDIO");                            
                break;
            case "G":
                System.out.println("PEQUENO");                            
                break;  
            default:
                System.out.println("INDEFINIDO");
                
        }
    }
}
