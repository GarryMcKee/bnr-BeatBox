package com.bignerdranch.android.beatbox;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by Garry on 14/07/2017.
 */

public class BeatBoxFragment extends Fragment {

    public static BeatBoxFragment newInstance() {
        
        Bundle args = new Bundle();
        
        BeatBoxFragment fragment = new BeatBoxFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
