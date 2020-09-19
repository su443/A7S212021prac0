package mx.edu.tesoem.isc.svj.a7s212021prac0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtnom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnom = findViewById(R.id.txtnombre);
    }
    public void saluda(View v){
        Toast.makeText(this,"Bienvenido " + txtnom.getText(),Toast.LENGTH_LONG).show();
}
}

