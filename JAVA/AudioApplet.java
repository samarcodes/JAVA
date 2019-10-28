import java.applet.*;
import java.awt.*;
public class AudioApplet extends Applet
{
AudioClip a;
Button play,stop;
public void init()
{
a=getAudioClip(getCodeBase(),"123.wav");
}
public void paint(Graphics g)
{
a.play();
}
}
/*<Applet code="AudioApplet.class" width=500 height=500></Applet>*/