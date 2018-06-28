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
    TextView calc, show_result;
    String calculate = "";
    double result = 0;

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
        show_result = findViewById(R.id.show_result);
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
                String[] arrayCalc = calculate.split(" ");
                String lastCalc = arrayCalc[arrayCalc.length - 1];
                if (!lastCalc.contains(".")) {
                    if (calculate.endsWith(" ") || calculate.isEmpty()) {
                        calculate += "0.";
                    } else {
                        calculate += ".";
                    }
                    calc.setText(calculate);
                }
            }
        });

        // Cleaning Click Listeners

        btnErase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!calculate.isEmpty()) {
                    int index = calculate.length();
                    if (calculate.endsWith(" ")) {
                        calculate = calculate.substring(0, index - 3);
                    } else if (calculate.endsWith("ans")) {
                        calculate = calculate.substring(0, index - 3);
                    } else {
                        calculate = calculate.substring(0, index - 1);
                    }
                    calc.setText(calculate);
                }
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
                if (calculate.endsWith(".")) {
                    int index = calculate.length();
                    calculate = calculate.substring(0, index - 1);
                }
                boolean is_number = false;
                int i = 9;
                while(i >= 0) {
                    if (calculate.endsWith(String.valueOf(i))) {
                        is_number = true;
                    }
                    i --;
                }
                if (!calculate.isEmpty() && is_number)  {
                    calculate = calculate + " + ";
                    calc.setText(calculate);
                } else if (calculate.isEmpty() && result != 0) {
                    calculate = "ans + ";
                    calc.setText(calculate);
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculate.endsWith(".")) {
                    int index = calculate.length();
                    calculate = calculate.substring(0, index - 1);
                }
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
                } else if (calculate.isEmpty() && result != 0) {
                    calculate = "ans - ";
                    calc.setText(calculate);
                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculate.endsWith(".")) {
                    int index = calculate.length();
                    calculate = calculate.substring(0, index - 1);
                }
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
                } else if (calculate.isEmpty() && result != 0) {
                    calculate = "ans X ";
                    calc.setText(calculate);
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculate.endsWith(".")) {
                    int index = calculate.length();
                    calculate = calculate.substring(0, index - 1);
                }
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
                } else if (calculate.isEmpty() && result != 0) {
                    calculate = "ans / ";
                    calc.setText(calculate);
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean canCalcul = true;
                if (calculate.isEmpty()) {
                    canCalcul = false;
                    show_result.setText("0");
                } else if (calculate.contains(" / 0")) {
                    if (!calculate.contains(" / 0.")) {
                        canCalcul = false;
                        show_result.setText(getResources().getString(R.string.divide_zero));
                    }
                }
                if (canCalcul) {
                    if (calculate.endsWith(" ")) {
                        calculate = calculate.substring(0, calculate.length() - 3);
                    }
                    boolean double_spotted = calculate.contains(".");
                    String[] calcArray = calculate.split(" ");
                    if (calcArray.length == 1) {
                        if (double_spotted) {
                            show_result.setText(calcArray[0]);
                        } else {
                            show_result.setText(String.valueOf((int) Double.parseDouble(calcArray[0])));
                        }
                    } else if (calcArray.length == 3) {
                        if (calculate.contains("ans")) {
                            switch (calcArray[1]) {
                                case "+":
                                    result = result + Double.parseDouble(calcArray[2]);
                                    break;
                                case "-":
                                    result = result - Double.parseDouble(calcArray[2]);
                                    break;
                                case "X":
                                    result = result * Double.parseDouble(calcArray[2]);
                                    break;
                                case "/":
                                    result = result / Double.parseDouble(calcArray[2]);
                                    break;
                                default:
                                    show_result.setText(getResources().getString(R.string.unknown_error));
                            }
                        } else {
                            switch (calcArray[1]) {
                                case "+":
                                    result = Double.parseDouble(calcArray[0]) + Double.parseDouble(calcArray[2]);
                                    break;
                                case "-":
                                    result = Double.parseDouble(calcArray[0]) - Double.parseDouble(calcArray[2]);
                                    break;
                                case "X":
                                    result = Double.parseDouble(calcArray[0]) * Double.parseDouble(calcArray[2]);
                                    break;
                                case "/":
                                    result = Double.parseDouble(calcArray[0]) / Double.parseDouble(calcArray[2]);
                                    break;
                                default:
                                    show_result.setText(getResources().getString(R.string.unknown_error));
                            }
                        }
                        if (!double_spotted || String.valueOf(result).endsWith(".0")) {
                            show_result.setText(String.valueOf((int) result));
                        } else {
                            show_result.setText(String.valueOf(result));
                        }
                    } else {
                        if (calculate.contains("ans")) {
                            switch (calcArray[1]) {
                                case "+":
                                    result = result + Double.parseDouble(calcArray[2]);
                                    break;
                                case "-":
                                    result = result - Double.parseDouble(calcArray[2]);
                                    break;
                                case "X":
                                    result = result * Double.parseDouble(calcArray[2]);
                                    break;
                                case "/":
                                    result = result / Double.parseDouble(calcArray[2]);
                                    break;
                                default:
                                    show_result.setText(getResources().getString(R.string.unknown_error));
                            }
                        } else {
                            switch (calcArray[1]) {
                                case "+":
                                    result = Double.parseDouble(calcArray[0]) + Double.parseDouble(calcArray[2]);
                                    break;
                                case "-":
                                    result = Double.parseDouble(calcArray[0]) - Double.parseDouble(calcArray[2]);
                                    break;
                                case "X":
                                    result = Double.parseDouble(calcArray[0]) * Double.parseDouble(calcArray[2]);
                                    break;
                                case "/":
                                    result = Double.parseDouble(calcArray[0]) / Double.parseDouble(calcArray[2]);
                                    break;
                                default:
                                    show_result.setText(getResources().getString(R.string.unknown_error));
                            }
                        }
                        int k = 3;
                        while (k < calcArray.length) {
                            switch (calcArray[k]) {
                                case "+":
                                    result = result + Double.parseDouble(calcArray[k + 1]);
                                    break;
                                case "-":
                                    result = result - Double.parseDouble(calcArray[k + 1]);
                                    break;
                                case "X":
                                    result = result * Double.parseDouble(calcArray[k + 1]);
                                    break;
                                case "/":
                                    result = result / Double.parseDouble(calcArray[k + 1]);
                                    break;
                                default:
                                    show_result.setText(getResources().getString(R.string.unknown_error));
                            }
                            if (!double_spotted || String.valueOf(result).endsWith(".0")) {
                                show_result.setText(String.valueOf((int) result));
                            } else {
                                show_result.setText(String.valueOf(result));
                            }
                            k += 2;
                        }
                    }
                    calculate = "";
                    calc.setText(calculate);
                }
            }
        });
    }
}
