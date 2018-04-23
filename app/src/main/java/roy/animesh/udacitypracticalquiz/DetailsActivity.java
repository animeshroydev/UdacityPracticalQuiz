package roy.animesh.udacitypracticalquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView txtUserName, txtemail, txtAbout;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txtUserName = (TextView) findViewById(R.id.result1);
        txtemail = (TextView) findViewById(R.id.result2);
        txtAbout =(TextView) findViewById(R.id.result3);

        Bundle b1 = getIntent().getExtras();
        String s1 = b1.getString("user");
        txtUserName.setText(s1);

        Bundle b2 = getIntent().getExtras();
        String s2 = b1.getString("email");
        txtemail.setText(s2);


        Bundle b3 = getIntent().getExtras();
        String s3 = b1.getString("about");
        txtAbout.setText(s3);


    }
}
