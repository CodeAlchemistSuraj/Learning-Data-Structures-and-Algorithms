import java.util.ArrayList; 



public class MainPushAndPop
{
	public static void main(String[] args) {
	    
	    MyStack pancakeStack = new MyStack();
	    
	    pancakeStack.push(10);
	     pancakeStack.push(20);
	      pancakeStack.push(30);
	      
	      System.out.println("Removing Top element"+ pancakeStack.pop());
	      System.out.println("Removing Top element"+ pancakeStack.pop());

	}
}

class MyStack{
    
    private ArrayList<Integer> stacklist;
    
    public MyStack(){
        
        stacklist = new ArrayList<Integer>();
        
    }
    
    public void push(int val){
        stacklist.add(val);
        System.out.println("Pushed Element "+ val);
    }
    
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Cannot be popped already Empty");
        }
        int lastIndex = stacklist.size()-1;
        return stacklist.remove(lastIndex);
    }
    
    public boolean isEmpty(){
        return stacklist.isEmpty();
    }
    
}
    
    



