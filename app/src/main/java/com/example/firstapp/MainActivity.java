package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int quantity = 0;
    int price = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        display(quantity);
        String priceMessage =  "ORDER SUMMARY \n\n"+"NAME = GOVIND PATHAK\n"+ " QUANTITY = "+ quantity + "\n TOTAL PRICE = " + calculatePrice()+"\n THANK YOU!";
        displayMessage(priceMessage);
    }

    private void displayMessage(String priceMessage) {
        TextView price = (TextView) findViewById(R.id.Order_text_view);
        price.setText(priceMessage);
    }

    private int calculatePrice(){
         price = quantity * 5;
         return price;
    }


    private void display(int quantity) {
        TextView input = (TextView) findViewById(R.id.input);
        input.setText(" " + quantity);
    }

    public void increment(View view) {

        quantity++;
        display(quantity);
    }

    public void decrement(View view) {
        quantity--;
        display(quantity);
    }
}