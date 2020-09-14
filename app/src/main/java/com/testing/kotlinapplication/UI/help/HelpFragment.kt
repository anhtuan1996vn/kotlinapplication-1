package com.testing.kotlinapplication.UI.help

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.testing.kotlinapplication.R
import com.testing.kotlinapplication.UI.help.model.Item
import kotlinx.android.synthetic.main.fragment_help.*

/**
 * A simple [Fragment] subclass.
 */
class HelpFragment : Fragment() {
    private lateinit var mAdapter: ItemAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_help, container, false) as View
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mAdapter = ItemAdapter(view.context, prepareData())
        rv_help.apply {
            layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL, false)
            adapter = mAdapter
        }
    }

    private fun prepareData(): ArrayList<Item> {
        val mList = ArrayList<Item>() as ArrayList
        mList.add(Item("How to order", 0))
        mList.add(Item("Payment", 1))
        mList.add(Item("Shipping", 2))
        mList.add(Item("Profile", 3))
        mList.add(Item("Contact Us", 4))
        return mList
    }
}
