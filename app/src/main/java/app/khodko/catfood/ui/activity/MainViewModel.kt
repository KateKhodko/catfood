package app.khodko.catfood.ui.activity

import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount

class MainViewModel : ViewModel() {

    var account: GoogleSignInAccount? = null

}