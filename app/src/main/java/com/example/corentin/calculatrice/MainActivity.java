package com.example.corentin.calculatrice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btn0, btnDot, btnPlus, btnMinus, btnMultiply, btnDivide;
    Button btnEqual, btnClean, btnErase;
    TextView calc, result;
    String calculate = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Numbers
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnDot = findViewById(R.id.btnDot);

        // Actions
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnEqual = findViewById(R.id.btnEqual);

        // Cleaning
        btnClean = findViewById(R.id.btnClean);
        btnErase = findViewById(R.id.btnErase);

        // Show
        result = findViewById(R.id.result);
        calc = findViewById(R.id.calc);

        // Numbers Click Listeners

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate += "0";
                calc.setText(calculate);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate += "1";
                calc.setText(calculate);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate += "2";
                calc.setText(calculate);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate += "3";
                calc.setText(calculate);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate += "4";
                calc.setText(calculate);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate += "5";
                calc.setText(calculate);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate += "6";
                calc.setText(calculate);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate += "7";
                calc.setText(calculate);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate += "8";
                calc.setText(calculate);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate += "9";
                calc.setText(calculate);
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate += ".";
                calc.setText(calculate);
            }
        });

        // Cleaning Click Listeners

        btnErase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int index = calculate.length();
                calculate = calculate.substring(0, index - 1);
                calc.setText(calculate);
            }
        });

        btnClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate = "";
                calc.setText(calculate);
            }
        });

        // Actions Click Listeners
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean is_number = false;
                int i = 9;
                if (calculate.endsWith(".")) {
                    int index = calculate.length();
                    calculate = calculate.substring(0, index - 1);
                }
                while(i >= 0) {
                    if (calculate.endsWith(String.valueOf(i))) {
                        is_number = true;
                    }
                    i --;
                }
                if (!calculate.isEmpty() && is_number)  {
                    calculate = calculate + " + ";
                    calc.setText(calculate);
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean is_number = false;
                int i = 9;
                while(i >= 0) {
                    if (calculate.endsWith(String.valueOf(i))) {
                        is_number = true;
                    }
                    i --;
                }
                if (!calculate.isEmpty() && is_number)  {
                    calculate = calculate + " - ";
                    calc.setText(calculate);
                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean is_number = false;
                int i = 9;
                while(i >= 0) {
                    if (calculate.endsWith(String.valueOf(i))) {
                        is_number = true;
                    }
                    i --;
                }
                if (!calculate.isEmpty() && is_number)  {
                    calculate = calculate + " X ";
                    calc.setText(calculate);
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean is_number = false;
                int i = 9;
                while(i >= 0) {
                    if (calculate.endsWith(String.valueOf(i))) {
                        is_number = true;
                    }
                    i --;
                }
                if (!calculate.isEmpty() && is_number)  {
                    calculate = calculate + " / ";
                    calc.setText(calculate);
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean canCalcul = true;
                String[] calcArray = calculate.split(" ");
                if (calculate.isEmpty()) {
                    canCalcul = false;
                    result.setText(getResources().getString(R.string.empty_field));
                }
                if (canCalcul) {
                    for (String singleCalc: calcArray) {

                    }
                }

            }
        });
    }
}
