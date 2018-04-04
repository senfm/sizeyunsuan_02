package calculate;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import java.util.zip.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JFrame;
public class Test extends JFrame  implements Runnable 
{
	public static final int DEFAULT_WIDTH = 450;
	public static final int DEFAULT_HEIGHT = 800;
	private JButton button1;
	private JButton button2;
	private JLabel label1;
	private JTextField field11;
	private JLabel label11;
	private JTextField field12;
	private JLabel label12;
	private JTextField field13;
	private JLabel label13;
	private JTextField field14;
	private JLabel label14;
	private JTextField field21;
	private JLabel label21;
	private JTextField field22;
	private JLabel label22;
	private JTextField field23;
	private JLabel label23;
	private JTextField field24;
	private JLabel label24;
	private JTextField field31;
	private JLabel label31;
	private JTextField field32;
	private JLabel label32;
	private JTextField field33;
	private JLabel label33;
	private JTextField field34;
	private JLabel label34;
	private JTextField field41;
	private JLabel label41;
	private JTextField field42;
	private JLabel label42;
	private JTextField field43;
	private JLabel label43;
	private JTextField field44;
	private JLabel label44;
	private JTextField field51;
	private JLabel label51;
	private JTextField field52;
	private JLabel label52;
	private JTextField field53;
	private JLabel label53;
	private JTextField field54;
	private JLabel label54;
	private JPanel panel;
	int n=1;
	final ArrayList<String> c  = new ArrayList<String>();//整数
	int[] Error1 = new int[21];
	//=========================================================
	public int time = 1;	
	boolean isRun = true;
	public void run() 
	{	
		while(isRun)
		{			
			try {
				//倒计时	
				time++;
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public Test( final ArrayList<String> integer,final ArrayList<String> intAnswer,
			final BufferedWriter out,final String c11,final String c22,final int n ) 
	{
		for(int i=0;i<20;i++)
		{
			Error1[i]=-1;
		}
		TimerThread df2=new TimerThread();
		df2.setVisible(true);
		df2.setAlwaysOnTop(true);
		final Thread thread1=new Thread(df2);
		thread1.start(); 
		setTitle("整数四则运算测试");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setLocationByPlatform(true);//可以自行设置窗口位置
        label1 = new JLabel(c11+"  "+c22+"的第"+n+"轮测试：",JLabel.LEFT);
        label1.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 18));
        label1.setBounds(100, 30, 300,45);
        add(label1);
      
        label11 = new JLabel((String) integer.get(0),JLabel.LEFT);
        label11.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 18));
        label11.setBounds(100, 60, 200,45);
        add(label11);
        field11 = new JTextField();
        field11.setColumns(20);
        field11.setBounds(250, 70, 80,25);
        add(field11);
     
