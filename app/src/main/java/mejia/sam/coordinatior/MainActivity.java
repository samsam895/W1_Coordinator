package mejia.sam.coordinatior;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
    }

    public void onClick(View view) {

        CheckBox checkBox = (CheckBox)view;
        if(checkBox.isChecked()){
            tv.setText("samsam895");
        }else{
            tv.setText("uncheck");
        }

    }
}
