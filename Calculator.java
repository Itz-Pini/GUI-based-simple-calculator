import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator implements ActionListener
{
    
    double num1=0,num2=0,result=0;
    int c;
    
    JFrame frame=new JFrame("Calculator");
    JLabel label=new JLabel();
    JTextField textField=new JTextField();
    JRadioButton on=new JRadioButton("On");
    JRadioButton off=new JRadioButton("Off");
    JButton but0=new JButton("0");
    JButton but1=new JButton("1");
    JButton but2=new JButton("2");
    JButton but3=new JButton("3");    
    JButton but4=new JButton("4");
    JButton but5=new JButton("5");
    JButton but6=new JButton("6");
    JButton but7=new JButton("7");
    JButton but8=new JButton("8");
    JButton but9=new JButton("9");
    JButton bdot=new JButton(".");
    JButton bclear=new JButton("C");
    JButton bdelete=new JButton("DEL");
    JButton bequal=new JButton("=");
    JButton bmul=new JButton("*");
    JButton bdiv=new JButton("/");
    JButton badd=new JButton("+");
    JButton bsub=new JButton("-");
    JButton bsquare=new JButton("x\u00B2");
    JButton breciprocal=new JButton("1/x");
    JButton bsqr=new JButton("\u221A");

    Calculator()
    {
        preparegui();
        addComponents();
        addActionEvent();
    }

    public void preparegui()
    {
        frame.setSize(305,510);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void addComponents()
    {
        label.setBounds(250,0,50,50);
        label.setForeground(Color.white);
        frame.add(label);

        textField.setBounds(10,40,270,40);
        textField.setFont(new Font("Arial",Font.BOLD,20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        on.setBounds(10,95,60,40);
        on.setSelected(true);
        on.setFont(new Font("Arial",Font.BOLD,14));
        on.setBackground(Color.black);
        on.setForeground(Color.white);
        on.setFocusable(false);
        frame.add(on);

        off.setBounds(10,120,60,40);
        off.setSelected(false);
        off.setFont(new Font("Arial",Font.BOLD,14));
        off.setBackground(Color.black);
        off.setForeground(Color.white);
        off.setFocusable(false);
        frame.add(off);

        ButtonGroup bg=new ButtonGroup();
        bg.add(on);
        bg.add(off);

        but7.setBounds(10,230,60,40);
        but7.setFont(new Font("Arial",Font.BOLD,20));
        but7.setFocusable(false);
        frame.add(but7);

        but8.setBounds(80,230,60,40);
        but8.setFont(new Font("Arial",Font.BOLD,20));
        but8.setFocusable(false);
        frame.add(but8);

        but9.setBounds(150,230,60,40);
        but9.setFont(new Font("Arial",Font.BOLD,20));
        but9.setFocusable(false);
        frame.add(but9);

        but4.setBounds(10,290,60,40);
        but4.setFont(new Font("Arial",Font.BOLD,20));
        but4.setFocusable(false);
        frame.add(but4);

        but5.setBounds(80,290,60,40);
        but5.setFont(new Font("Arial",Font.BOLD,20));
        but5.setFocusable(false);
        frame.add(but5);

        but6.setBounds(150,290,60,40);
        but6.setFont(new Font("Arial",Font.BOLD,20));
        but6.setFocusable(false);
        frame.add(but6); 
        
        but1.setBounds(10,350,60,40);
        but1.setFont(new Font("Arial",Font.BOLD,20));
        but1.setFocusable(false);
        frame.add(but1);

        but2.setBounds(80,350,60,40);
        but2.setFont(new Font("Arial",Font.BOLD,20));
        but2.setFocusable(false);
        frame.add(but2);

        but3.setBounds(150,350,60,40);
        but3.setFont(new Font("Arial",Font.BOLD,20));
        but3.setFocusable(false);
        frame.add(but3);

        bdot.setBounds(150,410,60,40);
        bdot.setFont(new Font("Arial",Font.BOLD,20));
        bdot.setFocusable(false);
        frame.add(bdot);

        but0.setBounds(10,410,130,40);
        but0.setFont(new Font("Arial",Font.BOLD,20));
        but0.setFocusable(false);
        frame.add(but0);

        bequal.setBounds(220,350,60,100);
        bequal.setFont(new Font("Arial",Font.BOLD,20));
        bequal.setBackground(new Color(239,188,2));
        bequal.setFocusable(false);
        frame.add(bequal);

        bdiv.setBounds(220,110,60,40);
        bdiv.setFont(new Font("Arial",Font.BOLD,20));
        bdiv.setBackground(new Color(239,188,2));
        bdiv.setFocusable(false);
        frame.add(bdiv);

        bsqr.setBounds(10,170,60,40);
        bsqr.setFont(new Font("Arial",Font.BOLD,18));
        bsqr.setFocusable(false);
        frame.add(bsqr);

        bmul.setBounds(220,230,60,40);
        bmul.setFont(new Font("Arial",Font.BOLD,20));
        bmul.setBackground(new Color(239,188,2));
        bmul.setFocusable(false);
        frame.add(bmul);

        bsub.setBounds(220,170,60,40);
        bsub.setFont(new Font("Arial",Font.BOLD,20));
        bsub.setBackground(new Color(239,188,2));
        bsub.setFocusable(false);
        frame.add(bsub);
        
        badd.setBounds(220,290,60,40);
        badd.setFont(new Font("Arial",Font.BOLD,20));
        badd.setBackground(new Color(239,188,2));
        badd.setFocusable(false);
        frame.add(badd);

        bsquare.setBounds(80,170,60,40);
        bsquare.setFont(new Font("Arial",Font.BOLD,20));
        bsquare.setFocusable(false);
        frame.add(bsquare);

        breciprocal.setBounds(150,170,60,40);
        breciprocal.setFont(new Font("Arial",Font.BOLD,15));
        breciprocal.setFocusable(false);
        frame.add(breciprocal);

        bdelete.setBounds(150,110,60,40);
        bdelete.setFont(new Font("Arial",Font.BOLD,12));
        bdelete.setBackground(Color.red);
        bdelete.setForeground(Color.white);
        bdelete.setFocusable(false);
        frame.add(bdelete);

        bclear.setBounds(80,110,60,40);
        bclear.setFont(new Font("Arial",Font.BOLD,12));
        bclear.setBackground(Color.red);
        bclear.setForeground(Color.white);
        bclear.setFocusable(false);
        frame.add(bclear);
        
    }

    public void addActionEvent()
    {
        on.addActionListener(this);
        off.addActionListener(this);
        bclear.addActionListener(this);
        bdelete.addActionListener(this);
        bdiv.addActionListener(this);
        bsqr.addActionListener(this);
        bsquare.addActionListener(this);
        breciprocal.addActionListener(this);
        bsub.addActionListener(this);
        but7.addActionListener(this);
        but8.addActionListener(this);
        but9.addActionListener(this);
        bmul.addActionListener(this);
        but4.addActionListener(this);
        but5.addActionListener(this);
        but6.addActionListener(this);
        badd.addActionListener(this);
        but1.addActionListener(this);
        but2.addActionListener(this);
        but3.addActionListener(this);
        bequal.addActionListener(this);
        but0.addActionListener(this);
        bdot.addActionListener(this);

    }

    public static void main(String[] args) 
    {
        Calculator cal=new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object s=e.getSource();
        if(s==on)
        {
            enable();
        }
        else if(s==off)
        {
            disable();
        }
        else if(s==bclear)
        {
            label.setText("");
            textField.setText("");

        }
        else if(s==bdelete)
        {
            int l=textField.getText().length(); 
            int n=l-1;
            if(l>0)
            {
                StringBuilder bk=new StringBuilder(textField.getText());
                bk.deleteCharAt(n);
                textField.setText(bk.toString());
            }
            if(textField.getText().endsWith(""));
            label.setText("");
        }
        else if(s==but0)
        {
            if(textField.getText().equals("0"))
            {
                return;
            }
            else
            {
                textField.setText(textField.getText()+"0");
            }
        }
        else if(s==but1)
        {
            textField.setText(textField.getText()+"1");

        }
        else if(s==but2)
        {
            textField.setText(textField.getText()+"2");

        }
        else if(s==but3)
        {
            textField.setText(textField.getText()+"3");

        }
        else if(s==but4)
        {
            textField.setText(textField.getText()+"4");

        }
        else if(s==but5)
        {
            textField.setText(textField.getText()+"5");

        }
        else if(s==but6)
        {
            textField.setText(textField.getText()+"6");

        }
        else if(s==but7)
        {
            textField.setText(textField.getText()+"7");

        }
        else if(s==but8)
        {
            textField.setText(textField.getText()+"8");

        }
        else if(s==but9)
        {
            textField.setText(textField.getText()+"9");

        }
        else if(s==bdot)
        {
            if(textField.getText().contains("."))
            {
                return;
            }
            else
            {
                textField.setText(textField.getText()+".");
            }
        }
        else if(s==badd)
        {
            String str=textField.getText();
            num1=Double.parseDouble(textField.getText());
            c=1;
            textField.setText("");
            label.setText(str + "+");
        }
        else if(s==bsub)
        {
            String str=textField.getText();
            num1=Double.parseDouble(textField.getText());
            c=2;
            textField.setText("");
            label.setText(str + "-");
        }
        else if(s==bmul)
        {
            String str=textField.getText();
            num1=Double.parseDouble(textField.getText());
            c=3;
            textField.setText("");
            label.setText(str + "*");
        }
        else if(s==bdiv)
        {
            String str=textField.getText();
            num1=Double.parseDouble(textField.getText());
            c=4;
            textField.setText("");
            label.setText(str + "/");
        }
        else if(s==bsquare)
        {
            num1= Double.parseDouble(textField.getText());
            double sq=Math.pow(num1, 2);
            String str=Double.toString(sq);
            if(str.endsWith(".0"))
            {
                textField.setText(str.replace(".0", ""));
            }
            else
            {
                textField.setText(str);
            }
        }
        else if(s==bsqr)
        {
            num1=Double.parseDouble(textField.getText());
            double sqr=Math.sqrt(num1);
            textField.setText(Double.toString(sqr));
        }
        else if(s==breciprocal)
        {
            num1= Double.parseDouble(textField.getText());
            double rc=1/num1;
            String str=Double.toString(rc);
            if(str.endsWith(".0"))
            {
                textField.setText(str.replace(".0", ""));
            }
            else
            {
                textField.setText(str);
            }
        }
        else if(s==bequal)
        {
            num2=Double.parseDouble(textField.getText());
            switch (c) 
            {
                case 1:result=num1+num2;
                    break;
                case 2:result=num1-num2;
                    break;
                case 3:result=num1*num2;
                    break;
                case 4:result=num1/num2;
                    break;
            }
            if(Double.toString(result).endsWith(".0"))
            {
                textField.setText(Double.toString(result).replace(".0", ""));
            }
            else
            {
                textField.setText(Double.toString(result));
            }
            label.setText("");
            num1=result;

        }
    }

    public void enable()
    {   
        on.setEnabled(false);
        off.setEnabled(true);
        textField.setEnabled(true);
        label.setEnabled(true);
        bclear.setEnabled(true);
        bdelete.setEnabled(true);
        bdiv.setEnabled(true);
        bsqr.setEnabled(true);
        bsquare.setEnabled(true);
        breciprocal.setEnabled(true);
        bsub.setEnabled(true);
        but7.setEnabled(true);
        but8.setEnabled(true);
        but9.setEnabled(true);
        bmul.setEnabled(true);
        but4.setEnabled(true);
        but5.setEnabled(true);
        but6.setEnabled(true);
        badd.setEnabled(true);
        but1.setEnabled(true);
        but2.setEnabled(true);
        but3.setEnabled(true);
        bequal.setEnabled(true);
        but0.setEnabled(true);
        bdot.setEnabled(true);

    }

    public void disable()
    {
        on.setEnabled(true);
        off.setEnabled(false);
        textField.setEnabled(false);
        label.setEnabled(false);
        label.setText("");
        textField.setText("");
        bclear.setEnabled(false);
        bdelete.setEnabled(false);
        bdiv.setEnabled(false);
        bsqr.setEnabled(false);
        bsquare.setEnabled(false);
        breciprocal.setEnabled(false);
        bsub.setEnabled(false);
        but7.setEnabled(false);
        but8.setEnabled(false);
        but9.setEnabled(false);
        bmul.setEnabled(false);
        but4.setEnabled(false);
        but5.setEnabled(false);
        but6.setEnabled(false);
        badd.setEnabled(false);
        but1.setEnabled(false);
        but2.setEnabled(false);
        but3.setEnabled(false);
        bequal.setEnabled(false);
        but0.setEnabled(false);
        bdot.setEnabled(false);
    }

}