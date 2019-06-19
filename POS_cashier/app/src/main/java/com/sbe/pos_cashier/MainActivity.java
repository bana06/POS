package com.sbe.pos_cashier;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.accountswitcher.AccountHeader;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        btn_add_customer = (RelativeLayout) findViewById(R.id.btn_add_costumer);
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
