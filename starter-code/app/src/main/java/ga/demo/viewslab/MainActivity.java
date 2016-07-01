package ga.demo.viewslab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView mTextView;
    Button mButton;
    Button mButton2;
    Button mButton3;
    Button mButton4;
    Button mButton5;
    Button mButton6;
    Button mButton7;
    Button mButton8;
    Button mButton9;
    Button mButton10;
    EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // mTextView = (TextView) findViewById(R.id.textView);
        mButton = (Button) findViewById(R.id.Button);
        mButton2 = (Button) findViewById(R.id.Button2);
        mButton3 = (Button) findViewById(R.id.Button3);
        mButton4 = (Button) findViewById(R.id.Button4);
        mButton5 = (Button) findViewById(R.id.Button5);
        mButton6 = (Button) findViewById(R.id.Button6);
        mButton7 = (Button) findViewById(R.id.Button7);
        mButton8 = (Button) findViewById(R.id.Button8);
        mButton9 = (Button) findViewById(R.id.Button9);
        mButton10 = (Button) findViewById(R.id.Button10);
        // mEditText =(EditText) findViewById(R.id.editText);


        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "You clicked the Button - Textviews 1 and 2 above", Toast.LENGTH_LONG).show();
            }
        };
        mButton.setOnClickListener(clickListener);
        View.OnClickListener clickListener2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "You clicked the Button -Textviews 3 and 4 above", Toast.LENGTH_LONG).show();
            }
        };
        mButton2.setOnClickListener(clickListener2);
        View.OnClickListener clickListener3 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "You clicked the Button -Textviews 5 and 6 above", Toast.LENGTH_LONG).show();
            }
        };
        mButton3.setOnClickListener(clickListener3);

        View.OnClickListener clickListener4 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "You clicked the Button -Textviews 7 and 8 above", Toast.LENGTH_LONG).show();
            }
        };
        mButton4.setOnClickListener(clickListener4);

        View.OnClickListener clickListener5 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "You clicked the Button -Textviews 9 and 10 above", Toast.LENGTH_LONG).show();
            }
        };
        mButton5.setOnClickListener(clickListener5);

        View.OnClickListener clickListener6 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "You clicked the Button -Textviews 11 and 12 above", Toast.LENGTH_LONG).show();
            }
        };
        mButton6.setOnClickListener(clickListener6);

        View.OnClickListener clickListener7 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "You clicked the Button -Textviews 13 and 14 above", Toast.LENGTH_LONG).show();
            }
        };
        mButton7.setOnClickListener(clickListener7);

        View.OnClickListener clickListener8 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "You clicked the Button -Textviews 15 and 16 above", Toast.LENGTH_LONG).show();
            }
        };
        mButton8.setOnClickListener(clickListener8);

        View.OnClickListener clickListener9 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "You clicked the Button -Textviews 17 and 18 above", Toast.LENGTH_LONG).show();
            }
        };
        mButton9.setOnClickListener(clickListener9);

        View.OnClickListener clickListener10 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "You clicked the Button -Textviews 19 and 20 above", Toast.LENGTH_LONG).show();
            }
        };
        mButton10.setOnClickListener(clickListener10);
    }
}
