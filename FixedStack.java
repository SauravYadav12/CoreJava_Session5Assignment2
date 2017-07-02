package mypack;

public class FixedStack implements  Stack{
int stack [];
int out;

public FixedStack(int size) {
stack=new int[size];
out--;

}
	@Override
	public void push(int I) 
	{
		if(out==stack.length-1)
		{
			System.out.println("stack overflow");
		}
		else {
			stack[++out]=I;
	}
	}

	@Override
	public int pop() {
		if(out<0){
		System.out.println("stack will be empty");
		return 0;

	}
	else {
		return stack[out--];
	
	}
	
}
}