/**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 * <p>
 * package com.example.android.justjava;
 */

package com.ava.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 0; //global variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the plus button is pressed.
     */
    public void increment(View view) {

        quantity = quantity + 1;
        displayQuantity(quantity);


    }

    /**
     * This method is called when the minus button is pressed.
     */
    public void decrement(View view) {

        quantity = quantity - 1;
        displayQuantity(quantity);


    }
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = calculatePrice();
        displayMessage(createOrderSummary(price));
    }

    /**
     * Calculates the price of the order.
     * @return Total Price
     */
    private int calculatePrice() {
        int price = quantity * 5;
        return price;
    }

    /**
     * Display Order Text Summary
     * @param price
     * @return priceMessage
     */
    private String createOrderSummary(int price){
        String priceMessage = "Name: Atul\n";
        priceMessage +="Quantity: " + quantity;
        priceMessage +="\nTotal: $"+ price + "\nThankyou!";
        return priceMessage;
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }


}