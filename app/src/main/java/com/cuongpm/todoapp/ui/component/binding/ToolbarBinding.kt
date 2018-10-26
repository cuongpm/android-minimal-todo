package com.cuongpm.todoapp.ui.component.binding

import android.databinding.BindingAdapter
import android.support.v7.widget.Toolbar
import com.cuongpm.todoapp.ui.main.base.BaseActivity

/**
 * Created by cuongpm on 10/6/18.
 */

object ToolbarBinding {

    @BindingAdapter("onNavigationIconClick")
    @JvmStatic
    fun onNavigationIconClicked(toolbar: Toolbar, data: Int) {
        toolbar.setNavigationOnClickListener {
            with(it.context as BaseActivity) {
                finish()
            }
        }

    }

    @BindingAdapter("onNavigationMenuClick")
    @JvmStatic
    fun onNavigationMenuClicked(toolbar: Toolbar, data: Int) {
        toolbar.setNavigationOnClickListener {
            with(toolbar.context as BaseActivity) {
                updateMenu()
            }
        }

    }
}
