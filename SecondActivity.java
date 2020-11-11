package id.ac.id.telkomuniversity.tass.praktikactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView text;
    private String teks;
    private String KEY_NAME = "TEKS";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text = findViewById(R.id.text2);

        Bundle extras = getIntent().getExtras();
        teks = extras.getString(KEY_NAME);
        text.setText(teks);
        Toast.makeText(getApplicationContext(), "Berhasil pindah ke activity kedua",
                Toast.LENGTH_LONG).show();
    }


    }
