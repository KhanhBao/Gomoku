package com.jospham.tictactoe;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.haunguyen.tictactoe.R;

public class MainActivity extends AppCompatActivity {
    private ImageView img;
    private Chessboard chessboard;
    @SuppressLint("ClickableViewAccessibility")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.img);

        chessboard = new Chessboard(MainActivity.this, 600,600,3,3);
        chessboard.init();
//        Line line = new Line(300,300, 3,3);
//        ChessBoard chessBoard = new ChessBoard(line);
        img.setImageBitmap(chessboard.drawBoard());
        img.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return chessboard.onTouch(view, motionEvent);
            }
        });
    }

}
