package fr.sm.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import fr.sm.databinding.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private Person joe;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instanciation d'une personne
        joe = new Person("User", "Joe");

        //Création d'un objet de liason (binding)
        binding = DataBindingUtil.setContentView(
                this,
                R.layout.activity_main);

        //Définition des variables à lier
        binding.setPerson(joe);
    }

    public void onPromote(View view) {
        joe.setName("Admin");
    }
}
