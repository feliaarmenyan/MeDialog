package com.example.medialog.fragments.quizgames

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.medialog.R
import com.example.medialog.fragments.ToolbarWithMenu
import com.example.medialog.ui.theme.Purple500
import com.example.medialog.ui.theme.Teal200

class QuizGamesList : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .background(Teal200)
                ) {
                    ToolbarWithMenu("Text Tasks") {
                        requireActivity().onBackPressed()
                    }

                    Image(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(350.dp),
                        painter = painterResource(id = R.drawable.quiz_games),
                        contentDescription = null
                    )

                    Divider(color = Purple500, thickness = 20.dp)

                    LazyVerticalGrid(
                        columns = GridCells.Fixed(2),
                        modifier = Modifier
                            .padding(12.dp)
                            .fillMaxHeight(),
                    ) {
                        val array: ArrayList<Int> = ArrayList(100)
                        for (i in 1..96) {
                            array.add(i)
                        }
                        itemsIndexed(array) { index, _ ->
                            QuizItem(index + 1) {
                                val action =
                                    QuizGamesListDirections.actionQuizGamesListToQuizItem(index + 1)
                                findNavController().navigate(action)

                            }
                        }
                    }
                }
            }
        }
    }

    @Composable
    fun QuizItem(number: Int, onClick: () -> Unit) {
        val shape = RoundedCornerShape(8.dp)
        val shapeRound = RoundedCornerShape(50.dp)
        Column(
            modifier = Modifier
                .padding(6.dp)
                .clickable { onClick() },
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .size(180.dp, 130.dp)
                    .clip(shape)
                    .background(Purple500),
                contentAlignment = Alignment.Center,
            ) {
                Box(
                    modifier = Modifier
                        .size(100.dp, 100.dp)
                        .clip(shapeRound)
                        .background(Teal200),
                    contentAlignment = Alignment.Center,
                ) {
                    Text(
                        text = number.toString(),
                        modifier = Modifier
                            .padding(top = 8.dp, start = 8.dp, end = 8.dp),
                        style = TextStyle(
                            Color.White, fontSize = 30.sp, fontWeight = FontWeight.Normal,
                        )
                    )
                }
            }
        }
    }
}