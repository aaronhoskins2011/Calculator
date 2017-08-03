package com.example.aaron.Calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.aaron.myapplication.R;

public class MainActivity extends AppCompatActivity {
    static String EMPTY_STRING = "";
    TextView etDisplay; //User input and output
    String userInputOne;//1st number user inputs
    String userInputTwo;//2nd number user inputs
    String operand;//operation being asked for

    //Number Buttons
    Button btnNumber1;
    Button btnNumber2;
    Button btnNumber3;
    Button btnNumber4;
    Button btnNumber5;
    Button btnNumber6;
    Button btnNumber7;
    Button btnNumber8;
    Button btnNumber9;
    Button btnNumber0;
    Button btnDecPoint;
    //Operation Buttons
    Button btnOpAdd;
    Button btnOpSub;
    Button btnOpMul;
    Button btnOpDiv;
    Button btnOpMod;
    Button btnOpPower;
    Button btnOpEqls;
    Button btnOpClear;
    Calculations enteredProblem;//current problem being evaluated


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Boolean firstNumberIsSet = Boolean.FALSE;
        userInputOne = EMPTY_STRING;
        userInputTwo = EMPTY_STRING;
        operand = EMPTY_STRING;
        enteredProblem = new Calculations(userInputOne,userInputTwo,operand);
        //Bind edit text display
        etDisplay = (TextView) findViewById(R.id.etDisplay);
        /****************************
         * Bind Buttons
         */
        //Numbers
        btnNumber1 = (Button)findViewById(R.id.btnNumber1);
        btnNumber2 = (Button)findViewById(R.id.btnNumber2);;
        btnNumber3 = (Button)findViewById(R.id.btnNumber3);;
        btnNumber4 = (Button)findViewById(R.id.btnNumber4);;
        btnNumber5 = (Button)findViewById(R.id.btnNumber5);;
        btnNumber6 = (Button)findViewById(R.id.btnNumber6);;
        btnNumber7 = (Button)findViewById(R.id.btnNumber7);;
        btnNumber8 = (Button)findViewById(R.id.btnNumber8);;
        btnNumber9 = (Button)findViewById(R.id.btnNumber9);;
        btnNumber0 = (Button)findViewById(R.id.btnNumber0);;
        btnDecPoint = (Button)findViewById(R.id.btnDecPoint);
        //Operation
        btnOpAdd = (Button)findViewById(R.id.btnOperatorAdd);
        btnOpSub = (Button)findViewById(R.id.btnOperatorSub);
        btnOpMul = (Button)findViewById(R.id.btnOperatorMul);
        btnOpDiv = (Button)findViewById(R.id.btnOperatorDiv);
        btnOpMod = (Button)findViewById(R.id.btnOperatorMod);
        btnOpPower = (Button)findViewById(R.id.btnOperatorExp);
        btnOpEqls = (Button)findViewById(R.id.btnOperatorEquals);
        btnOpClear = (Button)findViewById(R.id.btnClear);


        /********************************
         *  Action Listeners - Numbers
         */

