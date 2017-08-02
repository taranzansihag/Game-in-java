import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Arc extends Applet implements ActionListener{
 int x,flagx,flagy,y,a,b,c,d,z;
 Button b0,b1,b2,b3;
 public void init(){
  z=10;
  x=0;
  y=0;
  a=0+a;
  b=90+b;
  c=180+c;
  d=270+d;
  b0=new Button("<");
  b1=new Button("-");
  b2=new Button("+");
  b3=new Button(">");
  add(b0);
  add(b1);
  add(b2);
  add(b3);
  b0.addActionListener(this);
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e){ 
    if(e.getSource()==b1){
	        z++;
      }			
	if(e.getSource()==b2){
            z--;
	  }
	if(e.getSource()==b0){
	     flagx=1;
		 
	  }
    if(e.getSource()==b3){
	     flagx=0;
		 
	  }
			
 }
 public void paint(Graphics g){
  g.setColor(Color.red);
  g.fillArc(x,y,100,100,a,90);
  g.setColor(Color.green);
  g.fillArc(x,y,100,100,b,90);
  g.setColor(Color.yellow);
  g.fillArc(x,y,100,100,c,90);
  g.setColor(Color.blue);
  g.fillArc(x,y,100,100,d,90);
  setBackground(Color.pink);
  
  if(x==0)
     flagx=0;
   if(x==900)
     flagx=1;
  if(y==0)
     flagy=0;
  if(y==400)
     flagy=1;
	 
 if(flagx==0)
  {
    x++;
	a--;
	b--;
	c--;
	d--;
  } 
  else {
	  x--;
	  a++;
	  b++;
	  c++;
	  d++;
	}
  if(flagy==0)
    {
	  y++;
	}
  else
     {
	   y--;
	 }
         try{
		   
			   Thread.sleep(z);
           }
        catch(InterruptedException e){}
		repaint();
 }
  /*<applet code="Arc.java" width=1000 height=500> </applet>*/
} 