package com.example.hp.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;


 class Myname
{
    private  String name="poushali";
    public String getName()
    {
        return name;
    }

}




public class MainActivity extends AppCompatActivity {
Myname m= new Myname();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name=(EditText)findViewById(R.id.editText);

                name.setText(m.getName());
    }


}
