package fateh.tablayout

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.View

/**
 * Created by aleaa33 on 19/2/18.
 */
public class MainActivity : AppCompatActivity() {

    internal lateinit var viewpageradapter:ViewPagerAdapter //Declare PagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tabLayout=findViewById<View>(R.id.tab_layout) as TabLayout
        var viewPager=findViewById<View>(R.id.viewpager) as ViewPager

        val pageAdapter = ViewPagerAdapter(supportFragmentManager)

        // create fragments from 0 to 9

            pageAdapter.add(FragmentOne.newInstance(0), "FirstTab")
            pageAdapter.add(FragmentOne.newInstance(1), "SecondTab")
            pageAdapter.add(FragmentOne.newInstance(2), "ThirdTab")


        viewPager.adapter = pageAdapter
        tabLayout.setupWithViewPager(viewPager)

    }



}

