package getRandomNum;

public class GetRandomNum {

    public GetRandomNum() {
    }

    private int min = 0;
    private int max = 10;

    public int getRandomNumber(){
        return min + (int) (Math.random() * max);
    }

}
