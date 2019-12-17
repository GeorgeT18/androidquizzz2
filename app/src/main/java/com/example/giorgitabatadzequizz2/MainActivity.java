package com.example.giorgitabatadzequizz2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    protected LinearLayout layout = findViewById(R.id.mainLayout);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setupLayout();
    }

    protected void setupLayout() {
        final LinearLayout layout = this.layout = findViewById(R.id.mainLayout);

        RequestQueue queue = Volley.newRequestQueue(this);
        String url ="https://jsonplaceholder.typicode.com/todos";

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<ArrayList<Todo>>() {
                    @Override
                    public void onResponse(ArrayList<Todo> todos) {
//                        AlertDialog dialog = new AlertDialog(getApplicationContext());

                        for (Todo todo: todos) {
//                            TextView textView = new TextView(getApplicationContext());


//                            layout.addView(textView);
                        }

//                        dialog.show();


                        // Display the first 500 characters of the response string.
//                        textView.setText("Response is: "+ response.substring(0,500));
                    }
                }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
        });

        queue.add(stringRequest);
    }
}
