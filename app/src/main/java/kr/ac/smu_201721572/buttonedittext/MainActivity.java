package kr.ac.smu_201721572.buttonedittext;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnRes;
    TextView textResult;
    String num1, num2;
    Float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");
        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnAdd = (Button) findViewById(R.id.BtnPlus);
        btnSub = (Button) findViewById(R.id.BtnMinus);
        btnMul = (Button) findViewById(R.id.BtnMultiple);
        btnDiv = (Button) findViewById(R.id.BtnDivide);
        btnRes = (Button) findViewById(R.id.BtnRes);
        textResult = (TextView) findViewById(R.id.TextResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1 == null ||  num2 == null){
                    Toast.makeText(getApplicationContext(), "먼저 값을 입력해주세요.",Toast.LENGTH_SHORT).show();
                }else{
                    result = Float.parseFloat(num1) + Float.parseFloat(num2);
                    textResult.setText("계산결과 : "+ result.toString());
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1 == null ||  num2 == null){
                    Toast.makeText(getApplicationContext(), "먼저 값을 입력해주세요.",Toast.LENGTH_SHORT).show();
                }else {
                    result = Float.parseFloat(num1) - Float.parseFloat(num2);
                    textResult.setText("계산결과 : " + result.toString());
                }            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1 == null ||  num2 == null){
                    Toast.makeText(getApplicationContext(), "먼저 값을 입력해주세요.",Toast.LENGTH_SHORT).show();
                }else{
                result = Float.parseFloat(num1) * Float.parseFloat(num2);
                textResult.setText("계산결과 : "+ result.toString());
            }}
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1 == null ||  num2 == null){
                    Toast.makeText(getApplicationContext(), "먼저 값을 입력해주세요.",Toast.LENGTH_SHORT).show();
                }else{
                if (Float.parseFloat(num2) == 0){
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.",Toast.LENGTH_SHORT).show();
                }
                result = Float.parseFloat(num1) / Float.parseFloat(num2);
                textResult.setText("계산결과 : "+ result.toString());
            }}
        });
        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1 == null ||  num2 == null){
                    Toast.makeText(getApplicationContext(), "먼저 값을 입력해주세요.",Toast.LENGTH_SHORT).show();
                }else{
                result = Float.parseFloat(num1) % Float.parseFloat(num2);
                textResult.setText("계산결과 : "+ result.toString());
            }}
        });

    }
}