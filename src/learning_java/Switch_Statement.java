package learning_java;

public class Switch_Statement {

	public static void main(String[] args)
	{
		int m=13;
		String month="";
		
		/*
		 * switch(expr)
		 * {
		 * 		case identifier:
		 * 			block of code
		 * 			break;
		 * 		case identifier:
		 * 			block of code
		 * 			break;
		 * 		default:
		 * 			block of code
		 * 			break;
		 * 
		 * }
		 * 
		 */
		
		switch(m)
		{
			case 1:
				month="Jan";
				break;
				
			case 2:
				month="Feb";
				break;
			
			case 3:
				month="Mar";
				break;
			
			case 4:
				month="April";
				break;
				
			case 5:
				month="May";
				break;
				
			case 6:
				month="June";
				break;
				
			case 7:
				month="July";
				break;
				
			case 8:
				month="Aug";
				break;
				
			case 9:
				month="Sep";
				break;
				
			case 10:
				month="Oct";
				break;
				
			case 11:
				month="Nov";
				break;
				
			case 12:
				month="Dec";
				break;
			
			default:
				month="Not a valid month";
				break;
		}
			
		System.out.println("The month name for "+m+" is "+month);
			
			
		}
	
	}


