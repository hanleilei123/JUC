package synchronizedTest;

public class SyncTest {

    public static void main(String[] args) {



        myPrint();

    }

    private static void myPrint() {
        synchronized (SyncTest.class){
            System.out.println("字节码查看");
        }
    }
}
