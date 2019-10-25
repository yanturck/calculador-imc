package calculadora.imc;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IMC extends JFrame {
	public IMC() {
		super("IMC");
		Container lc = new JPanel();
		lc.setLayout(new GridLayout(4,3));
		
		lc.add(new JLabel("Peso"));
		JTextField txtPeso = new JTextField();
		lc.add(txtPeso);
		lc.add(new JLabel("Quilogramas"));
		
		lc.add(new JLabel("Altura"));
		JTextField txtAltura = new JTextField();
		lc.add(txtAltura);
		lc.add(new JLabel("Metros"));
		
		lc.add(new JLabel("IMC"));
		JTextField txtIMC = new JTextField();
		lc.add(txtIMC);
		lc.add(new JLabel(""));
		
		JButton calc = new JButton("CALCULAR");
		lc.add(calc);
		calc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double peso = Double.parseDouble(txtPeso.getText());
				double altura = Double.parseDouble(txtAltura.getText());
				double imc1 = (peso/(altura*altura));
				DecimalFormat formatador = new DecimalFormat("0.00");
				String imc = formatador.format(imc1);
				txtIMC.setText(imc);
			}
		});
		
		lc.add(new JLabel(""));
		JButton limpar = new JButton("CLEAR");
		lc.add(limpar);
		limpar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			txtPeso.setText("");
			txtAltura.setText("");
			txtIMC.setText("");
			}
		});
		
		Container c = getContentPane();
		c.add(BorderLayout.NORTH, new JLabel("Calculadora de IMC"));
		c.add(BorderLayout.CENTER, lc);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(322,200);
		setVisible(true);
	}
}
