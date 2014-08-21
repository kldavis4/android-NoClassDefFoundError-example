package com.acme;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.acme.R;

public class TestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.test_activity_layout);
    }

//     @Override
//     public boolean onCreateOptionsMenu(Menu menu) {
//         // Inflate the menu items for use in the action bar
//         //MenuInflater inflater = getMenuInflater();
//         //sinflater.inflate(R.menu.main_activity_actions, menu);
//         return super.onCreateOptionsMenu(menu);
//     }
// 
//     @Override
//     public boolean onOptionsItemSelected(MenuItem item) {
//         // Handle presses on the action bar items
//         switch (item.getItemId()) {
//             default:
//                 return super.onOptionsItemSelected(item);
//         }
//     }


    /** Called when the user clicks the Send button */
//    public void sendMessage(View view) {
//        // Do something in response to button
//        Intent intent = new Intent(this, DisplayMessageActivity.class);
//        EditText editText = (EditText) findViewById(R.id.edit_message);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);
//    }

}