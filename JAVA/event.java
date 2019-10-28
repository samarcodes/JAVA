import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class event extends JFrame implements ItemListener
{
	JCheckBox c1,c2;
	JRadioButton b1,b2;
	JLabel l;

	event()
	{
	l=new JLabel("selection");	
	c1=new JCheckBox("ram");
	c2=new JCheckBox("aditi");
	b1=new JRadioButton("male");	
	b2=new JRadioButton("female");
	ButtonGroup rbg=new ButtonGroup();
	rbg.add(b1);
	rbg.add(b2);
	JPanel p1=new JPanel();
	setSize(300,300);
	setVisible(true);
	c1.addItemListener(this);
	c2.addItemListener(this);
	b1.addItemListener(this);
	b2.addItemListener(this);
	p1.add(l);
	p1.add(c1);
	p1.add(c2);
	p1.add(b1);
	p1.add(b2);

	add(p1);
}

public void itemStateChanged(ItemEvent ae)
{
	if((ae.getItem()==b1 || ae.getItem()==c1) && ae.getStateChange()==ItemEvent.SELECTED)
	{
	l.setText("male selected");
	}

	if((ae.getItem()==b2 || ae.getItem()==c2) && ae.getStateChange()==ItemEvent.SELECTED)
	{
	l.setText("female selected");
	}
}
public static void main(String arg[])
{
	new event();
}
}
/*<APPLET code="event.class" HEIGHT=500 WIDTH=500></APPLET>*/      