package planks.xschool.com.xschoolplanks;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
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

import planks.xschool.com.xschoolplanks.model.User;

public class MainActivity extends Activity {

    private DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
    //private DatabaseReference userRef  = reference.child("Database").child("Users");

    private RelativeLayout rl_hud;
    private TextView hud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //rl_hud = (RelativeLayout) findViewById(R.id.rl_hud_id);
        hud = (TextView) findViewById(R.id.hud);

        //checkUser();
        //Esse método deverá checar se o usuário está logado no planks
        //Se não estiver, deve-se iniciar o modo anônimo

        //checkOnline();
        //Esse método deverá checar se o usuário está conectado na internet
        //Se não estiver, iniciar modo offline, se estiver logado + offline, deve abrir fragment planks_salvos

        hud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //OpenHud
            }
        });

        //FRAGMENTO EXEMPLO
        /*
        login = (Button) findViewById(R.id.btn_logar);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if(status) {
                    LoginFragment loginFragment = new LoginFragment();
                    fragmentTransaction.add(R.id.rl_container_fragmento, loginFragment);
                    fragmentTransaction.commit();
                    login.setText("Cadastre-se");
                    status = false;
                }else {
                    CadastroFragment cadastroFragment = new CadastroFragment();
                    fragmentTransaction.add(R.id.rl_container_fragmento, cadastroFragment);
                    fragmentTransaction.commit();
                    login.setText("Logar");
                    status = true;
                }
            }
        });
        */


        //FIREBASE EXAMPLE
        /*
        User user = new User();
        user.setUserName("Anyone");
        String nome = user.getUserName();
        userRef.child("Usuários").setValue(nome);
        */


    }
}
