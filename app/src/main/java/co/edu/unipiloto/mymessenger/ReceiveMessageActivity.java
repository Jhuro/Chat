package co.edu.unipiloto.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "message";
    public static String chat = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

            Intent intent = getIntent();
            TextView messageView = (TextView) findViewById(R.id.tv_a2_message);
            String messageText = intent.getStringExtra(EXTRA_MESSAGE);
            chat+=messageText;
            messageView.setText(chat);
    }

    public void onSendMessage(View view){

        String username = "Usuario 2: ";
        EditText messageView = (EditText) findViewById(R.id.et_a2_message);
        String messageText = username + messageView.getText().toString() + "\n";
        Intent intent = new Intent(this, CreateMessageActivity.class);
        intent.putExtra(CreateMessageActivity.EXTRA_MESSAGE, messageText);
        chat += messageText;
        startActivity(intent);
    }
}