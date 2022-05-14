import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
    JFrame frame;
    JTextField textfield;
    JPanel panel;
    ButtonGroup numbers = new ButtonGroup();

    button[] numButtons = new button[16];

    button addButton, subButton, mulButton, divButton, decButton, equButton;
    button aButton, bButton, cButton, dButton, eButton, fButton;
    button clrButton;

    Font font= new Font("Courier", Font.BOLD, 20);


    double num1 = 0;
    double num2 = 0;
    double result = 0;
    char operator;

    Calculator(){

        frame = new JFrame("Calculator");
        
        textfield = new JTextField();
        textfield.setEditable(false);
        textfield.setBounds(50,25,300,50);
        textfield.setBorder(null);
        textfield.setVisible(true);
        // textfield.setBackground(Color.DARK_GRAY);
        textfield.setForeground(Color.WHITE);
        textfield.setFont(font);
        textfield.setOpaque(false);



        addButton = new button("+");
		subButton = new button("-");
		mulButton = new button("*");
		divButton = new button("/");
		decButton = new button(".");
		equButton = new button("=");
        clrButton = new button("⌫");

        for (int i = 0; i < numButtons.length; i++) {
            numButtons[i] = new button(Integer.toHexString(i));
            numButtons[i].addActionListener(this);
            numButtons[i].setActionCommand(Integer.toString(i));  
            numbers.add(numButtons[i]);
        }


        panel = new JPanel();
        panel.setBounds(5,100,370,420);
        panel.setLayout(new GridLayout(5,6,0,0));
        // panel.setBackground(Color.DARK_GRAY);
        panel.setBorder(null);
        panel.setForeground(Color.WHITE);
        panel.setOpaque(false);


        // adding elements to panel
        panel.add(numButtons[13]);
        panel.add(numButtons[14]);
        panel.add(numButtons[15]);
        
        panel.add(numButtons[10]);
        panel.add(numButtons[11]);
        panel.add(numButtons[12]);

		panel.add(numButtons[7]);
		panel.add(numButtons[8]);
		panel.add(numButtons[9]);


		panel.add(numButtons[4]);
		panel.add(numButtons[5]);
		panel.add(numButtons[6]);

        panel.add(numButtons[1]);
		panel.add(numButtons[2]);
		panel.add(numButtons[3]);
        panel.add(clrButton);

        

		panel.add(mulButton);


		
        panel.add(subButton);
        panel.add(numButtons[13]);
		panel.add(decButton);
		panel.add(numButtons[0]);
		panel.add(equButton);
		panel.add(divButton);



        //adding elements to frame

        frame.add(panel);
        frame.add(textfield);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 550 );
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        //frame.setBackground(Color.GRAY);
        frame.setLayout(null);
        frame.setVisible(true);
        // frame.pack();
        frame.setResizable(false);

        


    }

    public static void main(String[] args) {
        Calculator calc = new Calculator(); // creating object 

    }

    @Override
    public void actionPerformed(ActionEvent e){
        // adding action listeners here.
        for (int i = 0; i < numButtons.length; i++) {
            if (e.getSource() == numButtons[i]) {
                textfield.setText(textfield.getText().concat(numButtons[i].getText()));
            } 
        }
       
        if (e.getSource() == clrButton) {
            
        } 

        

        if (e.getActionCommand().equals("sin")){

        } if (e.getActionCommand().equals("sinh")){

        } if (e.getActionCommand().equals("asin")){

        }if (e.getActionCommand().equals("asinh")){

        }
    }

}
