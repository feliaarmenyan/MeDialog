package com.example.medialog.fragments.onlinebooks

import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.example.medialog.R
import com.example.medialog.databinding.OnlineBookFragmentBinding
import com.example.medialog.fragments.ToolbarWithMenu

class OnlineBook : Fragment() {
    private lateinit var binding: OnlineBookFragmentBinding

    lateinit var imageAdapter1: OnlineBooksImagesAdapter
    lateinit var imageAdapter2: OnlineBooksImagesAdapter
    lateinit var imageAdapter3: OnlineBooksImagesAdapter
    lateinit var imageAdapter4: OnlineBooksImagesAdapter
    lateinit var imageAdapter5: OnlineBooksImagesAdapter
    lateinit var imageAdapter6: OnlineBooksImagesAdapter
    lateinit var imageAdapter7: OnlineBooksImagesAdapter
    lateinit var imageAdapter8: OnlineBooksImagesAdapter
    lateinit var imageAdapter9: OnlineBooksImagesAdapter
    lateinit var imageAdapter10: OnlineBooksImagesAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = OnlineBookFragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val books: ArrayList<Books> = ArrayList(10)
        val imageOfBook1: ArrayList<Image> = ArrayList(2)
        imageOfBook1.add(Image(R.drawable.image1_of_book1))
        imageOfBook1.add(Image(R.drawable.image2_of_book1))
        books.add(Books(imageOfBook1, R.string.media_literacy))
        val imageOfBook2: ArrayList<Image> = ArrayList(2)
        imageOfBook2.add(Image(R.drawable.image1_of_book2))
        imageOfBook2.add(Image(R.drawable.image2_of_book2))
        books.add(Books(imageOfBook2, R.string.media_literal_design_manual))
        val imageOfBook3: ArrayList<Image> = ArrayList(2)
        imageOfBook3.add(Image(R.drawable.image1_of_book3))
        imageOfBook3.add(Image(R.drawable.image2_of_book3))
        books.add(Books(imageOfBook3, R.string.media_literacy_teaching_manual))
        val imageOfBook4: ArrayList<Image> = ArrayList(2)
        imageOfBook4.add(Image(R.drawable.image1_of_book4))
        imageOfBook4.add(Image(R.drawable.image2_of_book4))
        books.add(Books(imageOfBook4, R.string.guide_media_literacy))
        val imageOfBook5: ArrayList<Image> = ArrayList(2)
        imageOfBook5.add(Image(R.drawable.image1_of_book5))
        imageOfBook5.add(Image(R.drawable.image2_of_book5))
        books.add(Books(imageOfBook5, R.string.protect_yourself))
        val imageOfBook6: ArrayList<Image> = ArrayList(2)
        imageOfBook6.add(Image(R.drawable.image1_of_book6))
        imageOfBook6.add(Image(R.drawable.image2_of_book6))
        books.add(Books(imageOfBook6, R.string.literacy))
        val imageOfBook7: ArrayList<Image> = ArrayList(2)
        imageOfBook7.add(Image(R.drawable.image1_of_book7))
        imageOfBook7.add(Image(R.drawable.image2_of_book7))
        books.add(Books(imageOfBook7, R.string.media_literacy_thinking))
        val imageOfBook8: ArrayList<Image> = ArrayList(2)
        imageOfBook8.add(Image(R.drawable.image1_of_book8))
        imageOfBook8.add(Image(R.drawable.image2_of_book8))
        books.add(Books(imageOfBook8, R.string.media_literacy_rus))
        val imageOfBook9: ArrayList<Image> = ArrayList(2)
        imageOfBook9.add(Image(R.drawable.image1_of_book9))
        imageOfBook9.add(Image(R.drawable.image2_of_book9))
        books.add(Books(imageOfBook9, R.string.media_literacy_how_live))
        val imageOfBook10: ArrayList<Image> = ArrayList(2)
        imageOfBook10.add(Image(R.drawable.image1_of_book10))
        imageOfBook10.add(Image(R.drawable.image2_of_book10))
        books.add(Books(imageOfBook10, R.string.media_education))

        imageAdapter1 = OnlineBooksImagesAdapter()
        imageAdapter2 = OnlineBooksImagesAdapter()
        imageAdapter3 = OnlineBooksImagesAdapter()
        imageAdapter4 = OnlineBooksImagesAdapter()
        imageAdapter5 = OnlineBooksImagesAdapter()
        imageAdapter6 = OnlineBooksImagesAdapter()
        imageAdapter7 = OnlineBooksImagesAdapter()
        imageAdapter8 = OnlineBooksImagesAdapter()
        imageAdapter9 = OnlineBooksImagesAdapter()
        imageAdapter10 = OnlineBooksImagesAdapter()
        binding.toolbar.setContent {

            ToolbarWithMenu("Online Books") {
                requireActivity().onBackPressed()
            }
        }
        binding.books1.adapter = imageAdapter1
        binding.books2.adapter = imageAdapter2
        binding.books3.adapter = imageAdapter3
        binding.books4.adapter = imageAdapter4
        binding.books5.adapter = imageAdapter5
        binding.books6.adapter = imageAdapter6
        binding.books7.adapter = imageAdapter7
        binding.books8.adapter = imageAdapter8
        binding.books9.adapter = imageAdapter9
        binding.books10.adapter = imageAdapter10

        imageAdapter1.submitList(books[0].image)
        imageAdapter2.submitList(books[1].image)
        imageAdapter3.submitList(books[2].image)
        imageAdapter4.submitList(books[3].image)
        imageAdapter5.submitList(books[4].image)
        imageAdapter6.submitList(books[5].image)
        imageAdapter7.submitList(books[6].image)
        imageAdapter8.submitList(books[7].image)
        imageAdapter9.submitList(books[8].image)
        imageAdapter10.submitList(books[9].image)

        binding.title1.movementMethod = LinkMovementMethod.getInstance()
        binding.title2.movementMethod = LinkMovementMethod.getInstance()
        binding.title3.movementMethod = LinkMovementMethod.getInstance()
        binding.title4.movementMethod = LinkMovementMethod.getInstance()
        binding.title5.movementMethod = LinkMovementMethod.getInstance()
        binding.title6.movementMethod = LinkMovementMethod.getInstance()
        binding.title7.movementMethod = LinkMovementMethod.getInstance()
        binding.title8.movementMethod = LinkMovementMethod.getInstance()
        binding.title9.movementMethod = LinkMovementMethod.getInstance()
        binding.title10.movementMethod = LinkMovementMethod.getInstance()


    }
}

data class Image(val image: Int)
data class Books(val image: ArrayList<Image>, val title: Int)