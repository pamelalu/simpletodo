package com.codepath.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        String todoName = getIntent().getStringExtra("todoName");
        EditText etItem = (EditText) findViewById(R.id.etItem);
        etItem.setText(todoName);
    }

    public void onEditItem(View v) {
        EditText etItem = (EditText) findViewById(R.id.etItem);
        Intent data = new Intent();
        data.putExtra("todoName", etItem.getText().toString());
        Integer position = getIntent().getIntExtra("position", -1);
        data.putExtra("position", position);
        setResult(RESULT_OK, data);
        this.finish();
    }
}
