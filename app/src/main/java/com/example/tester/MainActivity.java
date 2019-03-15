package com.example.tester;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etName;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.et_name);
        radioGroup = findViewById(R.id.radioGroup);

    }

    public void click(View view) {
        int sex = 0;
        String name = etName.getText().toString().trim();
        if (TextUtils.isEmpty(name)) {
            Toast.makeText(getApplicationContext(),"請輸入姓名",Toast.LENGTH_SHORT).show();
            return;
        }
        int id = radioGroup.getCheckedRadioButtonId();
        switch (id) {
            case R.id.rb_man:
                sex = 1;
                break;
            case R.id.rb_woman:
                sex = 2;
                break;
            case R.id.rb_other:
                sex = 3;
                break;
        }
        if (sex == 0) {
            Toast.makeText(getApplicationContext(),"請選擇性別",Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("name",name);
        intent.putExtra("sex",sex);
        startActivity(intent);
    }


}
