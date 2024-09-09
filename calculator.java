import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class calculator {

   // static double addition = 0;

    static double var1 = 0;
    static double var2 = 0;
    static String operation = "";
    static boolean firstNumberEntered = false;
    static long vara = 0;
    static long varb = 0;
    static long varc = 0;
    static long vard = 0;
    static double varcel = 0;
    static double varflr = 0;
    static double varsqrt = 0;
    static double varcbrt = 0;
    static double negvar = 0;
    static double varlog = 0;
    static double varlogb = 0;
    static double varnaddab = 0;
    static double varsumma = 0;
    static double varprodd = 1;
    //static String uptxtfl;
    
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

        JLabel ver = new JLabel("V.1.11");
        ver.setBounds(450, 824, 400, 20);
        ver.setFont(helv);
        ver.setForeground(Color.WHITE);

        JLabel vars = new JLabel("A=0, B=0, C=0, D=0");
        vars.setBounds(45,75, 400, 30);
        vars.setFont(helv);
        vars.setForeground(Color.WHITE);

        JTextField tf2 = new JTextField();
        tf2.setBounds(45,100, 400, 50);
        tf2.setBackground(new Color(52, 52, 52));
        tf2.setFont(helvfont);
        tf2.setForeground(Color.WHITE);
        tf2.setBorder(new EmptyBorder(0, 0, 0, 0));

        JTextField tf1 = new JTextField();
        tf1.setBounds(45,155, 400, 50);
        tf1.setBackground(new Color(52, 52, 52));
        tf1.setFont(helvfont);
        tf1.setForeground(Color.WHITE);
        //tf2.setBorder(new EmptyBorder(0, 0, 0, 0));

        JButton ac = new JButton("AC");
        ac.setBounds(50, 215,50, 50 );
        ac.setBackground(new Color(84,84,84,255));
        ac.setFont(helvbut);
        ac.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        ac.setForeground(Color.WHITE);
        ac.setFocusPainted(false);
        ac.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tf1.setText("");

               vara = 0;
               varb = 0;
               varc = 0;
               vard = 0;

                vars.setText(String.valueOf("A="+vara+", B="+varb+", C="+varc+", D=" +vard));
                tf1.setText("");
                tf2.setText("");
            }
        });

        JButton clr = new JButton("C");
        clr.setBounds(110, 215,50, 50 );
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
        per.setBounds(170, 215,50, 50 );
        per.setBackground(new Color(84,84,84,255));
        per.setFont(helvbut);
        per.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        per.setForeground(Color.WHITE);
        per.setFocusPainted(false);
        per.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                double var1 = Double.parseDouble(tf1.getText());
                String uptxtfl = tf1.getText() + "%";
                tf2.setText(uptxtfl);
                double result = var1 / 100;
                tf1.setText(String.valueOf(result));
            }
        });

        JButton div = new JButton("/");
        div.setBounds(230, 215,50, 50 );
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
                        String uptxtfl = tf1.getText() + "/";
                        tf2.setText(uptxtfl);
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

        JButton seven = new JButton("7");
        seven.setBounds(50, 275,50, 50 );
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
        eight.setBounds(110, 275,50, 50 );
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
        nine.setBounds(170, 275,50, 50 );
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
        four.setBounds(50, 335,50, 50 );
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
        five.setBounds(110, 335,50, 50 );
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
        six.setBounds(170, 335,50, 50 );
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
        one.setBounds(50, 395,50, 50 );
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
        two.setBounds(110, 395,50, 50 );
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
        three.setBounds(170, 395,50, 50 );
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
        zero.setBounds(50, 455,50, 50 );
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
        dzero.setBounds(110, 455,50, 50 );
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
        dot.setBounds(170, 455,50, 50 );
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
        Abut.setBounds(50, 515,50, 50 );
        Abut.setBackground(new Color(84,84,84,255));
        Abut.setFont(helvbut);
        Abut.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        Abut.setForeground(Color.WHITE);
        Abut.setFocusPainted(false);
        Abut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                vara = Long.parseLong(tf1.getText());

                vars.setText(String.valueOf("A= "+vara+", B= "+varb+", C= "+varc+", D= " +vard));
                tf1.setText("");
            }
        });

        JButton Bbut = new JButton("B");
        Bbut.setBounds(110, 515,50, 50 );
        Bbut.setBackground(new Color(84,84,84,255));
        Bbut.setFont(helvbut);
        Bbut.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        Bbut.setForeground(Color.WHITE);
        Bbut.setFocusPainted(false);
        Bbut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                varb = Long.parseLong(tf1.getText());
        
                vars.setText(String.valueOf("A= "+vara+", B= "+varb+", C= "+varc+", D= " +vard));
                tf1.setText("");
            }
        });

        JButton Cbut = new JButton("C");
        Cbut.setBounds(170, 515,50, 50 );
        Cbut.setBackground(new Color(84,84,84,255));
        Cbut.setFont(helvbut);
        Cbut.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        Cbut.setForeground(Color.WHITE);
        Cbut.setFocusPainted(false);
        Cbut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                varc = Long.parseLong(tf1.getText());
        
                vars.setText(String.valueOf("A= "+vara+", B= "+varb+", C= "+varc+", D= " +vard));
                tf1.setText("");
            }
        });

        JButton Dbut = new JButton("D");
        Dbut.setBounds(230, 515,50, 50 );
        Dbut.setBackground(new Color(84,84,84,255));
        Dbut.setFont(helvbut);
        Dbut.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        Dbut.setForeground(Color.WHITE);
        Dbut.setFocusPainted(false);
        Dbut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              
                vard = Long.parseLong(tf1.getText());
        
                vars.setText(String.valueOf("A= "+vara+", B= "+varb+", C= "+varc+", D= " +vard));
                tf1.setText("");
            }
        });

        JButton neg = new JButton("-/+");
        neg.setBounds(290, 275,50, 50 );
        neg.setBackground(new Color(84,84,84,255));
        neg.setFont(helvbut);
        neg.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        neg.setForeground(Color.WHITE);
        neg.setFocusPainted(false);
        neg.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              
                negvar = Double.parseDouble(tf1.getText());
                
                double negvar1 = -negvar;
                tf1.setText(String.valueOf(negvar1));

            }
        });

        JButton cel = new JButton("CEIL");
        cel.setBounds(290, 335,50, 50 );
        cel.setBackground(new Color(84,84,84,255));
        cel.setFont(helvbut);
        cel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        cel.setForeground(Color.WHITE);
        cel.setFocusPainted(false);
        cel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                varcel = Double.parseDouble(tf1.getText());
                String uptxtfl = tf1.getText() + " CEIL";
                tf2.setText(uptxtfl);
                

                double varcel1 = Math.ceil(varcel);
                tf1.setText(String.valueOf(varcel1));
            }
        });

        JButton flr = new JButton("FLR");
        flr.setBounds(290, 395,50, 50 );
        flr.setBackground(new Color(84,84,84,255));
        flr.setFont(helvbut);
        flr.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        flr.setForeground(Color.WHITE);
        flr.setFocusPainted(false);
        flr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              
                varflr = Double.parseDouble(tf1.getText());
                String uptxtfl = tf1.getText() + " FLR";
                tf2.setText(uptxtfl);

                double varflr1 = Math.floor(varflr);
                tf1.setText(String.valueOf(varflr1));
                
            }
        });

        JButton sqrt = new JButton("√");
        sqrt.setBounds(290, 455,50, 50 );
        sqrt.setBackground(new Color(84,84,84,255));
        sqrt.setFont(helvbut);
        sqrt.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        sqrt.setForeground(Color.WHITE);
        sqrt.setFocusPainted(false);
        sqrt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              
                varsqrt = Double.parseDouble(tf1.getText());
                String uptxtfl = tf1.getText() + "√";
                tf2.setText(uptxtfl);

                double varsqrt1 = Math.sqrt(varsqrt);
                tf1.setText(String.valueOf(varsqrt1));
                
            }
        });

        JButton cbrt = new JButton("∛");
        cbrt.setBounds(290, 515,50, 50 );
        cbrt.setBackground(new Color(84,84,84,255));
        cbrt.setFont(helvbut);
        cbrt.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        cbrt.setForeground(Color.WHITE);
        cbrt.setFocusPainted(false);
        cbrt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              
                varcbrt = Double.parseDouble(tf1.getText());
                String uptxtfl = tf1.getText() + "∛";
                tf2.setText(uptxtfl);

                double varcbrt1 = Math.cbrt(varcbrt);
                tf1.setText(String.valueOf(varcbrt1));
                
            }
        });

        JButton log = new JButton("log");
        log.setBounds(350, 275,50, 50 );
        log.setBackground(new Color(84,84,84,255));
        log.setFont(helvbut);
        log.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        log.setForeground(Color.WHITE);
        log.setFocusPainted(false);
        log.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                varlog = Double.parseDouble(tf1.getText());

                double varlog1 = Math.log(varlog);
                tf1.setText(String.valueOf(varlog1));

            }
        });

        JButton log10 = new JButton("log10");
        log10.setBounds(350, 335,50, 50 );
        log10.setBackground(new Color(84,84,84,255));
        log10.setFont(helvbut);
        log10.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        log10.setForeground(Color.WHITE);
        log10.setFocusPainted(false);
        log10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                varlogb = Double.parseDouble(tf1.getText());

                double varlogb1 = Math.log10(varlogb);
                tf1.setText(String.valueOf(varlogb1));

            }
        });

        JButton naddab = new JButton("A!+B!");
        naddab.setBounds(350, 395,50, 50 );
        naddab.setBackground(new Color(84,84,84,255));
        naddab.setFont(helvbut);
        naddab.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        naddab.setForeground(Color.WHITE);
        naddab.setFocusPainted(false);
        naddab.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                
            }
        });

        JButton summa = new JButton("∑ A/B");
        summa.setBounds(350, 455,50, 50 );
        summa.setBackground(new Color(84,84,84,255));
        summa.setFont(helvbut);
        summa.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        summa.setForeground(Color.WHITE);
        summa.setFocusPainted(false);
        summa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              
                for (int i=1; i<=vara; i++){
                    varsumma = varsumma + varb;
                }
                tf1.setText(String.valueOf(varsumma));
                
            }
        });

        JButton prodd = new JButton("Π A/B");
        prodd.setBounds(350, 515,50, 50 );
        prodd.setBackground(new Color(84,84,84,255));
        prodd.setFont(helvbut);
        prodd.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        prodd.setForeground(Color.WHITE);
        prodd.setFocusPainted(false);
        prodd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              
                for (long i = varb; i <= vara; i++){
                    varprodd = varprodd * i;
                }
                tf1.setText(String.valueOf(varprodd));
                
            }
        });

        JButton factorial = new JButton("n!");
        factorial.setBounds(50, 575,50, 50 );
        factorial.setBackground(new Color(84,84,84,255));
        factorial.setFont(helvbut);
        factorial.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        factorial.setForeground(Color.WHITE);
        factorial.setFocusPainted(false);
        factorial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                
            }
        });

        JButton dsummation = new JButton("∑ A/B ∑ C/D");
        dsummation.setBounds(50, 635,110, 50 );
        dsummation.setBackground(new Color(84,84,84,255));
        dsummation.setFont(helvbut);
        dsummation.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        dsummation.setForeground(Color.WHITE);
        dsummation.setFocusPainted(false);
        dsummation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                
            }
        });

        JButton dprod = new JButton("Π A/B Π C/D");
        dprod.setBounds(170, 620,110, 50 );
        dprod.setBackground(new Color(84,84,84,255));
        dprod.setFont(helvbut);
        dprod.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        dprod.setForeground(Color.WHITE);
        dprod.setFocusPainted(false);
        dprod.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                
            }
        });

        JButton sub = new JButton("-");
        sub.setBounds(230, 335,50, 50 );
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
                        String uptxtfl = tf1.getText() + "-";
                        tf2.setText(uptxtfl);
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
        mult.setBounds(230, 275,50, 50 );
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
                        String uptxtfl = tf1.getText() + "*";
                        tf2.setText(uptxtfl);
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

        

        JButton add = new JButton("+");
        add.setBounds(230, 395,50, 50 );
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
                        String uptxtfl = tf1.getText() + "+";
                        tf2.setText(uptxtfl);
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
        pow.setBounds(290, 215,50, 50 );
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


        //this is not working
        JButton poww = new JButton("X^y^z");
        poww.setBounds(350, 215,50, 50 );
        poww.setBackground(new Color(84,84,84,255));
        poww.setFont(helvbut);
        poww.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        poww.setForeground(Color.WHITE);
        poww.setFocusPainted(false);
        poww.addActionListener(new ActionListener() {
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
        eq.setBounds(230, 455,50, 50 );
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
                            //String uptxtfl = +var1+ +operation+ +var2+;
                            tf2.setText(var1 + " " + operation + " " + var2);
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
        frame1.add(tf2);
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
        frame1.add(neg);
        frame1.add(flr);
        frame1.add(cel);
        frame1.add(sqrt);
        frame1.add(cbrt);
        frame1.add(log);
        frame1.add(log10);
        frame1.add(naddab);
        frame1.add(poww);
        frame1.add(summa);
        frame1.add(prodd);
        frame1.add(dsummation);
        frame1.add(factorial);
        frame1.add(dprod);
        frame1.add(ver);

        frame1.add(img1);
        
        
        frame1.revalidate();
        frame1.repaint();

    }   
}
