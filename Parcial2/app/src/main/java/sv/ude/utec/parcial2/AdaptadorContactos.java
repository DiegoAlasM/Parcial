package sv.ude.utec.parcial2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdaptadorContactos extends ArrayAdapter<String> {
    Activity contexto;
    String []contacto;
    Integer []ImgContacto;
    ImageView imgFoto;
    TextView tvNombre;
    TextView tvCargo;
    TextView tvCompañia;
    public AdaptadorContactos(Activity contexto,String[]contacto, Integer[] imgContacto ){
        super(contexto,R.layout.contacto,contacto);
        this.contexto=contexto;
        this.contacto=contacto;
        this.ImgContacto=ImgContacto;
    }
    public View getView(int posicion, View v, ViewGroup parent){
        LayoutInflater inflater = contexto.getLayoutInflater();
        View romView=inflater.inflate(R.layout.contacto, null, true);
        tvNombre=romView.findViewById(R.id.tvNombreContac);
        tvCargo=romView.findViewById(R.id.tvCargoContac);
        tvCompañia=romView.findViewById(R.id.tvCompañiaContac);
        imgFoto=romView.findViewById(R.id.imgvContacto);
        tvNombre.setText(contacto[posicion]);
        tvCargo.setText(cargo[posicion]);
        tvCompañia.setText(compañia[posicion]);
        imgFoto.setImageResource(ImgContacto[posicion]);
        return rowView;
    }

}
