package com.cuongpm.todoapp.ui.main.tasks

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableBoolean
import javax.inject.Inject

/**
 * Created by cuongpm on 10/24/18
 */

class MenuViewModel @Inject constructor() : ViewModel() {

    val isOpenMenuLeft = ObservableBoolean(true)

}