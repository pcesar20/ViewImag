package br.com.pauloc.visualizadorimagens;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView imageView1 = findViewById(R.id.imageView1);
        final ImageView imageView2 = findViewById(R.id.imageView2);
        Button btnImg1 = findViewById(R.id.button_img1);
        Button btnImg2 = findViewById(R.id.button_img2);
        btnImg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder msgD = new AlertDialog.Builder(MainActivity.this);
                msgD.setTitle("Imagem View");
                msgD.setMessage("Lindo demais!");
                msgD.setNeutralButton("Concordo", null);
                msgD.show();
                imageView1.setVisibility(View.VISIBLE);
                imageView2.setVisibility(View.INVISIBLE);
            }
        });

        btnImg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder msgD = new AlertDialog.Builder(MainActivity.this);
                msgD.setTitle("Imagem View");
                msgD.setMessage("Que cara engraçado rsrsrs!");
                msgD.setNeutralButton("Concordo", null);
                msgD.show();
                imageView2.setVisibility(View.VISIBLE);
                imageView1.setVisibility(View.INVISIBLE);


            }
        });

    }
}
