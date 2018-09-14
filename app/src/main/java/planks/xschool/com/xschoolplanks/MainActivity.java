package planks.xschool.com.xschoolplanks;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentHostCallback;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

import planks.xschool.com.xschoolplanks.model.User;


public class MainActivity extends AppCompatActivity implements OpenedHudFragment.OnClickHud{

    private DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
    //private DatabaseReference userRef  = reference.child("Database").child("Users");

    private TextView hud; //Botão hud
    private TextView tv;
    private boolean status = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link Id com Variáveis
        hud = (TextView) findViewById(R.id.hud);

        //TODO checkUser();
        //Esse método deverá checar se o usuário está logado no planks
        //Se não estiver, deve-se iniciar o modo anônimo

        //TODO checkOnline();
        //Esse método deverá checar se o usuário está conectado na internet
        //Se não estiver, iniciar modo offline, se estiver logado + offline, deve abrir fragment planks_salvos


        //HudButton
        hud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(status){
                    OpenedHudFragment openedHudFragment = new OpenedHudFragment();
                    fragmentTransaction.add(R.id.fl_hud_id, openedHudFragment, null);
                    fragmentTransaction.commit();
                    status = false;
                } else {
                    Fragment fragment = fragmentManager.findFragmentById(R.id.fl_hud_id);
                    fragmentTransaction.remove(fragment);
                    fragmentTransaction.commit();
                    status = true;
                }

            }
        });



        //FIREBASE EXAMPLE
        /*
        User user = new User();
        user.setUserName("Anyone");
        String nome = user.getUserName();
        userRef.child("Usuários").setValue(nome);
        */


    }

    //Método Toast
    public void toastShort(String str){
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }



    //OPÇÕES DO HUD
    @Override
    public void OnHomePageClicked() {
        /* TODO HomePageLinked
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentNome fragmentNome = new FragmentNome();
        fragmentTransaction.add(R.id...., fragmentNome, null);
        fragmentTransaction.commit();

        //Para fechar o Hud
        Fragment fragment = fragmentManager.findFragmentById(R.id.fl_hud_id);
        fragmentTransaction.remove(fragment);
        fragmentTransaction.commit();
        */
        toastShort("Você clicou na tela inicial");
    }

    @Override
    public void OnCreatePlankClicked() {
        /* TODO SecondOptionLinked
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentNome fragmentNome = new FragmentNome();
        fragmentTransaction.add(R.id...., fragmentNome, null);
        fragmentTransaction.commit();

        //Para fechar o Hud
        Fragment fragment = fragmentManager.findFragmentById(R.id.fl_hud_id);
        fragmentTransaction.remove(fragment);
        fragmentTransaction.commit();

        */
    }

}
