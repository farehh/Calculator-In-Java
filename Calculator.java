import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
    JFrame frame;
    JTextField textfield;
    JPanel panel;

    JButton[] numButtons = new JButton[10];
    JButton addButton, subButton, mulButton, divButton, decButton, equButton;

    double num1 = 0;
    double num2 = 0;
    double result = 0;
    char operator;

    Calculator(){

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500 );
        //frame.setLayout(null);
        //frame.getContentPane().setBackground( Color.GRAY );
        
        //frame.setResizable(false);
        
        

        
        textfield = new JTextField();
        textfield.setEditable(true);
        textfield.setBounds(50,25,300,50);


        addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");


        for (int i = 0; i < numButtons.length; i++) {
            numButtons[i] = new JButton(String.valueOf(i));
            numButtons[i].addActionListener(this);
            //numButtons[i].setFocusable(false);
            //numButtons[i].repaint();

            
        }


        panel = new JPanel();
        //panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,5,5));
        panel.setBackground(Color.gray);

		panel.add(numButtons[2]);
		panel.add(numButtons[3]);
		panel.add(addButton);
		panel.add(numButtons[4]);
		panel.add(numButtons[5]);
		panel.add(numButtons[6]);
		panel.add(subButton);
		panel.add(numButtons[7]);
		panel.add(numButtons[8]);
		panel.add(numButtons[9]);
		panel.add(mulButton);
		panel.add(decButton);
		panel.add(numButtons[0]);
		panel.add(equButton);
		panel.add(divButton);

        frame.add(panel);
        frame.add(textfield);
        
        //frame.pack();
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

    }

    @Override
    public void actionPerformed(ActionEvent e){

    }

}
