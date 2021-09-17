package com.example.semana5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar mibarrra = findViewById(R.id.mibarra);
        setSupportActionBar(mibarrra);
        /*getSupportActionBar().setTitle("Leveling");*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mimenuu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1 :
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
                return true;
            case R.id.item2 :
                Toast.makeText(getApplicationContext(),"oculto1",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Intent intent1 = new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(intent1);
                return true;
            case R.id.item4:
                Toast.makeText(getApplicationContext(),"oculto2",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}