package com.qoobico.remindme;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

import alpha.mess.remindme.R;

public class MainActivity extends Activity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initToolbar();
    }

    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem)  {
                return false;
            }
        });

        toolbar.inflateMenu(R.menu.menu);
    }
}
