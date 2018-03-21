package sdu.cs58.nawapatsaphon.animalapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;

public class GameActivity extends AppCompatActivity {
    //Explicit ประกาศตัวแปร
    Button btn1,btn2,btn3,btn4;
    ImageView questionImageView;
    ImageButton volumnImageButton;
    MediaPlayer mediaPlayer; //เล่นไฟล์เสียง
    int questionCount = 10; //ตัวแปรเก็บจำนวนข้อคำถาม
    ArrayList<Integer> qID = new ArrayList<Integer>(); //เป็นชนิด  array สำหรับการสุ่มข้อคำถาม
    String answer;
    int score = 0;
    String getNameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //ผูก Element กับตัวเเปรบน JAVA
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        questionImageView=findViewById(R.id.imvQuestion);
        volumnImageButton=findViewById(R.id.imbVolumn);

        //เช็คหรือนับจำนวนคำถาม
        for (int i=1; i<=questionCount; i++) {
            qID.add(i);
        }
        Collections.shuffle(qID); //กำหนดให้ Landom คำถาม
        setQuestion(qID.remove(0)); //ทำให้คำถามไม่ซ้ำกัน
    }//end onCreate method

    private void setQuestion(int qID) { //ใช้สำหรับกำหนดข้อคำถามเเละเฉลยในเเต่ละข้อ
        if (qID == 1) {
            answer = "นก";
            questionImageView.setImageResource(R.drawable.bird);
            mediaPlayer = MediaPlayer.create(this, R.raw.bird);

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการ Random Choice
            choice.add("นก");
            choice.add("ม้า");
            choice.add("เเมว");
            choice.add("ยุง");
            Collections.shuffle(choice); //Ramdom  choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 2) {
            answer = "เเมว";
            questionImageView.setImageResource(R.drawable.cat);
            mediaPlayer = MediaPlayer.create(this, R.raw.cat);

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการ Random Choice
            choice.add("เเมว");
            choice.add("ม้า");
            choice.add("นก");
            choice.add("ยุง");
            Collections.shuffle(choice); //Ramdom  choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 3) {
            answer = "วัว";
            questionImageView.setImageResource(R.drawable.cow);
            mediaPlayer = MediaPlayer.create(this, R.raw.cow);

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการ Random Choice
            choice.add("วัว");
            choice.add("สิงโต");
            choice.add("หมู");
            choice.add("ยุง");
            Collections.shuffle(choice); //Ramdom  choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 4) {
            answer = "หมา";
            questionImageView.setImageResource(R.drawable.dog);
            mediaPlayer = MediaPlayer.create(this, R.raw.dog);

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการ Random Choice
            choice.add("หมา");
            choice.add("เเมว");
            choice.add("หมู");
            choice.add("ยุง");
            Collections.shuffle(choice); //Ramdom  choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 5) {
            answer = "ช้าง";
            questionImageView.setImageResource(R.drawable.elephant);
            mediaPlayer = MediaPlayer.create(this, R.raw.elephant);

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการ Random Choice
            choice.add("ช้าง");
            choice.add("ม้า");
            choice.add("หมู");
            choice.add("วัว");
            Collections.shuffle(choice); //Ramdom  choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 6) {
            answer = "ม้า";
            questionImageView.setImageResource(R.drawable.horse);
            mediaPlayer = MediaPlayer.create(this, R.raw.horse);

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการ Random Choice
            choice.add("ม้า");
            choice.add("หมู");
            choice.add("เเมว");
            choice.add("ยุง");
            Collections.shuffle(choice); //Ramdom  choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 7) {
            answer = "สิงโต";
            questionImageView.setImageResource(R.drawable.lion);
            mediaPlayer = MediaPlayer.create(this, R.raw.lion);

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการ Random Choice
            choice.add("สิงโต");
            choice.add("ม้า");
            choice.add("เเกะ");
            choice.add("ยุง");
            Collections.shuffle(choice); //Ramdom  choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 8) {
            answer = "ยุง";
            questionImageView.setImageResource(R.drawable.mosquito);
            mediaPlayer = MediaPlayer.create(this, R.raw.mosquito);

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการ Random Choice
            choice.add("ยุง");
            choice.add("ม้า");
            choice.add("เเมว");
            choice.add("เเกะ");
            Collections.shuffle(choice); //Ramdom  choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 9) {
            answer = "หมู";
            questionImageView.setImageResource(R.drawable.pig);
            mediaPlayer = MediaPlayer.create(this, R.raw.pig);

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการ Random Choice
            choice.add("หมู");
            choice.add("สิงโต");
            choice.add("เเมว");
            choice.add("เเกะ");
            Collections.shuffle(choice); //Ramdom  choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 10) {
            answer = "เเกะ";
            questionImageView.setImageResource(R.drawable.sheep);
            mediaPlayer = MediaPlayer.create(this, R.raw.sheep);

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการ Random Choice
            choice.add("เเกะ");
            choice.add("ช้าง");
            choice.add("สิงโต");
            choice.add("วัว");
            Collections.shuffle(choice); //Ramdom  choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }


    }//end setQuestion Method
    public  void choiceAns(View view) { //เอาไว้ตรวจคำตอบ

        Button button = (Button) view;
        String buttonString = button.getText().toString();
        if (buttonString.equals(answer)) {
            score++;
        }
        if (qID.isEmpty()) {//ถ้าทำครบทุกข้อqID จะเป็นค่าว่าง
            getNameString = getIntent().getStringExtra("Name");
            dialogboxScore(getNameString);// method เเสดงผลคพเเนนรวม
        } else {//ถ้าทำยังไม่ครบทุกข้อ
            setQuestion(qID.remove(0));//เรียก method setQuestion()เเสดงคำถามถัดไป

        }


    }// end method choiceAns
    private void dialogboxScore(String name) {//method สำหรับเเสดงคะเเนน
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("สรุปคะเเนน");
        builder.setMessage( name + "ได้คะเเนน " + score +" คะเเนน")
            .setCancelable(false)
            .setPositiveButton("ออกจากเกม", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();//ปิด Activity เพื่อออกจากแอฟ
                }
            })
            .setNegativeButton("เล่นอีกครั้ง", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);
                }
            });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }

    public void playSound(View View) {
        mediaPlayer.start();

        }// end playSound Method

}//end Class


