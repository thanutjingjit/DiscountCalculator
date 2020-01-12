package th.ac.su.thanut.discountcalculator


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnCalculate = findViewById<Button>(R.id.btnCalculate)
        var cbVat = findViewById<CheckBox>(R.id.cbVat)
        var tvPrice = findViewById<TextView>(R.id.tvPrice)

        btnCalculate.setOnClickListener {
            var edtOriginal2: Double = edtOriginal.text.toString().toDouble()
            var edtPercent2: Double = edtPercent.text.toString().toDouble()

            var total = edtOriginal2 - ((edtOriginal2/100) * edtPercent2)

            if (cbVat.isChecked) {
                total += (total/100)*7
            }

            tvPrice.setText(total.toString())
        }
    }
}
