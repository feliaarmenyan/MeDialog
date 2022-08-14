package com.example.medialog.fragments.video

import android.os.Bundle
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.medialog.fragments.ToolbarWithMenu
import com.example.medialog.ui.theme.Purple500
import com.example.medialog.ui.theme.Teal200
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Video(
    val title: String,
    val id: String,
    val description: String
) : Parcelable

@ExperimentalFoundationApi
class VideoListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val videos: ArrayList<Video> = ArrayList(10)
        videos.add(
            Video(
                title = "Տեղեկատվական լուրեր",
                id = "boqWgW8RsSA",
                description = "Ամեն օր օգտվելով համացանցի տեղեկատվական էջերից: հաճախ բախվում ենք այնպիսի էջերի, որոնք անծանոթ են և մեր կողմից ուսումնասիրված չեն։ Արագության և անուշադրության պատճառով երբեմն մենք չնկատելով անծանոթ աղբյուրը ուսումնասիրում ենք չստուգված տեղեկությունը և հավատում դրան։ " +
                        "Հետևյալ տեսանյութի միջոցով դուք կարող եք ավելի խորը ուսումնասիրել ապատեղեկատուների շահերը և թե ինչպես խուսափել ապատեղեկատվության զոհ լինելուց։"
            )
        )
        videos.add(
            Video(
                title = "Կայքերի նմանակում",
                id = "fS1-OujR_O4",
                description = "Ամեն օր մենք հետեւում ենք շատ լրատվական էջերի, քանի որ դրանց հավաստիությունը հաստատված է։ Սակայն շտապող մարդը հաճախ կարող է հետևել հավաստի էջի նմանակին` չնկատելով, որ դրանք իրականում տարբերվում են։ Ֆեյք էջը կարող է տարբերվել իրական էջից անվան ինչ-որ մասնիկով կամ նույնիսկ ինտերնետային հասցեով։ Այս տեսանյութի միջոցով կիմանանք, թե ինչպիսի դետալների պետք է ուշադրություն դարձնել հավաստի էջը նմանակից տարբերելու համար։"
            )
        )
        videos.add(
            Video(
                title = "Շահումներ՝ ֆեյսբուքում",
                id = "pbhnQ3cWX_I",
                description = "Շատերիս են հանդիպել ինտերնետում շահարկումներ, որոնց ետեւում կանգնած մարդիկ հետապնդում են տարբեր շահեր։ Այդպիսի փոստերը ունեն շատ համոզիչ վերնագիր և գրավում են շատերի ուշադրությունը։ Օրեցօր աճում են այդպիսի խաբեության զոհերի թիվը, և այս վիճակը միայն Հայաստանում չէ։ Հետեւյալ տեսանյութում դուք կծանոթանաք նմանատիպ շահարկումների տրման ձևերին և թե ինչի կարող է հանգել դրանց հավատալը:"
            )
        )
        videos.add(
            Video(
                title = "Կիբեռհանցագործներ",
                id = "yM5nLuFlx-U",
                description = "Ժամանակի ընթացքում ավելի են տարածվում մեդիայի շրջանակներում հանցագործությունները։ Սակայն որոշ դեպքերում մենք չենք էլ գիտակցում, որ ինքներս ենք սպառնալիքի տակ դնում մեր անձնական տվյալները։ Կիբեռհանցագործների նպատակները տարբեր են, սակայն ոչ մեկն էլ լավ ավարտ չի ունենում մեզ համար։ Այս տեսանյութի միջոցով կարող եք իմանալ կիբեռհանցագործության և դրա տարածման մասին։"
            )
        )
        videos.add(
            Video(
                title = "Սկանդալային թեմաներ",
                id = "2p6fVlfOdJk",
                description = "Մարդկանց ուշադրությունը գրավող հիմնական թեմաները սկանդալային են։ Ահա այսպիսի ճանապարհով են ֆեյքերը հավաքում իրենց դիտորդներին։ Տեսանյութը դիտելիս ավելի պարզ կդառնա, թե ինչու է անհրաժեշտ խուսափել նման սկանդալային փոստերից, ինչպես նաև նմանատիպ փոստերի օրինակներ"
            )
        )
        videos.add(
            Video(
                title = "Սոցիալական հարցումներ",
                id = "8buu6j3Nj_I",
                description = "Բոլորս էլ մասնակցել ենք տարատեսակ հարցումների, տարբեր նպատակներով։ Սակայն ոչ բոլոր հարցումների ետևում են կանգնած բարեխիղճ մարդիկ։ Տեսանյութը ներկայացնում է, բոլոր այն նպատակները, որոնց կարող են հասնել ֆեյքերը, եթե մենք լրացնենք չպաշտպանված հարցումներ"
            )
        )
        videos.add(
            Video(
                title = "Կեղծ հակավիրուսներ",
                id = "Gq2Jw5rVscE",
                description = "Մարդիկ վախենալով համակարգչային վիրուսներից ներբեռնում են հակավիրուսներ, մտածելով, որ այդպես լիարժեք ազատում են իրենց համակարգիչները վտանգից։ Սակայն ոչ բոլոր հակավիրուսներն են պաշտպանության համար ստեղծված։ Կան հակավիրուսներ, որոնք իրենցից հենց ներկայացնում են վիրուսներ։ Ավելի լավ պատկերացում ձեռք բերելու համար էլ կարող եք դիտել այս տեսանյութը։"
            )
        )
        videos.add(
            Video(
                title = "Անվտանգությունը սոցցանցերում",
                id = "r9lkZVr4iK4",
                description = "Մեդիայում կիբեռհարձակման վտանգը գնալով աճում է և արդեն զգացվում է անձնական տվյալների պաշտպանման կարիքը։ Սակայն ոչ բոլորը գիտեն, թե ինչպես ճիշտ պաշտպանվել և լիարժեք ազատվել վտանգից։ Հետեւյալ տեսանյութը ձեզ կօգնի այդ հարցում։"
            )
        )
        videos.add(
            Video(
                title = "Կեղծ շահումներ",
                id = "EIAsNJHgAD8",
                description = "Սոց կայքերում կամ ընդհանրապես համացանցում տարածված են կայքեր, որոնք առաջարկում են օդից շահումներ։ Հաճախ առաջարկը այնքան գրավիչ է լինում, որ մարդիկ միանգամից հավատում են և տրամադրում կայքին իրենց անձնական կամ բանկային տվյալները։"
            )
        )
        videos.add(
            Video(
                title = "Կեղծ խանութներ",
                id = "7p1_n-tQMDY",
                description = "Օնլայն խանութները կազմում են մեր առօրյայի մի մասը։ Բոլորս էլ գոնե մեկ անգամ փորձել ենք օնլայն ինչ-որ ապրանք պատվիրել, քանի որ այնտեղ համեմատաբար ցածր գներ են։ Սակայն ոչ բոլոր օնլայն խանութներն են իրական։ Կան նաև շատ վտանգավոր օնլայն խանութներ, որոնք հեշտությամբ կորզում են դրանց դիմորդների անձնական տվյալները և գումարը։ Տեսանյութը ավելի պատկերավոր կներկայացնի կեղծ օնլայն խանութների կողմից իրականացրած հափշտակման պրոցեսը։"
            )
        )

        return ComposeView(requireContext()).apply {
            setContent {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Teal200)
                ) {
                    ToolbarWithMenu("Video Lessons") {
                        requireActivity().onBackPressed()
                    }

                    LazyVerticalGrid(
                        columns = GridCells.Fixed(2),
                        modifier = Modifier
                            .padding(12.dp)
                            .fillMaxHeight(),
                    ) {
                        itemsIndexed(videos) { _, item ->
                            VideoItem(item) {
                                val action =
                                    VideoListFragmentDirections.actionVideoListFragmentToVideoWithYoutubeFragment(
                                        item
                                    )
                                findNavController().navigate(action)
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun VideoItem(item: Video, onClick: () -> Unit) {
    val shape = RoundedCornerShape(24.dp)
    Column(
        modifier = Modifier
            .padding(6.dp)
            .clickable { onClick() },
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .size(275.dp, 130.dp)
                .clip(shape)
                .background(Purple500),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                text = item.title,
                modifier = Modifier
                    .padding(top = 8.dp, start = 8.dp, end = 8.dp),
                style = TextStyle(
                    Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold,
                )
            )
        }
    }
}