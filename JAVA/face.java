import java.applet.*;
import java.awt.*;
public class face extends Applet
{
public void paint(Graphics g)
{
g.drawOval(40,40,150,120);
g.drawOval(57,75,30,20);
g.drawOval(110,75,30,20);
g.drawOval(68,81,10,10);
g.drawOval(121,81,10,10);
g.drawOval(85,100,30,30);
g.fillArc(75,130,60,40,0,180);
g.drawOval(25,92,15,30);
g.drawOval(190,92,10,30);
}
}
/*<Applet code="face.class" width=500 height=500></Applet>*/