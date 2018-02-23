package demo.hjq.musicplayer.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import demo.hjq.musicplayer.R;
import demo.hjq.musicplayer.base.BaseFragment;


/**
 * Created by Administrator on 2018/1/19.
 */
public class IndexFragment extends BaseFragment {
    @Override
    protected View initView() {
        return null;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_index, null);

        return view;
    }
}
