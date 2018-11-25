package lesson1;

public class FootballMatchAnalizer {

    public static int guessScore(int score1, int score2, int realScore1, int realScore2){
        return score1 == realScore1 && score2 == realScore2? 2 : ((score1 > score2 && realScore1 > realScore2)||
                (score1 < score2 && realScore1 < realScore2))? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(guessScore(0,3,1,3));
    }
}
