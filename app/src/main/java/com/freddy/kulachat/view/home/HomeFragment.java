package com.freddy.kulachat.view.home;

import android.os.Bundle;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.freddy.kulachat.R;
import com.freddy.kulachat.presenter.NullablePresenter;
import com.freddy.kulachat.view.BaseFragment;
import com.freddy.kulachat.widget.ReboundRecyclerView;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

/**
 * @author FreddyChen
 * @name
 * @date 2020/05/31 02:08
 * @email chenshichao@outlook.com
 * @github https://github.com/FreddyChen
 * @describe
 */
public class HomeFragment extends BaseFragment<NullablePresenter> {

    public static HomeFragment newInstance() {

        Bundle args = new Bundle();

        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void setRootView(Bundle saveInstanceState) {
        setLayout(R.layout.fragment_home);
    }
}
