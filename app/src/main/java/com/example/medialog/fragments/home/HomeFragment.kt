package com.example.medialog.fragments.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import androidx.navigation.NavHostController
import androidx.navigation.findNavController
import com.example.medialog.R
import com.example.medialog.ui.theme.MeDialogColor
import com.example.medialog.ui.theme.Teal200

data class DialogItem(
    val title: String,
    val color: Int,
//    val icon: Int
)

@ExperimentalFoundationApi
class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Teal200
                ) {
                    Column(modifier = Modifier.fillMaxWidth()) {

                        Row(
                            modifier = Modifier
                                .height(200.dp)
                                .align(Alignment.CenterHorizontally),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "MeDialog", modifier = Modifier.weight(1f),
                                style = TextStyle(
                                    MeDialogColor,
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Bold,
                                ), textAlign = TextAlign.Center
                            )
                            Image(
                                modifier = Modifier
                                    .weight(2f)
                                    .height(200.dp),
                                painter = painterResource(id = R.drawable.home_page),
                                contentDescription = null
                            )
                        }

                        val list: ArrayList<DialogItem> = ArrayList(6)
                        list.add(
                            DialogItem(
                                "Text Lessons",
                                R.color.text_lessons,
//                                R.drawable.video
                            )
                        )
                        list.add(
                            DialogItem(
                                "Text Tasks",
                                R.color.test_exercise,
//                                R.drawable.video
                            )
                        )
                        list.add(
                            DialogItem(
                                "Online Books",
                                R.color.online_book,
//                                R.drawable.video
                            )
                        )
                        list.add(
                            DialogItem(
                                "Media News",
                                R.color.media_news,
//                                R.drawable.video
                            )
                        )
                        list.add(
                            DialogItem(
                                "Video Lessons",
                                R.color.video_lessons,
//                                R.drawable.video
                            )
                        )
                        list.add(
                            DialogItem(
                                "About", R.color.about,
//                            R.drawable.video
                            )
                        )
                        Conversation(navController = findNavController() as NavHostController, list)
                    }
                }
            }
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun Conversation(
    navController: NavHostController,
    messages: List<DialogItem>
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .padding(12.dp)
            .fillMaxHeight(),
    ) {
        itemsIndexed(messages) { _, item ->
            ItemOfGrid(item) {
                when (item.title) {
                    "Text Lessons" -> {
                        val action =
                            HomeFragmentDirections.actionHomeFragmentToNewListFragment(
                                false
                            )
                        navController.navigate(action)
                    }
                    "Media News" -> {
                        val action =
                            HomeFragmentDirections.actionHomeFragmentToNewListFragment(
                                true
                            )
                        navController.navigate(action)
                    }
                    "Video Lessons" -> navController.navigate(R.id.action_HomeFragment_to_VideoListFragment)
                    "About" -> navController.navigate(R.id.action_HomeFragment_to_AboutFragment)
                    "Online Books" -> navController.navigate(R.id.action_HomeFragment_to_onlineBook)
                    "Text Tasks" -> navController.navigate(R.id.action_HomeFragment_to_quizGamesList)
                }
            }
        }
    }
}

@Composable
fun ItemOfGrid(
    dialogItem: DialogItem,
    onClick: () -> Unit
) {
    val shape = RoundedCornerShape(12.dp)
    Column(
        modifier = Modifier
            .wrapContentSize(Alignment.Center)
            .padding(6.dp)
            .clickable { onClick() },
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .size(275.dp, 130.dp)
                .clip(shape)
                .background(colorResource(dialogItem.color))
                .align(Alignment.CenterHorizontally)
        ) {
            Text(
                text = dialogItem.title,
                modifier = Modifier
                    .padding(top = 8.dp, start = 8.dp, end = 8.dp)
                    .align(Alignment.Center),
                style = TextStyle(
                    Color.White, fontSize = 18.sp, fontWeight = FontWeight.Bold,
                )
            )
//
//            Image(
//                painter = painterResource(id = dialogItem.icon),
//                modifier = Modifier.align(Alignment.BottomEnd).size(90.dp, 90.dp),
//                contentDescription = null
//            )
        }
    }
}