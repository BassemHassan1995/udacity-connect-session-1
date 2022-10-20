package bassem.udacity.session_1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import bassem.udacity.session_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //    private lateinit var binding: ActivityMainLtrBinding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        bindViewsUsingFindViewById()

//        binding = ActivityMainLtrBinding.inflate(layoutInflater)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        bindViewsUsingViewBinding()

    }

    private fun bindViewsUsingFindViewById() {

        val sessionTextView = findViewById<TextView>(R.id.session_tv)
        val helloTextView = findViewById<TextView>(R.id.hello_tv)
        val startButton = findViewById<Button>(R.id.start_btn)

        sessionTextView.text = getString(R.string.session_1)
        helloTextView.text = getString(R.string.welcome_to_fwd)
        startButton.setOnClickListener {
            Toast.makeText(
                this,
                getString(R.string.welcome_to_fwd), Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun bindViewsUsingViewBinding() {
        with(binding) {
            sessionTv.text = getString(R.string.session_1)
            helloTv.text = getString(R.string.welcome_to_fwd)
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