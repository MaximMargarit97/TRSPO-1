import java.util.Scanner;
class ActionManager {
    public synchronized void compute(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scan.nextDouble();
        System.out.println(num1 + num2);
    }
    public synchronized void print(){
        System.out.println("I am working");
    }
}
class ThreadSumComputation extends Thread {
    ActionManager sum = null;
    public ThreadSumComputation(ActionManager sum){
        this.sum = sum;
    }
    public void run() {
        while(true){
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            this.sum.compute();
        }
    }
}
class ThreadMessagePrint extends Thread{
    ActionManager message = null;
    public ThreadMessagePrint(ActionManager message){
        this.message = message;
    }

    public void run(){
        while(true){
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            this.message.print();
        }
    }
}
public class Thread2 {
    public static void main(String args[])
    {
        ActionManager action = new ActionManager();

        ThreadSumComputation thread1 = new ThreadSumComputation(action);
        ThreadMessagePrint thread2 = new ThreadMessagePrint(action);

        thread1.start();
        thread2.start();
    }
}
