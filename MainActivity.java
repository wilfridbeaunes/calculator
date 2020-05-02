package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

//declaration of variables for Buttons and EditText.
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSub, buttonDivision, buttonMul,
        button10, buttonC, buttonEqual,buttonln,buttonlog,buttonpower,buttoninverse,buttoncos,buttonsin,buttontan,buttonpi,buttoncosh,buttonsinh,
        buttontanh, buttone,buttonexp,buttonsqrt,buttonmodulos,buttonradian,buttonfactoriel,buttoncubicsqrt,buttondel,buttonans,buttonmoinplus
        ,buttonpourcentage,buttonplot;

    EditText crunchifyEditText;
    float mValueOne, mValueTwo;
    double a, ans=0;
    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision,crunchifyPower;
//end declaration of variables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// I associate to my variables the name of each button
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttonequal);
        crunchifyEditText = (EditText) findViewById(R.id.edt1);
        buttonmoinplus = (Button) findViewById(R.id.buttonmoinplus);
        buttonpourcentage = (Button) findViewById(R.id.buttonpourcentage);
        //function and variable
        buttonln = (Button) findViewById(R.id.buttonln);
        buttonlog = (Button) findViewById(R.id.buttonlog);
        buttonpower = (Button) findViewById(R.id.buttonpower);
        buttoninverse = (Button) findViewById(R.id.buttoninverse);
        buttoncos = (Button) findViewById(R.id.buttoncos);
        buttonsin = (Button) findViewById(R.id.buttonsin);
        buttontan = (Button) findViewById(R.id.buttontan);
        buttonpi = (Button) findViewById(R.id.buttonpi);
        buttoncosh = (Button) findViewById(R.id.buttoncosh);
        buttonsinh = (Button) findViewById(R.id.buttonsinh);
        buttontanh = (Button) findViewById(R.id.buttontanh);
        buttone = (Button) findViewById(R.id.buttone);
        buttonexp = (Button) findViewById(R.id.buttonexp);
        buttonsqrt = (Button) findViewById(R.id.buttonsqrt);
        buttonmodulos = (Button) findViewById(R.id.buttonmodulos);
        buttonradian = (Button) findViewById(R.id.buttonradian);
        buttonfactoriel = (Button) findViewById(R.id.buttonfactoriel);
        buttoncubicsqrt= (Button) findViewById(R.id.buttoncubicsqrt);
        buttondel = (Button) findViewById(R.id.buttondel);
        buttonans = (Button) findViewById(R.id.buttonans);
        buttonplot=(Button) findViewById(R.id.buttonplot);
//end of affectation of variables

// I define the actions that each button does
/* for exemple if i press the button "1" i will see one appear one the text part "1"
same with the others*/
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "0");
            }
        });
//+/-
        buttonmoinplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "-");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (crunchifyEditText == null) {
                    crunchifyEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    crunchifyAddition = true;
                    crunchifyEditText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                mSubtract = true;
                crunchifyEditText.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                crunchifyMultiplication = true;
                crunchifyEditText.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                crunchifyDivision = true;
                crunchifyEditText.setText(null);
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + ".");
            }
        });
//delete
        buttondel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String str;
                    str = crunchifyEditText.getText().toString();
                    str = str.substring(0, str.length() - 1);
                    crunchifyEditText.setText(str);
                }
                catch (Exception e){
                }
            }
        });
//pi
        buttonpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.PI;
                    crunchifyEditText.setText("");
                    crunchifyEditText.setText(crunchifyEditText.getText().toString() + a);
                }
                catch(Exception e){
                }
            }
        });
//expenentiel(1)
        buttone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.E;
                    crunchifyEditText.setText("");
                    crunchifyEditText.setText(crunchifyEditText.getText().toString() + a);
                }
                catch(Exception e){
                }
            }
        });
//%
        buttonpourcentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Double.parseDouble(crunchifyEditText.getText().toString())/100;
                    crunchifyEditText.setText("");
                    crunchifyEditText.setText(crunchifyEditText.getText().toString() + a);
                }
                catch(Exception e){
                }
            }
        });
//Ans
        buttonans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                crunchifyEditText.setText(ans+"");
            }
        });
//beginning functions

//1/x
        buttoninverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = 1 / Double.parseDouble(crunchifyEditText.getText().toString());
                    crunchifyEditText.setText("");
                    crunchifyEditText.setText(crunchifyEditText.getText().toString() + a);
                }
                catch(Exception e){
                }
            }
        });
//x!
        buttonfactoriel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Double.parseDouble(crunchifyEditText.getText().toString());
                    int er = 0; double i, s = 1;
                    if (a< 0) {
                        er = 20;
                    }
                    else {
                        for (i = 2; i <= a; i += 1.0)
                            s *= i;
                    }
                    crunchifyEditText.setText("");
                    crunchifyEditText.setText(crunchifyEditText.getText().toString() + s);
                }
                catch(Exception e){
                }
            }
        });
