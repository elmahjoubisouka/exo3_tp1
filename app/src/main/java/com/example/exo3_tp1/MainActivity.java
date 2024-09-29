package com.example.exo3_tp1;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private CheckBox choix1, choix2, choix3;
    private RadioButton radioOui, radioNon;
    private Button btnQuitter, btnSuivant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialiser les éléments de l'interface utilisateur
        choix1 = findViewById(R.id.choix1);
        choix2 = findViewById(R.id.choix2);
        choix3 = findViewById(R.id.choix3);
        radioOui = findViewById(R.id.radioOui);
        radioNon = findViewById(R.id.radioNon);
        btnQuitter = findViewById(R.id.btnQuitter);
        btnSuivant = findViewById(R.id.btnSuivant);

        // Écouteur du bouton "Quitter"
        btnQuitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Quitte l'activité
            }
        });

        // Écouteur du bouton "Suivant"
        btnSuivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Récupérer les choix sélectionnés
                StringBuilder result = new StringBuilder("Sélection :\n");

                if (choix1.isChecked()) {
                    result.append(" - ").append(choix1.getText().toString()).append("\n");
                }
                if (choix2.isChecked()) {
                    result.append(" - ").append(choix2.getText().toString()).append("\n");
                }
                if (choix3.isChecked()) {
                    result.append(" - ").append(choix3.getText().toString()).append("\n");
                }

                if (radioOui.isChecked()) {
                    result.append(" - ").append(radioOui.getText().toString());
                } else if (radioNon.isChecked()) {
                    result.append(" - ").append(radioNon.getText().toString());
                }

                // Démarrer l'activité ResultActivity et passer les informations
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("result", result.toString());
                startActivity(intent);
            }
        });
    }
}
