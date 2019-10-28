import java.applet.*;
import java.awt.*;
public class AppletSum extends Applet
{
public void paint(Graphics g)
{
int value1=10;
int value2=20;
int sum=value1+value2;
String s="Sum: "+Integer.toString(sum);
g.drawString(s,100,100);
}
}
/*<Applet code="AppletSum.class" width=250 height=250></Applet>*/