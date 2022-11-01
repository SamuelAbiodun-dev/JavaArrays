package Chapter6;

public class spaceAsterisks {
    public static void main(String[] args) {
        for(int counter = 2; counter <= 9; counter++){
            System.out.println(counter % 2 == 0 ? "* * * * * * * *" : " * * * * * * * *");
        }
    }
}
