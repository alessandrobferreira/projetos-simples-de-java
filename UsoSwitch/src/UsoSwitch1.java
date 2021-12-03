import javax.swing.JOptionPane;

public class UsoSwitch1 {

	public static void main(String[] args) {
		// 
		int opcao;
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Informa a opcao"));
		
		switch (opcao) {
		case 1: {
			System.out.println("Inclusão");
			break; 
		}
		case 4: {
			System.out.println("Consulta");
			break;
		}
		default: 
			JOptionPane.showMessageDialog(null, "Opção Inválida");
		}

	}

}
