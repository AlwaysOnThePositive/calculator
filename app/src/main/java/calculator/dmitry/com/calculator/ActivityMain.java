package calculator.dmitry.com.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityMain extends AppCompatActivity implements View.OnClickListener {
    private TextView textExpression;

    private double leftValue;
    private String expression;
    private String action;
    private boolean isRightValue;
    private boolean isComma;
    private double rightValue;
    private double answer;
    private int countNumsAfterComma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn0 = findViewById(R.id.b0);
        Button btn1 = findViewById(R.id.b1);
        Button btn2 = findViewById(R.id.b2);
        Button btn3 = findViewById(R.id.b3);
        Button btn4 = findViewById(R.id.b4);
        Button btn5 = findViewById(R.id.b5);
        Button btn6 = findViewById(R.id.b6);
        Button btn7 = findViewById(R.id.b7);
        Button btn8 = findViewById(R.id.b8);
        Button btn9 = findViewById(R.id.b9);

        Button btnMultiply = findViewById(R.id.bMultiply);
        Button btnDevision = findViewById(R.id.bDivivsion);
        Button btnPlus = findViewById(R.id.bPlus);
        Button btnMinus = findViewById(R.id.bMinus);
        Button btnEquals = findViewById(R.id.bEquals);
        Button btnComma = findViewById(R.id.bComma);
        Button btnDelete = findViewById(R.id.bDelete);

        textExpression = findViewById(R.id.expression);

        leftValue = 0;
        rightValue = 0;
        answer = 0;
        expression = "";
        action = "";
        isRightValue = false;
        isComma = false;
        countNumsAfterComma = 0;

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDevision.setOnClickListener(this);
        btnEquals.setOnClickListener(this);
        btnDelete.setOnClickListener(this);
        btnComma.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.b0:
                if (!isComma) {
                    if (!isRightValue) {
                        leftValue = leftValue * 10;
                    } else {
                        rightValue = rightValue * 10;
                    }
                } else {
                    countNumsAfterComma++;
                    if (!isRightValue) {
                        leftValue = leftValue * 10;
                    } else {
                        rightValue = rightValue * 10;
                    }
                }
                expression = expression + Integer.toString(0);
                textExpression.setText(expression);
                break;

            case R.id.b1:
                if (!isComma){
                    if (!isRightValue) {
                        leftValue = leftValue * 10 + 1;
                    } else {
                        rightValue = rightValue * 10 + 1;
                    }
                } else {
                    countNumsAfterComma++;
                    if (!isRightValue) {
                        leftValue = leftValue + 1 / (Math.pow(10, countNumsAfterComma));
                    } else {
                        rightValue = rightValue + 1 / (Math.pow(10, countNumsAfterComma));
                    }
                }
                expression = expression + Integer.toString(1);
                textExpression.setText(expression);
                break;

            case R.id.b2:
                if (!isComma){
                    if (!isRightValue) {
                        leftValue = leftValue * 10 + 2;
                    } else {
                        rightValue = rightValue * 10 + 2;
                    }
                } else {
                    countNumsAfterComma++;
                    if (!isRightValue) {
                        leftValue = leftValue + 2 / (Math.pow(10, countNumsAfterComma));
                    } else {
                        rightValue = rightValue + 2 / (Math.pow(10, countNumsAfterComma));
                    }
                }
                expression = expression + Integer.toString(2);
                textExpression.setText(expression);
                break;

            case R.id.b3:
                if (!isComma){
                    if (!isRightValue) {
                        leftValue = leftValue * 10 + 3;
                    } else {
                        rightValue = rightValue * 10 + 3;
                    }
                } else {
                    countNumsAfterComma++;
                    if (!isRightValue) {
                        leftValue = leftValue + 3 / (Math.pow(10, countNumsAfterComma));
                    } else {
                        rightValue = rightValue + 3 / (Math.pow(10, countNumsAfterComma));
                    }
                }
                expression = expression + Integer.toString(3);
                textExpression.setText(expression);
                break;

            case R.id.b4:
                if (!isComma){
                    if (!isRightValue) {
                        leftValue = leftValue * 10 + 4;
                    } else {
                        rightValue = rightValue * 10 + 4;
                    }
                } else {
                    countNumsAfterComma++;
                    if (!isRightValue) {
                        leftValue = leftValue + 4 / (Math.pow(10, countNumsAfterComma));
                    } else {
                        rightValue = rightValue + 4 / (Math.pow(10, countNumsAfterComma));
                    }
                }
                expression = expression + Integer.toString(4);
                textExpression.setText(expression);
                break;

            case R.id.b5:
                if (!isComma){
                    if (!isRightValue) {
                        leftValue = leftValue * 10 + 5;
                    } else {
                        rightValue = rightValue * 10 + 5;
                    }
                } else {
                    countNumsAfterComma++;
                    if (!isRightValue) {
                        leftValue = leftValue + 5 / (Math.pow(10, countNumsAfterComma));
                    } else {
                        rightValue = rightValue + 5 / (Math.pow(10, countNumsAfterComma));
                    }
                }
                expression = expression + Integer.toString(5);
                textExpression.setText(expression);
                break;

            case R.id.b6:
                if (!isComma){
                    if (!isRightValue) {
                        leftValue = leftValue * 10 + 6;
                    } else {
                        rightValue = rightValue * 10 + 6;
                    }
                } else {
                    countNumsAfterComma++;
                    if (!isRightValue) {
                        leftValue = leftValue + 6 / (Math.pow(10, countNumsAfterComma));
                    } else {
                        rightValue = rightValue + 6 / (Math.pow(10, countNumsAfterComma));
                    }
                }
                expression = expression + Integer.toString(6);
                textExpression.setText(expression);
                break;

            case R.id.b7:
                if (!isComma){
                    if (!isRightValue) {
                        leftValue = leftValue * 10 + 7;
                    } else {
                        rightValue = rightValue * 10 + 7;
                    }
                } else {
                    countNumsAfterComma++;
                    if (!isRightValue) {
                        leftValue = leftValue + 7 / (Math.pow(10, countNumsAfterComma));
                    } else {
                        rightValue = rightValue + 7 / (Math.pow(10, countNumsAfterComma));
                    }
                }
                expression = expression + Integer.toString(7);
                textExpression.setText(expression);
                break;

            case R.id.b8:
                if (!isComma){
                    if (!isRightValue) {
                        leftValue = leftValue * 10 + 8;
                    } else {
                        rightValue = rightValue * 10 + 8;
                    }
                } else {
                    countNumsAfterComma++;
                    if (!isRightValue) {
                        leftValue = leftValue + 8 / (Math.pow(10, countNumsAfterComma));
                    } else {
                        rightValue = rightValue + 8 / (Math.pow(10, countNumsAfterComma));
                    }
                }
                expression = expression + Integer.toString(8);
                textExpression.setText(expression);
                break;

            case R.id.b9:
                if (!isComma){
                    if (!isRightValue) {
                        leftValue = leftValue * 10 + 9;
                    } else {
                        rightValue = rightValue * 10 + 9;
                    }
                } else {
                    countNumsAfterComma++;
                    if (!isRightValue) {
                        leftValue = leftValue + 9 / (Math.pow(10, countNumsAfterComma));
                    } else {
                        rightValue = rightValue + 9 / (Math.pow(10, countNumsAfterComma));
                    }
                }
                expression = expression + Integer.toString(9);
                textExpression.setText(expression);
                break;

            case R.id.bPlus:
                action = "plus";
                isRightValue = true;
                expression += "+";
                textExpression.setText(expression);
                isComma = false;
                countNumsAfterComma = 0;
                break;

            case R.id.bMinus:
                action = "minus";
                isRightValue = true;
                expression += "-";
                textExpression.setText(expression);
                isComma = false;
                countNumsAfterComma = 0;
                break;

            case R.id.bMultiply:
                action = "multiply";
                isRightValue = true;
                expression += "x";
                textExpression.setText(expression);
                isComma = false;
                countNumsAfterComma = 0;
                break;

            case R.id.bDivivsion:
                action = "division";
                isRightValue = true;
                expression += "/";
                textExpression.setText(expression);
                isComma = false;
                countNumsAfterComma = 0;
                break;

            case R.id.bDelete:
                leftValue = 0;
                rightValue = 0;
                answer = 0;
                expression = "";
                action = "";
                isRightValue = false;
                textExpression.setText(expression);
                isComma = false;
                break;

            case R.id.bComma:
                if (!isComma) {
                    isComma = true;
                    expression += ",";
                    textExpression.setText(expression);
                }
                break;

            case R.id.bEquals:
                boolean checkL = checkDouble(leftValue);
                boolean checkR = checkDouble(rightValue);

                if (action.equals("plus")) {
                    answer = leftValue + rightValue;

                    if (checkL || checkR) {
                        expression = String.format("%.4f", answer);
                    } else {
                        expression = String.format("%.0f", answer);
                    }

                    textExpression.setText(expression);
                } else {
                    if (action.equals("minus")) {
                        answer = leftValue - rightValue;

                        if (checkL || checkR) {
                            expression = String.format("%.4f", answer);
                        } else {
                            expression = String.format("%.0f", answer);
                        }

                        textExpression.setText(expression);
                    } else {
                        if (action.equals("multiply")) {
                            answer = leftValue * rightValue;

                            if (checkL || checkR) {
                                expression = String.format("%.4f", answer);
                            } else {
                                expression = String.format("%.0f", answer);
                            }

                            textExpression.setText(expression);
                        } else {
                            answer = leftValue / rightValue;
                            if (checkL || checkR) {
                                expression = String.format("%.4f", answer);
                            } else {
                                expression = String.format("%.0f", answer);
                            }
                            textExpression.setText(expression);
                        }
                    }
                }
                countNumsAfterComma = 0;
                leftValue = 0;
                rightValue = 0;
                answer = 0;
                expression = "";
                action = "";
                isRightValue = false;
                isComma = false;
                break;
        }

    }

    private boolean checkDouble(double value) {
        int approximateVal = (int) value;
        double remainder = value - approximateVal;

        return !(remainder == 0);
    }
}
