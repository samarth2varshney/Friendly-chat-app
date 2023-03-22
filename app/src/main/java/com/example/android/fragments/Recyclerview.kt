package com.example.android.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Recyclerview.newInstance] factory method to
 * create an instance of this fragment.
 */
class Recyclerview : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    var newsarraylist = ArrayList<News>()
    //private lateinit var adapter: MyAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_recyclerview, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Recyclerview.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Recyclerview().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        newsarraylist.add(
            News("pushups", "works chest and triceps")
        )
        newsarraylist.add(
            News("Benches press", "isolates chest and triceps")
        )
        newsarraylist.add(
            News("incline bench press", "works more upper chest")
        )
        newsarraylist.add(
            News("chest fly", "isolates the chest muscles")
        )
        newsarraylist.add(
            News("dumblle overhead press", "isolates the triceps")
        )
        newsarraylist.add(
            News("cabel tricep extension", "also a great exersise for triceps")
        )
        newsarraylist.add(
            News("pushups", "works chest and triceps")
        )
        newsarraylist.add(
            News("Benches press", "isolates chest and triceps")
        )
        newsarraylist.add(
            News("incline bench press", "works more upper chest")
        )
        newsarraylist.add(
            News("chest fly", "isolates the chest muscles")
        )
        newsarraylist.add(
            News("dumblle overhead press", "isolates the triceps")
        )
        newsarraylist.add(
            News("cabel tricep extension", "also a great exersise for triceps")
        )
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recyclerview)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)

        var adapter = MyAdapter(newsarraylist)
        recyclerView.adapter = adapter
        recyclerView.isClickable = true
        adapter.setOnItemClickListener(object : MyAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
                val intent = Intent(this@Recyclerview.requireContext(),hello::class.java)
                intent.putExtra("hey","21325")
                intent.putExtra("position",position)
                startActivity(intent)
            }

        })

    }
}
