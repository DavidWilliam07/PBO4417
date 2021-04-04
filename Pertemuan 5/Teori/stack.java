import java.util.Stack;

public class stack {
    static Stack<Object> list = new Stack<>();
    public int currentIndex=-1;
    
    public void push(Object object){
        list.add(object);
        currentIndex++;
    }
    
    public Object pop(){
        Object object=list.remove(currentIndex);
        currentIndex--;
        return object;
    }
    
    public Object peek(){
        return list.get(currentIndex);
    }
    
    public void clear(){
        list.clear();
        currentIndex=-1;
    }
}

class hitung extends stack {
    static int count(){
        return list.size();
    }
}