import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        limpa();
        Scanner sc = new Scanner(System.in);
        int quantidadeContatos = 0;

        ListaContatos [] lista = new ListaContatos [ quantidadeContatos ];
          
            for( int i = 0 ; i < 3; i++){
                    
                ListaContatos listcont = new ListaContatos();
    
                System.out.print("Informe o nome do contato: ");
                listcont.setNome(sc.next());
                System.out.print("Informe o sobrenome do contato: ");
                listcont.setSobrenome(sc.next());
                System.out.print("Informe o número do contato: ");
                listcont.setTelefone(sc.next());

                System.out.println("Contato salvo!");
                limpa();
    
                lista [ i ] = listcont;
            }

            for (ListaContatos listcont : lista) {
                
                System.out.println("Nome do contato: " + listcont.getNome() + " " + listcont.getSobrenome());
                System.out.println("Número: " + listcont.getTelefone());
                System.out.println("\n");
            }

        sc.close();
    }
            
    public static void limpa(){
        
        System.out.print("\033[H\033[2J");
        System.out.flush();

    }
}