        btnNumber1.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              String currentDisplay = etDisplay.getText().toString();
                                              etDisplay.setText(currentDisplay + "1");

                                          }
                                      }

        );
        btnNumber2.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              String currentDisplay = etDisplay.getText().toString();
                                              etDisplay.setText(currentDisplay + "2");

                                          }
                                      }

        );
        btnNumber3.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              String currentDisplay = etDisplay.getText().toString();
                                              etDisplay.setText(currentDisplay + "3");

                                          }
                                      }

        );
        btnNumber4.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              String currentDisplay = etDisplay.getText().toString();
                                              etDisplay.setText(currentDisplay + "4");

                                          }
                                      }

        );
        btnNumber5.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              String currentDisplay = etDisplay.getText().toString();
                                              etDisplay.setText(currentDisplay + "5");

                                          }
                                      }

        );
        btnNumber6.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              String currentDisplay = etDisplay.getText().toString();
                                              etDisplay.setText(currentDisplay + "6");

                                          }
                                      }

        );
        btnNumber7.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              String currentDisplay = etDisplay.getText().toString();
                                              etDisplay.setText(currentDisplay + "7");

                                          }
                                      }

        );
        btnNumber8.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              String currentDisplay = etDisplay.getText().toString();
                                              etDisplay.setText(currentDisplay + "8");

                                          }
                                      }

        );
        btnNumber9.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              String currentDisplay = etDisplay.getText().toString();
                                              etDisplay.setText(currentDisplay + "9");

                                          }
                                      }

        );
        btnNumber0.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              String currentDisplay = etDisplay.getText().toString();
                                              etDisplay.setText(currentDisplay + "0");

                                          }
                                      }

        );
        btnDecPoint.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                String currentDisplay = etDisplay.getText().toString();
                                                etDisplay.setText(currentDisplay + ".");

                                            }
                                        }

        );
        /********************************
         *  Action Listeners - Operations
         */

        btnOpAdd.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              String temp;
                                              String currentDisplay = etDisplay.getText().toString();
                                              enteredProblem.setOperand("ADD");
                                              if(enteredProblem.getFirstNumber().equals(EMPTY_STRING)) {
                                                  enteredProblem.setFirstNumber(checkNumber(currentDisplay));
                                                  enteredProblem.setSecondNumber(checkNumber(enteredProblem.getSecondNumber()));
                                              } else {
                                                  enteredProblem.setSecondNumber(checkNumber(currentDisplay));
                                              }

                                              temp = enteredProblem.getAnswer(enteredProblem);
                                              enteredProblem.setFirstNumber(temp);
                                              etDisplay.setText(EMPTY_STRING);
                                          }
                                      }

        );

        btnOpSub.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            String temp;
                                            String currentDisplay = etDisplay.getText().toString();
                                            enteredProblem.setOperand("SUB");
                                            if(enteredProblem.getFirstNumber().equals(EMPTY_STRING)) {
                                                enteredProblem.setFirstNumber(checkNumber(currentDisplay));
                                                enteredProblem.setSecondNumber(checkNumber(enteredProblem.getSecondNumber()));
                                            } else {
                                                enteredProblem.setSecondNumber(checkNumber(currentDisplay));
                                            }

                                            temp = enteredProblem.getAnswer(enteredProblem);
                                            enteredProblem.setFirstNumber(temp);
                                            etDisplay.setText(EMPTY_STRING);
                                        }
                                    }

        );
        btnOpMul.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            String temp;
                                            String currentDisplay = etDisplay.getText().toString();
                                            enteredProblem.setOperand("MUL");
                                            if(enteredProblem.getFirstNumber().equals(EMPTY_STRING)) {
                                                enteredProblem.setFirstNumber(checkNumber(currentDisplay));
                                                enteredProblem.setSecondNumber(checkNumber(enteredProblem.getSecondNumber()));
                                            } else {
                                                enteredProblem.setSecondNumber(checkNumber(currentDisplay));
                                            }

                                            temp = enteredProblem.getAnswer(enteredProblem);
                                            enteredProblem.setFirstNumber(temp);
                                            etDisplay.setText(EMPTY_STRING);
                                        }
                                    }

        );
        btnOpDiv.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            String temp;
                                            String currentDisplay = etDisplay.getText().toString();
                                            enteredProblem.setOperand("DIV");
                                            if(enteredProblem.getFirstNumber().equals(EMPTY_STRING)) {
                                                enteredProblem.setFirstNumber(checkNumber(currentDisplay));
                                                enteredProblem.setSecondNumber(checkNumber(enteredProblem.getSecondNumber()));
                                            } else {
                                                enteredProblem.setSecondNumber(checkNumber(currentDisplay));
                                            }

                                            temp = enteredProblem.getAnswer(enteredProblem);
                                            enteredProblem.setFirstNumber(temp);
                                            etDisplay.setText(EMPTY_STRING);
                                        }
                                    }

        );
        btnOpMod.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            String temp;
                                            String currentDisplay = etDisplay.getText().toString();
                                            enteredProblem.setOperand("MOD");
                                            if(enteredProblem.getFirstNumber().equals(EMPTY_STRING)) {
                                                enteredProblem.setFirstNumber(checkNumber(currentDisplay));
                                                enteredProblem.setSecondNumber(checkNumber(enteredProblem.getSecondNumber()));
                                            } else {
                                                enteredProblem.setSecondNumber(checkNumber(currentDisplay));
                                            }

                                            temp = enteredProblem.getAnswer(enteredProblem);
                                            enteredProblem.setFirstNumber(temp);
                                            etDisplay.setText(EMPTY_STRING);
                                        }
                                    }

        );
        btnOpPower.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            String temp;
                                            String currentDisplay = etDisplay.getText().toString();
                                            enteredProblem.setOperand("EXP");
                                            if(enteredProblem.getFirstNumber().equals(EMPTY_STRING)) {
                                                enteredProblem.setFirstNumber(checkNumber(currentDisplay));
                                                enteredProblem.setSecondNumber(checkNumber(enteredProblem.getSecondNumber()));
                                            } else {
                                                enteredProblem.setSecondNumber(checkNumber(currentDisplay));
                                            }

                                            temp = enteredProblem.getAnswer(enteredProblem);
                                            enteredProblem.setFirstNumber(temp);
                                            etDisplay.setText(EMPTY_STRING);
                                        }
                                    }

        );
        btnOpEqls.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              String currentDisplay = etDisplay.getText().toString();
                                              enteredProblem.setSecondNumber(checkNumber(currentDisplay));
                                              etDisplay.setText(enteredProblem.getAnswer(enteredProblem));
                                              enteredProblem.setFirstNumber(etDisplay.getText().toString());
                                          }
                                      }

        );
        btnOpClear.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view) {
                                             String currentDisplay = EMPTY_STRING;
                                             enteredProblem.setOperand(EMPTY_STRING);
                                             enteredProblem.setFirstNumber(EMPTY_STRING);
                                             enteredProblem.setSecondNumber(EMPTY_STRING);
                                             etDisplay.setText(EMPTY_STRING);
                                         }
                                     }

        );


    }

    private String checkNumber(String passedNumber){
        return passedNumber.equals(EMPTY_STRING) ? "0" : passedNumber;

    }
}
