import java.util.Scanner;

class NewThread implements Runnable{
    String name;
    public NewThread(String name){
        this.name = name;
    }

    public void run() {
        while(true){
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println("Thread '" + this.name + "' is working.");
        }
    }
}

public class Thread3 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String name = "";
        while(true){
            name = scan.nextLine();
            Thread thread = new Thread(new NewThread(name));
            thread.start();
        }
    }
}
