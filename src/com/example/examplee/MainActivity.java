package com.example.examplee;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity  {
	
	
	//Tsedendamba
	private EditText  username=null;
	   private EditText  password=null;
	   private TextView attempts;
	   private Button login;
	   int counter = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.editText1);
        password = (EditText)findViewById(R.id.editText2);
        attempts = (TextView)findViewById(R.id.textView5);
        attempts.setText(Integer.toString(counter));
       // back = (MainActivity)createDisplayContext(display);
        login = (Button)findViewById(R.id.button1);
    }
    public void login(View view){
        if(username.getText().toString().equals("admin") && 
        password.getText().toString().equals("admin")){
        Toast.makeText(getApplicationContext(), "Redirecting...", 
        Toast.LENGTH_SHORT).show();
        counter++;
     }  else{
         Toast.makeText(getApplicationContext(), "Wrong Credentials",
        	      Toast.LENGTH_SHORT).show();
        	      attempts.setBackgroundColor(Color.RED);	
        	      counter--;
        	      attempts.setText(Integer.toString(counter));
        	      if(counter==0){
        	         login.setEnabled(false);
        	      }

        	   }

        	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
        	MainActivity.setBackgroundColor(android.graphics.Color.RED);
        	
            return true;
        }
        return super.onOptionsItemSelected(item);
        
       
    }
	private static void setBackgroundColor(int red) {
		// TODO Auto-generated method stub
		
	}
}
