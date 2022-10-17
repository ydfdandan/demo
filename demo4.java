package test;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class demo4 {
    public static void main(String[] args){
        Ca ca=new Ca();

    }
}

class Ca extends Frame{
    public Ca()  {
        //4个文本
        TextField num1=new TextField(10);
        TextField num2=new TextField(10);
        TextField num3=new TextField(10);
        TextField num4=new TextField(20);
        Panel panel1=new Panel();
        Panel panel2=new Panel();
        Button button=new Button("=");
        button.addActionListener(new MycalculatorListener(num1,num2,num3,num4));
        panel1.setLayout(new GridLayout(3,1));
        panel1.add(num1);
        panel1.add(num2);
        panel1.add(num3);
        panel2.add(num4);
        setLayout(new FlowLayout());

        add(panel1);
        add(button);
        add(panel2);
        pack();
        setVisible(true);
    }
}

//监听
class MycalculatorListener implements ActionListener{
    private TextField num1,num2,num3,num4;
    public MycalculatorListener(TextField num1,TextField num2,TextField num3,TextField num4){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
        this.num4=num4;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        int n1=Integer.parseInt(num1.getText());
        int n2=Integer.parseInt(num2.getText());
        int n3=Integer.parseInt(num3.getText());
        if(n1==1){
            num4.setText("1");
        }else if(n2==2){
            num4.setText("2");
        }else {
            num4.setText("3");
        }
    }
}