public class Main {
    public static void main (String[] args){

    int stableamount = 100;
    int additionamount = 2300;
    int bonus = additionamount / 100;
    if (additionamount < 1000 ) {
        bonus = 0;
    } else {
        bonus = additionamount / 100;
    }
    long totalamount = stableamount + additionamount + bonus;

    System.out.println(totalamount);

    }
}
