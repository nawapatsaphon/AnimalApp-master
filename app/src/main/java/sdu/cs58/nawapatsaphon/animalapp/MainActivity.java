package sdu.cs58.nawapatsaphon.animalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   //Explicit
    EditText nameEditText;
    Button startButton;
    String nameString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.edtName);
        startButton = findViewById(R.id.btnStart);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               nameString = nameEditText.getText().toString().trim();

               //check ค่าว่างในตัวแปร nameString
                if (nameString.length() == 0) {
                    Toast.makeText(getApplicationContext(), "กรุณากรอกชื่อด้วยครับ", Toast.LENGTH_SHORT).show();
                }else {
                    //เปิดหน้าเกม
                    Intent startIntent = new Intent(MainActivity.this, GameActivity.class);
                    startIntent.putExtra("Name", nameString);
                    startActivity(startIntent);
                }
            }
        });

    }//end onCreate method

}//end class
