 package com.example.ejemplotablelayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;


 public class MainActivity extends AppCompatActivity {

     Button b1;
     Button b2;
     Button b3;
     Button b4;
     Button b5;
     Button b6;
     Button b7;
     Button b8;
     Button b9;
     Button b;

     String turno="X";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);

        recorrer
                ();

    }

     public void jugar(View view) {
        Button button=(Button) view;

        if(button.getText().toString().equals("")){
            button.setText(turno);

            verificarGana(turno);

            esEmpate();

            cambiarTurno();
        }







     }

     private void esEmpate() {
         String casilla1=b1.getText().toString();
         String casilla2=b2.getText().toString();
         String casilla3=b3.getText().toString();
         String casilla4=b4.getText().toString();
         String casilla5=b5.getText().toString();
         String casilla6=b6.getText().toString();
         String casilla7=b7.getText().toString();
         String casilla8=b8.getText().toString();
         String casilla9=b9.getText().toString();

         if(!casilla1.equals("")&&!casilla2.equals("")&&!casilla3.equals("")&&!casilla4.equals("")&&!casilla5.equals("")&&!casilla6.equals("")&&!casilla7.equals("")&&!casilla8.equals("")&&!casilla9.equals("")){
             empate();
         }

     }

     private void empate() {
         b1.setEnabled(false);
         b2.setEnabled(false);
         b3.setEnabled(false);
         b4.setEnabled(false);
         b5.setEnabled(false);
         b6.setEnabled(false);
         b7.setEnabled(false);
         b8.setEnabled(false);
         b9.setEnabled(false);

         Toast.makeText(this,"EMPATE",Toast.LENGTH_LONG).show();

     }

     private void verificarGana(String turno) {

        String casilla1=b1.getText().toString();
         String casilla2=b2.getText().toString();
         String casilla3=b3.getText().toString();
         String casilla4=b4.getText().toString();
         String casilla5=b5.getText().toString();
         String casilla6=b6.getText().toString();
         String casilla7=b7.getText().toString();
         String casilla8=b8.getText().toString();
         String casilla9=b9.getText().toString();

        if(casilla1.equals(turno) && casilla2.equals(turno) && casilla3.equals(turno)){
            gano(turno);
        }
         if(casilla4.equals(turno) && casilla5.equals(turno) && casilla6.equals(turno)){
             gano(turno);
         }
         if(casilla7.equals(turno) && casilla8.equals(turno) && casilla9.equals(turno)){
             gano(turno);
         }
         if(casilla1.equals(turno) && casilla5.equals(turno) && casilla9.equals(turno)){
             gano(turno);
         }
         if(casilla3.equals(turno) && casilla5.equals(turno) && casilla7.equals(turno)){
             gano(turno);
         }
         if(casilla1.equals(turno) && casilla4.equals(turno) && casilla7.equals(turno)){
             gano(turno);
         }
         if(casilla3.equals(turno) && casilla6.equals(turno) && casilla9.equals(turno)){
             gano(turno);
         }
         if(casilla2.equals(turno) && casilla5.equals(turno) && casilla8.equals(turno)){
             gano(turno);
         }



     }

     private void gano(String turno) {

        b1.setEnabled(false);
         b2.setEnabled(false);
         b3.setEnabled(false);
         b4.setEnabled(false);
         b5.setEnabled(false);
         b6.setEnabled(false);
         b7.setEnabled(false);
         b8.setEnabled(false);
         b9.setEnabled(false);

         Toast.makeText(this,"Ha ganado "+turno,Toast.LENGTH_LONG).show();
     }

     private void cambiarTurno() {
        if(turno.equals("X")){
            turno="O";
        }else{
            turno="X";
        }

     }

     public void recorrer (){
         View v;
         ConstraintLayout constraintLayout= (ConstraintLayout) findViewById(R.id.cl);
         for (int i = 0; i < constraintLayout.getChildCount(); i++) {
             v = constraintLayout.getChildAt(i);
             System.out.println("objeto: "+ v.toString());
         }
     }


     public void salir(View view) {
        finish();
     }
 }