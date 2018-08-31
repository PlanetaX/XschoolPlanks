package planks.xschool.com.xschoolplanks;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HudFragment extends Fragment {

    private TextView texto;

    public HudFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hud, container, false);
        texto = (TextView)  view.findViewById(R.id.tv_test_id);
        texto.setText("Hud");
        return view;
    }

}
