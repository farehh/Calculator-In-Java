import java.awt.Color;
import java.awt.*;
import javax.swing.JButton;

public class Button extends JButton{
    Font font= new Font("Courier", Font.BOLD, 21);

    Button(String text){
        setText(text);
        setBackground(Color.DARK_GRAY);
        setForeground(Color.WHITE);
        setFocusable(false);
        setFont(font);


        
        // addMouseListener(new java.awt.event.MouseAdapter() {
        //     public void mouseEntered(java.awt.event.MouseEvent evt) {
        //         setForeground(Color.BLACK);
        //         setBackground(Color.DARK_GRAY);
        //     }
        //     public void mouseExited(java.awt.event.MouseEvent evt) {
        //         setForeground(Color.WHITE);
        //         setBackground(Color.DARK_GRAY);
        //         setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        //     }
        // });
    }
}
