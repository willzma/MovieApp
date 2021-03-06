package edu.gatech.movierecommender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class AdminDashboard extends AppCompatActivity {

    /**
     * Runs on inception of activity
     *
     * @param savedInstanceState default argument
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);
    }

    /**
     * Logout button dropdown
     *
     * @param menu menu to inflate
     * @return success boolean
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_admin_dashboard, menu);
        return true;
    }

    /**
     * On logout
     *
     * @param item item on action bar
     * @return success boolean
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        final int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * On button click to view user list
     *
     * @param v current View
     */
    @SuppressWarnings("unused")
    public void viewUserList(View v) {
        final Intent newIntent = new Intent(getApplicationContext(), UserListActivity.class);
        startActivity(newIntent);
    }

    /**
     * Logout function
     *
     * @param item item on action bar
     */
    @SuppressWarnings("unused")
    public void logout(MenuItem item) {
        //Launch main activity.
        final Intent homeIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(homeIntent);
    }

    /**
     * Disable back button
     */
    @Override
    public void onBackPressed() {
    }

}
