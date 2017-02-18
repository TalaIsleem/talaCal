package cal;
	import java.awt.BorderLayout;
	import java.awt.GridLayout;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.JTextField;
public class View extends JFrame{
	

	
		private JTextField text;
		private JPanel myPanel1,myPanel2 ;
		public JButton [] operations;
		public JButton [] numbers;
		private static final String[] names ={"+","-","*","/","%","^"};
		private static final String[] nums ={"1","2","3","4","5","6","7","8","9","CE","0","="};
		public String getNum()
		{
			return text.getText();
		}

		public void setResult(String res)
		{
			text.setText(res);
		}
		public double getResult()
		{
			return Double.parseDouble(text.getText());
		}
		public View ()
		{
			
			myPanel1=new JPanel();
			myPanel2=new JPanel();
			
			myPanel1.setLayout(new GridLayout(6,1));
			myPanel2.setLayout(new GridLayout(4,3));

			operations=new JButton [names.length];
			numbers=new JButton [nums.length];
			
			for ( int count = 0; count < names.length; count++ )
			{
			operations[ count ] = new JButton( names[ count ] );

			myPanel1.add( operations[ count ] );
			}
			for ( int count = 0; count < nums.length; count++ )
			{
			numbers[ count ] = new JButton( nums[ count ] );
			myPanel2.add( numbers[ count ] );
			}
				
			text =new JTextField("");
			text.setEditable(false);
			add(text,BorderLayout.NORTH);
			add(myPanel1,BorderLayout.EAST);

			add(myPanel2,BorderLayout.CENTER);
			
		}

		
	
}
