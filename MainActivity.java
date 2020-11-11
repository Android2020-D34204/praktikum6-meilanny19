package id.ac.id.telkomuniversity.tass.praktikactivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView helloword;
    Button buttonpindah;
    EditText edit;

    private String KEY_NAME = "TEKS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        helloword = findViewById(R.id.textview);
        buttonpindah = findViewById(R.id.button);
        edit = findViewById(R.id.editText);


        buttonpindah.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View v) {
                String teks = edit.getText().toString();
                if (TextUtils.isEmpty(teks)) {
                    Toast.makeText(getApplicationContext(), "input tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else {
                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                    intent.putExtra(KEY_NAME, teks);
                    openAlert(intent);

                }

            }
        });
    }
    public void openAlert (final Intent intent){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Yakin ingin pindah?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(intent);
            }
        });
        builder.setNegativeButton("Tidak", null);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.show();
    }


    }