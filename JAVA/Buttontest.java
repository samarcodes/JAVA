import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Buttontest extends Applet implements ActionListener
{
Button red,blue,white;
Label hit;
public void init()
{
hit=new Label("hit a button to change screen color");
red=new Button("RED");
white=new Button("WHITE");
blue=new Button("BLUE");
add(hit);
add(red);
add(white);
add(blue);
red.addActionListener(this);
white.addActionListener(this);
blue.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
if(ae.equals("RED"))
{
setBackground(Color.red);
}
if(ae.equals("WHITE"))
{
setBackground(Color.white);
}
if(ae.equals("BLUE"))
{
setBackground(Color.blue);
}
}
}
/*<applet code="Buttontest.class" width=500 height=500></applet>*/