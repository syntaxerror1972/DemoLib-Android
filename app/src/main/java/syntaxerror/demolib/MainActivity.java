package syntaxerror.demolib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import syntaxerror.mylibrary.MainClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtResult=(TextView)findViewById(R.id.txtResult);
        txtResult.setText("Result : "+MainClass.getSum(12,34));
    }
}
