package touch.touchdemo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import touch.touchdemo.widget.ViewPagerCompat;

/**
 * Created by lanjl on 2016/8/28.
 */
public class ViewPagerActicity2 extends AppCompatActivity {

    ViewPagerCompat mainViewPager;
    TabLayout mTabLayout;
    private final int PAGE_SIZE = 4;
    private Fragment[] rootFragments = new Fragment[PAGE_SIZE];

    ViewPagerAdapter mViewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager_main2);

        mainViewPager = (ViewPagerCompat) findViewById(R.id.viewpager);
        mTabLayout = (TabLayout) findViewById(R.id.tl_tab);

        setupViewPager(mainViewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        for (int i = 0; i < PAGE_SIZE; i++) {
            switch (i) {
                case 0:
                    rootFragments[i] = new MainFragment2();
                    break;
                case 1:
                    rootFragments[i] = new AboutFragment();
                    break;
                case 2:
                    rootFragments[i] = new AboutFragment();
                    break;
                case 3:
                    rootFragments[i] = new AboutFragment();
                    break;
            }
            Log.e("rootFragments", i + "= " + rootFragments[i]);
            rootFragments[i].setRetainInstance(true);
            mViewPagerAdapter.addFragment(rootFragments[i]);
        }
        viewPager.setAdapter(mViewPagerAdapter);

        viewPager.setOffscreenPageLimit(PAGE_SIZE);
        mTabLayout.setupWithViewPager(viewPager);
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
