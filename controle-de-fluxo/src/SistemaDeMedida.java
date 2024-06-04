public class SistemaDeMedida {
    public static void main(String[] args) {
      /*  String sigla = "p";
        if(sigla == "p")
        System.out.println("Pequeno");
        else if(sigla == "m")
        System.out.println("Medio");
        else if(sigla == "g")
        System.out.println("Grande");

        else 
    System.out.println("Indefinido");
    }*/

    String sigla ="M";
    switch (sigla) {
        case "P" :{
            System.out.println("PEQUENO");
            break;

        }

            

            case "M" : {
                System.out.println("MEDIO");
                break;    

            }
    
                

            case "G" :{
                System.out.println("GRANDE");
                break;        

            }

            default:
            System.out.println("Indefinido");
        
                    
        
    
    
    }  

}     

}