        label12 = new JLabel((String) integer.get(1),JLabel.LEFT);
        label12.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 18));
        label12.setBounds(100, 90, 200,45);
        add(label12);
        field12 = new JTextField();
        field12.setColumns(20);
        field12.setBounds(250, 100, 80,25);
        add(field12);
      
        label13 = new JLabel((String) integer.get(2),JLabel.LEFT);
        label13.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 18));
        label13.setBounds(100, 120, 200,45);
        add(label13);
        field13 = new JTextField();
        field13.setColumns(20);
        field13.setBounds(250, 130, 80,25);
        add(field13);
     
        label14 = new JLabel((String) integer.get(3),JLabel.LEFT);
        label14.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 18));
        label14.setBounds(100, 150, 200,45);
        add(label14);
        field14 = new JTextField();
        field14.setColumns(20);
        field14.setBounds(250, 160, 80,25);
        add(field14);
      
        label21 = new JLabel((String) integer.get(4),JLabel.LEFT);
        label21.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 18));
        label21.setBounds(100, 180, 200,45);
        add(label21);
        field21 = new JTextField();
        field21.setColumns(20);
        field21.setBounds(250, 190, 80,25);
        add(field21);
     
        label22 = new JLabel((String) integer.get(5),JLabel.LEFT);
        label22.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 18));
        label22.setBounds(100, 210, 200,45);
        add(label22);
        field22 = new JTextField();
        field22.setColumns(20);
        field22.setBounds(250, 220, 80,25);
        add(field22);
      
        label23 = new JLabel((String) integer.get(6),JLabel.LEFT);
        label23.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 18));
        label23.setBounds(100, 240, 200,45);
        add(label23);
        field23 = new JTextField();
        field23.setColumns(20);
        field23.setBounds(250, 250, 80,25);
        add(field23);
     
        label24 = new JLabel((String) integer.get(7),JLabel.LEFT);
        label24.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 18));
        label24.setBounds(100, 270, 200,45);
        add(label24);
        field24 = new JTextField();
        field24.setColumns(20);
        field24.setBounds(250, 280, 80,25);
        add(field24);
      
        label31 = new JLabel((String) integer.get(8),JLabel.LEFT);
        label31.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 18));
        label31.setBounds(100, 300, 200,45);
        add(label31);
        field31 = new JTextField();
        field31.setColumns(20);
        field31.setBounds(250, 310, 80,25);
        add(field31);
     
        label32 = new JLabel((String) integer.get(9),JLabel.LEFT);
        label32.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 18));
        label32.setBounds(100, 330, 200,45);
        add(label32);
        field32 = new JTextField();
        field32.setColumns(20);
        field32.setBounds(250, 340, 80,25);
        add(field32);
      
        label33 = new JLabel((String) integer.get(10),JLabel.LEFT);
        label33.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 18));
        label33.setBounds(100, 360, 200,45);
        add(label33);
        field33 = new JTextField();
        field33.setColumns(20);
        field33.setBounds(250, 370, 80,25);
        add(field33);
     
        label34 = new JLabel((String) integer.get(11),JLabel.LEFT);
        label34.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 18));
        label34.setBounds(100, 390, 200,45);
        add(label34);
        field34 = new JTextField();
        field34.setColumns(20);
        field34.setBounds(250, 400, 80,25);
        add(field34);
      
        label41 = new JLabel((String) integer.get(12),JLabel.LEFT);
        label41.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 18));
        label41.setBounds(100, 420, 200,45);
        add(label41);
	    field41 = new JTextField();
	    field41.setColumns(20);
	    field41.setBounds(250, 430, 80,25);
	    add(field41);
     
	    label42 = new JLabel((String) integer.get(13),JLabel.LEFT);
	    label42.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 18));
	    label42.setBounds(100, 450, 200,45);
	    add(label42);
	    field42 = new JTextField();
	    field42.setColumns(20);
	    field42.setBounds(250, 460, 80,25);
	    add(field42);
      
	    label43 = new JLabel((String) integer.get(14),JLabel.LEFT);
	    label43.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 18));
	    label43.setBounds(100, 480, 200,45);
	    add(label43);
	    field43 = new JTextField();
	    field43.setColumns(20);
	    field43.setBounds(250, 490, 80,25);
	    add(field43);
     
	    label44 = new JLabel((String) integer.get(15),JLabel.LEFT);
	    label44.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 18));
	    label44.setBounds(100, 510, 200,45);
	    add(label44);
	    field44 = new JTextField();
	    field44.setColumns(20);
	    field44.setBounds(250, 520, 80,25);
	    add(field44);
      
	    label51 = new JLabel((String) integer.get(16),JLabel.LEFT);
	    label51.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 18));
	    label51.setBounds(100, 540, 200,45);
	    add(label51);
	    field51 = new JTextField();
	    field51.setColumns(20);
	    field51.setBounds(250, 550, 80,25);
	    add(field51);
     
	    label52 = new JLabel((String) integer.get(17),JLabel.LEFT);
	    label52.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 18));
	    label52.setBounds(100, 570, 200,45);
	    add(label52);
	    field52 = new JTextField();
	    field52.setColumns(20);
	    field52.setBounds(250, 580, 80,25);
	    add(field52);
      
	    label53 = new JLabel((String) integer.get(18),JLabel.LEFT);
	    label53.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 18));
	    label53.setBounds(100, 600, 200,45);
	    add(label53);
	    field53 = new JTextField();
	    field53.setColumns(20);
	    field53.setBounds(250, 610, 80,25);
	    add(field53);
     
	    label54 = new JLabel((String) integer.get(19),JLabel.LEFT);
	    label54.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 18));
	    label54.setBounds(100, 630, 200,45);
	    add(label54);
	    field54 = new JTextField();
	    field54.setColumns(20);
	    field54.setBounds(250, 640, 80,25);
	    add(field54);
      
	    button1 = new JButton("确定");
	    button1.setBounds(120, 680, 180,25);
	    add(button1);
	    panel = new JPanel();
	    add(panel);
	    button1.addActionListener(new ActionListener()
		{
	    	public  void actionPerformed(ActionEvent  event)
			{
	    		thread1.stop();
	    		c.add(field11.getText());
				c.add(field12.getText());
				c.add(field13.getText());
				c.add(field14.getText()); 
				c.add( field21.getText());
				c.add(field22.getText()); 
				c.add( field23.getText());
				c.add(field24.getText());
				c.add( field31.getText());
				c.add(field32.getText());
				c.add(field33.getText()); 
				c.add(field34.getText()); 
				c.add(field41.getText()); 
				c.add(field42.getText()); 
				c.add(field43.getText()); 
				c.add( field44.getText());
				c.add(field51.getText()); 
				c.add( field52.getText());
				c.add( field53.getText());
				c.add( field54.getText());
				int j=0,exactly=0;
				for(int i=0;i<20;i++)
				{
					if(c.get(i).equals(intAnswer.get(i)))
					{
						exactly++;//正确个数 
					}
					else
					{
						Error1[j]=i;
						j++;
					}
				}
		        	  
		        int grade = exactly*5;
		        if(event.getSource()==button1)
				{
		        	setVisible(false);
		            int x=n+1;
		            Summary  ss =  new  Summary(grade,integer,intAnswer,out,Error1,x,c11,c22);
		            ss.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		           	ss.setVisible(true);
		           	ss.setLocationRelativeTo(null);	
				}
			}
		});
	}
}