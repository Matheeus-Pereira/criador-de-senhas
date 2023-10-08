package index;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import index.Funcoes;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;

public class Aplicacao extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea_1;
	String resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplicacao frame = new Aplicacao();
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
	public Aplicacao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 243, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea textArea = new JTextArea("digite o tamanho da sua senha:");
		textArea.setBackground(SystemColor.inactiveCaptionBorder);
		textArea.setEditable(false);
		textArea.setWrapStyleWord(true);
		textArea.setFont(new Font("Times New Roman", Font.BOLD, 13));
		textArea.setBounds(24, 53, 193, 22);
		contentPane.add(textArea);

		textField = new JTextField();
		textField.setBounds(56, 115, 91, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Gerar");
		btnNewButton.setForeground(SystemColor.activeCaptionText);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBackground(SystemColor.window);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "digite o tamanho da sua senha!", "ATENÇÃO",
							JOptionPane.ERROR_MESSAGE);

				} else {
					int tamanho = Integer.parseInt(textField.getText());
					Funcoes.criar_senha(tamanho);
				}

			}
		});

		btnNewButton.setBounds(56, 163, 89, 23);
		contentPane.add(btnNewButton);
	}
}
