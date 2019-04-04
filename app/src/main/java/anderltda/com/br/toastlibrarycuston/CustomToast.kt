package anderltda.com.br.toastlibrarycuston

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast

class CustomToast {

    fun showToast(context: Context, message: String) {

        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val customToastRoot = inflater.inflate(R.layout.custom_toast, null)

        val customToast = Toast(context)

        customToast.view = customToastRoot

        val textView = customToastRoot.findViewById<View>(R.id.textView1) as TextView

        textView.text = message

        customToast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.BOTTOM, 0, 0)

        customToast.duration = Toast.LENGTH_LONG

        customToast.show()
    }
}