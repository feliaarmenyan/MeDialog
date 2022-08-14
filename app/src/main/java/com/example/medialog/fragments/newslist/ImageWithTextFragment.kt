package com.example.medialog.fragments.newslist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.medialog.fragments.ToolbarWithMenu
import com.example.medialog.ui.theme.Teal200

class ImageWithTextFragment : Fragment() {

    private val args: ImageWithTextFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                ) {
                    ToolbarWithMenu(args.news.title) {
                        requireActivity().onBackPressed()
                    }
                    Image(
                        painter = painterResource(id = args.news.image),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(5f)
                    )
                    Text(
                        text = args.news.description,
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(10f)
                            .verticalScroll(
                                rememberScrollState()
                            )
                            .background(Teal200),
                        style = TextStyle(Color.White)
                    )
                }
            }
        }
    }
}