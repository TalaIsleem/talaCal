package cal;

public class Model {
		private double res ;
		
		public void calculate(double first,double second,char oper)throws ArithmeticException
		{
			double temp=0;
			switch (oper)
			{
			case'+':
				temp=first+second;
				break;
			case '-':
				temp=first-second;
				break;
			case'/':
				try{
				temp=first/second;}
				catch( ArithmeticException arithmeticException)
				{
					System.err.printf( "\nException: %s\n", arithmeticException );
					System.out.println(
							"Zero is an invalid denominator. Please try again.\n" );
				}
				break;
			case'*':
				temp=first*second;
				break;
			case'%':
				temp=first%second;
				break;
			case '^':
				temp=Math.pow(first,second);
				break;
			}
			set_Result(temp);	
		}
		private void set_Result(double s)
		{
			res=s;
		}
		public double get_Result()
		{
			return res;
		}
		
	


}
