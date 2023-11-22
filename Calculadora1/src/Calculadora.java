import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import java.awt.Window.Type;

public class Calculadora extends JFrame {
	private boolean resultadoMostrado = false;
	 private static final long serialVersionUID = 1L;
	 private JPanel contentPane;
	    private final JPanel panel = new JPanel();
	    private final JPanel panel_1 = new JPanel();
	    private JLabel texoperacion;
	    private JLabel texresultado;
	    private double resultado; // Almacena el resultado de las operaciones
	    private String operador = ""; // Almacena el operador actual
	    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 270, 531);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        panel.setBackground(new Color(46, 57, 81));
        panel.setBounds(0, 21, 254, 160);
        contentPane.add(panel);
        panel.setLayout(null);
		
        texoperacion = new JLabel("");
        texoperacion.setForeground(Color.WHITE);
        texoperacion.setHorizontalAlignment(SwingConstants.RIGHT);
        texoperacion.setFont(new Font("Roboto", Font.BOLD, 18));
        texoperacion.setBounds(0, 0, 244, 40);
        panel.add(texoperacion);

        texresultado = new JLabel("0");
        texresultado.setForeground(Color.WHITE);
        texresultado.setHorizontalAlignment(SwingConstants.RIGHT);
        texresultado.setFont(new Font("Roboto Black", Font.PLAIN, 36));
        texresultado.setBounds(0, 38, 244, 40);
        panel.add(texresultado);
        panel_1.setForeground(new Color(255, 255, 255));
        panel_1.setBackground(new Color(46, 57, 81));
        panel_1.setBounds(0, 180, 254, 312);
        contentPane.add(panel_1);
        panel_1.setLayout(null);
		
        JButton btnNewButton = new JButton("C");
        btnNewButton.setFocusPainted(false);
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBorderPainted(false);
        btnNewButton.setRolloverIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_pressed_dark.png")));
        btnNewButton.setFont(new Font("Roboto Light", Font.PLAIN, 24));
        btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
        btnNewButton.setToolTipText("5");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texoperacion.setText("");
                texresultado.setText("0");
                resultado = 0;
                operador = "";
            }
        });
        btnNewButton.setIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_dark.png")));
        btnNewButton.setBounds(10, 12, 50, 50);
        panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("^");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setRolloverIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_pressed_dark.png")));
		btnNewButton_1.setIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_dark.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setToolTipText("5");
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_1.setFont(new Font("Roboto Light", Font.PLAIN, 24));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBounds(70, 12, 50, 50);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("%");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setRolloverIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_pressed_dark.png")));
		btnNewButton_2.setIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_dark.png")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setToolTipText("5");
		btnNewButton_2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_2.setFont(new Font("Roboto Light", Font.PLAIN, 22));
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setBounds(130, 12, 50, 50);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setRolloverIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_pressed_dark.png")));
		btnNewButton_3.setIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_dark.png")));
		btnNewButton_3.setToolTipText("5");
		btnNewButton_3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_3.setFont(new Font("Roboto Light", Font.PLAIN, 24));
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setBounds(190, 12, 50, 50);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("*");
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setRolloverIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_pressed_dark.png")));
		btnNewButton_4.setIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_dark.png")));
		btnNewButton_4.setToolTipText("5");
		btnNewButton_4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4.setFont(new Font("Roboto Light", Font.PLAIN, 24));
		btnNewButton_4.setFocusPainted(false);
		btnNewButton_4.setBounds(190, 73, 50, 50);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("-");
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setRolloverIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_pressed_dark.png")));
		btnNewButton_5.setIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_dark.png")));
		btnNewButton_5.setToolTipText("5");
		btnNewButton_5.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_5.setFont(new Font("Roboto Light", Font.PLAIN, 24));
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.setBounds(190, 134, 50, 50);
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("+");
		btnNewButton_6.setForeground(new Color(255, 255, 255));
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.setRolloverIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_pressed_dark.png")));
		btnNewButton_6.setIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_dark.png")));
		btnNewButton_6.setToolTipText("5");
		btnNewButton_6.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_6.setFont(new Font("Roboto Light", Font.PLAIN, 24));
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setBounds(190, 195, 50, 50);
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("=");
		btnNewButton_7.setForeground(new Color(0, 191, 255));
		btnNewButton_7.setBorderPainted(false);
		btnNewButton_7.setRolloverIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_pressed_dark.png")));
		btnNewButton_7.setIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_dark.png")));
		btnNewButton_7.setToolTipText("5");
		btnNewButton_7.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_7.setFont(new Font("Roboto Light", Font.PLAIN, 24));
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setBounds(190, 256, 50, 50);
		panel_1.add(btnNewButton_7);
		startColorAnimation(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("7");
		btnNewButton_8.setForeground(new Color(255, 255, 255));
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setRolloverIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_pressed_dark.png")));
		btnNewButton_8.setIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_dark.png")));
		btnNewButton_8.setToolTipText("5");
		btnNewButton_8.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_8.setFont(new Font("Roboto Light", Font.PLAIN, 24));
		btnNewButton_8.setFocusPainted(false);
		btnNewButton_8.setBounds(10, 73, 50, 50);
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("4");
		btnNewButton_9.setForeground(new Color(255, 255, 255));
		btnNewButton_9.setBorderPainted(false);
		btnNewButton_9.setRolloverIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_pressed_dark.png")));
		btnNewButton_9.setIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_dark.png")));
		btnNewButton_9.setToolTipText("5");
		btnNewButton_9.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_9.setFont(new Font("Roboto Light", Font.PLAIN, 24));
		btnNewButton_9.setFocusPainted(false);
		btnNewButton_9.setBounds(10, 134, 50, 50);
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("1");
		btnNewButton_10.setForeground(new Color(255, 255, 255));
		btnNewButton_10.setBorderPainted(false);
		btnNewButton_10.setRolloverIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_pressed_dark.png")));
		btnNewButton_10.setIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_dark.png")));
		btnNewButton_10.setToolTipText("5");
		btnNewButton_10.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_10.setFont(new Font("Roboto Light", Font.PLAIN, 24));
		btnNewButton_10.setFocusPainted(false);
		btnNewButton_10.setBounds(10, 195, 50, 50);
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("8");
		btnNewButton_11.setForeground(new Color(255, 255, 255));
		btnNewButton_11.setBorderPainted(false);
		btnNewButton_11.setRolloverIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_pressed_dark.png")));
		btnNewButton_11.setIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_dark.png")));
		btnNewButton_11.setToolTipText("5");
		btnNewButton_11.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_11.setFont(new Font("Roboto Light", Font.PLAIN, 24));
		btnNewButton_11.setFocusPainted(false);
		btnNewButton_11.setBounds(70, 73, 50, 50);
		panel_1.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("9");
		btnNewButton_12.setForeground(new Color(255, 255, 255));
		btnNewButton_12.setBorderPainted(false);
		btnNewButton_12.setRolloverIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_pressed_dark.png")));
		btnNewButton_12.setIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_dark.png")));
		btnNewButton_12.setToolTipText("5");
		btnNewButton_12.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_12.setFont(new Font("Roboto Light", Font.PLAIN, 24));
		btnNewButton_12.setFocusPainted(false);
		btnNewButton_12.setBounds(130, 73, 50, 50);
		panel_1.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("5");
		btnNewButton_13.setForeground(new Color(255, 255, 255));
		btnNewButton_13.setBorderPainted(false);
		btnNewButton_13.setRolloverIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_pressed_dark.png")));
		btnNewButton_13.setIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_dark.png")));
		btnNewButton_13.setToolTipText("5");
		btnNewButton_13.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_13.setFont(new Font("Roboto Light", Font.PLAIN, 24));
		btnNewButton_13.setFocusPainted(false);
		btnNewButton_13.setBounds(70, 134, 50, 50);
		panel_1.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("6");
		btnNewButton_14.setForeground(new Color(255, 255, 255));
		btnNewButton_14.setBorderPainted(false);
		btnNewButton_14.setRolloverIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_pressed_dark.png")));
		btnNewButton_14.setIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_dark.png")));
		btnNewButton_14.setToolTipText("5");
		btnNewButton_14.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_14.setFont(new Font("Roboto Light", Font.PLAIN, 24));
		btnNewButton_14.setFocusPainted(false);
		btnNewButton_14.setBounds(130, 134, 50, 50);
		panel_1.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("2");
		btnNewButton_15.setForeground(new Color(255, 255, 255));
		btnNewButton_15.setBorderPainted(false);
		btnNewButton_15.setRolloverIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_pressed_dark.png")));
		btnNewButton_15.setIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_dark.png")));
		btnNewButton_15.setToolTipText("5");
		btnNewButton_15.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_15.setFont(new Font("Roboto Light", Font.PLAIN, 24));
		btnNewButton_15.setFocusPainted(false);
		btnNewButton_15.setBounds(70, 195, 50, 50);
		panel_1.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("3");
		btnNewButton_16.setForeground(new Color(255, 255, 255));
		btnNewButton_16.setBorderPainted(false);
		btnNewButton_16.setRolloverIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_pressed_dark.png")));
		btnNewButton_16.setIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_dark.png")));
		btnNewButton_16.setToolTipText("5");
		btnNewButton_16.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_16.setFont(new Font("Roboto Light", Font.PLAIN, 24));
		btnNewButton_16.setFocusPainted(false);
		btnNewButton_16.setBounds(130, 195, 50, 50);
		panel_1.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("0");
		btnNewButton_17.setForeground(new Color(255, 255, 255));
		btnNewButton_17.setBorderPainted(false);
		btnNewButton_17.setRolloverIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_pressed_dark.png")));
		btnNewButton_17.setIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_dark.png")));
		btnNewButton_17.setToolTipText("5");
		btnNewButton_17.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_17.setFont(new Font("Roboto Light", Font.PLAIN, 24));
		btnNewButton_17.setFocusPainted(false);
		btnNewButton_17.setBounds(10, 256, 50, 50);
		panel_1.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton(".");
		btnNewButton_18.setForeground(new Color(255, 255, 255));
		btnNewButton_18.setBorderPainted(false);
		btnNewButton_18.setRolloverIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_pressed_dark.png")));
		btnNewButton_18.setIcon(new ImageIcon(Calculadora.class.getResource("/Imagenes/btn1_dark.png")));
		btnNewButton_18.setToolTipText("5");
		btnNewButton_18.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_18.setFont(new Font("Roboto Light", Font.PLAIN, 24));
		btnNewButton_18.setFocusPainted(false);
		btnNewButton_18.setBounds(70, 256, 50, 50);
		panel_1.add(btnNewButton_18);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(46, 57, 81));
		panel_2.setBounds(0, 0, 254, 21);
		contentPane.add(panel_2);
		setLocationRelativeTo(null);
		// Modificar ActionListener para botones numéricos
		ActionListener numberButtonListener = new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        JButton clickedButton = (JButton) e.getSource();
		        String currentText = texresultado.getText();
		        String buttonText = clickedButton.getText();

		        // Si ya se realizó una operación y se presiona un número, comenzar una nueva operación
		        if (operador.isEmpty() || resultadoMostrado) {
		            texresultado.setText(buttonText);
		            resultadoMostrado = false;
		        } else {
		            // Concatenar el nuevo número al número actual
		            texresultado.setText(currentText + buttonText);
		        }
		    }
		};

	    //configurar actionlistener para botones numericos.
		
		btnNewButton_17.addActionListener(numberButtonListener);//0
		btnNewButton_16.addActionListener(numberButtonListener);//3
		btnNewButton_15.addActionListener(numberButtonListener);//2
		btnNewButton_14.addActionListener(numberButtonListener);//6
		btnNewButton_13.addActionListener(numberButtonListener);//5
		btnNewButton_12.addActionListener(numberButtonListener);//9
		btnNewButton_11.addActionListener(numberButtonListener);//8
		btnNewButton_10.addActionListener(numberButtonListener);//1
		btnNewButton_9.addActionListener(numberButtonListener);//4
		btnNewButton_8.addActionListener(numberButtonListener);//7
		
		// ActionListener para botones de operación
		ActionListener operationButtonListener = new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        JButton clickedButton = (JButton) e.getSource();
		        String buttonText = clickedButton.getText();

		        // Manejar el botón de igual
		        if (buttonText.equals("=")) {
		            realizarOperacion();
		        } else {
		            // Si el operador no está vacío, realizar la operación
		            if (!operador.isEmpty()) {
		                realizarOperacion();
		            }
		            // Almacenar el nuevo operador solo si es diferente del actual
		            if (!operador.equals(buttonText)) {
		                operador = buttonText;
		                // Almacenar el número actual
		                resultado = Double.parseDouble(texresultado.getText());
		            }
		            // Limpiar el texto
		            texresultado.setText("0");
		        }
		    }
		};

		//configurar actionlistener para botones de operacion
        // Configurar actionlistener para botones de operacion
        btnNewButton_1.addActionListener(operationButtonListener);// ^
        btnNewButton_2.addActionListener(operationButtonListener);// %
        btnNewButton_3.addActionListener(operationButtonListener);// /
        btnNewButton_4.addActionListener(operationButtonListener);// *
        btnNewButton_5.addActionListener(operationButtonListener);// -
        btnNewButton_6.addActionListener(operationButtonListener);// +
        btnNewButton_7.addActionListener(operationButtonListener);// =
        btnNewButton_18.addActionListener(operationButtonListener);// =
		
     // Modificar ActionListener para el botón "="
        ActionListener igualButtonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    realizarOperacion();
                    resultadoMostrado = true;
                } catch (NumberFormatException ex) {
                    ex.printStackTrace(); // Opcional: Imprime el seguimiento de la pila para depuración
                }
            }
        };

        // Configurar ActionListener para el botón "="
        btnNewButton_7.addActionListener(igualButtonListener);
	}
	
	private void realizarOperacion() {
        String textoResultado = texresultado.getText();

        if (!textoResultado.isEmpty()) {
            double nuevoNumero = Double.parseDouble(textoResultado);

            switch (operador) {
                case "^":
                    // Realizar la operación de potenciación según sea necesario
                    break;
                case "%":
                    // Realizar la operación de porcentaje según sea necesario
                    break;
                case "/":
                    if (nuevoNumero != 0) {
                        resultado /= nuevoNumero;
                    } else {
                        // Manejar la división por cero
                        resultado = 0;
                    }
                    break;
                case "*":
                    resultado *= nuevoNumero;
                    break;
                case "-":
                    resultado -= nuevoNumero;
                    break;
                case "+":
                    resultado += nuevoNumero;
                    break;
                // Agregar más casos según sea necesario
            }

            // Mostrar el resultado
            texresultado.setText(String.valueOf(resultado));
        }

        // Restablecer el operador
        operador = "";
    }
	public void startColorAnimation(JButton button) {
	  javax.swing.Timer timer = new javax.swing.Timer(200, new ActionListener() {
	        public float hue = 0.0f;

	        
	        public void actionPerformed(ActionEvent e) {
	            // Cambiar el color del texto con un patrón de arcoíris
	            hue = (hue + 0.05f) % 1.0f;
	            button.setForeground(Color.getHSBColor(hue, 1.0f, 1.0f));
	        }
	    });

	    // Iniciar la animación
	    timer.start();
	}
}
