package edu.vcu.nguyenam8.proj1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    int MY_REQUEST =1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickUpdate (View view)
    {
        Intent i = new Intent(this, AccessControl.class);
        this.startActivityForResult(i, MY_REQUEST);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if (resultCode==RESULT_OK && requestCode=MY_REQUEST)
        {

        }
    }
}
