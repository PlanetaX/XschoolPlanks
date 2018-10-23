package planks.xschool.com.xschoolplanks.Fragments;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import planks.xschool.com.xschoolplanks.R;
import planks.xschool.com.xschoolplanks.model.User;


/**
 * A simple {@link Fragment} subclass.
 */
public class OpenedHudFragment extends Fragment {

    //TextViews
    public TextView homepage;
    private TextView createPlank;
    private TextView tv_hud_perfil;

    //ListViews

    OnClickHud clickHud;
    public interface OnClickHud {

         void OnHomePageClicked();
         void OnCreatePlankClicked();
         //void OnThirdClicked();
    }


    public OpenedHudFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_opened_hud, container, false);

        //TODO Adapter ListView<>Hud
        homepage = (TextView) view.findViewById(R.id.tv_texto);
        createPlank = (TextView) view.findViewById(R.id.tv_second);
        tv_hud_perfil = (TextView) view.findViewById(R.id.tv_hud_perfil);

        //TODO checkUser();
        //Seguir escopo abaixo
        if(true){
                tv_hud_perfil.setText("Logar");
        }else{
            tv_hud_perfil.setText("Perfil");
        }

        //Primeira opção (Página inicial)
        homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickHud.OnHomePageClicked();
            }
        });

        //Segunda opção (Criar Plank)
        createPlank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickHud.OnCreatePlankClicked();
            }
        });

        //Terceira
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Activity activity = (Activity) context;

        clickHud = (OnClickHud) activity;
    }

}
