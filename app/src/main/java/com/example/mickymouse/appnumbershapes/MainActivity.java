package com.example.mickymouse.appnumbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Nummber  {

        int Constant;

        public  Boolean Squrt(){

            double squareRoot= Math.sqrt(Constant);

            if (squareRoot== Math.floor(squareRoot)){

                return true;

                }else
                    {

                return false;

            }
        }

        public boolean Trianglenumber() {

            int triNumb=1;
            int x=1;

            while (triNumb<Constant){

                x++;
                triNumb+=x;
                }
                if (triNumb==Constant ){
                return true;
                }else {
                return false;
                }

        }







    }
    public void testnumber(View view){

        String Message ="";
        EditText UserNumber = (EditText)findViewById(R.id.NumeditText);


        if (UserNumber.getText().toString().isEmpty())
        {
            Message="PLease Enter a Number";

        } else {

            Nummber Num = new Nummber();

            Num.Constant = Integer.parseInt(UserNumber.getText().toString());


            if (Num.Squrt()) {
                if (Num.Trianglenumber()) {

                    Message = Num.Constant + " is both Triangular and Squared Number";

                } else {

                    Message = Num.Constant + " is Squared but not Triangular";
                }

            } else {
                if (Num.Trianglenumber()) {

                    Message = Num.Constant + " is Triangular but not a Squared Number";

                } else {

                    Message = Num.Constant + " is neither Triangular or Squared Number";
                }

            }

        }
        Toast.makeText(getApplicationContext(),Message,Toast.LENGTH_LONG).show();



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
