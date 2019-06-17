package com.sbe.pos_cashier;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends Activity {
    ListView list_from_categori;
    ArrayAdapter<String>adapter;

    public ImageButton imgbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_from_categori = (ListView)findViewById(R.id.list_from_categori);
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
}
