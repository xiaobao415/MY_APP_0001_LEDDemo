package com.example.administrator.my_app_0001_leddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  boolean ledon = false;
    private Button button = null;
    private CheckBox checkBoxled1 = null;
    private CheckBox checkBoxled2 = null;
    private CheckBox checkBoxled3 = null;
    private CheckBox checkBoxled4 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.BUUTON);
        checkBoxled1 = (CheckBox) findViewById(R.id.LED1);
        checkBoxled2 = (CheckBox) findViewById(R.id.LED2);
        checkBoxled3 = (CheckBox) findViewById(R.id.LED3);
        checkBoxled4 = (CheckBox) findViewById(R.id.LED4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ledon = !ledon;
                if (ledon) {
                    button.setText("ALL OFF");
                    checkBoxled1.setChecked(true);
                    checkBoxled2.setChecked(true);
                    checkBoxled3.setChecked(true);
                    checkBoxled4.setChecked(true);
                } else {
                    button.setText("ALL ON");
                    checkBoxled1.setChecked(false);
                    checkBoxled2.setChecked(false);
                    checkBoxled3.setChecked(false);
                    checkBoxled4.setChecked(false);
                }
            }
        });
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.LED1:
                if (checked)
                    // Put some meat on the sandwich
                    Toast.makeText(getApplicationContext(), "LED1 on", Toast.LENGTH_SHORT).show();
                else
                    // Remove the meat
                    Toast.makeText(getApplicationContext(),"LED1 off",Toast.LENGTH_SHORT).show();
                break;
            case R.id.LED2:
                if (checked)
                    // Cheese me
                    Toast.makeText(getApplicationContext(),"LED2 on",Toast.LENGTH_SHORT).show();
                else
                    // I'm lactose intolerant
                    Toast.makeText(getApplicationContext(),"LED2 off",Toast.LENGTH_SHORT).show();
                break;
            case R.id.LED3:
                if (checked)
                    // Cheese me
                    Toast.makeText(getApplicationContext(),"LED3 on",Toast.LENGTH_SHORT).show();
                else
                    // I'm lactose intolerant
                    Toast.makeText(getApplicationContext(),"LED3 off",Toast.LENGTH_SHORT).show();
                break;
            case R.id.LED4:
                if (checked)
                    // Cheese me
                    Toast.makeText(getApplicationContext(),"LED4 on",Toast.LENGTH_SHORT).show();
                else
                    // I'm lactose intolerant
                    Toast.makeText(getApplicationContext(),"LED4 off",Toast.LENGTH_SHORT).show();
                break;
            // TODO: Veggie sandwich
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
