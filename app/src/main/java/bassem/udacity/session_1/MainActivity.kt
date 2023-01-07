package bassem.udacity.session_1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import bassem.udacity.session_1.databinding.ActivityMainBinding
import bassem.udacity.session_1.databinding.ActivityMainLtrBinding

class MainActivity : AppCompatActivity() {

            private lateinit var binding: ActivityMainLtrBinding
//    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
        binding = ActivityMainLtrBinding.inflate(layoutInflater)

        setContentView(binding.root)

        bindViews()
    }

    private fun bindViews() {
        with(binding) {
            sessionTv.text = getString(R.string.session_1)
            helloTv.text = getString(R.string.hello_world)
            startBtn.setOnClickListener {
                Toast.makeText(
                    this@MainActivity,
                    getString(R.string.welcome_to_fwd),
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

}