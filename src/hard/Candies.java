package hard;

/**
 * Created by stengali on 1/20/18.
 */
public class Candies {

    int distributeCandies(int[] ratings) {
        int[] candies = new int[ratings.length];

        for(int i=1;i<candies.length;i++) {
            if(ratings[i] > ratings[i-1])
                candies[i] = candies[i-1] + 1;
        }
        for (int i=candies.length-2;i>=0;i--) {
            if(ratings[i] > ratings[i+1]) {
                candies[i] = Math.max(candies[i], candies[i+1] + 1);
            }
        }
        int sum = 0;
        for(int candy : candies) {
            sum += candy;
        }
        return sum;
    }
    public static void main(String[] args) {
        Candies obj = new Candies();
        System.out.println(obj.distributeCandies(new int[]{1,2,3,4,5,6}));
    }
}
