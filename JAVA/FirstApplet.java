import java.applet.*;
import java .awt.*;

public class FirstApplet extends Applet
{
String msg;
public void init()
{
setForeground(Color.red);
setBackground(Color.green);
msg="inside init() ";
}
public void start()
{
msg+="inside start() ";
}
public void paint(Graphics g)
{
msg+="inside paint()";
g.drawString(msg,10,20);
}
}
/*<APPLET code="FirstApplet.class" WIDTH=500 HEIGHT=500></APPLET>*/