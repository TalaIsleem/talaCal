package cal;

	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JFrame;
public class Controller {
		private View V;
		private Model M;
		private boolean test=false;
		private double first ;
		private double second; 
		private char oper;
		private double result;
		
		public Controller(View v1,Model m1)
		{
			V=v1;
			M=m1;
			numHandler handler1=new numHandler();
			oprHandler handler2=new oprHandler();
			for ( int count = 0; count < V.operations.length; count++ )
			{
			V.operations[ count ].addActionListener(handler2);
			}
			for ( int count = 0; count < V.numbers.length; count++ )
			{
			V.numbers[ count ].addActionListener(handler1);
			
			}
		
		}
			private class numHandler implements ActionListener
			{
				public void actionPerformed( ActionEvent event )
				{
					String s="";
					if(test)
					{
						V.setResult("");
						test=false;
					}
					if(event.getSource()==V.numbers[0])
						s=V.getNum()+"1";
					else if(event.getSource()==V.numbers[1])
						s=V.getNum()+"2";
					else if(event.getSource()==V.numbers[2])
						s=V.getNum()+"3";
					else if(event.getSource()==V.numbers[3])
						s=V.getNum()+"4";
					else if(event.getSource()==V.numbers[4])
						s=V.getNum()+"5";
					else if(event.getSource()==V.numbers[5])
						s=V.getNum()+"6";
					else if(event.getSource()==V.numbers[6])
						s=V.getNum()+"7";
					else if(event.getSource()==V.numbers[7])
						s=V.getNum()+"8";
					else if(event.getSource()==V.numbers[8])
						s=V.getNum()+"9";
					else if(event.getSource()==V.numbers[9])
						s="";
					else if(event.getSource()==V.numbers[10])
						s=V.getNum()+"0";
					else if(event.getSource()==V.numbers[11])
					{
						test=true;
					second =Double.parseDouble(V.getNum());
					M.calculate(first, second, oper);
					result=M.get_Result();
					s=""+result;
					}
					V.setResult(s);
					
				}
			}
			private class oprHandler implements ActionListener
			{
				public void actionPerformed( ActionEvent event )
				{ 	first=Double.parseDouble(V.getNum());
					if(event.getSource()==V.operations[0])
						oper='+';
					else if(event.getSource()==V.operations[1])
						oper='-';
					else if(event.getSource()==V.operations[2])
						oper='*';
					else if(event.getSource()==V.operations[3])
						oper='/';
					else if(event.getSource()==V.operations[4])
						oper='%';
					else if(event.getSource()==V.operations[5])
						oper='^';
					
					V.setResult("");
				}
			}
		
		
			public static void main(String[] args)
			{
				View V=new View();
				Model M=new Model();
				Controller C;
				C=new Controller(V,M);
				
				V.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
				V.setSize( 400, 400 ); // set frame size
				V.setVisible( true );
				
				
			}
	

}
