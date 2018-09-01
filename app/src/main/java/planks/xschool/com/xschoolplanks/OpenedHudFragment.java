package planks.xschool.com.xschoolplanks;


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

import planks.xschool.com.xschoolplanks.model.User;


/**
 * A simple {@link Fragment} subclass.
 */
public class OpenedHudFragment extends Fragment {

    public TextView texto;
    RelativeLayout rl;

    public OpenedHudFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_opened_hud, container, false);
        texto = (TextView) view.findViewById(R.id.tv_texto);

        texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        return view;
    }

}
