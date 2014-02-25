package foo.bar.palindroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

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
    public void checkWord(View view) {
        EditText editPalindrome = (EditText) findViewById(R.id.edit_palindrome);
        TextView textResult = (TextView) findViewById(R.id.text_result);
        String word = adaptationString(editPalindrome.getText().toString());
        if (!word.equals(""))
        if (isPalindrome(word)) {
            textResult.setText(textResult.getText()+"\n"+"\""+editPalindrome.getText().toString()+"\" is a palindrome");
        }
        else {
            textResult.setText(textResult.getText()+"\n"+"\""+editPalindrome.getText().toString()+"\" not a palindrome");
        }
        editPalindrome.setText("");
    }


    public static String reverseString(String s) {
        String outStr = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            outStr = outStr + s.charAt(i);
        }
        return outStr;
    }

    public static String adaptationString(String s) {
        String outStr = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isLetter(s.charAt(i)))
                outStr = outStr + s.charAt(i);
        }
        return outStr.toLowerCase();
    }

    public static boolean isPalindrome(String s) {
        return reverseString(s).equals(s);
    }
}
