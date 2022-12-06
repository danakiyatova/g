package com.example.pr18_19

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat


class DetailFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)

    }


    fun setSelectedItem(selectedItem: String?) {
        val title = view?.findViewById<TextView>(R.id.detailsText)
        val details = view?.findViewById<TextView>(R.id.infoText)
        val picture = view?.findViewById<ImageView>(R.id.imageView1)
        title?.text = selectedItem
        when(selectedItem) {
            "Акита-ину" -> {
                details?.text = getString(R.string.Акита_ину)
                picture?.setImageResource(R.drawable.akita)
            }

            "Алабай (среднеазиатская овчарка)" -> { details?.text = getString(R.string.Алабай_среднеазиатская_овчарка)
                picture?.setImageResource(R.drawable.alabai)}
            "Доберман" -> {details?.text = getString(R.string.Доберман)
                picture?.setImageResource(R.drawable.dob)}
            "Маламут" -> {details?.text = getString(R.string.Маламут)
                picture?.setImageResource(R.drawable.mal)}
            "Русский Той-Терьер" ->{ details?.text = getString(R.string.Русский_Той_Терьер)
            picture?.setImageResource(R.drawable.toi)}
            "Амогус" -> {details?.text = getString(R.string.Амогус)
                picture?.setImageResource(R.drawable.am)
            }
        }
    }

}