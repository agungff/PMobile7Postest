package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import info.androidhive.materialtabs.R;

public class HasilBola extends AppCompatActivity {

    public HasilBola(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_bola);

        TextView tvHasil = (TextView) findViewById(R.id.tvHasil);
        Double hasil = getIntent().getExtras().getDouble("hasil");
        tvHasil.setText(String.valueOf(hasil));
    }
}
