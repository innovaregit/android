package ar.com.innovare.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView mensaje;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mensaje = (TextView) findViewById(R.id.mensaje);
        boton= (Button) findViewById(R.id.boton);

        boton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                mensaje.setText("Hola Android!!!");
            }
        });

    }
}
