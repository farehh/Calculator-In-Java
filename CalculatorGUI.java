import javax.swing.*;

public class CalculatorGUI {

    private JPanel CalculatorPanel;
    private JButton a0Button;
    private JButton ACButton;
    private JButton button3;
    private JButton button4;
    private JButton cButton;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton button9;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton button13;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JTextField textField1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("CalculatorGUI");
        frame.setContentPane(new CalculatorGUI().CalculatorPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setTitle("Lumber 1 Cal.");

    }
}
