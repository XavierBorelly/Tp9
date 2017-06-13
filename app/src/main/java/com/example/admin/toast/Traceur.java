package com.example.admin.toast;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Traceur extends AppCompatActivity {


    private int incrément =0;

    public void onIncrement (View view)
    {
        incrément++;
        TextView compteur = (TextView) findViewById(R.id.compteur);
        compteur.setText(incrément + "");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast toast = Toast.makeText(this, R.string.resume, Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast toast = Toast.makeText(this, R.string.restart, Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast toast = Toast.makeText(this, R.string.stop, Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toast = Toast.makeText(this, R.string.destroy, Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Toast toast = Toast.makeText(this, R.string.restoreInstanceState, Toast.LENGTH_LONG);
        toast.show();


        incrément = savedInstanceState.getInt("progress", 0);


        TextView compteur = (TextView) findViewById(R.id.compteur);
        compteur.setText(incrément + "");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast toast = Toast.makeText(this, R.string.saveInstanceState, Toast.LENGTH_LONG);
        toast.show();

        outState.putInt("progress", incrément);
    }
}
