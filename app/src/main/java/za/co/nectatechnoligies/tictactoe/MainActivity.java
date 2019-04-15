package za.co.nectatechnoligies.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // 0 = O; 1 = X; 2 = empty

    int activePlayer = 0;

    int[] gameState = {2,2,2,2,2,2,2,2,2};

    int[][] winnnngPos = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};

    public void playerTap (View view ){

        ImageView tictac = (ImageView) view;

        int tappedTicTac = Integer.parseInt(tictac.getTag().toString());

        gameState[tappedTicTac] = activePlayer;

        if(activePlayer == 0) {

            tictac.setImageResource(R.drawable.o);
            activePlayer = 1;

        }else {

            tictac.setImageResource(R.drawable.x);
            activePlayer = 0;
        }

        for (int[] winningPoss : winnnngPos){

            if(gameState[winningPoss[0]] == gameState[winningPoss[1]] && gameState[winningPoss[1]] == gameState[winningPoss[2]] && gameState[winningPoss[0]] != 2){
//                someone has won

                String winner = "";

                if(activePlayer == 1){

                    winner = "X";

                }else{
                    winner = "0";
                }
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
