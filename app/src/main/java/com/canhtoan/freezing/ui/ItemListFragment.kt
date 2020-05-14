package com.canhtoan.freezing.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.canhtoan.freezing.R
import com.canhtoan.freezing.viewmodels.FriezeListItemViewModel

class ItemListFragment : Fragment() {

    private lateinit var itemsViewModel: FriezeListItemViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

        itemsViewModel = ViewModelProvider(this).get(FriezeListItemViewModel::class.java)
    }

    companion object {
        fun newInstance() = ItemListFragment()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.fragment_list_item, menu)
    }
}