import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class calculator {

   // static double addition = 0;

    static double var1 = 0;
    static double var2 = 0;
    static String operation = "";
    static boolean firstNumberEntered = false;
    static double vara = 0;
    static double varb = 0;
    static double varc = 0;
    static double vard = 0;
    
    static double addition = 0;
    static double subtraction = 0;
    static double multiplication = 0;
    public static void main(String []args){

        Font helvfont = new Font("Helvetica", Font.PLAIN,20);
        Font helvbut = new Font("Helvetica", Font.PLAIN, 15);
        Font helv = new Font("Helvetica", Font.PLAIN, 15);

        JFrame frame1 = new JFrame("Calculator");
        frame1.setLayout(new BorderLayout());
        frame1.setSize(480, 854);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
        frame1.setResizable(false);

        ImageIcon bg = new ImageIcon("image4.png");

        JLabel img1 = new JLabel(bg);
        img1.setBounds(0,0,480, 854);

        JLabel wel = new JLabel("Calculator");
        wel.setBounds(45,25, 400, 30);
        wel.setFont(helvfont);
        wel.setForeground(Color.WHITE);

        JLabel vars = new JLabel("A=0, B=0, C=0, D=0");
        vars.setBounds(45,75, 400, 30);
        vars.setFont(helv);
        vars.setForeground(Color.WHITE);

        JTextField tf1 = new JTextField();
        tf1.setBounds(45,100, 400, 50);
        tf1.setBackground(new Color(52, 52, 52));
        tf1.setFont(helvfont);
        tf1.setForeground(Color.WHITE);

        JButton ac = new JButton("AC");
        ac.setBounds(50, 200,50, 50 );
        ac.setBackground(new Color(84,84,84,255));
        ac.setFont(helvbut);
        ac.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        ac.setForeground(Color.WHITE);
        ac.setFocusPainted(false);
        ac.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText("");
            }
        });

        JButton clr = new JButton("C");
        clr.setBounds(110, 200,50, 50 );
        clr.setBackground(new Color(84,84,84,255));
        clr.setFont(helvbut);
        clr.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        clr.setForeground(Color.WHITE);
        clr.setFocusPainted(false);
        clr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                String currentText = tf1.getText();

                currentText = currentText.substring(0, currentText.length() - 1);
                tf1.setText(currentText);
            }
        });

        JButton per = new JButton("%");
        per.setBounds(170, 200,50, 50 );
        per.setBackground(new Color(84,84,84,255));
        per.setFont(helvbut);
        per.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        per.setForeground(Color.WHITE);
        per.setFocusPainted(false);
        per.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                double var1 = Double.parseDouble(tf1.getText());
                double result = var1 / 100;
                tf1.setText(String.valueOf(result));
            }
        });

        JButton seven = new JButton("7");
        seven.setBounds(50, 260,50, 50 );
        seven.setBackground(new Color(84,84,84,255));
        seven.setFont(helvbut);
        seven.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        seven.setForeground(Color.WHITE);
        seven.setFocusPainted(false);
        seven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText(tf1.getText() + "7");
            }
        });

        JButton eight = new JButton("8");
        eight.setBounds(110, 260,50, 50 );
        eight.setBackground(new Color(84,84,84,255));
        eight.setFont(helvbut);
        eight.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        eight.setForeground(Color.WHITE);
        eight.setFocusPainted(false);
        eight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText(tf1.getText() + "8");
            }
        });

        JButton nine = new JButton("9");
        nine.setBounds(170, 260,50, 50 );
        nine.setBackground(new Color(84,84,84,255));
        nine.setFont(helvbut);
        nine.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        nine.setForeground(Color.WHITE);
        nine.setFocusPainted(false);
        nine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText(tf1.getText() + "9");
            }
        });

        JButton four = new JButton("4");
        four.setBounds(50, 320,50, 50 );
        four.setBackground(new Color(84,84,84,255));
        four.setFont(helvbut);
        four.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        four.setForeground(Color.WHITE);
        four.setFocusPainted(false);
        four.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText(tf1.getText() + "4");
            }
        });

        JButton five = new JButton("5");
        five.setBounds(110, 320,50, 50 );
        five.setBackground(new Color(84,84,84,255));
        five.setFont(helvbut);
        five.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        five.setForeground(Color.WHITE);
        five.setFocusPainted(false);
        five.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText(tf1.getText() + "5");
            }
        });

        JButton six = new JButton("6");
        six.setBounds(170, 320,50, 50 );
        six.setBackground(new Color(84,84,84,255));
        six.setFont(helvbut);
        six.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        six.setForeground(Color.WHITE);
        six.setFocusPainted(false);
        six.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText(tf1.getText() + "6");
            }
        });

        JButton one = new JButton("1");
        one.setBounds(50, 380,50, 50 );
        one.setBackground(new Color(84,84,84,255));
        one.setFont(helvbut);
        one.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        one.setForeground(Color.WHITE);
        one.setFocusPainted(false);
        one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText(tf1.getText() + "1");
            }
        });

        JButton two = new JButton("2");
        two.setBounds(110, 380,50, 50 );
        two.setBackground(new Color(84,84,84,255));
        two.setFont(helvbut);
        two.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        two.setForeground(Color.WHITE);
        two.setFocusPainted(false);
        two.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText(tf1.getText() + "2");
            }
        });

        JButton three = new JButton("3");
        three.setBounds(170, 380,50, 50 );
        three.setBackground(new Color(84,84,84,255));
        three.setFont(helvbut);
        three.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        three.setForeground(Color.WHITE);
        three.setFocusPainted(false);
        three.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText(tf1.getText() + "3");
            }
        });

        JButton zero = new JButton("0");
        zero.setBounds(50, 440,50, 50 );
        zero.setBackground(new Color(84,84,84,255));
        zero.setFont(helvbut);
        zero.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        zero.setForeground(Color.WHITE);
        zero.setFocusPainted(false);
        zero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText(tf1.getText() + "0");
            }
        });

        JButton dzero = new JButton("00");
        dzero.setBounds(110, 440,50, 50 );
        dzero.setBackground(new Color(84,84,84,255));
        dzero.setFont(helvbut);
        dzero.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        dzero.setForeground(Color.WHITE);
        dzero.setFocusPainted(false);
        dzero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText(tf1.getText() + "00");
            }
        });

        JButton dot = new JButton(".");
        dot.setBounds(170, 440,50, 50 );
        dot.setBackground(new Color(84,84,84,255));
        dot.setFont(helvbut);
        dot.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        dot.setForeground(Color.WHITE);
        dot.setFocusPainted(false);
        dot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText(tf1.getText() + ".");
            }
        });

        JButton Abut = new JButton("A");
        Abut.setBounds(50, 500,50, 50 );
        Abut.setBackground(new Color(84,84,84,255));
        Abut.setFont(helvbut);
        Abut.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        Abut.setForeground(Color.WHITE);
        Abut.setFocusPainted(false);
        Abut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                vara = Double.parseDouble(tf1.getText());

                vars.setText(String.valueOf("A= "+vara+", B= "+varb+", C= "+varc+", D= " +vard));
                tf1.setText("");
            }
        });

        JButton Bbut = new JButton("B");
        Bbut.setBounds(110, 500,50, 50 );
        Bbut.setBackground(new Color(84,84,84,255));
        Bbut.setFont(helvbut);
        Bbut.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        Bbut.setForeground(Color.WHITE);
        Bbut.setFocusPainted(false);
        Bbut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                varb = Double.parseDouble(tf1.getText());
        
                vars.setText(String.valueOf("A= "+vara+", B= "+varb+", C= "+varc+", D= " +vard));
                tf1.setText("");
            }
        });

        JButton Cbut = new JButton("C");
        Cbut.setBounds(170, 500,50, 50 );
        Cbut.setBackground(new Color(84,84,84,255));
        Cbut.setFont(helvbut);
        Cbut.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        Cbut.setForeground(Color.WHITE);
        Cbut.setFocusPainted(false);
        Cbut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                varc = Double.parseDouble(tf1.getText());
        
                vars.setText(String.valueOf("A= "+vara+", B= "+varb+", C= "+varc+", D= " +vard));
                tf1.setText("");
            }
        });

        JButton Dbut = new JButton("D");
        Dbut.setBounds(230, 500,50, 50 );
        Dbut.setBackground(new Color(84,84,84,255));
        Dbut.setFont(helvbut);
        Dbut.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        Dbut.setForeground(Color.WHITE);
        Dbut.setFocusPainted(false);
        Dbut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              
                vard = Double.parseDouble(tf1.getText());
        
                vars.setText(String.valueOf("A= "+vara+", B= "+varb+", C= "+varc+", D= " +vard));
                tf1.setText("");
            }
        });

        JButton sub = new JButton("-");
        sub.setBounds(230, 320,50, 50 );
        sub.setBackground(new Color(84,84,84,255));
        sub.setFont(helvbut);
        sub.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        sub.setForeground(Color.WHITE);
        sub.setFocusPainted(false);
        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              
                try {
                    if (!firstNumberEntered) {
                        var1 = Double.parseDouble(tf1.getText());
                        tf1.setText("");
                        operation = "-";
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

        JButton mult = new JButton("*");
        mult.setBounds(230, 260,50, 50 );
        mult.setBackground(new Color(84,84,84,255));
        mult.setFont(helvbut);
        mult.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        mult.setForeground(Color.WHITE);
        mult.setFocusPainted(false);
        mult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              
                try {
                    if (!firstNumberEntered) {
                        var1 = Double.parseDouble(tf1.getText());
                        tf1.setText("");
                        operation = "*";
                        firstNumberEntered = true;
                    } else {
                       
                        double var2 = Double.parseDouble(tf1.getText());
                        double multiplication= var1 * var2;
                        
                        tf1.setText(String.valueOf(multiplication));
                        //tf1.setText("");
                        firstNumberEntered = false;
                    }
                } catch (NumberFormatException ex) {
                    tf1.setText("Invalid input");
                }
            }
        });

        JButton div = new JButton("/");
        div.setBounds(230, 200,50, 50 );
        div.setBackground(new Color(84,84,84,255));
        div.setFont(helvbut);
        div.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        div.setForeground(Color.WHITE);
        div.setFocusPainted(false);
        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              
                try {
                    if (!firstNumberEntered) {
                        var1 = Double.parseDouble(tf1.getText());
                        tf1.setText("");
                        operation = "/";
                        firstNumberEntered = true;
                    } else {
                       
                        double var2 = Double.parseDouble(tf1.getText());
                        double divition = var1 / var2;
                        
                        tf1.setText(String.valueOf(divition));
                        //tf1.setText("");
                        firstNumberEntered = false;
                    }
                } catch (NumberFormatException ex) {
                    tf1.setText("Invalid input");
                }
            }
        });

        JButton add = new JButton("+");
        add.setBounds(230, 380,50, 50 );
        add.setBackground(new Color(84,84,84,255));
        add.setFont(helvbut);
        add.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        add.setForeground(Color.WHITE);
        add.setFocusPainted(false);
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              
                try {
                    if (!firstNumberEntered) {
                        var1 = Double.parseDouble(tf1.getText());
                        tf1.setText("");
                        operation = "+";
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

        JButton pow = new JButton("X^y");
        pow.setBounds(290, 200,50, 50 );
        pow.setBackground(new Color(84,84,84,255));
        pow.setFont(helvbut);
        pow.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        pow.setForeground(Color.WHITE);
        pow.setFocusPainted(false);
        pow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                try {
                    if (!firstNumberEntered) {
                        var1 = Double.parseDouble(tf1.getText());
                        tf1.setText("");
                        operation = "pow";
                        firstNumberEntered = true;
                    } else {
                       
                        double var2 = Double.parseDouble(tf1.getText());
                        double resultpow =(Math.pow(var1,var2));
                        
                        tf1.setText(String.valueOf(resultpow));
                        //tf1.setText("");
                        firstNumberEntered = false;
                    }
                } catch (NumberFormatException ex) {
                    tf1.setText("Invalid input");
                }
            }
        });


        JButton eq = new JButton("=");
        eq.setBounds(230, 440,50, 50 );
        eq.setBackground(new Color(84,84,84,255));
        eq.setFont(helvbut);
        eq.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        eq.setForeground(Color.WHITE);
        eq.setFocusPainted(false);
        eq.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                try {
                    if (firstNumberEntered) {
                        double result = 0;
                        // Switch-case for different operations
                        switch (operation) {
                            case "+":
                                var2 = Double.parseDouble(tf1.getText());
                                result = var1 + var2;
                                break;
                            case "-":
                                var2 = Double.parseDouble(tf1.getText());
                                result = var1 - var2;
                                break;
                            case "*":
                                var2 = Double.parseDouble(tf1.getText());
                                result = var1 * var2;
                                break;
                            case "/":
                                var2 = Double.parseDouble(tf1.getText());
                                if (var2 != 0) {
                                    result = var1 / var2;
                                } else {
                                    tf1.setText("Syntax Error");
                                    firstNumberEntered = false;
                                    operation = "";
                                    return;
                                }
                                break;
                            case "pow":
                                var2 = Double.parseDouble(tf1.getText());
                                result = (Math.pow(var1, var2));
                                break;

                                //divider
                                
                                default:
                                tf1.setText("Syntax Error");
                                return;
                            }
                            tf1.setText(String.valueOf(result));
                            firstNumberEntered = false;
                            operation = "";
                        }         
                    }catch(NumberFormatException ex){
                        tf1.setText("Syntax Error"); 
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
        frame1.add(mult);
        frame1.add(per);
        frame1.add(clr);
        frame1.add(ac);
        frame1.add(div);
        frame1.add(eq);
        frame1.add(pow);
        frame1.add(vars);
        frame1.add(Abut);
        frame1.add(Bbut);
        frame1.add(Cbut);
        frame1.add(Dbut);


        frame1.add(img1);
        
        
        frame1.revalidate();
        frame1.repaint();

    }   
}
