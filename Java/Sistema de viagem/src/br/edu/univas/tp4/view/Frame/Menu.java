package br.edu.univas.tp4.view.Frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import br.edu.univas.tp4.view.Util.Frame;

public class Menu extends Frame {

	private static final long serialVersionUID = 5420709425090343561L;
	
	private JPanel contentPane = null;
	JMenuBar barra;
	JSeparator separator;
	JMenu planilhasMenu,cadMenu, relatoriosMenu, ajudaMenu, sairMenu;
	JMenuItem cadUsuarios, cadMotoristas, cadVeiculos, cadViagem;
	JMenu relatoriosUsuarios, relatoriosMotorista, relatoriosVeiculos, relatoriosViagem;
	JMenuItem fechar;
	
	public Menu() {
		this.setSize(700, 355);
		this.setTitle("Sistema de Viagem");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		setResizable(false);
		addComponents();
	}
	
	public void addComponents() {
		
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());		
		this.setContentPane(contentPane);
				
		barra = new JMenuBar();
		setJMenuBar(barra);
		
		//Menu de planilhas
		planilhasMenu = new JMenu("Planilhas");
		barra.add(planilhasMenu);
		
		//Menu de cadastro
		cadMenu = new JMenu("Cadastro");
		barra.add(cadMenu);
		
		cadMotoristas = new JMenuItem("Motoristas");
		cadMenu.add(cadMotoristas);			
				
		cadUsuarios = new JMenuItem("Usu�rios");
		cadMenu.add(cadUsuarios);
			
		cadVeiculos = new JMenuItem("Veiculos"); 
		cadMenu.add(cadVeiculos);
		
		cadViagem = new JMenuItem("Viagens");
		cadMenu.add(cadViagem);
		
		//Menu de relat�rios
		relatoriosMenu = new JMenu("Relat�rios");
		barra.add(relatoriosMenu);
		
		relatoriosMotorista = new JMenu("Motorista");
		relatoriosMenu.add(relatoriosMotorista);
		
		relatoriosUsuarios = new JMenu("Usu�rios");
		relatoriosMenu.add(relatoriosUsuarios);
		
		relatoriosVeiculos = new JMenu("Veiculos");
		relatoriosMenu.add(relatoriosVeiculos);
		
		relatoriosViagem = new JMenu("Viagens");
		relatoriosMenu.add(relatoriosViagem);
		
		ajudaMenu = new JMenu("Ajuda");
		barra.add(ajudaMenu);
		
		sairMenu = new JMenu("Sair");
		barra.add(sairMenu);
		
		fechar = new JMenuItem("Fechar (alt + F4)");
		fechar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fecharButton();
				
			}
		});
		sairMenu.add(fechar);
		
	}
	
	public void fecharButton(){
		System.exit(0);
	}
	
	public static void main(String[] args){
		Frame.setlookAndFeel(Frame.ACRYL);
		Menu tela = new Menu();
		tela.setVisible(true);
	}

}
