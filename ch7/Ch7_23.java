package ch7;

public class Ch7_23 {

    public static void main(String[] args){
        boolean[] locks = new boolean[100];

        for(int i = 1; i <= 100; i++){
            for(int j = i; j <= 100; j += i){
                    locks[j-1] = !locks[j-1];
            }

        }

        printOpenLocks(locks);
    }

    public static boolean toggleOpen(boolean open){
        return !open;
    }

    public static void printOpenLocks(boolean[] locks){
        System.out.println("The open locks are: ");
        int count = 0;

        for(int i = 0; i < locks.length; i++){
            if(locks[i]){
                System.out.print((i + 1) +", ");
                count++;
                if(count % 10 == 0)
                    System.out.println();
            }
        }
    }
}
