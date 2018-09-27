package planks.xschool.com.xschoolplanks.Fragments;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import planks.xschool.com.xschoolplanks.OpenedHudFragment;
import planks.xschool.com.xschoolplanks.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CreatePlankFragment extends Fragment {

    private Button jb;
    OnClickBut clickButton;
    public interface OnClickBut {

        void OnNextClicked();
        //void OnThirdClicked();
    }
    public CreatePlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_create_plank, container, false);
        // Inflate the layout for this fragment
        jb = (Button) view.findViewById(R.id.button);

        jb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickButton.OnNextClicked();
            }
        });

        return view;
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Activity activity = (Activity) context;

        clickButton = (OnClickBut) activity;
    }

}
