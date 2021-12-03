import javax.swing.JOptionPane;

public class desafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	int opcao;
	
	do {
		opcao = Integer.parseInt(JOptionPane.showInputDialog("1 para incluir\n"
				+ "2 para alterar\n"
				+ "3 para excluir\n"
				+ "4 para consultar\n"
				+ "9 para sair\n Escolha uma opção"));
				
		switch(opcao){
        case 1:
        	System.out.println("Incluir");
            break;
            
            
        case 2:
        	System.out.println("Alterar");
            break;
            
            
        case 3:
        	System.out.println("Excluir");
            break;
            
            
        case 4:
        	System.out.println("Consultar");
            break;
                    
		}   
		}  while (opcao != 9);
	System.out.println("Saiu com sucesso");
		
	}
	
    

}
