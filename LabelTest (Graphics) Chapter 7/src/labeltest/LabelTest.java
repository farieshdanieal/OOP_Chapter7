/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labeltest;

/**
 *
 * @author User
 */
import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;


public class LabelTest extends JFrame {
    private JLabel label1, label2, label3;
    private JTextField textField1 = new JTextField(10);
    private JButton button1, button2;
    private JCheckBox checkBox1, checkBox2;

    public LabelTest() {
        super("Fariesh Punya");

        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        // Title label at the top
        label1 = new JLabel("Welkem tu Mobel Lejen", SwingConstants.CENTER);
        container.add(label1, BorderLayout.NORTH);

        // Create a main panel to hold both image-button-checkbox panels side by side
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(1, 2)); // 1 row, 2 columns

        // Panel for Darat (image + button + checkbox + radio buttons)
        JPanel daratPanel = new JPanel();
        daratPanel.setLayout(new BoxLayout(daratPanel, BoxLayout.Y_AXIS)); // Vertical layout

        Icon rabbit = new ImageIcon("C:\\Users\\User\\Downloads\\images (3).jpeg");
        label2 = new JLabel("Darat", rabbit, SwingConstants.CENTER);
        label2.setVerticalTextPosition(SwingConstants.BOTTOM); // Text below the image
        label2.setHorizontalTextPosition(SwingConstants.CENTER); // Center the text horizontally

        button1 = new JButton("SELEK");
        button1.setAlignmentX(Component.CENTER_ALIGNMENT); // Center the button

        // Add a checkbox under Darat
        checkBox1 = new JCheckBox("Guna Skin");
        checkBox1.setAlignmentX(Component.CENTER_ALIGNMENT); // Center the checkbox

        // Create radio buttons under Darat
        JRadioButton b1Darat = new JRadioButton("EMBLEM FAITER");
        JRadioButton b2Darat = new JRadioButton("EMBLEM MEJ");
        JRadioButton b3Darat = new JRadioButton("EMBLEM TENK");

        ButtonGroup groupDarat = new ButtonGroup();
        groupDarat.add(b1Darat);
        groupDarat.add(b2Darat);
        groupDarat.add(b3Darat);

        // Center-align the radio buttons
        b1Darat.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2Darat.setAlignmentX(Component.CENTER_ALIGNMENT);
        b3Darat.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Add components to daratPanel
        daratPanel.add(label2);
        daratPanel.add(button1);
        daratPanel.add(checkBox1);
        daratPanel.add(b1Darat);
        daratPanel.add(b2Darat);
        daratPanel.add(b3Darat);

        // Panel for Linglung (image + button + checkbox + radio buttons)
        JPanel linglungPanel = new JPanel();
        linglungPanel.setLayout(new BoxLayout(linglungPanel, BoxLayout.Y_AXIS)); // Vertical layout

        Icon anotherImage = new ImageIcon("C:\\Users\\User\\Downloads\\download (2).jpeg");
        label3 = new JLabel("Linglung", anotherImage, SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM); // Text below the image
        label3.setHorizontalTextPosition(SwingConstants.CENTER); // Center the text horizontally

        button2 = new JButton("SELEK");
        button2.setAlignmentX(Component.CENTER_ALIGNMENT); // Center the button

        // Add a checkbox under Linglung
        checkBox2 = new JCheckBox("Guna Skin");
        checkBox2.setAlignmentX(Component.CENTER_ALIGNMENT); // Center the checkbox

        // Create radio buttons under Linglung
        JRadioButton b1Linglung = new JRadioButton("EMBLEM FAITER");
        JRadioButton b2Linglung = new JRadioButton("EMBLEM MEJ");
        JRadioButton b3Linglung = new JRadioButton("EMBLEM TENK");

        ButtonGroup groupLinglung = new ButtonGroup();
        groupLinglung.add(b1Linglung);
        groupLinglung.add(b2Linglung);
        groupLinglung.add(b3Linglung);

        // Center-align the radio buttons
        b1Linglung.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2Linglung.setAlignmentX(Component.CENTER_ALIGNMENT);
        b3Linglung.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Add components to linglungPanel
        linglungPanel.add(label3);
        linglungPanel.add(button2);
        linglungPanel.add(checkBox2);
        linglungPanel.add(b1Linglung);
        linglungPanel.add(b2Linglung);
        linglungPanel.add(b3Linglung);

        // Add both panels (daratPanel and linglungPanel) to the main panel
        mainPanel.add(daratPanel);
        mainPanel.add(linglungPanel);

        // Add the main panel to the center of the container
        container.add(mainPanel, BorderLayout.CENTER);

        // Add text field at the bottom (south)
        textField1.setBackground(new Color(0xE1C16E));
        textField1.setForeground(Color.BLUE);
        textField1.setFont(new Font("Courier", Font.ITALIC, 15));
        container.add(textField1, BorderLayout.SOUTH);

        // Set size and visibility of the frame
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
        setVisible(true);
   
       


    }
    public static void main(String[] args) {
        LabelTest application = new LabelTest();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


