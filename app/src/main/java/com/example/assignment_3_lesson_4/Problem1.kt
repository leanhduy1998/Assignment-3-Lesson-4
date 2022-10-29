package com.example.assignment_3_lesson_4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TableRow
import android.widget.TextView
import com.example.assignment_3_lesson_4.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Problem1 : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.addButton.setOnClickListener {
            if (!binding.codeNameEditText.text.isEmpty() && !binding.versionEditText.text.isEmpty()) {
                val tableRow = TableRow(context)
                val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT)
                tableRow.layoutParams = layoutParams

                val codeName = TextView(context)
                codeName.text = binding.codeNameEditText.text
                codeName.setBackgroundResource(R.color.purple_200)
                tableRow.addView(codeName, 0)

                val version = TextView(context)
                version.text = binding.versionEditText.text
                version.setBackgroundResource(R.color.purple_200)
                tableRow.addView(version, 1)

                binding.tableLayoutid.addView(tableRow)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}