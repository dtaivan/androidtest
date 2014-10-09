package com.example.examplee;





import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.support.v4.app.Fragment;

import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	//test https://www.youtube.com/watch?v=ZK20jVt7XEc
	//smoke 
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
    }//dafsdfafda
    public void login(View view){
        if(username.getText().toString().equals("admin") && 
        password.getText().toString().equals("admin")){
        Toast.makeText(getApplicationContext(), "Redirecting...", 
        Toast.LENGTH_SHORT).show();
        RelativeLayout rl = (RelativeLayout)findViewById(R.id.your_layout_id);
        rl.setBackgroundColor(Color.DKGRAY);
        counter++;
     }  else{
         Toast.makeText(getApplicationContext(), "Wrong Credentials ",
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
       
        
        switch (item.getItemId()) {
        case R.id.item1:
        	PlaceholderFragment d=new PlaceholderFragment();
        	d.onClick(null);
            return true;
        case R.id.item2:
        	MainActivity.setBackgroundColor(android.graphics.Color.RED);
            return true;
        default:
            return super.onOptionsItemSelected(item);
    }
       
    }
	
	private static void setBackgroundColor(int red) {
		// TODO Auto-generated method stub
		
	}
	public static class PlaceholderFragment extends Fragment {
		public void onClick(View arg0) {
			Intent tableIntent = new Intent(getActivity(), Setting.class);
		}
	}
}
