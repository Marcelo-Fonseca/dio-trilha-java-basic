public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "j"; //M/T

        switch(plano) {
            case "T": {
                System.out.println("5GB youtube");
                break;

            }
            case "M":{
                System.out.println("Whats e instagram gratis");
                break;
            }

            case "B": {
                System.out.println("100 minutos de ligação");
                break;
            }
            default:
            System.out.println("Plano não exite favor verificar!!");

        }


    }
    
}
