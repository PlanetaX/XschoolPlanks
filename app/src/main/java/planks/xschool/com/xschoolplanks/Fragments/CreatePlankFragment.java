package planks.xschool.com.xschoolplanks.Fragments;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import planks.xschool.com.xschoolplanks.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CreatePlankFragment extends Fragment {


    public CreatePlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_plank, container, false);
    }

}