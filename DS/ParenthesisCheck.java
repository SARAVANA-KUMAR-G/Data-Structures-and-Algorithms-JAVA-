public class ParenthesisCheck {
    
    int top;
    char[] arr;

    ParenthesisCheck(int size){
        this.top = -1;
        this.arr = new char[size];
    }

    // Insert / Push Operation
    void push(char data){
        if(top >= -1){
            arr[top+1] = data;
            top++;
        }
    }

    // Delete / Pop Operation
    char pop(){
        if(top != -1){
            char poppedElement = arr[top];
            top--;
            return poppedElement;
        }
        return '0';
    }

    void isVaild(String str){
        for(int i = 0; i < str.length() ; i++){
            // System.out.println("Ap: "+str.charAt(i));
            char current;
            if(str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')'){
                char popped = pop();
                // System.out.println("Bp: "+popped);
                if(popped == '{' && str.charAt(i) == '}'){
                    continue;
                }
                else if(popped == '[' && str.charAt(i) == ']'){
                    continue;
                }
                else if(popped == '(' && str.charAt(i) == ')'){
                    continue;
                }
                else{
                    System.out.println("Unbalanced");
                    return ;
                }
            }

            current = str.charAt(i);
            if(current == '{' || current == '[' || current == '('){
                push(current);
            }
            
        }
        System.out.println("Balanced");
    }

    // Check if the Stack is Empty or Not
    void isEmpty(){
        if(top == -1){
            System.out.println("Stack is Empty!");
            return ;
        }
        System.out.println("Stack is not Empty!");
    }

    // Display Stack
    void display(){
        if(top != -1){
            for (int i = top; i >= 0; i--) {
                System.out.println("|"+arr[i]+"|");
                System.out.println("----");
            }
            return ;
        }
        System.out.println("Stack is Empty!");
    }

    public static void main(String[] args) {
        
        ParenthesisCheck checker = new ParenthesisCheck(10);

        checker.isVaild("{{[(--))]}}");

        // checker.display();

    }
}
