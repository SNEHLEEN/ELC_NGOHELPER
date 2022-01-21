
package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NgoDetails extends AppCompatActivity {
EditText c1,c2,c3,c4,c5,c6,c7,c8,c9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngo_details);
        c1=(EditText)findViewById(R.id.t1);
        c2=(EditText)findViewById(R.id.t2);
        c3=(EditText)findViewById(R.id.t3);
        c4=(EditText)findViewById(R.id.t4);
        c5=(EditText)findViewById(R.id.t5);
        c6=(EditText)findViewById(R.id.t6);
        c7=(EditText)findViewById(R.id.t7);
        c8=(EditText)findViewById(R.id.t8);
        c9=(EditText)findViewById(R.id.p1);
    }
public void b1(View view)
{
    DBHelper db= new DBHelper(this);
    String number=c4.getText().toString();
    String pincode=c6.getText().toString();
    //int pincode1=Integer.parseInt(pincode);
 //   int number1=Integer.parseInt(number);
    Boolean a=db.insertregister(c1.getText().toString(),c2.getText().toString(),c3.getText().toString(),number,c5.getText().toString(),pincode,c9.getText().toString(),c7.getText().toString(),c8.getText().toString());
   if(a) {
       Toast.makeText(this, "Completed", Toast.LENGTH_LONG).show();
   }
   else
   {
       Toast.makeText(this, "Failed", Toast.LENGTH_LONG).show();
   }
   c1.setText("");
    c2.setText("");
    c3.setText("");
    c4.setText("");
    c5.setText("");
    c6.setText("");
    c7.setText("");
    c8.setText("");
    c9.setText("");

}
public void h1(View view)
{
    Intent intent= new Intent(this,MainActivity.class);
    startActivity(intent);
}
}