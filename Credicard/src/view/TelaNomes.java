package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

	public class TelaNomes extends JPanel{
		private TelaPrincipal t1;
		private JButton MudarTelasButton;
		private JTextField textField;
		private String nome;
		private JButton salvarButton;
		
		public TelaNomes(TelaPrincipal t1) {
		this.t1 = t1;
		this.setLayout(null);
		JLabel nameLabel = new JLabel("Nome:");
	    nameLabel.setBounds(150, 50, 50, 30); // Define posição e tamanho do JLabel
	    this.add(nameLabel);
	
	    textField = new JTextField(20);
	    textField.setBounds(190, 50, 200, 30); // Define posição e tamanho do JTextField
	    this.add(textField);
	    
	    salvarButton = new JButton("Salvar");
	    salvarButton.setBounds(190, 100, 200, 30);
	    salvarButton.addActionListener(new salvarNome());
	    this.add(salvarButton);
	    
	    MudarTelasButton = new JButton("Mudar Tela");
	    MudarTelasButton.setBounds(190, 130, 200, 30);
	    MudarTelasButton.addActionListener(new mudarTela());
	    this.add(MudarTelasButton);
		}
		 private class salvarNome implements ActionListener {
				public void actionPerformed(ActionEvent e) {
					nome = textField.getText();
					System.out.println(nome);
				}
				
				 
			 }
		 private class mudarTela implements ActionListener {
				public void actionPerformed(ActionEvent e) {
					t1.mudarTelas(1);
				}
				
				 
			 }
}
