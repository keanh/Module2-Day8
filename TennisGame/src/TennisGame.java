public class TennisGame {
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final String DEUCE = "Deuce";
    public static final String HYPHEN = "-";
    public static final String ALL = "All";

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        int tempScore=0;
        if (player1Score==player2Score)
        {
            switch (player1Score)
            {
                case 0:
                    score = LOVE + HYPHEN + ALL;
                    break;
                case 1:
                    score = FIFTEEN + HYPHEN + ALL;
                    break;
                case 2:
                    score =THIRTY + HYPHEN + ALL;
                    break;
                case 3:
                    score = FORTY + HYPHEN + ALL;
                    break;
                default:
                    score = DEUCE;
                    break;

            }
        }
        else if (player1Score>=4 || player2Score>=4)
        {
            int minusResult = player1Score-player2Score;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1)
                    tempScore = player1Score;
                else
                    {
                        score += '-';
                        tempScore = player2Score;
                    }
                switch(tempScore)
                {
                    case 0:
                        score+=LOVE;
                        break;
                    case 1:
                        score+=FIFTEEN;
                        break;
                    case 2:
                        score+=THIRTY;
                        break;
                    case 3:
                        score+=FORTY;
                        break;
                }
            }
        }
        return score;
    }

//    private static void setMinusResult(int player1Score,int player2Score,String score){
//        int minusResult = player1Score-player2Score;
//        if (minusResult==1) score ="Advantage player1";
//        else if (minusResult ==-1) score ="Advantage player2";
//        else if (minusResult>=2) score = "Win for player1";
//        else score ="Win for player2";
//    }
}
