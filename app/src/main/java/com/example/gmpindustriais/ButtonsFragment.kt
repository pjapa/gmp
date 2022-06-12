package com.example.gmpindustriais

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.gmpindustriais.databinding.FragmentButtonsBinding
import com.example.gmpindustriais.ui.home.HomeViewModel

class ButtonsFragment : Fragment() {

    private var _binding: FragmentButtonsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentButtonsBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return binding?.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btnmasseiras.setOnClickListener {
            findNavController().navigate(R.id.action_buttonsFragment_to_descricaoMasseiras)
        }
        binding?.btndisperssores.setOnClickListener {
            findNavController().navigate(R.id.action_buttonsFragment_to_descricaoDisperssores)
        }
        binding?.btnmoinhos.setOnClickListener {
            findNavController().navigate(R.id.action_buttonsFragment_to_descricaoMoinhos)
        }
        binding?.btnhelices.setOnClickListener {
            findNavController().navigate(R.id.action_buttonsFragment_to_descricaoHelices)
        }
        binding?.btnestacao.setOnClickListener {
            findNavController().navigate(R.id.action_buttonsFragment_to_descricaoAditivos)
        }
    }





    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}