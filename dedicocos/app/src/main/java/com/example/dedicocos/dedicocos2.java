package com.example.dedicocos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class dedicocos2 extends AppCompatActivity {

    MainActivity main = new MainActivity();
    Button edit;
    TextView name2,tel2,email2,dcr2,date2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dedicocos2);
        final String nombre,telefono,email,descripcion,fecha;
        edit = findViewById(R.id.btnEdit);
        name2 = findViewById(R.id.txtName2);
        tel2 = findViewById(R.id.txtTel2);
        email2 = findViewById(R.id.txtCorreo2);
        dcr2 = findViewById(R.id.txtDescripcion2);
        date2 = findViewById(R.id.txtFecha);

        Bundle bundle = getIntent().getExtras();
        nombre = bundle.getString("nombre");
        telefono = bundle.getString("telefono");
        email = bundle.getString("email");
        descripcion = bundle.getString("descripcion");
        fecha = bundle.getString("fecha");

        name2.setText("Nombre: "+nombre);
        tel2.setText("Teléfono: "+telefono);
        email2.setText("Email: "+email);
        dcr2.setText("Descripción: "+descripcion);
        date2.setText("Fecha: "+fecha);

        edit.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        intent.putExtra("nombre",nombre);
                        intent.putExtra("telefono",telefono);
                        intent.putExtra("email",email);
                        intent.putExtra("descripcion",descripcion);
                        intent.putExtra("fecha",fecha);

                        startActivity(intent);
                        finish();
                    }
                });
    }
}
