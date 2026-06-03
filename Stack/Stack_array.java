package Stack;
class StackArray{
    int [] stack;
    int top;
    
    StackArray(int size){
        stack= new int[size];
        top= -1;
    }
    
    void push(int data){
        if(top == -1){
            System.out.println("Stack overflow");
        }
        else{
            stack[++top]=data;
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack underflow");
        }
        else{
            System.out.println("Popped element :" + stack[top]);
            top--;
        }
    }
    
    // int pop(){ //use int or void as per your requirement
    //      if(top==-1){
    //         System.out.println("Stack underflow");
    //         return  -1;
    //     }
    //     else{
    //         int popped = stack[top];
    //         top--;
    //         return popped;
    //     }
    // }
    
    // int peek(){ //use int or void as per your requirement
    //     return stack[top];
    // }
    
    void peek(){
        System.out.println("Peek element : " + stack[top]);
    }
    
    void display(){
        for(int i= top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
    }
}
public class Stack_array
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}