import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
    JFrame frame;
    JTextField textfield;
    JPanel panel;
    ButtonGroup numbers = new ButtonGroup();

    Button[] numButtons = new Button[16];
    Button[] funButtons = new Button[9];
    Button[] trigButtons = new Button[12];
    Button[] htrigButtons = new Button[12];
    Button[] exfunButtons = new Button[9];



    Button addButton, subButton, mulButton, divButton, decButton, equButton;
    Button aButton, bButton, cButton, dButton, eButton, fButton;
    Button clrButton, remButton;


    Button sin, cos , tan , cosec, cot, sec;
    Button asin, acos, atan, acosec, acot, asec;
    Button sinh, cosh, tanh, cosech, coth, sech;
    Button asinh, acosh, atanh, acosech, acoth, asech;
    Button logButton, expButton, radButton, degButton;
    Button absButton, factButton, squareButton, sqrtButton, cubeButton, modButton;

    ButtonGroup numbase;
    JRadioButton decimal;
    JRadioButton octal;
    JRadioButton hexadecimal;
    JRadioButton binary;

    ButtonGroup datatype;
    JRadioButton int_type;
    JRadioButton float_type;
    JRadioButton double_type;
    JRadioButton long_type;

    double num1 = 0, num2 = 0, result = 0;
    char operator;


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

        decimal = new JRadioButton("Decimal", true);
        decimal.setBounds(53, 110, 80, 30);
        decimal.setFocusable(false);
        decimal.addActionListener(this);
        decimal.setActionCommand("Decimal");

        octal = new JRadioButton("Octal");
        octal.setBounds(203,110,60,30);
        octal.setFocusable(false);
        octal.addActionListener(this);
        octal.setActionCommand("Octal");

        binary = new JRadioButton("Binary");
        binary.setBounds(353,110,70,30);
        binary.setFocusable(false);
        binary.addActionListener(this);
        binary.setActionCommand("Binary");

        hexadecimal = new JRadioButton("Hexadecimal");
        hexadecimal.setBounds(503,110,110,30);
        hexadecimal.setFocusable(false);
        hexadecimal.addActionListener(this);
        hexadecimal.setActionCommand("HexaDecimal");

        numbase = new ButtonGroup();
        numbase.add(decimal);
        numbase.add(octal);
        numbase.add(binary);
        numbase.add(hexadecimal);


        int_type = new JRadioButton("Integer", true);
        int_type.setBounds(53,160,80,30);
        int_type.setFocusable(false);
        int_type.addActionListener(this);
        int_type.setActionCommand("Integer");
        int_type.setBackground(Color.DARK_GRAY);

        float_type = new JRadioButton("Float");
        float_type.setBounds(203,160,60,30);
        float_type.setFocusable(false);
        float_type.addActionListener(this);
        float_type.setActionCommand("Float");
        float_type.setBackground(Color.DARK_GRAY);

        double_type = new JRadioButton("Double");
        double_type.setBounds(353,160,70,30);
        double_type.setFocusable(false);
        double_type.addActionListener(this);
        double_type.setActionCommand("Double");
        double_type.setBackground(Color.DARK_GRAY);

        long_type = new JRadioButton("Long");
        long_type.setBounds(503,160,110,30);
        long_type.setFocusable(false);
        long_type.addActionListener(this);
        long_type.setActionCommand("Long");
        long_type.setBackground(Color.DARK_GRAY);


        datatype = new ButtonGroup();
        datatype.add(int_type);
        datatype.add(float_type);
        datatype.add(double_type);
        datatype.add(long_type);
    


        addButton = new Button("+");
		subButton = new Button("-");
		mulButton = new Button("*");
		divButton = new Button("/");
		decButton = new Button(".");
		equButton = new Button("=");
        clrButton = new Button("Clear");
        modButton = new Button("%");
        remButton = new Button("⌫");

        funButtons[0] = addButton;
        funButtons[1] = subButton;
        funButtons[2] = mulButton;
        funButtons[3] = divButton;
        funButtons[4] = decButton;
        funButtons[5] = modButton;
        funButtons[6] = clrButton;
        funButtons[7] = remButton;
        funButtons[8] = equButton;



        for (int i = 0; i < numButtons.length; i++) {
            numButtons[i] = new Button(Integer.toHexString(i));
            numButtons[i].addActionListener(this);
            numButtons[i].setActionCommand(((Integer.toString(i))));  
            
        }


        for (int i = 0; i < funButtons.length; i++) {
            funButtons[i].addActionListener(this);
            funButtons[i].setFont(font);

        }

        sin = new Button("sin");
        cos = new Button("cos");
        tan = new Button("tan");
        cosec = new Button("csc");
        sec = new Button("sec");
        cot = new Button("cot");
        asin = new Button("asin");
        acos = new Button("acos");
        atan = new Button("atan");
        acosec = new Button("acsc");
        asec = new Button("asec");
        acot = new Button("acot");


        trigButtons[0] = sin;
        trigButtons[1] = cos;
        trigButtons[2] = tan;
        trigButtons[3] = cosec;
        trigButtons[4] = sec;
        trigButtons[5] = cot;
        trigButtons[6] = asin;
        trigButtons[7] = acos;
        trigButtons[8] = atan;
        trigButtons[9] = acosec;
        trigButtons[10] = asec;
        trigButtons[11] = acot;

        for (int i = 0; i < trigButtons.length; i++) {
            trigButtons[i].addActionListener(this);
        }

        sinh = new Button("sinh");
        cosh = new Button("cosh");
        tanh = new Button("tanh");
        cosech = new Button("csch");
        sech = new Button("sech");
        coth = new Button("coth");
        asinh = new Button("asinh");
        acosh = new Button("acosh");
        atanh = new Button("atanh");
        acosech = new Button("acsch");
        asech = new Button("asech");
        acoth = new Button("acoth");

        htrigButtons[0] = sinh;
        htrigButtons[1] = cosh;
        htrigButtons[2] = tanh;
        htrigButtons[3] = cosech;
        htrigButtons[4] = sech;
        htrigButtons[5] = coth;
        htrigButtons[6] = asinh;
        htrigButtons[7] = acosh;
        htrigButtons[8] = atanh;
        htrigButtons[9] = acosech;
        htrigButtons[10] = asech;
        htrigButtons[11] = acoth;

        for (int i = 0; i < htrigButtons.length; i++) {
            htrigButtons[i].addActionListener(this);
        }

        logButton = new Button("log");
        expButton = new Button("exp");
        degButton = new Button("deg");
        radButton = new Button("rad");
        absButton = new Button("+/-");
        factButton = new Button("n!");
        squareButton = new Button("x^2");
        sqrtButton = new Button("sqrt");
        cubeButton = new Button("x^3");


        exfunButtons[0] = logButton;
        exfunButtons[1] = expButton;
        exfunButtons[2] = degButton;
        exfunButtons[3] = radButton;
        exfunButtons[4] = absButton;
        exfunButtons[5] = factButton;
        exfunButtons[6] = squareButton;
        exfunButtons[7] = sqrtButton;
        exfunButtons[8] = cubeButton;

        for (int i = 0; i < exfunButtons.length; i++) {
            exfunButtons[i].addActionListener(this);
        }


        remButton.setBounds(53, 630, 295, 50);
        clrButton.setBounds(353, 630, 295, 50);
        equButton.setBounds(53, 575, 595, 50);


        panel = new JPanel();
        panel.setBounds(50,210,600,340);
        panel.setLayout(new GridLayout(11,5,0,0));
        panel.setBackground(Color.DARK_GRAY);
        panel.setBorder(null);
        panel.setForeground(Color.WHITE);
        


        // adding elements to panel
        panel.add(numButtons[1]);
        panel.add(numButtons[2]);
        panel.add(numButtons[3]);
        panel.add(numButtons[10]);
        panel.add(numButtons[11]);
        panel.add(numButtons[4]);
        panel.add(numButtons[5]);
        panel.add(numButtons[6]);
        panel.add(numButtons[12]);
        panel.add(numButtons[13]);
        panel.add(numButtons[7]);
        panel.add(numButtons[8]);
        panel.add(numButtons[9]);
        panel.add(numButtons[14]);
        panel.add(numButtons[15]);
        panel.add(subButton);
        panel.add(numButtons[0]);
        panel.add(addButton);
        panel.add(trigButtons[0]);
        panel.add(trigButtons[1]);
        panel.add(funButtons[5]);
        panel.add(clrButton);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(trigButtons[2]);
        panel.add(trigButtons[3]);
        panel.add(decButton);
        panel.add(htrigButtons[0]);
        panel.add(htrigButtons[1]);
        panel.add(trigButtons[4]);
        panel.add(trigButtons[5]);
        panel.add(htrigButtons[2]);
        panel.add(htrigButtons[3]);
        panel.add(htrigButtons[4]);
        panel.add(trigButtons[6]);
        panel.add(trigButtons[7]);
        panel.add(htrigButtons[5]);
        panel.add(htrigButtons[6]);
        panel.add(htrigButtons[7]);
        panel.add(trigButtons[8]);
        panel.add(trigButtons[9]);
        panel.add(htrigButtons[8]);
        panel.add(htrigButtons[9]);
        panel.add(htrigButtons[10]);
        panel.add(trigButtons[10]);
        panel.add(trigButtons[11]);
        panel.add(htrigButtons[11]);

        panel.add(exfunButtons[0]);
        panel.add(exfunButtons[1]);
        panel.add(exfunButtons[2]);
        panel.add(exfunButtons[3]);
        panel.add(exfunButtons[4]);
        panel.add(exfunButtons[5]);
        panel.add(exfunButtons[6]);
        panel.add(exfunButtons[7]);
        panel.add(exfunButtons[8]);



        //adding elements to frame

        frame.add(panel);
        frame.add(textfield);
        frame.add(decimal);
        frame.add(binary);
        frame.add(octal);
        frame.add(hexadecimal);
        frame.add(int_type);
        frame.add(float_type);
        frame.add(double_type);
        frame.add(long_type);
        frame.add(panel);
        frame.add(equButton);
        frame.add(remButton);
        frame.add(clrButton);

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
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numButtons[i]) {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
                if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                    textfield.setText(isDoubleParsable(textfield.getText(), datatype.getSelection().getActionCommand()));
                } else {
                    textfield.setText(isIntegerParsable(textfield.getText(), datatype.getSelection().getActionCommand()));
                }
            }
        }
        if (e.getSource() == decButton) {
            textfield.setText(textfield.getText().concat("."));
        }
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '+';
            textfield.setText("");
        }
        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '-';
            textfield.setText("");
        }
        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '*';
            textfield.setText("");
        }
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '/';
            textfield.setText("");
        }
        if (e.getSource() == remButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '%';
            textfield.setText("");
        }
        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(textfield.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                case '%':
                    result = num1 % num2;
                    break;
            }

            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            result = num1;


        }
        if (e.getSource() == clrButton) {
            textfield.setText("");
        }
        if (e.getSource() == remButton) {
            String string = textfield.getText();
            textfield.setText("");
            for (int i = 0; i < string.length() - 1; i++) {
                textfield.setText(textfield.getText() + string.charAt(i));
            }
        }
        if (e.getSource() == squareButton) {
            num1 = Double.parseDouble(textfield.getText());
            result = Math.pow(num1, 2);
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == sqrtButton) {
            num1 = Double.parseDouble(textfield.getText());
            result = Math.sqrt(num1);
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == cubeButton) {
            num1 = Double.parseDouble(textfield.getText());
            result = Math.pow(num1, 3);
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }

        if (numbase.getSelection().getActionCommand().equals("HexaDecimal")) {
            // DEC Number
            for (int i = 0; i < numButtons.length; i++) {
                numButtons[i].setEnabled(true);
            }
            // HEX Number
            for (int i = 10; i < numButtons.length; i++) {
                numButtons[i].setEnabled(true);
            }
            for (int i = 1; i < funButtons.length; i++) {
                funButtons[0].setEnabled(false);
                funButtons[i].setEnabled(true);
            }
            for (int i = 0; i < trigButtons.length; i++) {
                trigButtons[i].setEnabled(false);
            }
            for (int i = 0; i < htrigButtons.length; i++) {
                htrigButtons[i].setEnabled(false);
            }
            for (int i = 0; i < exfunButtons.length; i++) {
                exfunButtons[i].setEnabled(false);
            }

            int_type.setEnabled(true);
            long_type.setEnabled(true);
            float_type.setEnabled(false);
            double_type.setEnabled(false);

        } else if (numbase.getSelection().getActionCommand().equals("Decimal")) {
            // DEC Number
            for (int i = 0; i < numButtons.length; i++) {
                numButtons[i].setEnabled(true);
            }
            // HEX Number
            for (int i = 10; i < numButtons.length; i++) {
                numButtons[i].setEnabled(false);
            }
            for (int i = 0; i < funButtons.length; i++) {
                funButtons[i].setEnabled(true);
            }
            for (int i = 0; i < trigButtons.length; i++) {
                trigButtons[i].setEnabled(true);
            }
            for (int i = 0; i < htrigButtons.length; i++) {
                htrigButtons[i].setEnabled(true);
            }
            for (int i = 0; i < exfunButtons.length; i++) {
                exfunButtons[i].setEnabled(true);
            }
            int_type.setEnabled(true);
            long_type.setEnabled(true);
            float_type.setEnabled(true);
            double_type.setEnabled(true);
        } else if (numbase.getSelection().getActionCommand().equals("Octal")) {
            // OCT Number
            for (int i = 0; i < numButtons.length; i++) {
                numButtons[i].setEnabled(false);
            }
            // OCT Number
            for (int i = 0; i < 8; i++) {
                numButtons[i].setEnabled(true);
            }
            // HEX Number
            for (int i = 10; i < numButtons.length; i++) {
                numButtons[i].setEnabled(false);
            }
            for (int i = 1; i < funButtons.length; i++) {
                funButtons[0].setEnabled(false);
                funButtons[i].setEnabled(true);
            }
            for (int i = 0; i < trigButtons.length; i++) {
                trigButtons[i].setEnabled(false);
            }
            for (int i = 0; i < htrigButtons.length; i++) {
                htrigButtons[i].setEnabled(false);
            }
            for (int i = 0; i < exfunButtons.length; i++) {
                exfunButtons[i].setEnabled(false);
            }
            int_type.setEnabled(true);
            long_type.setEnabled(true);
            float_type.setEnabled(false);
            double_type.setEnabled(false);
        } else if (numbase.getSelection().getActionCommand().equals("Binary")) {
            // DEC Number
            for (int i = 0; i < numButtons.length; i++) {
                numButtons[i].setEnabled(false);
            }
            // BIN Number
            for (int i = 0; i < 2; i++) {
                numButtons[i].setEnabled(true);
            }
            // HEX Number
            for (int i = 10; i < numButtons.length; i++) {
                numButtons[i].setEnabled(false);
            }
            for (int i = 1; i < funButtons.length; i++) {
                funButtons[0].setEnabled(false);
                funButtons[i].setEnabled(true);
            }
            for (int i = 0; i < trigButtons.length; i++) {
                trigButtons[i].setEnabled(false);
            }
            for (int i = 0; i < htrigButtons.length; i++) {
                htrigButtons[i].setEnabled(false);
            }
            for (int i = 0; i < exfunButtons.length; i++) {
                exfunButtons[i].setEnabled(false);
            }
            int_type.setEnabled(true);
            long_type.setEnabled(true);
            float_type.setEnabled(false);
            double_type.setEnabled(false);
        }


        if (e.getSource() == logButton) {
            num1 = Double.parseDouble(textfield.getText());
            result = Math.log(num1);
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == absButton) {
            num1 = Double.parseDouble(textfield.getText());
            result = Math.abs(num1);
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == expButton) {
            num1 = Double.parseDouble(textfield.getText());
            result = Math.exp(num1);
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == degButton) {
            num1 = Double.parseDouble(textfield.getText());
            result = Math.toDegrees(num1);
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;

        }
        if (e.getSource() == radButton) {
            num1 = Double.parseDouble(textfield.getText());
            result = Math.toRadians(num1);
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == sin) {
            num1 = Double.parseDouble(textfield.getText());
            result = Math.sin(num1);
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;

        }
        if (e.getSource() == cos) {
            num1 = Double.parseDouble(textfield.getText());
            result = Math.cos(num1);
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == tan) {
            num1 = Double.parseDouble(textfield.getText());
            result = Math.tan(num1);
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == cosec) {
            num1 = Double.parseDouble(textfield.getText());
            result = 1 / (Math.sin(num1));
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == sec) {
            num1 = Double.parseDouble(textfield.getText());
            result = 1 / (Math.cos(num1));
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == cot) {
            num1 = Double.parseDouble(textfield.getText());
            result = 1 / (Math.tan(num1));
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == asin) {
            num1 = Double.parseDouble(textfield.getText());
            result = Math.asin(num1);
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == acos) {
            num1 = Double.parseDouble(textfield.getText());
            result = Math.acos(num1);
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == atan) {
            num1 = Double.parseDouble(textfield.getText());
            result = Math.atan(num1);
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == acosec) {
            num1 = Double.parseDouble(textfield.getText());
            result = 1 / (Math.asin(num1));
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == asec) {
            num1 = Double.parseDouble(textfield.getText());
            result = 1 / (Math.acos(num1));
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == acot) {
            num1 = Double.parseDouble(textfield.getText());
            result = 1 / (Math.atan(num1));
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == sinh) {
            num1 = Double.parseDouble(textfield.getText());
            result = Math.sinh(num1);
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == cosh) {
            num1 = Double.parseDouble(textfield.getText());
            result = Math.cosh(num1);
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == tanh) {
            num1 = Double.parseDouble(textfield.getText());
            result = Math.tanh(num1);
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == cosech) {
            num1 = Double.parseDouble(textfield.getText());
            result = 1 / (Math.sinh(num1));
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == sech) {
            num1 = Double.parseDouble(textfield.getText());
            result = 1 / (Math.cosh(num1));
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == coth) {
            num1 = Double.parseDouble(textfield.getText());
            result = 1 / (Math.tanh(num1));
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == asinh) {
            num1 = Double.parseDouble(textfield.getText());
            result = Math.log10(num1 + (Math.sqrt((num1 * num1) + 1)));
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == acosh) {
            num1 = Double.parseDouble(textfield.getText());
            result = Math.log10(num1 + (Math.sqrt((num1 * num1) - 1)));
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == atanh) {
            num1 = Double.parseDouble(textfield.getText());
            result = 1 / 2 * (Math.log10((1 + num1) / (1 - num1)));
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == acosech) {
            num1 = Double.parseDouble(textfield.getText());
            result = Math.log10((1 + (Math.sqrt(1 + (num1 * num1)))) / num1);
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == asech) {
            num1 = Double.parseDouble(textfield.getText());
            result = Math.log10((1 + (Math.sqrt(1 - (num1 * num1)))) / num1);
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }
        if (e.getSource() == acoth) {
            num1 = Double.parseDouble(textfield.getText());
            result = 1 / 2 * (Math.log10((num1 + 1) / (num1 - 1)));
            if (datatype.getSelection().getActionCommand().equals("Double") || datatype.getSelection().getActionCommand().equals("Float")) {
                textfield.setText(isDoubleParsable(String.valueOf(result), datatype.getSelection().getActionCommand()));
            } else {
                textfield.setText(isIntegerParsable(String.valueOf((long) result), datatype.getSelection().getActionCommand()));
            }
            num1 = result;
        }

        
    }

    // method to check parsality
    public static String isIntegerParsable(String number, String type){
        // try to parse in given data type and again convert into String
        try {
            if (type.equals("Byte")){
                number = Byte.toString(Byte.parseByte(number));
            } else if (type.equals("Short")){
                number = Short.toString(Short.parseShort(number));
            } else if (type.equals("Integer")){
                number = Integer.toString(Integer.parseInt(number));
            } else if (type.equals("Long")) {
                number = Double.toString(Double.parseDouble(number));
            }
        } catch (java.lang.NumberFormatException e){ // In case, NumberFormatException (Not Parsable)
            number = "NumberFormatException";
        }

        // returning number string
        return number;
    }

    

    public static String isDoubleParsable(String number, String type){
        // try to parse in given data type and again convert into String
        try {
            if (type.equals("Float")){
                number = Float.toString(Float.parseFloat(number));
            } else if (type.equals("Double")){
                number = Double.toString(Double.parseDouble(number));
            }
        } catch (java.lang.NumberFormatException e){ // In case, NumberFormatException (Not Parsable)
            number = "NumberFormatException";
        }

        // returning number string
        return number;
    }

}
