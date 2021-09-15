package lamdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
       //Java 1.7 code

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside old run.");
            }
        };
        new Thread(runnable).start();

        //java 1.8 code

        new Thread(() -> System.out.println("Inside new run.")).start();
    }
}
