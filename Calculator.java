import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculator implements ActionListener{
	
	boolean isOperatorClicked=false;
	
	String oldValue;

	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton divButton;
	JButton multiplyButton;
	JButton minusButton;
	JButton plusButton;
	JButton clearButton;
	
	
	
	public Calculator() {
		
		jf=new JFrame("Rukku Mwol");
		
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(300, 150);
		
	   displayLabel=new JLabel("");
	   displayLabel.setBounds(30,50,540,50);
	   
	   displayLabel.setBackground(Color.gray);
	   displayLabel.setOpaque(true);
	   displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
	   displayLabel.setForeground(Color.white);
	   jf.add(displayLabel);
	   
	   //7,8,9
	   
	    //JButton
	    sevenButton=new JButton("7");
	    sevenButton.setFont(new Font("Arial",Font.BOLD,40));
	    sevenButton.setBounds(30,130,80,80);
	    sevenButton.addActionListener(this);
	    jf.add(sevenButton);
	    
	    
	    
	    eightButton=new JButton("8");
	    eightButton.setFont(new Font("Arial",Font.BOLD,40));
	    eightButton.setBounds(130,130,85,80);
	    eightButton.addActionListener(this);
	    jf.add(eightButton);
	    
	   
	    
	    nineButton=new JButton("9");
	    nineButton.setFont(new Font("Arial",Font.BOLD,40));
	    nineButton.setBounds(240,130,80,80);
	    nineButton.addActionListener(this);
	    jf.add(nineButton);
	    
	   
	    
	    
	    
	    
	    //4,5,6
	   
	    
	    fourButton=new JButton("4");
	    fourButton.setBounds(30,230,80,80);
	    fourButton.setFont(new Font("Arial",Font.BOLD,40));
	    jf.add(fourButton);
	    fourButton.addActionListener(this);
	    
	    
	    
	    
	    fiveButton=new JButton("5");
	    fiveButton.setBounds(130,230,85,80);
	    fiveButton.addActionListener(this);
	    fiveButton.setFont(new Font("Arial",Font.BOLD,40));
	    jf.add(fiveButton);
	    
	    
	    
	    
	    sixButton=new JButton("6");
	    sixButton.setBounds(240,230,80,80);
	    sixButton.setFont(new Font("Arial",Font.BOLD,40));
	    sixButton.addActionListener(this);
	    jf.add(sixButton);
	    
	    //1,2,3
	    
	    
	    
	   
	    oneButton=new JButton("1");
	    oneButton.setFont(new Font("Arial",Font.BOLD,40));
	    oneButton.setBounds(30,330,80,80);
	    oneButton.addActionListener(this);
	    jf.add(oneButton);
	    
	   
	    
	    
	    
	    
	    twoButton=new JButton("2");
	    twoButton.setBounds(130,330,85,80);
	    twoButton.addActionListener(this);
	    twoButton.setFont(new Font("Arial",Font.BOLD,40));
	    jf.add(twoButton);
	    
	    
	    
	    
	    threeButton=new JButton("3");
	    threeButton.setBounds(240,330,80,80);
	   threeButton.setFont(new Font("Arial",Font.BOLD,40));
	    jf.add(threeButton);
	    threeButton.addActionListener(this);
	    
	    
	    //.,0,=
	    
	    
	    
	    dotButton=new JButton(".");
	    dotButton.setBounds(30,430,80,80);
	    dotButton.setFont(new Font("Arial",Font.BOLD,40));
	    dotButton.addActionListener(this);
	    jf.add(dotButton);
	    
	    
	    
	    zeroButton=new JButton("0");
	    zeroButton.setBounds(130,430,85,80);
	    zeroButton.setFont(new Font("Arial",Font.BOLD,40));
	    zeroButton.addActionListener(this);
	    jf.add(zeroButton);
	    
	    
	    
	    
	    equalButton=new JButton("=");
	    equalButton.setBounds(240,430,80,80);
	    equalButton.setFont(new Font("Arial",Font.BOLD,40));
	    equalButton.addActionListener(this);
	    jf.add(equalButton);
	    
	    
	    
	    //÷
	    
	    divButton=new JButton("÷");
	    divButton.setFont(new Font("Arial",Font.BOLD,40));
	    divButton.setBounds(340,130,120,80);
	    divButton.addActionListener(this);
	    jf.add(divButton);
	    
	    //X
	    
	    multiplyButton=new JButton("X");
	    multiplyButton.setFont(new Font("Arial",Font.BOLD,40));
	    multiplyButton.setBounds(340,230,120,80);
	    multiplyButton.addActionListener(this);
	    jf.add(multiplyButton);
	    
	    //-
	    
	    minusButton=new JButton("-");
	    minusButton.setFont(new Font("Arial",Font.BOLD,40));
	    minusButton.setBounds(340,330,120,80);
	    minusButton.addActionListener(this);
	    jf.add(minusButton);
	    
	    //+


	    plusButton=new JButton("+");
	    plusButton.setFont(new Font("Arial",Font.BOLD,40));
	    plusButton.setBounds(340,430,120,80);
	    plusButton.addActionListener(this);
	    jf.add(plusButton);
	    
	    //clear
	    
	    
	    clearButton=new JButton("C");
	    clearButton.setFont(new Font("Arial",Font.BOLD,40));
	    clearButton.setBounds(490,200,80,310);
	    clearButton.addActionListener(this);
	    jf.add( clearButton);
	    
	    
	    
	    
	    
	   
	    
	 
		
		jf.setVisible(true);
	    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
		
	}
	 
	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	
		
		
		if(e.getSource()==sevenButton) {
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
			
			
			
		
		
		
		
		
		
		}else if(e.getSource()==eightButton) {
			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
			
		
		
		
		
		
		}else if(e.getSource()==nineButton) {
	         if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
			
	
		
		
		
		}else if(e.getSource()==fourButton) {
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
			
	
		
		
		
		
		}else if(e.getSource()==fiveButton) {
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
	
			
			
			
			
			
		}else if(e.getSource()==sixButton) {
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
			
		
		
		
		
		}else if(e.getSource()==fourButton) {
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
			
		
		
		
		
		
		}else if(e.getSource()==threeButton) {
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
			
		
		
		
		
		}else if(e.getSource()==twoButton) {
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
			
		
		
		
		
		}else if(e.getSource()==oneButton) {
			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
			
		
		
		
		
		
		}else if(e.getSource()==zeroButton) {
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
			
		
		
		
		
		
		
		}else if(e.getSource()==dotButton) {
			if(isOperatorClicked) {
				displayLabel.setText(".");
				isOperatorClicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+".");
			}
			
		
		
		}else if(e.getSource()==equalButton) {
			String newValue=displayLabel.getText();
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
			
			float result=oldValueF+newValueF;
			
			displayLabel.setText(result+"");
			
			
		
		
			
		}else if(e.getSource()==divButton) {
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
		
		
		
		
		}else if(e.getSource()==minusButton) {
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
		
		
		
		
		}else if(e.getSource()==plusButton) {
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
		
			
			
		}else if(e.getSource()==multiplyButton) {
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
		
		
		
		
		}else if(e.getSource()==clearButton) {
			displayLabel.setText("");
			 
		}
			
	
	
		
	
	
	}
	
	
	
}
		
	
	

