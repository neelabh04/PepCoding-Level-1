public class stackToQueueADD {
    public static class StackToQueueAdapter {
        Stack<Integer> mainS;
        Stack<Integer> helperS;
    
        public StackToQueueAdapter() {
          mainS = new Stack<>();
          helperS = new Stack<>();
        }
    
        int size() {
          return mainS.size();
        }
    
        void add(int val) {
          mainS.push(val);
        }
    
        int remove() {
            if(size() == 0){
                System.out.println("Queue underflow");
                return -1;
            }else{
                while(mainS.size() > 1){
                    helperS.push(mainS.pop());
                }
                int val = mainS.pop();
                while(helperS.size() > 0){
                    mainS.push(helperS.pop());
                }
                return val;
            } 
        }
    
        int peek() {
            if(size() == 0){
                System.out.println("Queue underflow");
                return -1;
            }else{
                while(mainS.size() > 1){
                    helperS.push(mainS.pop());
                }
                int val = mainS.pop();
                mainS.push(val);
                while(helperS.size() > 0){
                    mainS.push(helperS.pop());
                }
                return val;
            } 
        }
    }
}
