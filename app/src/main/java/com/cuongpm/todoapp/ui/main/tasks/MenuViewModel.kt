package com.cuongpm.todoapp.ui.main.tasks

import android.arch.lifecycle.ViewModel
import android.content.Context
import android.content.Intent
import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import com.cuongpm.todoapp.di.qualifier.ApplicationContext
import com.cuongpm.todoapp.util.SingleLiveEvent
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import javax.inject.Inject

/**
 * Created by cuongpm on 10/24/18
 */

class MenuViewModel @Inject constructor(
        @ApplicationContext private val context: Context
) : ViewModel() {

    lateinit var googleSignInClient: GoogleSignInClient

    private var googleSignInAccount: GoogleSignInAccount? = null

    val isOpenMenuLeft = ObservableBoolean(false)
    val googleUserName = ObservableField<String>()
    val googleUserEmail = ObservableField<String>()
    val googleUserAvatar = ObservableField<String>()
    val isGoogleSignedIn = ObservableBoolean(false)
    val googleSignInEvent = SingleLiveEvent<Void>()

    fun setupGoogleSignIn() {
        // Configure sign-in to request the user's ID, email address and basic profile
        val googleSignInOptions: GoogleSignInOptions = GoogleSignInOptions.Builder(
                GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
//                .requestServerAuthCode(context.getString(R.string.server_client_id))
                .build()

        // Build a GoogleSignInClient with above options
        googleSignInClient = GoogleSignIn.getClient(context, googleSignInOptions)

        // Check existing Google sign in account
        // If the user is ready signed in the GoogleSignInAccount will be non-null
        googleSignInAccount = GoogleSignIn.getLastSignedInAccount(context)
        if (googleSignInAccount != null) {
            updateGoogleUserInfo(googleSignInAccount)
            // Sign in to update token
            googleSignIn()
        }
    }

    fun googleSignIn() {
        googleSignInEvent.call()
    }

    fun googleSignInCompleted(data: Intent?) {
        val task = GoogleSignIn.getSignedInAccountFromIntent(data)
        try {
            val account = task.getResult(ApiException::class.java)
            // Update user's information
            updateGoogleUserInfo(account)
        } catch (e: ApiException) {
            e.printStackTrace()
            // Sign in failed
            updateGoogleUserInfo(null)
        }
    }

    fun googleSignOut() {
        googleSignInClient.signOut().addOnCompleteListener {
            isGoogleSignedIn.set(false)
            googleSignInAccount = null
        }
    }

    private fun updateGoogleUserInfo(account: GoogleSignInAccount?) {
        if (account != null) {
            googleSignInAccount = account
            googleUserName.set(account.displayName)
            googleUserEmail.set(account.email)
            googleUserAvatar.set(account.photoUrl.toString())
            isGoogleSignedIn.set(true)
        }
    }
}