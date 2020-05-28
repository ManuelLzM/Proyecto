package com.example.dedicocos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button siguiente;
    EditText nombre,telefono,correo,descripcion;
    DatePicker fecha;
    String nameEd,telEd,emEd,descrEd,dateEd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        siguiente = findViewById(R.id.btnSig);
        nombre = findViewById(R.id.txtName);
        telefono = findViewById(R.id.txtTel);
        correo = findViewById(R.id.txtCorreo);
        descripcion = findViewById(R.id.txtDescripcion);
        fecha = findViewById(R.id.datePicker);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            nameEd = bundle.getString("nombre");
            telEd = bundle.getString("telefono");
            emEd = bundle.getString("email");
            descrEd = bundle.getString("descripcion");
            dateEd = bundle.getString("fecha");

            nombre.setText(nameEd);
            telefono.setText(telEd);
            correo.setText(emEd);
            descripcion.setText(descrEd);

        }


        siguiente.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(getApplicationContext(), dedicocos2.class);
                        intent.putExtra("nombre",nombre.getText().toString());
                        intent.putExtra("telefono",telefono.getText().toString());
                        intent.putExtra("email",correo.getText().toString());
                        intent.putExtra("descripcion",descripcion.getText().toString());
                        intent.putExtra("fecha", (fecha.getDayOfMonth()+"/"+fecha.getMonth()+"/"+fecha.getYear()));
                        startActivity(intent);
                    }
                });
    }
}
