package com.example.ksbay.project_manager;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    public boolean buttonpress = false;
    public String cal = "";
    public boolean decimalused = false;
    public boolean inputStatus = true;
    public String modifyText = "";
    public double num1;
    public double num2;


    private void calcResult()
    {
        TextView localTextView = (TextView)findViewById(R.id.SolutionBox);
        this.num2 = Double.parseDouble(localTextView.getText().toString());
        this.inputStatus=false;
        if(this.cal=="+")
            num1+=num2;
        else if(this.cal=="-")
            num1-=num2;
        else if(this.cal=="*")
            num1*=num2;
        else if(this.cal=="/")
            num1/=num2;

        localTextView.setText(Double.toString(num1));
    }
    public void buttonClick0(View paramView)
    {
        TextView localTextView = (TextView)findViewById(R.id.SolutionBox);
        if (this.inputStatus)
        {
            this.modifyText = localTextView.getText().toString();
            this.modifyText += "0";
            localTextView.setText(this.modifyText);
            return;
        }
        localTextView.setText("0");
        this.inputStatus = true;
    }

    public void buttonClick1(View paramView)
    {
        TextView localTextView = (TextView)findViewById(R.id.SolutionBox);
        if (this.inputStatus)
        {
            this.modifyText = localTextView.getText().toString();
            this.modifyText += "1";
            localTextView.setText(this.modifyText);
            return;
        }
        localTextView.setText("1");
        this.inputStatus = true;
    }

    public void buttonClick2(View paramView)
    {
        TextView localTextView = (TextView)findViewById(R.id.SolutionBox);
        if (this.inputStatus)
        {
            this.modifyText = localTextView.getText().toString();
            this.modifyText += "2";
            localTextView.setText(this.modifyText);
            return;
        }
        localTextView.setText("2");
        this.inputStatus = true;
    }

    public void buttonClick3(View paramView)
    {
        TextView localTextView = (TextView)findViewById(R.id.SolutionBox);
        if (this.inputStatus)
        {
            this.modifyText = localTextView.getText().toString();
            this.modifyText += "3";
            localTextView.setText(this.modifyText);
            return;
        }
        localTextView.setText("3");
        this.inputStatus = true;
    }

    public void buttonClick4(View paramView)
    {
        TextView localTextView = (TextView)findViewById(R.id.SolutionBox);
        if (this.inputStatus)
        {
            this.modifyText = localTextView.getText().toString();
            this.modifyText += "4";
            localTextView.setText(this.modifyText);
            return;
        }
        localTextView.setText("4");
        this.inputStatus = true;
    }

    public void buttonClick5(View paramView)
    {
        TextView localTextView = (TextView)findViewById(R.id.SolutionBox);
        if (this.inputStatus)
        {
            this.modifyText = localTextView.getText().toString();
            this.modifyText += "5";
            localTextView.setText(this.modifyText);
            return;
        }
        localTextView.setText("5");
        this.inputStatus = true;
    }

    public void buttonClick6(View paramView)
    {
        TextView localTextView = (TextView)findViewById(R.id.SolutionBox);
        if (this.inputStatus)
        {
            this.modifyText = localTextView.getText().toString();
            this.modifyText += "6";
            localTextView.setText(this.modifyText);
            return;
        }
        localTextView.setText("6");
        this.inputStatus = true;
    }

    public void buttonClick7(View paramView)
    {
        TextView localTextView = (TextView)findViewById(R.id.SolutionBox);
        if (this.inputStatus)
        {
            this.modifyText = localTextView.getText().toString();
            this.modifyText += "7";
            localTextView.setText(this.modifyText);
            return;
        }
        localTextView.setText("7");
        this.inputStatus = true;
    }

    public void buttonClick8(View paramView)
    {
        TextView localTextView = (TextView)findViewById(R.id.SolutionBox);
        if (this.inputStatus)
        {
            this.modifyText = localTextView.getText().toString();
            this.modifyText += "8";
            localTextView.setText(this.modifyText);
            return;
        }
        localTextView.setText("8");
        this.inputStatus = true;
    }

    public void buttonClick9(View paramView)
    {
        TextView localTextView = (TextView)findViewById(R.id.SolutionBox);
        if (this.inputStatus)
        {
            this.modifyText = localTextView.getText().toString();
            this.modifyText += "9";
            localTextView.setText(this.modifyText);
            return;
        }
        localTextView.setText("9");
        this.inputStatus = true;
    }

    public void buttonClickAdd(View paramView)
    {
        TextView localTextView = (TextView)findViewById(R.id.SolutionBox);
        if (localTextView.length() != 0)
        {
            this.num1 = Double.parseDouble(localTextView.getText().toString());
            calcResult();
            this.cal = "+";
            this.buttonpress = true;
            this.decimalused=false;
        }
    }
    public void buttonClickClear(View paramView)
    {
        TextView localTextView = (TextView)findViewById(R.id.SolutionBox);
        this.num1 = 0.0D;
        this.num2 = 0.0D;
        this.cal = "";
        localTextView.setText("");
        this.decimalused = false;
        this.buttonpress = false;
    }

    public void buttonClickDecimal(View paramView)
    {
        TextView localTextView = (TextView)findViewById(R.id.SolutionBox);
        if ((this.inputStatus) && (!this.decimalused))
        {
            this.modifyText = localTextView.getText().toString();
            this.modifyText += ".";
            localTextView.setText(this.modifyText);
            this.decimalused = true;
        }
        while ((localTextView.getText() == ".") || (this.decimalused)) {
            return;
        }
        localTextView.setText(".");
        this.inputStatus = true;
        this.decimalused = true;
    }

    public void buttonClickDivide(View paramView)
    {
        TextView localTextView = (TextView)findViewById(R.id.SolutionBox);
        if (localTextView.length() != 0)
        {
            this.num1 = Double.parseDouble(localTextView.getText().toString());
            calcResult();
            this.cal = "/";
            this.buttonpress = true;
            this.decimalused=false;
        }
    }

    public void buttonClickEquals(View paramView)
    {
        TextView localTextView = (TextView)findViewById(R.id.SolutionBox);
        if ((localTextView.getText().toString() != "") && (localTextView.getText().toString() != "."))
        {
            calcResult();
            this.cal = "";
            this.decimalused=false;
        }
    }

    public void buttonClickMultiply(View paramView)
    {
        TextView localTextView = (TextView)findViewById(R.id.SolutionBox);
        if (localTextView.length() != 0)
        {
            this.num1 = Double.parseDouble(localTextView.getText().toString());
            calcResult();
            this.cal = "*";
            this.buttonpress = true;
            this.decimalused=false;
        }
    }

    public void buttonClickPlusToMinus(View paramView)
    {
        TextView localTextView = (TextView)findViewById(R.id.SolutionBox);
        if (localTextView.length() != 0)
        {
            if (localTextView.getText().toString().startsWith("-"))
            {
                this.modifyText = localTextView.getText().toString();
                localTextView.setText(this.modifyText.substring(1));
            }
            else
            {
                this.modifyText = localTextView.getText().toString();
                this.modifyText = ("-" + this.modifyText);
                localTextView.setText(this.modifyText);
            }

        }

    }
    //subtract has issues when continually subtracting numbers
    //ie 135+241= then -3. will just print last answer
    public void buttonClickSubtract(View paramView)
    {
        TextView localTextView = (TextView)findViewById(R.id.SolutionBox);
        if ((localTextView.length() != 0) && (!this.buttonpress))
        {
            this.num1 = Double.parseDouble(localTextView.getText().toString());
            calcResult();
            this.cal = "+";
            this.decimalused=false;
            this.buttonpress=true;
        }
        if (this.buttonpress)
        {
            localTextView.setText("-");
            this.inputStatus = true;
            return;
        }
        if(localTextView.length()==0)
        {
            localTextView.setText("-");
        }
    }
}
