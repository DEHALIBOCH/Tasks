package kz.project.tasks

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class TasksFragment : Fragment() {

    private var _binding: FragmentTasksBinding? = null
    private val binding = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTasksBinding.inflate(inflater, container, false)
        return _binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}