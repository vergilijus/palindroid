package foo.bar.palindroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    /**
     * Called when button_check clicked
     */
    public void checkWord() {
        printWord();
    }
    /**
     * Print word from edit_palindrome
     */
    public void printWord() {
        EditText editPalindrome = (EditText) findViewById(R.id.edit_palindrome);
    }
}
