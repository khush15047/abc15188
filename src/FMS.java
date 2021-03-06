import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author khushvinder
 */
public class FMS extends JFrame {
    private JFrame frame1, frame2, frame3, frame4;
    private JPanel panel1, panel2, panel3, panel4;
    private JLabel label1, label2, head, head2, head3, label4, label5, label6, label7, label8, label9, label10, label11, lab_log, lab_pass;
    private JButton Login, one, two, three, four, logout, submit, cancel;
    private JButton Register, Login2;
    private JTextField textField1, text_log, text_pass, textField2, textField3, textField4, textField5, textField6, textField7, textField8;
    private String Text1, Text2, t3, t4, t5, t6, t7, t8, t9, t10;

    //constructor
    public FMS() {
        frame1 = new JFrame("FMS");
        frame1.setSize(500, 300);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel();
        label1.setText("Facility Management Services System");
        Font myFont = new Font("Comic Sans MS", Font.PLAIN, 27);
        label1.setFont(myFont);
        panel1.setBackground(Color.BLACK);
        label1.setForeground(Color.GREEN);
        panel1.add(label1);
        JButton Login = new JButton("Login");
        Login.setBackground(Color.GREEN);
        Login.setForeground(Color.BLUE);
        panel1.add(Login);
        JButton Register = new JButton("Register");
        Register.setBackground(Color.GREEN);
        Register.setForeground(Color.BLUE);
        panel1.add(Register);
        frame1.add(panel1);
        frame1.setVisible(true);
        Login.setActionCommand("Login");

        Login.addActionListener(new Action1());

        Register.setActionCommand("Register");
        Register.addActionListener(new Action4());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new FMS();//contructor call
    }

