package edu.washington.abbast.lifecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    private int p1Life = 20;
    private int p2Life = 20;
    private int p3Life = 20;
    private int p4Life = 20;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState != null) {
            p1Life = savedInstanceState.getInt("p1");
            p2Life = savedInstanceState.getInt("p2");
            p3Life = savedInstanceState.getInt("p3");
            p4Life = savedInstanceState.getInt("p4");

            final TextView textp1Life = (TextView) findViewById(R.id.p1Life);
            textp1Life.setText("Life Count = " + p1Life);
            lose(1);

            final TextView textp2Life = (TextView) findViewById(R.id.p2Life);
            textp2Life.setText("Life Count = " + p2Life);
            lose(2);

            final TextView textp3Life = (TextView) findViewById(R.id.p3Life);
            textp3Life.setText("Life Count = " + p3Life);
            lose(3);

            final TextView textp4Life = (TextView) findViewById(R.id.p4Life);
            textp4Life.setText("Life Count = " + p4Life);
            lose(4);

        }
    }

    //Saves each players life whenever a new onCreate is called
    //due to screen orientation change.
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("p1", p1Life);
        savedInstanceState.putInt("p2", p2Life);
        savedInstanceState.putInt("p3", p3Life);
        savedInstanceState.putInt("p4", p4Life);
    }

    public void p1Controls(View v) {
        TextView text1 = (TextView) findViewById(R.id.p1Life);
        if(v.getId() == R.id.p1Minus5) {
            p1Life -= 5;
        } else if(v.getId() == R.id.p1Minus) {
            p1Life--;
        } else if(v.getId() == R.id.p1Add) {
            p1Life++;
        } else if(v.getId() == R.id.p1Add5) {
            p1Life += 5;
        }
        text1.setText("Life Count = " + p1Life);
        lose(1);
    }

    public void p2Controls(View v) {
        TextView text2 = (TextView) findViewById(R.id.p2Life);
        if(v.getId() == R.id.p2Minus5) {
            p2Life -= 5;
        } else if(v.getId() == R.id.p2Minus) {
            p2Life--;
        } else if(v.getId() == R.id.p2Add) {
            p2Life++;
        } else if(v.getId() == R.id.p2Add5) {
            p2Life += 5;
        }
        text2.setText("Life Count = " + p2Life);
        lose(2);
    }

    public void p3Controls(View v) {
        TextView text3 = (TextView) findViewById(R.id.p3Life);
        if(v.getId() == R.id.p3Minus5) {
            p3Life -= 5;
        } else if(v.getId() == R.id.p3Minus) {
            p3Life--;
        } else if(v.getId() == R.id.p3Add) {
            p3Life++;
        } else if(v.getId() == R.id.p3Add5) {
            p3Life += 5;
        }
        text3.setText("Life Count = " + p3Life);
        lose(3);
    }

    public void p4Controls(View v) {
        TextView text4 = (TextView) findViewById(R.id.p4Life);
        if(v.getId() == R.id.p4Minus5) {
            p4Life -= 5;
        } else if(v.getId() == R.id.p4Minus) {
            p4Life--;
        } else if(v.getId() == R.id.p4Add) {
            p4Life++;
        } else if(v.getId() == R.id.p4Add5) {
            p4Life += 5;
        }
        text4.setText("Life Count = " + p4Life);
        lose(4);
    }

    private void lose(int player) {
        TextView loser = (TextView) findViewById(R.id.lose);
        if (player == 1 && p1Life <= 0) {
            loser.setText("Player 1 LOSES!");
        }
        if (player == 2 && p2Life <= 0) {
            loser.setText("Player 2 LOSES!");
        }
        if (player == 3 && p3Life <= 0) {
            loser.setText("Player 3 LOSES!");
        }
        if (player == 4 && p4Life <= 0) {
            loser.setText("Player 4 LOSES!");
        }
    }
}
