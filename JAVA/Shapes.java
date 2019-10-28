import java.awt.*;
import java.applet.*;
public class Shapes extends Applet
{
public void paint(Graphics g)
{
g.drawLine(10,30,50,30);
g.drawRect(50,50,50,30);
g.fillRect(150,50,50,30);
g.drawRoundRect(250,50,50,30,20,20);
g.drawOval(100,100,40,40);
g.fillArc(100,200,200,200,0,180);
}
}
/*<Applet code="Shapes.java" width=500 height=500></Applet>*/