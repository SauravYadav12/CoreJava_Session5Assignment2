package mypack;

public class VariableStack implements Stack{

	int out;
	int stack[];
	
	public VariableStack(int size) {
		stack=new int [size];
		out--;
		
	}
	
	@Override
	public void push(int I) {
		if(out==stack.length-1 ){
			int arr[]=new int[stack.length*2];
				for(int i=0; i<stack.length; i++)
				{ 
					arr[i] = stack[i]; 
			 		stack = arr;       
			 		stack[++out] = I;  
			 	}  
			 }    
		      else     
		     stack[++out] = I;  
		}  
	 
	@Override
	  public int pop() { 
		if(out < 0) {      
			System.out.println("Stack will be empty");   
			return 0;     
			}     
		else       
		    return stack[out--];
		}
	}
