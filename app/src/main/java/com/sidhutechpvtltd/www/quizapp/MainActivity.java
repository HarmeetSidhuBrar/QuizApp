package com.sidhutechpvtltd.www.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private int score;

    private RadioGroup radioGroup1;
    private RadioGroup radioGroup2;
    private RadioGroup radioGroup3;
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    private CheckBox checkBox5;
    private CheckBox checkBox6;
    private EditText editName;
    EditText editText1;
    EditText editText2;
    private Button showButton;

    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;

    private void getView() {
        radioGroup1 = findViewById(R.id.radioButton1);
        radioGroup2 = findViewById(R.id.radioButton2);
        radioGroup3 = findViewById(R.id.radioButton3);
        //Checkbox here
        checkBox1=findViewById(R.id.checkbox_1);
        checkBox2=findViewById(R.id.checkbox_2);
        checkBox3=findViewById(R.id.checkbox_3);
        checkBox4=findViewById(R.id.checkbox_4);
        checkBox5=findViewById(R.id.checkbox_5);
        checkBox6=findViewById(R.id.checkbox_6);
        editText1=findViewById(R.id.edit_text_1);
        editText2=findViewById(R.id.edit_text_2);
        editName =  findViewById(R.id.editText_name);
        showButton = findViewById(R.id.quizSubmissionButton);
        //displayText = findViewById(R.id.textView_name);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getView();
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=0;
                String name = editName.getText().toString();
                //radio button for FIRST QUESTION
                int selectedId1=radioGroup1.getCheckedRadioButtonId();
                int selectedId2=radioGroup2.getCheckedRadioButtonId();
                int selectedId3=radioGroup3.getCheckedRadioButtonId();
                radioButton1=findViewById(selectedId1);
                radioButton2=findViewById(selectedId2);
                radioButton3=findViewById(selectedId3);
                checkBox1.isChecked();
                checkBox2.isChecked();
                checkBox3.isChecked();
                checkBox4.isChecked();
                checkBox5.isChecked();
                checkBox6.isChecked();
                //if statement for radio button
                if (selectedId1==R.id.radioButton1A) {
                    score+=1;
                }
                else {
                    score+=0;
                }

                if (selectedId2==R.id.radioButton2C) {
                    score+=1;
                }
                else {
                    score+=0;
                }

                if (selectedId3==R.id.radioButton3B){
                    score+=1;
                }
                else {
                    score+=0;
                }
                String questionFour=editText1.getText().toString();
                if(questionFour.equals("8 Bits")){
                    score+=1;
                }
                else {
                    score+=0;
                }
                String questionFifth =editText2.getText().toString();
                if(questionFifth.equals("Archie")){
                    score+=1;
                }
                else {
                    score+=0;
                }
                if ( checkBox1.isChecked() && checkBox2.isChecked() ){
                    score+=1;
                }
                else {
                    score+=0;
                }
                if ( checkBox4.isChecked()&& checkBox6.isChecked() ){
                    score+=1;
                }
                else {
                    score+=0;
                }

                String finalScore = getString(R.string.hi) + name + getString(R.string.you_have_scored) + score + getString(R.string.outOf);
                Toast.makeText(getApplicationContext(),finalScore,Toast.LENGTH_LONG).show();

            }
        });
    }
}