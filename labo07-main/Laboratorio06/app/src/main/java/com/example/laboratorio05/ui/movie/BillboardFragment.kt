package com.example.laboratorio05.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import com.example.laboratorio05.R
import com.example.laboratorio05.databinding.FragmentBillboardBinding
import com.example.laboratorio05.databinding.FragmentNewMovieBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BillboardFragment : Fragment() {
    private lateinit var btnCreateNewMovie: FloatingActionButton
    private lateinit var starWarsCv: CardView
    private lateinit var harryPotterCv: CardView

    lateinit var binding: FragmentBillboardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBillboardBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnCreateNewMovie = view.findViewById(R.id.btnNavCreateNewMovie)
        starWarsCv = view.findViewById(R.id.starWarsCardView)
        harryPotterCv = view.findViewById(R.id.harryPotterCardView)

        starWarsCv.setOnClickListener {
            it.findNavController().navigate(R.id.action_billboardFragment_to_movieFragment)
        }

        harryPotterCv.setOnClickListener {
            it.findNavController().navigate(R.id.action_billboardFragment_to_movieFragment)
        }

        btnCreateNewMovie.setOnClickListener {
            it.findNavController().navigate(R.id.action_billboardFragment_to_newMovieFragment)
        }

    }

}