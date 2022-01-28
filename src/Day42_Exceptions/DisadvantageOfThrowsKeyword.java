package Day42_Exceptions;

public class DisadvantageOfThrowsKeyword {
    public static void main(String[] args) {

        System.out.println("Hello");

        //sleep(2.5); //throws - the caller is now responsible for handling this exception

        System.out.println("Hello World");

        System.out.println("---------------------");

        System.out.println("Hello");

        MorningWorkOut.sleep(2.5);//try and catch - already handled

        System.out.println("Cydeo");


    }
        public static void sleep(double seconds) throws InterruptedException{

                Thread.sleep((long) (seconds * 1000));

            }
        }





