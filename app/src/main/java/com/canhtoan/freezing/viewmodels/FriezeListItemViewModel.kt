package com.canhtoan.freezing.viewmodels

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.canhtoan.freezing.data.FriezeItemRepository

class FriezeListItemViewModel internal constructor(
    private val repository: FriezeItemRepository,
    private val handle: SavedStateHandle
): ViewModel() {

}