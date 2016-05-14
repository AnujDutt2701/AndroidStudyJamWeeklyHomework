package com.example.android.justjava;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    int quantity = 2;
    boolean chocolate = false;
    boolean whippedCream = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        EditText editText = (EditText) findViewById(R.id.name_field);
        String name  = editText.getText().toString();
        displayMessage(createOrderSummary(calculatePrice(),name,whippedCream,chocolate));
        sendEmail(createOrderSummary(calculatePrice(),name,whippedCream,chocolate));
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.order_summary_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method is called when the + button is clicked.
     */
    public void increment(View view) {
        //EditText quantityEditText = (EditText) findViewById(R.id.)
        if(quantity < 100) {
            quantity++;
        }
        displayQuantity(quantity);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void decrement(View view) {
        //EditText quantityEditText = (EditText) findViewById(R.id.)
        if(quantity > 0) {
            quantity--;
        }
            displayQuantity(quantity);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.order_summary_text_view);
        priceTextView.setText(message);
    }

    private int calculatePrice()
    {
        int basePrice = 5;
        if(whippedCream)
        {
            basePrice += 1;
        }
        if(chocolate)
        {
            basePrice += 2;
        }
        return quantity*basePrice;
    }

    private String createOrderSummary(int price,String name, boolean whippedCream, boolean chocolate){
        String message = "";
        message += "Name : "+ name;
        message += "\nAdd whipped cream? " + whippedCream;
        message += "\nAdd chocolate? " + chocolate;
        message += "\nQuantity: " + quantity;
        message += "\nTotal: $" + price;
        message += "\nThank you!";
        return message;
    }

    public void addOrRemoveWhippedCream(View view){
        CheckBox checkBox = (CheckBox) findViewById(R.id.whipped_cream_checkbox);
        if(checkBox.isChecked())
            whippedCream = true;
        else
            whippedCream = false;

    }
    public void addOrRemoveChocolate(View view){
        CheckBox checkBox = (CheckBox) findViewById(R.id.chocolate_checkbox);
        if(checkBox.isChecked())
            chocolate = true;
        else
            chocolate = false;

    }

    public void sendEmail(String emailBody)
    {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.putExtra(Intent.EXTRA_TEXT,emailBody);
        if (emailIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(emailIntent);
        }
    }
}