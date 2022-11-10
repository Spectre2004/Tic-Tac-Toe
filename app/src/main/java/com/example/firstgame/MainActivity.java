package com.example.firstgame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.icu.text.UFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Btn0;
    Button Btn1;
    Button Btn2;
    Button Btn3;
    Button Btn4;
    Button Btn5;
    Button Btn6;
    Button Btn7;
    Button Btn8;
    Button Btn9;
    Button BtnRestart;
    TextView textview;
    TextView scoreTable;

    public int count;
    public int scoreX;
    public int scoreO;


    public static Button[][] btnList = new Button[3][3];

    public static boolean Turn = true;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Btn0 = (Button) findViewById(R.id.btn1);
        Btn1 = (Button) findViewById(R.id.btn1);
        Btn2 = (Button) findViewById(R.id.btn2);
        Btn3 = (Button) findViewById(R.id.btn3);
        Btn4 = (Button) findViewById(R.id.btn4);
        Btn5 = (Button) findViewById(R.id.btn5);
        Btn6 = (Button) findViewById(R.id.btn6);
        Btn7 = (Button) findViewById(R.id.btn7);
        Btn8 = (Button) findViewById(R.id.btn8);
        Btn9 = (Button) findViewById(R.id.btn9);
        BtnRestart = (Button) findViewById(R.id.btnRestart);


        textview = (TextView) findViewById(R.id.textView);
        scoreTable = (TextView)findViewById(R.id.scoreTable);

        textview.setText("Ход крестиков");

        count = 0;
        scoreO = 0;
        scoreX = 0;

        btnList = new Button[][] {{Btn1, Btn2, Btn3}, {Btn4, Btn5, Btn6}, {Btn7, Btn8, Btn9}};




    }
    public void onClickTurn(View v)
    {
        Button vv = (Button) v;
        if(Turn)
        {
            ((Button) v).setText("X");
            vv.setEnabled(false);
            Turn = false;
            textview.setText("Ход ноликов");
        }
        else
        {
            ((Button) v).setText("O");
            vv.setEnabled(false);
            Turn = true;
            textview.setText("Ход крестиков");
        }
        CheckWin();
    }
    @SuppressLint("UseCompatLoadingForDrawables")
    public void onClickRestart(View v)
    {
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                btnList[i][j].setText("");
                count = 0;
                btnList[i][j].setBackground(getDrawable(R.drawable.border));
                Turn = true;
                textview.setText("Ход крестиков");
                btnList[i][j].setEnabled(true);
            }
        }
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    public void CheckWin()
    {

        if (btnList[0][0].getText() == "X" && btnList[0][1].getText() == "X" && btnList[0][2].getText() == "X")
        {
            textview.setText("Крестики выиграли");
            scoreX++;
            scoreTable.setText(String.format("Крестики - %d Нолики - %d", scoreX, scoreO));
            btnList[0][0].setBackground(getDrawable(R.drawable.borderwin));
            btnList[0][1].setBackground(getDrawable(R.drawable.borderwin));
            btnList[0][2].setBackground(getDrawable(R.drawable.borderwin));
            for (int i=0;i<3;i++)
            {
                for (int j=0;j<3;j++)
                {
                    btnList[i][j].setEnabled(false);
                }
            }
//            xssxs

        }
        else if (btnList[1][0].getText() == "X" && btnList[1][1].getText() == "X" && btnList[1][2].getText() == "X")
        {
            textview.setText("Крестики выиграли");
            scoreX++;
            scoreTable.setText(String.format("Крестики - %d Нолики - %d", scoreX, scoreO));
            btnList[1][0].setBackground(getDrawable(R.drawable.borderwin));
            btnList[1][1].setBackground(getDrawable(R.drawable.borderwin));
            btnList[1][2].setBackground(getDrawable(R.drawable.borderwin));
            for (int i=0;i<3;i++)
            {
                for (int j=0;j<3;j++)
                {
                    btnList[i][j].setEnabled(false);
                }
            }
        }
        else if (btnList[2][0].getText() == "X" && btnList[2][1].getText() == "X" && btnList[2][2].getText() == "X")
        {
            textview.setText("Крестики выиграли");
            scoreX++;
            scoreTable.setText(String.format("Крестики - %d Нолики - %d", scoreX, scoreO));
            btnList[2][0].setBackground(getDrawable(R.drawable.borderwin));
            btnList[2][1].setBackground(getDrawable(R.drawable.borderwin));
            btnList[2][2].setBackground(getDrawable(R.drawable.borderwin));
            for (int i=0;i<3;i++)
            {
                for (int j=0;j<3;j++)
                {
                    btnList[i][j].setEnabled(false);
                }
            }
        }
        else if (btnList[0][0].getText() == "X" && btnList[1][0].getText() == "X" && btnList[2][0].getText() == "X")
        {
            textview.setText("Крестики выиграли");
            scoreX++;
            scoreTable.setText(String.format("Крестики - %d Нолики - %d", scoreX, scoreO));
            btnList[0][0].setBackground(getDrawable(R.drawable.borderwin));
            btnList[1][0].setBackground(getDrawable(R.drawable.borderwin));
            btnList[2][0].setBackground(getDrawable(R.drawable.borderwin));
            for (int i=0;i<3;i++)
            {
                for (int j=0;j<3;j++)
                {
                    btnList[i][j].setEnabled(false);
                }
            }
        }
        else if (btnList[0][1].getText() == "X" && btnList[1][1].getText() == "X" && btnList[2][1].getText() == "X")
        {
            textview.setText("Крестики выиграли");
            scoreX++;
            scoreTable.setText(String.format("Крестики - %d Нолики - %d", scoreX, scoreO));
            btnList[0][1].setBackground(getDrawable(R.drawable.borderwin));
            btnList[1][1].setBackground(getDrawable(R.drawable.borderwin));
            btnList[2][1].setBackground(getDrawable(R.drawable.borderwin));
            for (int i=0;i<3;i++)
            {
                for (int j=0;j<3;j++)
                {
                    btnList[i][j].setEnabled(false);
                }
            }
        }
        else if (btnList[0][2].getText() == "X" && btnList[1][2].getText() == "X" && btnList[2][2].getText() == "X")
        {
            textview.setText("Крестики выиграли");
            scoreX++;
            scoreTable.setText(String.format("Крестики - %d Нолики - %d", scoreX, scoreO));
            btnList[0][2].setBackground(getDrawable(R.drawable.borderwin));
            btnList[1][2].setBackground(getDrawable(R.drawable.borderwin));
            btnList[2][2].setBackground(getDrawable(R.drawable.borderwin));
            for (int i=0;i<3;i++)
            {
                for (int j=0;j<3;j++)
                {
                    btnList[i][j].setEnabled(false);
                }
            }
        }
        else if (btnList[0][0].getText() == "X" && btnList[1][1].getText() == "X" && btnList[2][2].getText() == "X")
        {
            textview.setText("Крестики выиграли");
            scoreX++;
            scoreTable.setText(String.format("Крестики - %d Нолики - %d", scoreX, scoreO));
            btnList[0][0].setBackground(getDrawable(R.drawable.borderwin));
            btnList[1][1].setBackground(getDrawable(R.drawable.borderwin));
            btnList[2][2].setBackground(getDrawable(R.drawable.borderwin));
            for (int i=0;i<3;i++)
            {
                for (int j=0;j<3;j++)
                {
                    btnList[i][j].setEnabled(false);
                }
            }
        }
        else if (btnList[0][2].getText() == "X" && btnList[1][1].getText() == "X" && btnList[2][0].getText() == "X")
        {
            textview.setText("Крестики выиграли");
            scoreX++;
            scoreTable.setText(String.format("Крестики - %d Нолики - %d", scoreX, scoreO));
            btnList[0][2].setBackground(getDrawable(R.drawable.borderwin));
            btnList[1][1].setBackground(getDrawable(R.drawable.borderwin));
            btnList[2][0].setBackground(getDrawable(R.drawable.borderwin));
            for (int i=0;i<3;i++)
            {
                for (int j=0;j<3;j++)
                {
                    btnList[i][j].setEnabled(false);
                }
            }
        }


        else if (btnList[0][0].getText() == "O" && btnList[0][1].getText() == "O" && btnList[0][2].getText() == "O" )
        {
            textview.setText("Нолики выиграли");
            scoreO++;
            scoreTable.setText(String.format("Крестики - %d Нолики - %d", scoreX, scoreO));
            btnList[0][0].setBackground(getDrawable(R.drawable.borderwin));
            btnList[0][1].setBackground(getDrawable(R.drawable.borderwin));
            btnList[0][2].setBackground(getDrawable(R.drawable.borderwin));
            for (int i=0;i<3;i++)
            {
                for (int j=0;j<3;j++)
                {
                    btnList[i][j].setEnabled(false);
                }
            }
        }
        else if (btnList[1][0].getText() == "O" && btnList[1][1].getText() == "O" && btnList[1][2].getText() == "O")
        {
            textview.setText("Нолики выиграли");
            scoreO++;
            scoreTable.setText(String.format("Крестики - %d Нолики - %d", scoreX, scoreO));
            btnList[1][0].setBackground(getDrawable(R.drawable.borderwin));
            btnList[1][1].setBackground(getDrawable(R.drawable.borderwin));
            btnList[1][2].setBackground(getDrawable(R.drawable.borderwin));
            for (int i=0;i<3;i++)
            {
                for (int j=0;j<3;j++)
                {
                    btnList[i][j].setEnabled(false);
                }
            }
        }
        else if (btnList[2][0].getText() == "O" && btnList[2][1].getText() == "O" && btnList[2][2].getText() == "O")
        {
            textview.setText("Нолики выиграли");
            scoreO++;
            scoreTable.setText(String.format("Крестики - %d Нолики - %d", scoreX, scoreO));
            btnList[2][0].setBackground(getDrawable(R.drawable.borderwin));
            btnList[2][1].setBackground(getDrawable(R.drawable.borderwin));
            btnList[2][2].setBackground(getDrawable(R.drawable.borderwin));
            for (int i=0;i<3;i++)
            {
                for (int j=0;j<3;j++)
                {
                    btnList[i][j].setEnabled(false);
                }
            }
        }
        else if (btnList[0][0].getText() == "O" && btnList[1][0].getText() == "O" && btnList[2][0].getText() == "O")
        {
            textview.setText("Нолики выиграли");
            scoreO++;
            scoreTable.setText(String.format("Крестики - %d Нолики - %d", scoreX, scoreO));
            btnList[0][0].setBackground(getDrawable(R.drawable.borderwin));
            btnList[1][0].setBackground(getDrawable(R.drawable.borderwin));
            btnList[2][0].setBackground(getDrawable(R.drawable.borderwin));
            for (int i=0;i<3;i++)
            {
                for (int j=0;j<3;j++)
                {
                    btnList[i][j].setEnabled(false);
                }
            }
        }
        else if (btnList[0][1].getText() == "O" && btnList[1][1].getText() == "O" && btnList[2][1].getText() == "O")
        {
            textview.setText("Нолики выиграли");
            scoreO++;
            scoreTable.setText(String.format("Крестики - %d Нолики - %d", scoreX, scoreO));
            btnList[0][1].setBackground(getDrawable(R.drawable.borderwin));
            btnList[1][1].setBackground(getDrawable(R.drawable.borderwin));
            btnList[2][1].setBackground(getDrawable(R.drawable.borderwin));
            for (int i=0;i<3;i++)
            {
                for (int j=0;j<3;j++)
                {
                    btnList[i][j].setEnabled(false);
                }
            }
        }
        else if (btnList[0][2].getText() == "O" && btnList[1][2].getText() == "O" && btnList[2][2].getText() == "O")
        {
            textview.setText("Нолики выиграли");
            scoreO++;
            scoreTable.setText(String.format("Крестики - %d Нолики - %d", scoreX, scoreO));
            btnList[0][2].setBackground(getDrawable(R.drawable.borderwin));
            btnList[1][2].setBackground(getDrawable(R.drawable.borderwin));
            btnList[2][2].setBackground(getDrawable(R.drawable.borderwin));
            for (int i=0;i<3;i++)
            {
                for (int j=0;j<3;j++)
                {
                    btnList[i][j].setEnabled(false);
                }
            }
        }
        else if (btnList[0][0].getText() == "O" && btnList[1][1].getText() == "O" && btnList[2][2].getText() == "O")
        {
            textview.setText("Нолики выиграли");
            scoreO++;
            scoreTable.setText(String.format("Крестики - %d Нолики - %d", scoreX, scoreO));
            btnList[0][0].setBackground(getDrawable(R.drawable.borderwin));
            btnList[1][1].setBackground(getDrawable(R.drawable.borderwin));
            btnList[2][2].setBackground(getDrawable(R.drawable.borderwin));
            for (int i=0;i<3;i++)
            {
                for (int j=0;j<3;j++)
                {
                    btnList[i][j].setEnabled(false);
                }
            }
        }
        else if (btnList[0][2].getText() == "O" && btnList[1][1].getText() == "O" && btnList[2][0].getText() == "O")
        {
            textview.setText("Нолики выиграли");
            scoreO++;
            scoreTable.setText(String.format("Крестики - %d Нолики - %d", scoreX, scoreO));
            btnList[0][2].setBackground(getDrawable(R.drawable.borderwin));
            btnList[1][1].setBackground(getDrawable(R.drawable.borderwin));
            btnList[2][0].setBackground(getDrawable(R.drawable.borderwin));
            for (int i=0;i<3;i++)
            {
                for (int j=0;j<3;j++)
                {
                    btnList[i][j].setEnabled(false);
                }
            }
        }



        else if (count == 8)
        {
            for (int i=0;i<3;i++)
            {
                for (int j=0;j<3;j++)
                {
                    btnList[i][j].setEnabled(false);
                    textview.setText("Ничья!");
                }
            }
        }

        count++;

    }
}