package ar.com.innovare.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView mensaje;
    Button boton;
    EditText numero1;
    EditText numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mensaje = (TextView) findViewById(R.id.mensaje);
        boton= (Button) findViewById(R.id.boton);
        numero1 = (EditText) findViewById(R.id.numero1);
        numero2 = (EditText) this.findViewById(R.id.numero2);  //IGUAL

        boton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Integer num1= Integer.valueOf(numero1.getText().toString()); // Objeto
                Integer num2= Integer.valueOf(numero2.getText().toString());
                Integer suma = num1+num2;
                mensaje.setText("La suma es de " + suma.toString());
            }
        });

    }
}
