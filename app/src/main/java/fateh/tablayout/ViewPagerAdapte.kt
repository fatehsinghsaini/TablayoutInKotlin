package fateh.tablayout

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by aleaa33 on 21/2/18.
 */

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val tabNames: ArrayList<String>
    private val fragments: ArrayList<Fragment>

    init {
        tabNames = ArrayList()
        fragments = ArrayList()
    }

    fun add(fragment: Fragment, title: String) {
        tabNames.add(title)
        fragments.add(fragment)
    }

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getItem(position: Int): Fragment? {

        when(position)
        {
            0 -> return FragmentOne()
            1 -> return FragmentTwo()
            2 -> return FragmentThree()
            else -> return null
        }
    }

    override fun getPageTitle(position: Int): CharSequence {
        return tabNames[position]
    }

}