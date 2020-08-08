package com.example.hello_world;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private int count =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void sayHello(View view) {

        Log.d("Test", String.valueOf(0));
        double x=0;
        double y =0;
        ArrayList<Toast> toastList = new ArrayList<Toast>();
        Button btn = (Button)findViewById(R.id.btnHello);
        btn.setEnabled(false);
        int toastAmount = (int)(Math.random()*100);
        if(toastAmount <30){
            toastAmount = 30;
        }


        for(int k = 0 ;k<toastAmount;k++){
            toastList.add(Toast.makeText(getApplicationContext(),"Fuck you",Toast.LENGTH_SHORT));
        }


        Toast fToast = Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT);
        int cont = 0;
        for(int i=0;i<toastAmount;i++){
            x = Math.random()*1000;
            y= Math.random()*2000;
            toastList.get(i).setGravity(Gravity.TOP|Gravity.LEFT,(int)x,(int)y);
            toastList.get(i).show();
            cont ++;

            Log.d("Test2",String.valueOf(x)+"x " + String.valueOf(y) + "y");
        }
        Log.d("Test2",String.valueOf(cont));

        }

    public void reSet(View view) {

        Log.d("Test3","Reset Hit");
        Button bt = (Button)findViewById(R.id.btnHello);
        bt.setEnabled(true);


    }
}
