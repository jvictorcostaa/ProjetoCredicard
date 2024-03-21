package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
	
	public class TelaPrincipal extends JFrame {
	    private JTextField textField;
	    private String nome;
	    private JButton MudarTelasButton;
	    private JPanel telanomes;
	    private JPanel telaProdutos;
	    private ArrayList<JPanel> telas;

	    public TelaPrincipal() {
	        // Configuração do JFrame
	        setTitle("Meu JFrame");  // Título da janela
	        setSize(600, 650); // Largura e altura da janela em pixels
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Ação padrão ao fechar a janela
	        setLocationRelativeTo(null);  // Centralizar a janela na tela

	        telas = new ArrayList<>();
	        
	        telanomes = new TelaNomes(this); // Inicializa o JPanel
	        telas.add(telanomes);

	        telaProdutos = new TelaAddProdutos(this); // Inicializa o JPanel
	        telas.add(telaProdutos);

	        // Adicionando todos os painéis ao JFrame
	        for (JPanel tela : telas) {
	        	tela.setVisible(false);
	            this.add(tela);
	        }
	        
	        
	        telas.get(1).setVisible(true);
//	        telas.get(0).setVisible(true);
	        
	        
	        this.setVisible(true);
	    }

	    public void mudarTelas(int telaAtual) {
	        for(int i = 0;i<2;i++) {
	        	telas.get(i).setVisible(false);
	            repaint();
	        }
	        telas.get(telaAtual).setVisible(true);
	    }
	}