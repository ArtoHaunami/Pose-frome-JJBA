import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.PosefromJJBA.databinding.ActivityMain1Binding
import com.example.PosefromeJJBA.databinding.ActivityMain2Binding

class MainActivity1 : AppCompatActivity() {

    private lateinit var binding: activity_main1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = activity_main1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Установка обработчика нажатия на изображение
        binding.imageView.setOnClickListener { changeImage() }
    }

    private fun changeImage() {
        // Установка нового изображения через binding
        binding.imageView.setImageResource(R.drawable.new_image_name)
    }
}

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: activity_main2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = activity_main2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Установка обработчика нажатия на изображение
        binding.imageView.setOnClickListener { changeImage() }
    }

    private fun changeImage() {
        // Установка нового изображения через binding
        binding.imageView.setImageResource(R.drawable.new_image_name)
    }
}