package com.example.admin.toast;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Traceur extends AppCompatActivity {


    private Point number = new Point();

    public void onIncrement (View view)
    {
        number.increment();
        TextView compteur = (TextView) findViewById(R.id.compteur);
        compteur.setText(number.getCompteur() + "");
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

        number = ,savedInstanceState.getParcelable("sauv");


        TextView compteur = (TextView) findViewById(R.id.compteur);
        compteur.setText(number.getCompteur() + "");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast toast = Toast.makeText(this, R.string.saveInstanceState, Toast.LENGTH_LONG);
        toast.show();

        outState.putParcelable("sauv", number);
    }
}
