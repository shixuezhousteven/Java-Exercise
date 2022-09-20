import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class BankAccount {
    Integer id;
    float balance;
    ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    public BankAccount(Integer id, float balance) {
        this.id = id;
        this.balance = balance;
    }

    public void deposita(float amount){
        readWriteLock.writeLock().lock();
        try {
            this.balance += amount;
        } finally {
            readWriteLock.writeLock().unlock();
        }

    }
    public void deposit(){
        readWriteLock.writeLock().lock();
        try {
            this.balance += 1;
        } finally {
            readWriteLock.writeLock().unlock();
        }

    }

    public void depositt(){


        this.balance += 1;
    }

    public void withdraw(){
        readWriteLock.writeLock().lock();
        try {
            this.balance -= 1;
        } finally {
            readWriteLock.writeLock().unlock();
        }

    }

}
