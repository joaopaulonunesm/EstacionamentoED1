import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class estacionamento {
	
	static JFrame telaMenu = new JFrame ("Estacionamento");
	
	static JLabel lbEstacionamento = new JLabel ("Controle de Estacionamento");
	
	static JButton btEntrou = new JButton("Entrada");
	static JButton btSaiu = new JButton("Saida");
	
	static int [][] vagas = new int [3][18];
	
	public static void main(String[] args) {
		
		janelaMenu();	
		acaoEntrada();
		acaoSaida();
		
	}
	
	static void janelaMenu (){
		
		telaMenu.setLayout(null);
		telaMenu.setSize(900, 700);
		telaMenu.getContentPane().setBackground(Color.WHITE);
		telaMenu.setResizable(false);
		telaMenu.setLocationRelativeTo(null);
		telaMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaMenu.setVisible(true);
		
		telaMenu.add(lbEstacionamento);
		lbEstacionamento.setBounds(250, -250, 600, 600);
		lbEstacionamento.setFont(new Font("Arial", Font.BOLD, 30));
		
		componentesMenu();
		
	}
	
	static void componentesMenu (){
		
		telaMenu.add(btEntrou);
		btEntrou.setBounds(150, 100, 150, 50);
		
		telaMenu.add(btSaiu);
		btSaiu.setBounds(580, 100, 150, 50);
		
	}
	
	static void acaoEntrada (){
		
		btEntrou.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				for(int i = 0; i < vagas.length; i++){
					System.out.println("Vagas do " + (i+1) + "º Andar: " );
					for(int j = 0; j < vagas[i].length; j++){
						System.out.println("Vaga " + (j+1) + ": " +  vagas[i][j]);
					}
				}
				
			}
		});
	}
	
	static void acaoSaida (){
		
		btSaiu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
	
	static void sorteioEntrada (){
		
		
		
	}

}
