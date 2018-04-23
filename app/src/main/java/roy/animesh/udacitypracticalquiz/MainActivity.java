package roy.animesh.udacitypracticalquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText userName, email, about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        userName = (EditText) findViewById(R.id.userName);
        email = (EditText) findViewById(R.id.email);
        about = (EditText) findViewById(R.id.about);

        btn = (Button) findViewById(R.id.next);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("user",userName.getText().toString());
                intent.putExtra("email", email.getText().toString());
                intent.putExtra("about", about.getText().toString());
                startActivity(intent);
            }
        });





    }
}
