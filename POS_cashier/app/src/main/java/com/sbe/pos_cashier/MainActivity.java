package com.sbe.pos_cashier;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    //integrasi java dan xml
    ListView list_from_categori;
    ArrayAdapter<String>adapter;
    Dialog dialogMain;
    RelativeLayout customer;

    //utk relasi costumer java dan xml
    TextView btn_exit;
    LinearLayout btn_add_customer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_from_categori = (ListView)findViewById(R.id.list_from_categori);

        //utk add customer
        dialogMain = new Dialog(MainActivity.this);
        customer = (RelativeLayout) findViewById(R.id.customer);

        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomer();
            }
        });
    }

    private void ShowDelete(){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Are you sure want to delete this order?")


                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                alert.setCancelable(false);
        alert.show();
    }

    private void Showorder(){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Are you sure want to send this order to Kitchen?")


                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
        alert.setCancelable(false);
        alert.show();
    }

    public void delete(View view) {
        ShowDelete();
    }

    public void Showorder(View view) {
        Showorder();
    }

    public void showCustomer(){
        dialogMain.setContentView(R.layout.activity_costumer);

        btn_add_customer = (LinearLayout) findViewById(R.id.btn_add_customer);
        btn_exit = (TextView) findViewById(R.id.btn_exit);

//        btn_add_customer.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Ini button add customer", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        btn_exit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                dialogMain.dismiss();
//            }
//        });

        dialogMain.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialogMain.show();
    }
}
