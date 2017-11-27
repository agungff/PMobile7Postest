package info.androidhive.materialtabs.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import info.androidhive.materialtabs.R;


public class ThreeFragment extends Fragment{

    public ThreeFragment(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three, container, false);

        final EditText edtJari = (EditText) view.findViewById(R.id.edtJariJari);

        Button btnLuasPermukaan = (Button) view.findViewById(R.id.btnCariLuas);
        btnLuasPermukaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtJari.getText().toString().isEmpty()){
                    Toast.makeText(getContext(), "Jari-jari masih kosong", Toast.LENGTH_SHORT).show();
                }else{
                    Double jari2 = Double.parseDouble(edtJari.getText().toString());
                    Double hasil = 4.0*22.0/7.0*jari2*jari2;

                    Intent intent = new Intent(getContext(), HasilBola.class);
                    intent.putExtra("hasil", hasil);
                    startActivity(intent);
                }
            }
        });

        Button btnCariVolume = (Button) view.findViewById(R.id.btnCariVolume);
        btnCariVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtJari.getText().toString().isEmpty()){
                    Toast.makeText(getContext(), "Jari-jari masih kosong", Toast.LENGTH_SHORT).show();
                }else{
                    Double jari2 = Double.parseDouble(edtJari.getText().toString());
                    Double hasil = 4.0/3.0*22.0/7.0*jari2*jari2*jari2;

                    Intent intent = new Intent(getContext(), HasilBola.class);
                    intent.putExtra("hasil", hasil);
                    startActivity(intent);
                }
            }
        });

        return view;
    }

}
