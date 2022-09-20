import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args){
        ExecutorService excutorService = Executors.newFixedThreadPool(10);

        BankAccount ba = new BankAccount(1,0);

        IntStream.range(0,1000).forEach(i -> excutorService.submit(ba::deposit));
        IntStream.range(0,600).forEach(i -> excutorService.submit(ba::withdraw));
        excutorService.shutdown();
        while (!excutorService.isTerminated());

        System.out.println(ba.balance);
    }


}