    class Action1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame1.getContentPane().removeAll();
            frame1.repaint();
            String command = e.getActionCommand();
            if (command.equals("Login")) {
                JPanel panel2 = new JPanel();
                panel2.setBackground(Color.BLACK);
                head = new JLabel();
                head.setText("USER LOGIN");
                Font myFont = new Font("Comic Sans MS", Font.PLAIN, 77);
                head.setFont(myFont);
                head.setForeground(Color.GREEN);
                panel2.add(head);
                lab_log = new JLabel("USERNAME");
                lab_log.setForeground(Color.GREEN);
                text_log = new JTextField(35);
                panel2.add(lab_log, BorderLayout.CENTER);
                panel2.add(text_log);

                lab_pass = new JLabel("PASSWORD");
                lab_pass.setForeground(Color.GREEN);
                panel2.add(lab_pass);
                text_pass = new JTextField(35);
                panel2.add(lab_pass, BorderLayout.CENTER);
                panel2.add(text_pass);

                Login2 = new JButton("LOGIN");
                Login2.setBackground(Color.GREEN);
                Login2.setForeground(Color.BLUE);
                panel2.add(Login2);

                Login2.setActionCommand("Login2");
                Login2.addActionListener(new Action2());


                frame1.add(panel2);

                frame1.setVisible(true);
            }
        }
    }

    class Action4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame1.getContentPane().removeAll();
            frame1.repaint();
            String command = e.getActionCommand();
            if (command.equals("Register")) {
                JPanel panel2 = new JPanel();
                panel2.setBackground(Color.BLACK);
                label4 = new JLabel("   ID              ");
                textField1 = new JTextField(34);
                textField1.setBounds(50, 10, 20, 10);
                panel2.add(label4, BorderLayout.EAST);
                panel2.add(textField1);
                label5 = new JLabel("   TYPE          ");
                textField2 = new JTextField(34);
                panel2.add(label5, BorderLayout.CENTER);
                panel2.add(textField2);
                label6 = new JLabel("  NAME          ");
                textField3 = new JTextField(34);
                panel2.add(label6, BorderLayout.EAST);
                panel2.add(textField3);
                label7 = new JLabel("USERNAME  ");
                textField4 = new JTextField(34);
                panel2.add(label7, BorderLayout.EAST);
                panel2.add(textField4);
                label8 = new JLabel("PASSWORD  ");
                textField5 = new JTextField(34);
                panel2.add(label8, BorderLayout.EAST);
                panel2.add(textField5);
                label9 = new JLabel(" DOB                 ");
                textField6 = new JTextField(34);
                panel2.add(label9, BorderLayout.EAST);
                panel2.add(textField6);
                label10 = new JLabel("ADDRESS        ");
                textField7 = new JTextField(34);
                panel2.add(label10, BorderLayout.EAST);
                panel2.add(textField7);
                label11 = new JLabel("DEPARTMENT");
                textField8 = new JTextField(34);
                panel2.add(label11, BorderLayout.EAST);
                panel2.add(textField8);
                submit = new JButton("Submit");
                cancel = new JButton("Cancel");
                submit.setActionCommand("submit");
                submit.addActionListener(new Action3());
                cancel.setActionCommand("cancel");
                cancel.addActionListener(new Action3());
                panel2.add(submit);
                panel2.add(cancel);
                Color();
                frame1.add(panel2);
                frame1.setVisible(true);
            }
        }

        public void Color() {

            submit.setBackground(Color.GREEN);
            submit.setForeground(Color.BLUE);
            cancel.setBackground(Color.GREEN);
            cancel.setForeground(Color.BLUE);
            label4.setForeground(Color.GREEN);
            label5.setForeground(Color.GREEN);
            label6.setForeground(Color.GREEN);
            label7.setForeground(Color.GREEN);
            label8.setForeground(Color.GREEN);
            label9.setForeground(Color.GREEN);
            label10.setForeground(Color.GREEN);
            label11.setForeground(Color.GREEN);
        }

    }

    class Action2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame1.getContentPane().removeAll();
            frame1.repaint();
            String command = e.getActionCommand();
            if (command.equals("Login2")) {
                Text1 = text_log.getText();//getting input from Username
                Text2 = text_pass.getText();//gettig input from Password
                panel3 = new JPanel();
                panel3.setBackground(Color.BLACK);
                head2 = new JLabel();
                head2.setText("Admin");
                Font myFont = new Font("Comic Sans MS", Font.PLAIN, 20);
                head2.setFont(myFont);
                head2.setForeground(Color.CYAN);
                panel3.add(head2);
                one = new JButton("Home");
                two = new JButton("Staff");
                three = new JButton("Logistics");
                four = new JButton("Report");
                logout = new JButton("Logout");
                one.setBackground(Color.GREEN);
                two.setBackground(Color.GREEN);
                three.setBackground(Color.GREEN);
                four.setBackground(Color.GREEN);
                logout.setBackground(Color.ORANGE);
                one.setForeground(Color.BLUE);
                two.setForeground(Color.BLUE);
                three.setForeground(Color.BLUE);
                four.setForeground(Color.BLUE);
                logout.setForeground(Color.BLUE);
                one.setActionCommand("Home");
                two.setActionCommand("Staff");
                three.setActionCommand("Logistics");
                four.setActionCommand("Report");
                logout.setActionCommand("Logout");
                panel3.add(one);
                panel3.add(two);
                panel3.add(three);
                panel3.add(four);
                panel3.add(logout);
                frame1.add(panel3);
                frame1.setVisible(true);
            }
        }
    }

    class Action3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame1.getContentPane().removeAll();
            frame1.repaint();
            String command = e.getActionCommand();
            if (command.equals("submit")) {
                t3 = textField1.getText();//getting input from ID
                t4 = textField2.getText();//getting input from Type
                t5 = textField3.getText();//getting input from Name
                t6 = textField4.getText();//getting input from Username
                t7 = textField5.getText();//getting input from Password
                t8 = textField6.getText();//getting input from DOB
                t9 = textField7.getText();//getting input from Address
                t10 = textField8.getText();//getting input from Department
                panel4 = new JPanel();
                panel4.setBackground(Color.BLACK);
                head3 = new JLabel();
                head3.setText("YOU ARE SUCCESSFULLY REGISTERED!");
                Font myFont = new Font("Comic Sans MS", Font.PLAIN, 20);
                head3.setFont(myFont);
                head3.setForeground(Color.CYAN);
                panel4.add(head3);
                frame1.add(panel4);
                frame1.setVisible(true);
            } else {
                System.exit(0);
            }
        }

    }

}
