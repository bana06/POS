package com.sbe.pos_cashier;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class PopupDinein extends Activity {
    private TextView btn_cancel;
    private RelativeLayout opsi_dinein, opsi_takeaway, opsi_delivery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_dinein);

        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        opsi_dinein = (RelativeLayout) findViewById(R.id.opsi_dinein);
        opsi_dinein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //method
            }
        });

        opsi_takeaway= (RelativeLayout) findViewById(R.id.opsi_takeaway);
        opsi_takeaway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //method

            }
        });

        opsi_delivery = (RelativeLayout) findViewById(R.id.opsi_delivery);
        opsi_delivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //method

            }
        });

        btn_cancel = (TextView) findViewById(R.id.btn_cancel);
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
