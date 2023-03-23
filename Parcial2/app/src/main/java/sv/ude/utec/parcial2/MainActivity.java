package sv.ude.utec.parcial2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    private ArrayList<Contactos> Contatolist;
    ListView lvProfile;
    Integer[]imvProfile={
            R.drawable.lead_photo_1,
            R.drawable.lead_photo_2,
            R.drawable.lead_photo_3,
            R.drawable.lead_photo_4,
            R.drawable.lead_photo_5,
            R.drawable.lead_photo_6,
            R.drawable.lead_photo_7,
            R.drawable.lead_photo_8,
            R.drawable.lead_photo_9,
            R.drawable.lead_photo_10
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Contatolist = new ArrayList<Contactos>();
        Contatolist.add(new Contactos("Alexander", "CEO", "Insures S.O"));
        Contatolist.add(new Contactos("Carlos Lopez", "Asistente", "Hospital Blue"));
        Contatolist.add(new Contactos("Sara Bonz", "Directora de Marketing", "Electrical Parts LTD"));
        Contatolist.add(new Contactos("Liliana Clarence", "Diseñadora de Producto", "Creativa App"));
        Contatolist.add(new Contactos("Benito Peralta", "Supervisor de Ventas", "Neumaticos Press"));
        Contatolist.add(new Contactos("Juan Jaramillo", "CEO", "Banco Nacional"));
        Contatolist.add(new Contactos("Christian Steps", "CTO", "Cooperativa Verde"));
        Contatolist.add(new Contactos("Alexa Giraldo", "Lead Programmer", "Frutisofy"));
        Contatolist.add(new Contactos("Linda Murillo", "Directora de Marketing", "Seguros Boliver"));
        Contatolist.add(new Contactos("Lizete Astrada", "CEO", "Concesionario Motolox"));
        AdaptadorContactos adapter = new AdaptadorContactos(this);
        lvProfile = findViewById(R.id.lvContactos);
        lvProfile.setAdapter(adapter);
    }
    public class AdaptadorContactos extends ArrayAdapter<Contactos> {
        AppCompatActivity appCompatActivity;
        AdaptadorContactos (AppCompatActivity context){
            super(context, R.layout.Contactos, lvContactos);
            appCompatActivity = context;
        }
        public View getView(int position, View convertView, ViewGroup parent)
        {
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.employees, null);
            ImageView imvProfileT = item.findViewById(R.id.imvProfile);
            imvProfileT.setImageResource(imvProfile[position]);
            TextView tvNameProfileT = item.findViewById(R.id.tvNameProfile);
            tvNameProfileT.setText(EmployeeList.get(position).getEmployeeName());
            TextView tvPositionT = item.findViewById(R.id.tvPosition);
            tvPositionT.setText(EmployeeList.get(position).getEmployeePosition());
            TextView tvCompanyT = item.findViewById(R.id.tvCompany);
            tvCompanyT.setText(EmployeeList.get(position).getEmployeeCompany());
            return(item);
        }
    }
}