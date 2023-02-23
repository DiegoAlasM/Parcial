package sv.ude.utec.primerparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtUsername, edtPassword;

    TextView tvwMensaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        tvwMensaje = findViewById(R.id.tvwMensaje);
    }
    public void Login (View v){
        String Username, Password;

        Username = edtUsername.getText().toString();
        Password = edtPassword.getText().toString();

        if (Username.equals("parcialETps1") && Password.equals("p4rC14l#tp$")){
            startActivity(new Intent( MainActivity.this, imc.class));
        }
        else {
            tvwMensaje.setText("Contraseña y usuario no son correctos");
        }

    }

}