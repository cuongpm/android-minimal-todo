package com.cuongpm.todoapp.ui.main.tasks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cuongpm.todoapp.databinding.FragmentMenuBinding
import com.cuongpm.todoapp.di.scope.ActivityScoped
import com.cuongpm.todoapp.ui.main.base.BaseFragment
import javax.inject.Inject

/**
 * Created by cuongpm on 10/27/18.
 */

@ActivityScoped
class MenuFragment @Inject constructor() : BaseFragment() {

    private lateinit var dataBinding: FragmentMenuBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        dataBinding = FragmentMenuBinding.inflate(inflater, container, false).apply {
            viewModel = (activity as TaskActivity).menuViewModel
        }

        dataBinding.viewModel?.setupGoogleSignIn()

        return dataBinding.root
    }

}