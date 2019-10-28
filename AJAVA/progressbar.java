import javax.swing.*;
public class progressbar extends JFrame
{
 JProgressBar b;
 progressbar()
 { 
  b=new JProgressBar(0,100);
  b.setBounds(40,40,160,30);
  b.setValue(0);
  b.setStringPainted(true);
  add(b);
  setSize(400,400);
  setLayout(null);
 }
 
 public void fill()
 {
  int i=0;
  while(i<=100)
  {
   b.setValue(i+10);
   try{Thread.sleep(1000);}catch(Exception e){}
   i+=20;
  }
 }

 public static void main(String args[])
 {
  progressbar pb=new progressbar();
  pb.setVisible(true);
  pb.fill();
 }
}