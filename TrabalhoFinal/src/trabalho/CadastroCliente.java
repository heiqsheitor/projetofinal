package trabalho;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import trabalho.Cliente;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tFUsuario;
	private JPasswordField pFSenha;
	
	Cliente cliente = new Cliente(getWarningString(), getName(), FRAMEBITS);
	private String nome = cliente.getNome();
	private String senha = cliente.getSenha();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCliente frame = new CadastroCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroCliente() {
		setTitle("Tela Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setResizable(false); // proibe de expandir a tela
		setLocationRelativeTo(null); // abre a tela centralizada no monitor
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(78, 56, 46, 14);
		contentPane.add(lblUsuario);
		
		tFUsuario = new JTextField();
		tFUsuario.setBounds(187, 53, 86, 20);
		contentPane.add(tFUsuario);
		tFUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(78, 87, 46, 14);
		contentPane.add(lblSenha);
		
		pFSenha = new JPasswordField();
		pFSenha.setBounds(187, 84, 86, 20);
		contentPane.add(pFSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// verifica se o nome e senha digitado são iguais aos já implementados no código
				String nome1 = tFUsuario.getText(); 
				String senha1 = new String(pFSenha.getText());
				
				if(nome1.equals(nome) && senha1.equals(senha)){ //verifica se o que foi digitado é igual as classes
					JOptionPane.showMessageDialog(null, "Login autorizado");
					JOptionPane.showMessageDialog(null, cliente.getMsg());
				} else {
					JOptionPane.showMessageDialog(null, "Usuário e/ou senha incorretos");
				}
			}
		});
		btnEntrar.setBounds(93, 158, 89, 23);
		contentPane.add(btnEntrar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(221, 158, 89, 23);
		contentPane.add(btnExcluir);
	}
}
