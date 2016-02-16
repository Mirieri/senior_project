package safari.eagle.com.tech_bot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        Button RegisterButton= (Button) findViewById(R.id.regButton);
        Button  LoginButton= (Button) findViewById(R.id.logInbutton);

        //final String successMessage = "You have successfully Registered";
        RegisterButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"You have successfully registered",Toast.LENGTH_LONG).show();
                return;
                     }
                });
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"You are successfully Loged in",Toast.LENGTH_LONG).show();
                return;
            }
        });
    }





}