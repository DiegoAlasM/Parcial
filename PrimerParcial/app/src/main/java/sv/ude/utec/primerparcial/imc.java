package sv.ude.utec.primerparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class imc extends AppCompatActivity {

    EditText edtPeso, edtEstatura;

    TextView tvwResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        edtPeso = findViewById(R.id.edtPeso);
        edtEstatura = findViewById(R.id.edtEstatura);
        tvwResultado = findViewById(R.id.tvwResultado);

    }

    public void IMCMetodo (View v){
        Double peso, estatura, imc;

        peso = Double.parseDouble(edtPeso.getText().toString());
        estatura = Double.parseDouble(edtEstatura.getText().toString());

        imc = (peso) / (estatura * estatura);

        if (imc < 10.5 ){
            tvwResultado.setText(String.valueOf("Críticamente Bajo de Peso"));
        } else if (imc < 15.9) {
            tvwResultado.setText(String.valueOf("Severamente Bajo de Peso"));
        } else if (imc < 18.5){
            tvwResultado.setText(String.valueOf("Bajo de Peso"));
        } else if (imc < 25){
            tvwResultado.setText(String.valueOf("Normal (peso saludable)"));
        }else if (imc < 30){
            tvwResultado.setText(String.valueOf("Sobrepeso"));
        }else if (imc < 35){
            tvwResultado.setText(String.valueOf("Obesidad Clase 1 - Moderadamente Obeso\""));
        }else if (imc < 40){
            tvwResultado.setText(String.valueOf("Obesidad Clase 2 - Severamente Obeso\""));
        }else if (imc > 50){
            tvwResultado.setText(String.valueOf("Obesidad Clase 3 - Críticamente Obeso\""));

        }
    }


        }