//squareRoot
        buttonsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.sqrt(Double.parseDouble(crunchifyEditText.getText().toString()));
                    crunchifyEditText.setText("");
                    crunchifyEditText.setText(crunchifyEditText.getText().toString() + a);
                }
                catch(Exception e){
                }
            }
        });
//cos(x)
        buttoncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.cos(Double.parseDouble(crunchifyEditText.getText().toString()));
                    crunchifyEditText.setText("");
                    crunchifyEditText.setText(crunchifyEditText.getText().toString() + a);
                }
                catch (Exception e) {
                }
            }
        });
//sin(x)
        buttonsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.sin(Double.parseDouble(crunchifyEditText.getText().toString()));
                    crunchifyEditText.setText("");
                    crunchifyEditText.setText(crunchifyEditText.getText().toString() + a);
                }
                catch (Exception e) {
                }
            }
        });

//tan(x)
        buttontan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.tan(Double.parseDouble(crunchifyEditText.getText().toString()));
                    crunchifyEditText.setText("");
                    crunchifyEditText.setText(crunchifyEditText.getText().toString() + a);
                }
                catch (Exception e) {
                }
            }
        });
//log10(x)
        buttonlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.log10(Double.parseDouble(crunchifyEditText.getText().toString()));
                    crunchifyEditText.setText("");
                    crunchifyEditText.setText(crunchifyEditText.getText().toString() + a);
                }
                catch (Exception e) {
                }
            }
        });
//exp(x)
        buttonexp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.exp(Double.parseDouble(crunchifyEditText.getText().toString()));
                    crunchifyEditText.setText("");
                    crunchifyEditText.setText(crunchifyEditText.getText().toString() + a);
                }
                catch (Exception e) {
                }
            }
        });
//ln(x)
        buttonln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.log(Double.parseDouble(crunchifyEditText.getText().toString()));
                    crunchifyEditText.setText("");
                    crunchifyEditText.setText(crunchifyEditText.getText().toString() + a);
                }
                catch (Exception e) {
                }
            }
        });
//cosh(x)
        buttoncosh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.cosh(Double.parseDouble(crunchifyEditText.getText().toString()));
                    crunchifyEditText.setText("");
                }
                catch (Exception e) {
                }
            }
        });
//sinh(x)
        buttonsinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.sinh(Double.parseDouble(crunchifyEditText.getText().toString()));
                    crunchifyEditText.setText("");
                    crunchifyEditText.setText(crunchifyEditText.getText().toString() + a);
                }
                catch (Exception e) {
                }
            }
        });
//tanh(x)
        buttontanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.tanh(Double.parseDouble(crunchifyEditText.getText().toString()));
                    crunchifyEditText.setText("");
                    crunchifyEditText.setText(crunchifyEditText.getText().toString() + a);
                }
                catch (Exception e) {
                }
            }
        });
//cubic root
        buttoncubicsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.cbrt(Double.parseDouble(crunchifyEditText.getText().toString()));
                    crunchifyEditText.setText("");
                    crunchifyEditText.setText(crunchifyEditText.getText().toString() + a);
                }
                catch (Exception e) {
                }
            }
        });
//x^y
        buttonpower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = (Double.parseDouble(crunchifyEditText.getText().toString()));
                    crunchifyEditText.setText("");
                    crunchifyPower = true;
                    crunchifyEditText.setText(null);
                }
                catch (Exception e) {
                }
            }
        });
//|x|
        buttonmodulos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double b,c;
                    a = Double.parseDouble(crunchifyEditText.getText().toString());
                    b = Math.pow(a,2);
                    c = Math.sqrt(b);
                    crunchifyEditText.setText("");
                    crunchifyEditText.setText(crunchifyEditText.getText().toString() + c);
                }
                catch (Exception e) {
                }
            }
        });
        //end of functions

//button equal
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueTwo = Float.parseFloat(crunchifyEditText.getText() + "");

                if (crunchifyAddition == true) {
                    crunchifyEditText.setText(mValueOne + mValueTwo + "");
                    crunchifyAddition = false;
                }
                if (crunchifyMultiplication == true) {
                    crunchifyEditText.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }
                if (mSubtract == true) {
                    crunchifyEditText.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }
                if (crunchifyDivision == true) {
                    crunchifyEditText.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;
                }
                //remenber
                ans=Double.parseDouble(crunchifyEditText.getText().toString());
                if(crunchifyPower == true){
                    crunchifyEditText.setText(Math.pow(a, mValueTwo)+"");
                    crunchifyPower = false;
                }

            }
        });
// button activity 2
        buttonplot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPage2();
            }
        });

    }
    public void openPage2(){
        Intent intent = new Intent(this,graph.class);
        startActivity(intent);
    }
//end of action
}
//end of main program

