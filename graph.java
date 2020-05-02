package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class graph extends AppCompatActivity {
    //declaration variable
    Button buttonReturn, bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btcos,btsin,bttan,btcosh,btsinh,bttanh,btln,
            btexp,btpow,btsqrt,btx,btclear,btplus,btmoin,btfois,btdiv,btplot, btclose;

    EditText TextView;

    GraphView graphPlot;
    LineGraphSeries<DataPoint> series;
    double x,y;
    int i;
    boolean crunchifybtcos,crunchifybtsin,crunchifybttan,crunchifybtcosh,crunchifybtsinh,crunchifybttanh,crunchifybtln,crunchifybtexp,crunchifybtsqrt,crunchifybtX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
//I associate to my variables the name of each button
        bt1=findViewById(R.id.but1);
        bt2=findViewById(R.id.but2);
        bt3=findViewById(R.id.but3);
        bt4=findViewById(R.id.but4);
        bt5=findViewById(R.id.but5);
        bt6=findViewById(R.id.but6);
        bt7=findViewById(R.id.but7);
        bt8=findViewById(R.id.but8);
        bt9=findViewById(R.id.but9);
        btcos=findViewById(R.id.buttonFcos);
        btsin=findViewById(R.id.buttonFsin);
        bttan=findViewById(R.id.buttonFtan);
        btcosh=findViewById(R.id.buttonFcosh);
        btsinh=findViewById(R.id.buttonFsinh);
        bttanh=findViewById(R.id.buttonFtanh);
        btln=findViewById(R.id.buttonFln);
        btexp=findViewById(R.id.buttonFexp);
        btpow=findViewById(R.id.butPow);
        btsqrt=findViewById(R.id.butsqrt);
        btx=findViewById(R.id.butX);
        btclear=findViewById(R.id.butClear);
        btplus=findViewById(R.id.butPlus);
        btmoin=findViewById(R.id.butMoin);
        btfois=findViewById(R.id.butFois);
        btdiv=findViewById(R.id.butDiv);
        btplot=findViewById(R.id.butPlot);
        buttonReturn = (Button) findViewById(R.id.buttonreturn);
        TextView=(EditText) findViewById(R.id.editText2);
        btclose=findViewById(R.id.butclose);
        bt0=findViewById(R.id.but0);

        graphPlot=  (GraphView) findViewById(R.id.graph);
        series= new LineGraphSeries<DataPoint>();


        // actions does by each button
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView.setText(TextView.getText() + "0");
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView.setText(TextView.getText() + "1");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { TextView.setText(TextView.getText() + "2");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView.setText(TextView.getText() + "3");
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView.setText(TextView.getText() + "4");
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView.setText(TextView.getText() + "5");
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView.setText(TextView.getText() + "6");
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView.setText(TextView.getText() + "7");
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView.setText(TextView.getText() + "8");
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView.setText(TextView.getText() + "9");
            }
        });
        btclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView.setText("");
                graphPlot.removeSeries(series);
            }
        });
        btclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView.setText(TextView.getText() + ")");
            }
        });
        btx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView.setText(TextView.getText() + "x");
            }
        });

        btcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView.setText("cos(x)");
                x=-20;
                for(i=0; i<500; i++){
                    x=x+0.1;
                    y=Math.cos(x);
                    series.appendData(new DataPoint(x,y),true,500);
                }
                crunchifybtcos= true;
            }
        });
        btcosh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView.setText("cosh(x)");
                x=-3;
                for(i=0; i<59; i++){
                    x=x+0.1;
                    y=Math.cosh(x);
                    series.appendData(new DataPoint(x,y),true,59);
                }
                crunchifybtcosh= true;
            }
        });
        btsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView.setText("sin(x)");
                x=-20;
                for(i=0; i<500; i++){
                    x=x+0.1;
                    y=Math.sin(x);
                    series.appendData(new DataPoint(x,y),true,500);
                }
                crunchifybtsin= true;
            }
        });
        btsinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView.setText("sinh(x)");
                x=-3;
                for(i=0; i<60; i++){
                    x=x+0.1;
                    y=Math.sinh(x);
                    series.appendData(new DataPoint(x,y),true,60);
                }
                crunchifybtsinh= true;
            }
        });
        bttan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView.setText("tan(x)");
                x=-10;
                for(i=0; i<200; i++){
                    x=x+0.1;
                    y=Math.tan(x);
                    series.appendData(new DataPoint(x,y),true,200);
                }
                crunchifybttan= true;
            }
        });
        bttanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView.setText("tanh(x)");
                x=-3;
                for(i=0; i<60; i++){
                    x=x+0.1;
                    y=Math.tanh(x);
                    series.appendData(new DataPoint(x,y),true,60);
                }
                crunchifybttanh= true;
            }
        });
        btexp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView.setText("exp(x)");
                x=-5;
                for(i=0; i<200; i++){
                    x=x+0.1;
                    y=Math.exp(x);
                    series.appendData(new DataPoint(x,y),true,200);
                }
                crunchifybtexp= true;
            }
        });

        btln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView.setText("ln(x)");
                for(i=0; i<500; i++){
                    x=x+0.1;
                    y=Math.log(x);
                    series.appendData(new DataPoint(x,y),true,500);
                }
                crunchifybtln= true;
            }
        });

        btplot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (crunchifybtsin== true){
                    graphPlot.addSeries(series);
                    crunchifybtsin= false;
                }
                if (crunchifybtsinh== true){
                    graphPlot.addSeries(series);
                    crunchifybtsinh= false;
                }
                if (crunchifybtcos== true){
                    graphPlot.addSeries(series);
                    crunchifybtcos= false;
                }
                if (crunchifybtcosh== true){
                    graphPlot.addSeries(series);
                    crunchifybtcosh= false;
                }
                if (crunchifybttan== true){
                    graphPlot.addSeries(series);
                    crunchifybttan= false;
                }
                if (crunchifybttanh== true){
                    graphPlot.addSeries(series);
                    crunchifybttanh= false;
                }
                if (crunchifybtexp== true){
                    graphPlot.addSeries(series);
                    crunchifybtexp= false;
                }
                if (crunchifybtln== true){
                    graphPlot.addSeries(series);
                    crunchifybtln= false;
                }
            }
        });

        buttonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPage2();
            }
        });
        //coding of function
    }
    public void openPage2(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
