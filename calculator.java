import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class calculator {

   // static double addition = 0;

    static double var1 = 0;
    static double var2 = 0;
    static boolean firstNumberEntered = false;
    
    static double addition = 0;
    static double subtraction = 0;
    public static void main(String []args){

        Font helvfont = new Font("Helvetica", Font.PLAIN,20);

        JFrame frame1 = new JFrame("Calculator");
        frame1.setLayout(new BorderLayout());
        frame1.setSize(480, 854);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
        frame1.setResizable(false);

        ImageIcon bg = new ImageIcon("image1.png");

        JLabel img1 = new JLabel(bg);
        img1.setBounds(0,0,480, 854);

        JLabel wel = new JLabel("Calculator");
        wel.setBounds(45,25, 400, 30);
        wel.setFont(helvfont);

        JTextField tf1 = new JTextField();
        tf1.setBounds(45,100, 400, 50);

        JButton seven = new JButton("7");
        seven.setBounds(50, 200,50, 50 );
        seven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText(tf1.getText() + "7");
            }
        });

        JButton eight = new JButton("8");
        eight.setBounds(110, 200,50, 50 );
        eight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText(tf1.getText() + "8");
            }
        });

        JButton nine = new JButton("9");
        nine.setBounds(170, 200,50, 50 );
        nine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText(tf1.getText() + "9");
            }
        });

        JButton four = new JButton("4");
        four.setBounds(50, 260,50, 50 );
        four.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText(tf1.getText() + "4");
            }
        });

        JButton five = new JButton("5");
        five.setBounds(110, 260,50, 50 );
        five.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText(tf1.getText() + "5");
            }
        });

        JButton six = new JButton("6");
        six.setBounds(170, 260,50, 50 );
        six.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText(tf1.getText() + "6");
            }
        });

        JButton one = new JButton("1");
        one.setBounds(50, 320,50, 50 );
        one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText(tf1.getText() + "1");
            }
        });

        JButton two = new JButton("2");
        two.setBounds(110, 320,50, 50 );
        two.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText(tf1.getText() + "2");
            }
        });

        JButton three = new JButton("3");
        three.setBounds(170, 320,50, 50 );
        three.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText(tf1.getText() + "3");
            }
        });

        JButton zero = new JButton("0");
        zero.setBounds(50, 380,50, 50 );
        zero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText(tf1.getText() + "0");
            }
        });

        JButton dzero = new JButton("00");
        dzero.setBounds(110, 380,50, 50 );
        dzero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText(tf1.getText() + "00");
            }
        });

        JButton dot = new JButton(".");
        dot.setBounds(170, 380,50, 50 );
        dot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText(tf1.getText() + ".");
            }
        });

        JButton add = new JButton("+");
        add.setBounds(230, 320,50, 50 );
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              
                try {
                    if (!firstNumberEntered) {
                        var1 = Double.parseDouble(tf1.getText());
                        tf1.setText("");
                        firstNumberEntered = true;
                    } else {
                       
                        double var2 = Double.parseDouble(tf1.getText());
                        double addition = var1 + var2;
                        
                        tf1.setText(String.valueOf(addition));
                        //tf1.setText("");
                        firstNumberEntered = false;
                    }
                } catch (NumberFormatException ex) {
                    tf1.setText("Invalid input");
                }
            }
        });

        JButton sub = new JButton("-");
        sub.setBounds(230, 260,50, 50 );
        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              
                try {
                    if (!firstNumberEntered) {
                        var1 = Double.parseDouble(tf1.getText());
                        tf1.setText("");
                        firstNumberEntered = true;
                    } else {
                       
                        double var2 = Double.parseDouble(tf1.getText());
                        double subtraction = var1 - var2;
                        
                        tf1.setText(String.valueOf(subtraction));
                        //tf1.setText("");
                        firstNumberEntered = false;
                    }
                } catch (NumberFormatException ex) {
                    tf1.setText("Invalid input");
                }
            }
        });





        frame1.add(wel);
        frame1.add(tf1);
        frame1.add(one);
        frame1.add(two);
        frame1.add(three);
        frame1.add(four);
        frame1.add(five);
        frame1.add(six);
        frame1.add(seven);
        frame1.add(eight);
        frame1.add(nine);
        frame1.add(zero);
        frame1.add(dzero);
        frame1.add(dot);
        frame1.add(add);
        frame1.add(sub);


        frame1.add(img1);
        
        
        frame1.revalidate();
        frame1.repaint();

    }   
}
