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

    button sin, cos , tan , cosec, cot, sec;
    button asin, acos, atan, acosec, acot, asec;
    button sinh, cosh, tanh, cosech, coth, sech;
    button asinh, acosh, atanh, acosech, acoth, asech;
    button log, exp, rad, deg;
    button abs, fact, square, sqrt, cube;

    ButtonGroup numbase;
    JRadioButton decimal;
    JRadioButton octal;
    JRadioButton hexa;
    JRadioButton binary;

    ButtonGroup datatype;
    JRadioButton int_type;
    JRadioButton float_type;
    JRadioButton double_type;
    JRadioButton long_type;


    Font font= new Font("Courier", Font.BOLD, 20);

    Calculator(){

        frame = new JFrame("Calculator");
        
        textfield = new JTextField();
        textfield.setEditable(false);
        textfield.setBounds(50,25,600,50);
        textfield.setBorder(null);
        textfield.setVisible(true);
        textfield.setBackground(Color.DARK_GRAY);
        textfield.setForeground(Color.WHITE);
        textfield.setFont(font);

        JRadioButton decimal = new JRadioButton("Decimal", true);
        decimal.setBounds(53, 110, 80, 30);
        decimal.setFocusable(false);
        decimal.addActionListener(this);
        decimal.setActionCommand("Decimal");

        JRadioButton octal= new JRadioButton("Octal");
        octal.setBounds(203,110,60,30);
        octal.setFocusable(false);
        octal.addActionListener(this);
        octal.setActionCommand("Octal");

        JRadioButton binary= new JRadioButton("Binary");
        binary.setBounds(353,110,70,30);
        binary.setFocusable(false);
        binary.addActionListener(this);
        binary.setActionCommand("Binary");

        JRadioButton hexadecimal= new JRadioButton("Hexadecimal");
        hexadecimal.setBounds(503,110,110,30);
        hexadecimal.setFocusable(false);
        hexadecimal.addActionListener(this);
        hexadecimal.setActionCommand("HexaDecimal");

        ButtonGroup numbase = new ButtonGroup();
        numbase.add(decimal);
        numbase.add(octal);
        numbase.add(binary);
        numbase.add(hexadecimal);


        JRadioButton int_type = new JRadioButton("Integer",true);
        int_type.setBounds(53,160,80,30);
        int_type.setFocusable(false);
        int_type.addActionListener(this);
        int_type.setActionCommand("Integer");

        JRadioButton float_type = new JRadioButton("Float");
        float_type.setBounds(203,160,60,30);
        float_type.setFocusable(false);
        float_type.addActionListener(this);
        float_type.setActionCommand("Float");

        JRadioButton double_type = new JRadioButton("Double");
        double_type.setBounds(353,160,70,30);
        double_type.setFocusable(false);
        double_type.addActionListener(this);
        double_type.setActionCommand("Double");

        JRadioButton long_type = new JRadioButton("Long");
        long_type.setBounds(503,160,110,30);
        long_type.setFocusable(false);
        long_type.addActionListener(this);
        double_type.setActionCommand("Long");

        ButtonGroup datatype = new ButtonGroup();
        datatype.add(int_type);
        datatype.add(float_type);
        datatype.add(double_type);
        datatype.add(long_type);






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
            numButtons[i].setActionCommand(((Integer.toString(i)).toUpperCase()));  
            numbers.add(numButtons[i]);
        }


        panel = new JPanel();
        panel.setBounds(5,100,370,420);
        panel.setLayout(new GridLayout(5,6,0,0));
        panel.setBackground(Color.DARK_GRAY);
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
        frame.setSize(700, 750 );
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setLayout(null);
        frame.setVisible(true);
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
