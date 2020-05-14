package com.canhtoan.freezing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.canhtoan.freezing.ui.ItemListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val isFragmentContainerEmpty = savedInstanceState == null
        if (isFragmentContainerEmpty) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, ItemListFragment.newInstance())
                .commit()
        }
    }
}
