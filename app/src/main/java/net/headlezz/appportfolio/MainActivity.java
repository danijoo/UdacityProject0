package net.headlezz.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(getString(net.headlezz.appportfolio.R.string.title));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * Main menu button click listener method
     * @param view Pressed button
     */
    public void onClick(View view) {
        String buttonName = ((Button) view).getText().toString();
        Toast.makeText(this, String.format(getString(R.string.button_click_message), buttonName), Toast.LENGTH_SHORT).show();
    }
}
