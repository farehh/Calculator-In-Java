import javax.swing.JRadioButton;

import java.awt.Color;
import java.awt.*;


public class RadioButtons extends JRadioButton {
    Font font= new Font("Arial", Font.BOLD, 13);

    RadioButtons(String text){
        setText(text);
        setBackground(Color.DARK_GRAY);
        setForeground(Color.WHITE);
        setFocusable(false);
        setFont(font);
        
        if(text == "Integer")
            setSelected(true);
        
        if(text == "Decimal")
            setSelected(true);

    }

}
