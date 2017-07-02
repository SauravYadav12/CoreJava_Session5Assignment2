package mypack;

class TestStack 
{
public static void main(String[] args) {
	
	 FixedStack fs1 = new FixedStack(0); 
	 FixedStack fs2 = new FixedStack(8);  
	      
	 for(int i=0; i<5; i++) fs1.push(i);     
	 for(int i=0; i<8; i++) fs2.push(i); 

     System.out.println("Stack in fs1:");   
	 for(int i=0; i<5; i++)       
		 System.out.println(fs1.pop());  
	    System.out.println("Stack in fs2:");   
	    for(int i=0; i<8; i++)       
	    	System.out.println(fs2.pop());   
	    
	    VariableStack v1=new VariableStack(5);
	    VariableStack v2=new VariableStack(7);
	    
	    
	    for(int i=0; i<12; i++) v1.push(i);    
	    for(int i=0; i<20; i++) v2.push(i);  
	    System.out.println("Stack in variableStack1:");   
	    for(int i=0; i<12; i++)        
	    	System.out.println(v1.pop());  
	    System.out.println("Stack in variableStack2:");   
	    for(int i=0; i<20; i++)       
	    	System.out.println(v2.pop());   
	    }


}

