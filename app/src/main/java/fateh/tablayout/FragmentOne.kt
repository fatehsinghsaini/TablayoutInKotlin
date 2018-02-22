package fateh.tablayout

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView

/**
 * Created by aleaa33 on 21/2/18.
 */
class FragmentOne: Fragment() {

    var tv_name: TextView? = null
    var rel_main: RelativeLayout? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view: View? = inflater!!.inflate(R.layout.one_fragment, container, false)

     /*   rel_main=view?.findViewById<RelativeLayout>(R.id.rel_main) as RelativeLayout
        rel_main?.setBackgroundColor(Color.CYAN)
        tv_name = view?.findViewById<TextView>(R.id.tv_name) as TextView
        tv_name?.text = "W3Adda First Tab"*/


        return view
    }

    companion object {
        val PAGE_NUM = "PAGE_NUM"
        fun newInstance(page: Int): FragmentOne {
            val fragment = FragmentOne()
            val args = Bundle()
            args.putInt(PAGE_NUM, page)
            fragment.setArguments(args)
            return fragment
        }
    }


}