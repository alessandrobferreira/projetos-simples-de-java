package calculadora;

import javax.swing.JOptionPane;

public class calculadora1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int opcao;
		int numero1= 0;
		int numero2= 0;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("1 para somar\n"
					+ "2 para subtrair\n"
					+ "3 para multiplicar\n"
					+ "4 para dividir\n"
					+ "9 para sair\n Escolha uma opção"));
					
			if (opcao !=9) {
			numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
			}

			switch(opcao){
			
	        case 1:
	        		System.out.println("resultado " + (numero1 + numero2));
	            break;
	            
	            
	        case 2:
	        		System.out.println("resultado " + (numero1 - numero2));
	            break;
	            
	            
	        case 3:
	        		System.out.println("resultado " + (numero1 * numero2));
	            break;
	            
	            
	        case 4:
	        	if (numero2 == 0) {
	        		System.out.println("Impossível dividir por zero");
	        	}
	        	else {
	        		System.out.println("resto da divisão" + (numero1 % numero2));
	        		System.out.println("resultado " + (numero1 / numero2)); 
	        		}
	            break;
	                    
			}   
			}  while (opcao != 9);
					System.out.println("Saiu com sucesso");
	}

}
