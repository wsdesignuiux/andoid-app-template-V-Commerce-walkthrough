package e.wolfsoft1.v_commerce_walkthrough;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import adapter.ProfilePagerAdapter_walkthrough;
import me.relex.circleindicator.CircleIndicator;


public class V_Commerce_walkthrough extends AppCompatActivity {

    public ViewPager viewpager;

    ProfilePagerAdapter_walkthrough profilePagerAdapter_walkthrough;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v__commerce_walkthrough);


        viewpager = (ViewPager) findViewById(R.id.viewpager);

        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);

        profilePagerAdapter_walkthrough = new ProfilePagerAdapter_walkthrough(getSupportFragmentManager());

        viewpager.setAdapter(profilePagerAdapter_walkthrough);

        indicator.setViewPager(viewpager);

        profilePagerAdapter_walkthrough.registerDataSetObserver(indicator.getDataSetObserver());
    }
}
