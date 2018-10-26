package com.cuongpm.todoapp.ui.component.binding

import android.databinding.BindingAdapter
import android.support.v4.widget.DrawerLayout
import android.view.Gravity

/**
 * Created by cuongpm on 10/26/18.
 */

object DrawerBinding {

    @BindingAdapter("android:openDrawerLeft")
    @JvmStatic
    fun onNavigationIconClicked(drawerLayout: DrawerLayout, isOpen: Boolean) {
        if (isOpen) {
            drawerLayout.openDrawer(Gravity.START)
        } else {
            drawerLayout.closeDrawer(Gravity.START)
        }
    }
}
