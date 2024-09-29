package com.example.exo3_tp1;


import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result); // Assurez-vous d'avoir créé un layout XML pour cette activité

        textViewResult = findViewById(R.id.textViewResult);

        // Récupérer les données de l'intent
        String result = getIntent().getStringExtra("result");

        // Afficher le résultat
        if (result != null) {
            textViewResult.setText(result);
        }
    }
}
