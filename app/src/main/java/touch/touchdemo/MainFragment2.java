package touch.touchdemo;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class MainFragment2 extends  Fragment {

    ViewPager mViewpager;
    ViewPagerAdapter mViewPagerAdapter;
    public MainFragment2() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main2, container, false);
        mViewpager = (ViewPager) view.findViewById(R.id.re_viewpager);

        return view;
    }
    private final int PAGE_SIZE = 4;
    private Fragment[] rootFragments = new Fragment[PAGE_SIZE];
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager());
        for (int i = 0; i < PAGE_SIZE; i++) {
            switch (i) {
                case 0:
                    rootFragments[i] = new ImagerFragment();
                    break;
                case 1:
                    rootFragments[i] = new ImagerFragment();
                    break;
                case 2:
                    rootFragments[i] = new ImagerFragment();
                    break;
                case 3:
                    rootFragments[i] = new ImagerFragment();
                    break;
            }
            Log.e("rootFragments", i + "= " + rootFragments[i]);
            rootFragments[i].setRetainInstance(true);
            mViewPagerAdapter.addFragment(rootFragments[i]);
            mViewpager.setAdapter(mViewPagerAdapter);
        }


    }




    static class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragments = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public void addFragment(Fragment fragment) {
            mFragments.add(fragment);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }
        @Override
        public CharSequence getPageTitle(int position) {

            return "tab" + (position + 1);
        }
    }

}
