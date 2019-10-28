import java.applet.*;
import java.awt.*;
public class ImageApplet extends Applet
{
Image i;
public void init()
{
i=getImage(getDocumentBase(),"ImageApplet1.jpg");
}
public void paint(Graphics g)
{
g.drawImage(i,0,0,i.getWidth(this),i.getHeight(this),this);
}
}
/*<Applet code="ImageApplet.class" width=500 height=500></Applet>*/