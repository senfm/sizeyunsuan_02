package calculate;
/*
 * this is grade summary 
 */
import java.awt.event.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;
public class Summary extends JFrame
{
	static ArrayList<String>  Grade = new ArrayList<String>();
	static ArrayList<String> integer1 = new ArrayList<String>();
 	static ArrayList<String> IntAnswer1 = new ArrayList<String>();
 	static ArrayList<String> fraction1 = new ArrayList<String>();
 	static ArrayList<String> FraAnswer1 = new ArrayList<String>();
	private JButton button1;
	private JButton button2;
	private JLabel label1;
	calculate cal = new calculate();
	int j=-1;
	public  Summary(int grade,final ArrayList<String> Calculate,final ArrayList<String> Answer,
			final BufferedWriter out,int[] Error,final int n,final String c11,final String c22)
	{
		Grade.add(0+"");
		Grade.add(grade+"");
		setTitle("�÷����");
	
		setLocationByPlatform(true);//�����������ô���λ�� 
		label1 = new JLabel("�����" +grade+"�� ",JLabel.LEFT);
		label1.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 18));
		label1.setBounds(50, 100, 200,45);
		add(label1);
		button1 = new JButton("����һ��");
		button1.setBounds(150, 200, 100,25);
		add(button1);
		button2 = new JButton("��״ͼ");
		button2.setBounds(150, 300, 100,25);
		add(button2);

	    JPanel pan = new JPanel();
	    add(pan);
	    button1.addActionListener(new ActionListener()
		{
	    	public  void actionPerformed(ActionEvent  event)
			{
	    		ArrayList<String>  Grade = new ArrayList<String>();
				ArrayList<String> integer1 = new ArrayList<String>();
			 	ArrayList<String> IntAnswer1 = new ArrayList<String>();
			 	ArrayList<String> fraction1 = new ArrayList<String>();
			 	ArrayList<String> FraAnswer1 = new ArrayList<String>();
		    	int i,result;
		    	int value;
		        for(i=0;i<20;i++)
		        {
		        	int num1=(int)(Math.random()*100);//�������һ��0-100������
		            int num2=(int)(Math.random()*100);//�������һ��0-100������
		            int num3=(int)(Math.random()*100);//�������һ��0-100������
		            int num4=(int)(Math.random()*100);//�������һ��0-100������
		            int num5=(int)(Math.random()*100);//�������һ��0-100������
		            int numn=(int)(Math.random()*3);//�������һ��0-3������,0��ʾ3����������1��ʾ4����������2��ʾ5��������,3��ʾ��������
		            switch(numn)
		            {
		               case 0:
		            	   String s=cal.threenum(num1,num2,num3);
		            	   value = cal.jisuan(s);
		            	   if(value==-1)
		            		   i--;
		            	   else
		            	   {
		            		   try {
		            			   out.write(s+value+"\r\n");
		            		   } catch (IOException e) {
		            			   // TODO Auto-generated catch block
		            			   e.printStackTrace();
		            		   } // \r\n��Ϊ����   
		            		   integer1.add(s);
		            		   IntAnswer1.add(value+"");
		            	   }
		            	   break;
		               case 1:
		            	   s=cal.fournum(num1,num2,num3,num4);
		            	   //System.out.println(s);
		           	       value = cal.jisuan(s);
		           	       if(value==-1)
		           	    	   i--;
		           	       else
		           	       {
		           	    	   try {
		           	    		   out.write(s+value+"\r\n");
		           	    	   } catch (IOException e) {
		           	    		   // TODO Auto-generated catch block
		           	    		   e.printStackTrace();
		           	    	   } // \r\n��Ϊ����   
		           	    	   integer1.add(s);
		           	    	   IntAnswer1.add(value+"");
		           	       }
		           	       break;
		               case 2:
		            	   s=cal.fivenum(num1,num2,num3,num4,num5);
		            	   //System.out.println(s);
		           	       value = cal.jisuan(s);
		           	       if(value==-1)
		           	    	   i--;
		           	       else
		           	       {
		           	    	   try {
		           	    		   out.write(s+value+"\r\n");
		           	    	   } catch (IOException e) {
		           	    		   // TODO Auto-generated catch block
		           	    		   e.printStackTrace();
		           	    	   } // \r\n��Ϊ����   
		           	    	   integer1.add(s);
		           	    	   IntAnswer1.add(value+"");
		           	       }
		           	       break;
		            }
		        }
		        int num1,num2,num3;
	            for(i=0;i<20;i++)
	            {
	            	num1=1+(int)(Math.random()*10);//�������һ��0-100������
	            	num2=1+(int)(Math.random()*10);//�������һ��0-100������
	            	num3=1+(int)(Math.random()*10);//�������һ��0-100������
	            	int M,Z;
	            	int x1,x2,x3;
	            	x1=1+(int)(Math.random()*num1);//����һ���ȷ�ĸnum1С�ķ��ӣ�ʵ�������
	            	x2=1+(int)(Math.random()*num2);//����һ���ȷ�ĸnum2С�ķ��ӣ�ʵ�������
	            	x3=1+(int)(Math.random()*num3);//����һ���ȷ�ĸnum3С�ķ��ӣ�ʵ�������
	            	Z=x1*num2*num3+x2*num1*num3+x3*num1*num2;
	            	M=num1*num2*num3;
	            	String d=cal.simplification(Z,M);
	            	String s=x1+"/"+num1+"+"+x2+"/"+num2+"+"+x3+"/"+num3+"=";
	            	fraction1.add(s);
	            	FraAnswer1.add(d);
	            }
	            try {
	            	out.flush();
	            } catch (IOException e) {
	            	// TODO Auto-generated catch block
	            	e.printStackTrace();
	            }
	            setVisible(false); 
	            Select frame = new Select(integer1,fraction1,IntAnswer1,FraAnswer1,out,n,c11,c22);
	            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            frame.setVisible(true);
	            frame.setResizable(false);//���ڵĴ�С ���ɱ� 
	            frame.setLocationRelativeTo(null);//ʹ������ʾ ������ 
			}
		});
	    button2.addActionListener(new ActionListener()
	    {
	    	public  void actionPerformed(ActionEvent  event)
	    	{
	    		if(event.getSource()==button2)
	    		{
	    			setVisible(false); 
	    			Histogram SS = new Histogram(Grade);
	    			JFrame jf=new JFrame();
	    			jf.setTitle("��̬��״ͼ");
	    			jf.add(SS); 
	    			jf.setVisible(true);
	    			int len = Grade.size();
	    			jf.setSize( 30*len+50,700);
	    			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    			jf.setResizable(false);
	    		}
	    	}
	    });	
	}
}