package info.androidhive.materialtabs.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import info.androidhive.materialtabs.R;

public class TwoFragment extends Fragment{
    private EditText edtNomorSMS, edtNomorTelpon, edtPesan, edtCari;

    public TwoFragment(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_two, container, false);
        
        edtNomorSMS = (EditText) view.findViewById(R.id.edtNomorSMS);
        edtNomorTelpon = (EditText) view.findViewById(R.id.edtNomorTelpon);
        edtPesan = (EditText) view.findViewById(R.id.edtSMS);
        edtCari = (EditText) view.findViewById(R.id.edtURL);

        Button btnKirim = (Button) view.findViewById(R.id.btnKirim);
        btnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtNomorSMS.getText().toString().isEmpty()){
                    Toast.makeText(getContext(), "Nomor telpon masih kosong", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("smsto:" + edtNomorSMS.getText().toString()));
                    intent.putExtra("sms_body", edtPesan.getText().toString());
                    startActivity(intent);
                }
            }
        });

        Button btnTelpon = (Button) view.findViewById(R.id.btnTelpon);
        btnTelpon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtNomorTelpon.getText().toString().isEmpty()){
                    Toast.makeText(getContext(), "Nomor telpon masih kosong", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + edtNomorTelpon.getText().toString()));
                    startActivity(intent);
                }
            }
        });

        Button btnCari = (Button) view.findViewById(R.id.btnBrowser);
        btnCari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtCari.getText().toString().isEmpty()){
                    Toast.makeText(getContext(), "Alamat URL masih kosong", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(edtCari.getText().toString()));
                    startActivity(intent);
                }
            }
        });
        return view;
    }
}
