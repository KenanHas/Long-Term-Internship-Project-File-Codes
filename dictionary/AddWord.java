package com.kenanh.dictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class AddWord extends AppCompatActivity {
    Database database;
    EditText wordNameTxt,wordMeaningTxt,wordCategoryTxt;
  RadioGroup radioGroup;
  RadioButton radioButton;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_word);
        Intent intent = getIntent();
        wordMeaningTxt = findViewById(R.id.wordMeaningTxt);
        wordNameTxt = findViewById(R.id.wordNameTxt);
        wordCategoryTxt = findViewById(R.id.wordCategoryTxt);
        database = new Database(this);

        radioGroup = findViewById(R.id.radioGroup);

    }
    public void clickRadioButton(View view)
    {
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        wordCategoryTxt.setText(radioButton.getText().toString());
    }
    public void addWord(View view)
    {
     String word= wordMeaningTxt.getText().toString();
     String name = wordNameTxt.getText().toString();
     String category = wordCategoryTxt.getText().toString();

     if (word.matches("")|| name.matches("")||category.matches(""))
     {
         Toast.makeText(this, "Boş Alanları Doldurunuz.", Toast.LENGTH_SHORT).show();
     }
     else {
         database.addWord(word,name, category);
         Toast.makeText(this, "Kelime Eklendi.", Toast.LENGTH_SHORT).show();
     }
        wordMeaningTxt.setText("");
        wordNameTxt.setText("");
        wordCategoryTxt.setText("");
    }
    public void liste(View view)
    {
        Intent intent = new Intent(AddWord.this,WordsList.class);
        startActivity(intent);
    }
}