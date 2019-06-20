package com.sbe.pos_cashier;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CostumerActivity extends Activity {
    private TextView btn_exit;
    private RelativeLayout btn_add_costumer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_costumer);

        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        btn_add_costumer = (RelativeLayout) findViewById(R.id.btn_add_costumer);
        btn_add_costumer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CostumerActivity.this, AddCostumer.class));
            }
        });

        btn_exit = (TextView) findViewById(R.id.btn_exit);
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
