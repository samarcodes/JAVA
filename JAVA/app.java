import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class app extends Applet implements ActionListener
{
int x,y,z;
Button b;
Label l1,l2,l3;
TextField t1,t2,t3;
public void init()
{
l1=new Label("marks 1");
l2=new Label("marks 2");
l3=new Label("total");
b=new Button("add");
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(b);
b.addActionListener(this);
}
}
class test implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
if(e.getSource()=="b")
{
x=Integer.parseInt(t1.getText());
y=Integer.parseInt(t2.getText());
z=x+y;
t3.setText(String.valueof(z));
}
}
}

/*<Applet code="app.class" width=250 height=250></Applet>*/