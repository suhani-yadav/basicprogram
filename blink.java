import java.awt.*;

class Trafic2 extends Frame
{
Trafic2()
{
	Font f=new Font("Chiller",Font.BOLD,40);
	setFont(f);
	setBackground(Color.cyan);	
	}
	
public void paint(Graphics g)
{
	g.setColor(Color.red);
	g.drawString("Traffic Signal",100,100);
	g.setColor(Color.black);
	g.fillRect(600,165,150,400);
	g.fillArc(575,130,200,200,0,180);
	g.fillRect(650,560,50,100); 
	//colors .....
	for(int i=0;i<20;i++)
	{
	try{Thread.sleep(700);} catch(Exception e){ }
	g.setColor(Color.red);
	g.fillOval(625,190,100,100);
	try{Thread.sleep(700);} catch(Exception e){ }
	g.setColor(Color.yellow);
	g.fillOval(625,310,100,100);
	try{Thread.sleep(700);} catch(Exception e){ }
	g.setColor(Color.green);
	g.fillOval(625,440,100,100);

	try{Thread.sleep(700);} catch(Exception e){ }
	g.setColor(Color.black);
	g.fillRect(600,165,150,400);
	g.fillArc(575,130,200,200,0,180);

   }
}
}
class Trafic
{
	public static void main(String ar[])
	{
    Trafic2 t=new Trafic2();
    t.setVisible(true);
    t.setSize(1200,700);
	t.setBackground(Color.cyan);
	}
}