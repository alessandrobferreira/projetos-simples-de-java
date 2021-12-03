import javax.swing.JOptionPane;

public class UsoWhile {

	public static void main(String[] args) {
		
		// Informar a quantidade de notas, pedir as notas e calcular a media
		float nota, media = 0;
        int qtdNotas, contaNotas;
        
        qtdNotas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de notas"));
        
        contaNotas = 1;
        
        while (contaNotas <= qtdNotas) {
        	nota = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota nrº:" + contaNotas));
        	contaNotas++; 
        	
        }
        
 	}

}
