package com.example.medialog.fragments.quizgames

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.AlertDialog
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.medialog.R
import com.example.medialog.fragments.Description
import com.example.medialog.fragments.ToolbarWithMenu
import com.example.medialog.ui.theme.Teal200

class QuizItem : Fragment() {
    private val args: QuizItemArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val quizList: ArrayList<Quiz> = ArrayList(4)
        var answer1: ArrayList<Answer> = ArrayList(7)
        answer1.add(
            Answer(
                "Թերթը հրապարակում է հարցազրույց իր լրագրողներից մեկի և գործող նախագահի միջև ընտրություններից առաջ:",
                true
            )
        )
        answer1.add(Answer("Լրատվամիջոցներից մեկը հոդված է հրապարակում հայտնի աստղերի ընտանի կենդանիների նկարներով։"))
        answer1.add(
            Answer(
                "Ուշ երեկոյան թոք-շոուի հաղորդավարուհին իր շոուն հրավիրում է երեք մասնակիցների՝ քննարկելու #MeToo շարժումը: Քննության մասնակիցներից մեկը բարձրաստիճան մի գործչի մեղադրել է աշխատավայրում ոտնձգությունների մեջ: Մյուսը կադրերի մենեջեր է, որը պատասխանատու է իր ընկերության զբաղվածության պրակտիկայի և քաղաքականության համար: Երրորդ մասնակիցը գիրք է գրել այն մասին, թե ինչպես է MeToo-ն փոխում կորպորատիվ Ամերիկան:",
                true
            )
        )
        answer1.add(
            Answer(
                "Լրատվամիջոցներից մեկը հրապարակում է առողջապահական քաղաքականության փորձագետի կարծիքը առողջապահական բարեփոխումների օգուտների մասին:",
                true
            )
        )
        answer1.add(Answer("Բլոգում ներկայացված են տարվա 10 ամենադիտված ռեալիթի շոուները:"))
        answer1.add(
            Answer(
                "Լրատվական թղթակիցը լուսաբանում է պատերազմի բռնկումը մեկ այլ մայրցամաքի երկրում:",
                true
            )
        )
        answer1.add(
            Answer(
                "Թերթի հոդվածում խոսվում է այն մասին, թե ինչպես են խոշոր քաղաքում շինարարական ընկերությունները չեն պահպանում շինարարական կանոնները:",
                true
            )
        )
        quizList.add(
            Quiz(
                number = 1,
                question = "Ստորև բերվածներից որո՞նք են ԶԼՄ-ների օրինակները, որոնք կատարում են «լավ կառավարման» գործառույթները: (Ստուգեք այն ամենը, ինչ կիրառվում է):",
                answer = answer1
            )
        )
        val answer2: ArrayList<Answer> = ArrayList(4)
        answer2.add(Answer("Կառավարություններ և ընկերություններ"))
        answer2.add(Answer("Ընկերություններ և ընտանիքներ"))
        answer2.add(Answer("Ընտանիքներ և կառավարություններ", true))
        answer2.add(Answer("Ընտանիքներ և ընկերություններ"))
        quizList.add(
            Quiz(
                number = 2,
                question = "Համաշխարհային առումով ո՞ր երկու խմբերն են ամենայն հավանականությամբ տիրապետում մեդիա կազմակերպություններին:",
                answer = answer2
            )
        )
        val answer3: ArrayList<Answer> = ArrayList(2)
        answer3.add(Answer("Ճիշտ"))
        answer3.add(Answer("Կեղծ", true))
        quizList.add(
            Quiz(
                number = 3,
                question = "Ճիշտ է, թե Սխալ. Պետական և հանրային լրատվամիջոցների միջև տարբերություն չկա:",
                answer = answer3
            )
        )
        val answer4: ArrayList<Answer> = ArrayList(4)
        answer4.add(Answer("Լրատվական կազմակերպությունները չպետք է զեկուցեն կրոնի մասին։"))
        answer4.add(Answer("Ընտրված պաշտոնյաները չպետք է թույլ տան, որ իրենց կրոնական համոզմունքները ազդեն իրենց կառավարման վրա:"))
        answer4.add(
            Answer(
                "Լրատվական կազմակերպության բիզնես և խմբագրական գործունեությունը պահվում է առանձին:",
                true
            )
        )
        answer4.add(Answer("Լրատվամիջոցները, կառավարությունը և կրոնական հաստատությունները կարևոր, բայց առանձին դերեր են կատարում հասարակության մեջ:"))
        quizList.add(
            Quiz(
                number = 4,
                question = "Ինչի՞ն է վերաբերում եկեղեցու և պետության տարանջատումը մեդիա ոլորտում։",
                answer = answer4
            )
        )
        val answer5: ArrayList<Answer> = ArrayList(2)
        answer5.add(Answer("Ճիշտ"))
        answer5.add(Answer("Կեղծ", true))
        quizList.add(
            Quiz(
                number = 5,
                question = "Ճիշտ է, թե Սխալ. Բարձրորակ լուրերի համար երբեք չի օգտագործվի անանուն աղբյուր:",
                answer = answer5
            )
        )
        val answer6: ArrayList<Answer> = ArrayList(5)
        answer6.add(
            Answer(
                "Դուք չեք կարող գտնել մեկ այլ հեղինակավոր լրատվամիջոցի հոդված, որը կհաստատի պատմության պնդումները",
                true
            )
        )
        answer6.add(
            Answer(
                "Հոդվածում ներառված են փաստեր և տվյալներ՝ իր տեսակետը հաստատելու համար՝ չնշելով, թե որտեղից է նա ստացել այդ տեղեկատվությունը:",
                true
            )
        )
        answer6.add(Answer("Կայքի տիրույթի անունը վերջանում է .uk-ով"))
        answer6.add(Answer("Հոդվածում մեջբերում են աղբյուրները և բացատրում, թե որտեղ են եղել հայտարարությունները:"))
        answer6.add(Answer("Հոդվածում շեշտվում են ապշեցուցիչ փաստերը՝ ընդգծելով դրանք։", true))
        quizList.add(
            Quiz(
                number = 6,
                question = "Հետևյալներից ո՞րը կարող է նախազգուշացնող նշան լինել, որ պատմությունը ճշգրիտ չէ: (Ստուգեք այն ամենը, ինչ կիրառվում է):",
                answer = answer6
            )
        )
        val answer7: ArrayList<Answer> = ArrayList(2)
        answer7.add(Answer("Ճիշտ"))
        answer7.add(
            Answer(
                "Կեղծ: Մեդիագրագիտությունը ավելին է, քան մեդիա մուտք գործելու ունակությունը. այն նաև ներառում է ավելի ակտիվ ներգրավվածություն լրատվամիջոցների հետ, ինչպիսիք են գնահատումը և ստեղծումը:",
                true
            )
        )
        quizList.add(
            Quiz(
                number = 7,
                question = "Մեդիագրագիտությունը տարբեր ձևերով լրատվամիջոցներ մուտք գործելու կարողություն է:",
                answer = answer7
            )
        )
        val answer8: ArrayList<Answer> = ArrayList(2)
        answer8.add(Answer("Ճիշտ"))
        answer8.add(
            Answer(
                "Կեղծ: Կան տարիքի հետ կապված որոշ խնդիրներ, ինչպիսիք են տարիքին համապատասխան մուտքի կառավարումը առցանց բովանդակության համար:",
                true
            )
        )
        quizList.add(
            Quiz(
                number = 8,
                question = "Մեդիագրագիտության հետ կապված խնդիրները բոլորի համար նույնն են՝ անկախ տարիքից։",
                answer = answer8
            )
        )
        val answer9: ArrayList<Answer> = ArrayList(2)
        answer9.add(Answer("Ճիշտ", true))
        answer9.add(Answer("Կեղծ"))
        quizList.add(
            Quiz(
                number = 9,
                question = "Հաղորդակցությունը հիմնականում տեղեկատվության կամ իմաստի փոխանակում է, բայց կան հաղորդակցության բազմաթիվ տարբեր մոդելներ:",
                answer = answer9
            )
        )
        val answer10: ArrayList<Answer> = ArrayList(2)
        answer10.add(Answer("Ճիշտ", true))
        answer10.add(Answer("Կեղծ"))
        quizList.add(
            Quiz(
                number = 10,
                question = "Հաղորդակցությունը կարող է օգնել սահմանել սոցիալական չափանիշներ՝ ցույց տալով, թե ինչն է ընդունելի կամ անընդունելի հասարակության մեջ:",
                answer = answer10
            )
        )
        val answer11: ArrayList<Answer> = ArrayList(4)
        answer11.add(Answer("Միջմշակութային հաղորդակցություն"))
        answer11.add(Answer("Կազմակերպչական հաղորդակցություն"))
        answer11.add(Answer("Զանգվածային հաղորդակցություն", true))
        answer11.add(Answer("Միջանձնային հաղորդակցություն"))
        quizList.add(
            Quiz(
                number = 11,
                question = "Հետևյալ տերմիններից ո՞րն է օգտագործվում մեկից շատ և շատից շատ հաղորդակցման գործողությունները դասակարգելու համար:",
                answer = answer11
            )
        )
        val answer12: ArrayList<Answer> = ArrayList(4)
        answer12.add(Answer("1982 թ"))
        answer12.add(Answer("2012 թ"))
        answer12.add(Answer("1992 թ", true))
        answer12.add(Answer("2002 թ"))
        quizList.add(
            Quiz(
                number = 12,
                question = "Aspen Media Literacy Leadership Institute-ը մեդիագրագիտությունը սահմանեց որպես «տարբեր ձևերով լրատվամիջոցներ մուտք գործելու, վերլուծելու, գնահատելու և ստեղծելու կարողություն»: Ո՞ր թվականին է առաջին անգամ հրապարակվել այս սահմանումը:",
                answer = answer12
            )
        )
        val answer13: ArrayList<Answer> = ArrayList(4)
        answer13.add(Answer("Մեդիագրագիտությունը կարևոր հմտություն է, որը հնարավորություն կտա երիտասարդներին ներգրավվել որպես ժողովրդավարական երկրի քաղաքացիներ"))
        answer13.add(
            Answer(
                "Մեդիագրագիտությունը զարգացնում է հասարակության մեջ լրատվամիջոցների դերի ըմբռնումը",
                true
            )
        )
        answer13.add(
            Answer(
                "Մեդիագրագիտությունը զարգացնում է հարցումների և ինքնարտահայտման էական հմտություններ",
                true
            )
        )
        answer13.add(Answer("Մեդիագրագիտությունն առաջին հերթին վերաբերում է լուրերի աղբյուրների գնահատմանը"))
        quizList.add(
            Quiz(
                number = 13,
                question = "Հետևյալ հասկացություններից որո՞նք են ներառված Մեդիագրագիտության կենտրոնի 21-րդ դարի Մեդիագրագիտության ընդլայնված սահմանման մեջ: (Նշեք բոլորը, որոնք կիրառվում են. կա երկու ճիշտ պատասխան:)",
                answer = answer13
            )
        )
        val answer14: ArrayList<Answer> = ArrayList(5)
        answer14.add(Answer("Միակողմանի"))
        answer14.add(Answer("Քննադատաբար վերլուծելով լրատվամիջոցների բովանդակությունը՝ հաշվի առնելով դրա կոնկրետ ներկայացումը, դրա հիմքում ընկած քաղաքական կամ սոցիալական հաղորդագրությունները"))
        answer14.add(Answer("Լրատվամիջոցների սեփականության և կարգավորման հարցերը գնահատելը, որոնք կարող են ազդել, թե ինչ ձևով է ներկայացվում լրատվամիջոցը"))
        answer14.add(Answer("Տեխնոլոգիայի ասպեկտները"))
        answer14.add(Answer("Վերոնշյալ բոլորը մեդիագրագիտության մաս են:", true))
        quizList.add(
            Quiz(
                number = 14,
                question = "Հետևյալներից ո՞րը «Մեդիա գրագիտություն»-ի մաս չէ:",
                answer = answer14
            )
        )
        val answer15: ArrayList<Answer> = ArrayList(5)
        answer15.add(Answer("Մեդիա քերականություն"))
        answer15.add(Answer("Մեդիա ալիքների մասնատում"))
        answer15.add(Answer("Մեդիա արտադրության պրակտիկա", true))
        answer15.add(Answer("Commercial Forces Shaping Media Content"))
        answer15.add(Answer("Ոչ մեկը վերը նշված"))
        quizList.add(
            Quiz(
                number = 15,
                question = "Ստորև բերվածներից ո՞րը ՉԻ մեդիա գրագիտության ձևավորման երեք ընդհանուր կատեգորիաներից մեկը:",
                answer = answer15
            )
        )
        val answer16: ArrayList<Answer> = ArrayList(5)
        answer16.add(Answer("Գրքերի, թերթերի և ամսագրերի չափն ու ձևավորումը"))
        answer16.add(Answer("Հեռուստատեսության, խմբագրման, լուսավորության, ձայնային էֆեկտների և երաժշտության համար օգտագործվող տեսախցիկի անկյունների տեսակները, որոնք օգնում են դիտողներին ցույց տալ"))
        answer16.add(Answer("Ձայնային էֆեկտների, արդիականությունների և ձայնային ազդանշանների օգտագործում ռադիոյով"))
        answer16.add(Answer(" Երաժշտական ժանրերը, որոնց երաժշտական արդյունաբերությունը բաժանում է երաժշտությունը"))
        answer16.add(Answer("Բոլոր վերոնշյալները", true))
        quizList.add(
            Quiz(
                number = 16,
                question = "Մեդիա քերականությունը ներառում է հետևյալներից ո՞րը.",
                answer = answer16
            )
        )
        val answer17: ArrayList<Answer> = ArrayList(5)
        answer17.add(Answer("Նայելով ապրանքանիշի անունը. . .վստահելի բրենդ է:"))
        answer17.add(Answer("Համոզվելով, որ աղբյուրը կառավարական գործակալություն է", true))
        answer17.add(Answer("Կայքի ներքին տեղեկատվության և փաստերի ստուգման և առաքելության ընթացակարգի ստուգում, ինչպես նաև, թե որ տեսակի վեբ կայքերին է այն կապում"))
        answer17.add(Answer("Համեմատելով վեբկայքի տեղեկատվությունը կայացած մեդիա ընկերության նույն տեղեկատվության կամ սկզբնաղբյուր նյութի հետ"))
        answer17.add(Answer("Ոչ մեկը վերը նշված"))
        quizList.add(
            Quiz(
                number = 17,
                question = "Հետևյալներից ո՞ր մեկը ՉԻ առցանց հայտնաբերված տեղեկատվության գնահատման հիմնական եղանակներից մեկը:",
                answer = answer17
            )
        )
        val answer18: ArrayList<Answer> = ArrayList(5)
        answer18.add(Answer("Առևտրային որոշումները հաճախ դեր են խաղում ստեղծվող մեդիա բովանդակության տեսակի մեջ"))
        answer18.add(Answer("ԱՄՆ-ում մեդիա ձեռնարկությունների մեծ մասը հետևում է շահույթի մոդելին իրենց գործունեության համար"))
        answer18.add(Answer("Կորպորատիվ հովանավորությունը մեծ դեր է խաղում ԱՄՆ-ում հանրային հեռուստատեսության ծրագրերի ֆինանսավորման գործում, որոնք իրենց ֆինանսավորման մեկ երրորդից պակասն են ստանում կառավարությունից։"))
        answer18.add(
            Answer(
                "Խոշոր մեդիա ընկերությունները, ինչպիսիք են Time Warner-ը, Walt Disney-ը և Viacom-ը, գլոբալ են և, հետևաբար, հազվադեպ են կարող գերիշխել տեղական լրատվամիջոցներում:",
                true
            )
        )
        answer18.add(Answer("Այս բոլորը ճշմարիտ են։"))
        quizList.add(
            Quiz(
                number = 18,
                question = "Հետևյալներից ո՞րը չի համապատասխանում մեդիա բովանդակությունը ձևավորող առևտրային ուժերին:",
                answer = answer18
            )
        )
        val answer19: ArrayList<Answer> = ArrayList(4)
        answer19.add(
            Answer(
                "Սանդղակի տնտեսություններ, որոնք կարող են ձեռք բերել լրատվամիջոցների սեփականատերերը՝ ունենալով ավելի մեծ մեդիա ընկերություններ տարբեր տեսակի լրատվամիջոցներում",
                true
            )
        )
        answer19.add(Answer("Դաշնային կանոններ, որոնք պահանջում են մեդիա ընկերություններին ձեռք բերել նոր լրատվամիջոցների սեփականություն."))
        answer19.add(Answer("Բազմազանության նպատակներ, որոնք կարող են իրականացվել հիմնականում լրատվամիջոցների լայն սեփականության միջոցով."))
        answer19.add(Answer("Բոլոր վերոնշյալները"))
        answer19.add(Answer("Ոչ մեկը վերը նշված"))
        quizList.add(
            Quiz(
                number = 19,
                question = "Հետևյալ ուժերից ո՞րն է պայմանավորված ԶԼՄ-ների սեփականության կենտրոնացումը.",
                answer = answer19
            )
        )
        val answer20: ArrayList<Answer> = ArrayList(5)
        answer20.add(Answer("Հաղորդակցության որոշակի միջոցի հիմքում ընկած տեխնոլոգիա"))
        answer20.add(Answer("xx հաղորդագրության տակ եղած հաղորդագրությունը ճիշտ է"))
        answer20.add(Answer("ստակ հաղորդագրություն", true))
        answer20.add(Answer("Բոլոր վերոնշյալները"))
        answer20.add(Answer("Ոչ մեկը վերը նշված"))
        quizList.add(
            Quiz(
                number = 20,
                question = "Ենթատեքստը ՉԻ վերաբերում ստորև նշվածներից որին",
                answer = answer20
            )
        )
        val answer21: ArrayList<Answer> = ArrayList(3)
        answer21.add(Answer("Հեռուստացույց, ֆիլմեր, ամսագրեր, թերթեր, տեսախաղեր, երաժշտություն, ռադիո և գովազդ"))
        answer21.add(Answer("սոցիալական ցանցեր, լուսանկարների և տեսանյութերի փոխանակման կայքեր և այլ առցանց բովանդակություն"))
        answer21.add(Answer("Բոլոր վերոնշյալները", true))
        quizList.add(Quiz(number = 21, question = "ետևյալներից ո՞րն է «մեդիա»:", answer = answer21))
        val answer22: ArrayList<Answer> = ArrayList(3)
        answer22.add(Answer("մարդկանց տեղեկացնել նոր ապրանքների և ծառայությունների մասին"))
        answer22.add(Answer("մարդկանց տեղեկացնել արտադրանքի առավելությունների մասին և որտեղից այն գնել"))
        answer22.add(Answer("ընկերության համար գումար աշխատելու համար", true))
        quizList.add(
            Quiz(
                number = 22,
                question = "Ո՞րն է գովազդի հիմնական նպատակը:",
                answer = answer22
            )
        )
        val answer23: ArrayList<Answer> = ArrayList(3)
        answer23.add(Answer("Դա կարող է առաջացնել ուտելու խանգարումներ։"))
        answer23.add(Answer("Դա կարող է ազդել մարմնի պատկերի և ինքնագնահատականի վրա:", true))
        answer23.add(Answer("Դա ոչ մի ազդեցություն չունի։"))
        quizList.add(
            Quiz(
                number = 23,
                question = "Ի՞նչ ազդեցություն ունի կատարյալ նիհար կանանց և մկանուտ տղամարդկանց հետ շփումը մարդկանց վրա:",
                answer = answer23
            )
        )
        val answer24: ArrayList<Answer> = ArrayList(3)
        answer24.add(Answer("Պարզապես անտեսեք այն, քանի որ դա, հավանաբար, միայն ձեզ է անհանգստացնում"))
        answer24.add(Answer("Պարզապես ընդունեք այն, քանի որ իրականում ոչինչ չեք կարող անել դրա դեմ"))
        answer24.add(
            Answer(
                "Թող հաղորդագրության համար պատասխանատու մարդիկ իմանան, թե ինչ եք զգում:",
                true
            )
        )
        quizList.add(
            Quiz(
                number = 24,
                question = "Ի՞նչ կարող եք անել, եթե լրատվամիջոցներում անընդունելի բան եք տեսնում:",
                answer = answer24
            )
        )
        val answer25: ArrayList<Answer> = ArrayList(3)
        answer25.add(
            Answer(
                "Դուք չեք կարող հասնել այս տեսքին, քանի որ նրանք իրական կյանքում նման չեն",
                true
            )
        )
        answer25.add(Answer("Համոզվեք, որ հետևեք առողջ սննդակարգին և վարժություններին:"))
        answer25.add(Answer("Օգտագործեք այն ապրանքը, որը նրանք գովազդում են:"))
        quizList.add(
            Quiz(
                number = 25,
                question = "Ինչպե՞ս կարող եք փորձել նմանվել այն կանանց և տղամարդկանց, ում տեսնում եք գովազդներում:",
                answer = answer25
            )
        )
        val answer26: ArrayList<Answer> = ArrayList(3)
        answer26.add(Answer("Իմացեք այս պատկերները ստեղծելու տեխնիկայի մասին:"))
        answer26.add(Answer("Քննադատորեն մտածեք հաղորդագրության հիմքում ընկած իմաստի մասին:"))
        answer26.add(Answer("Բոլոր վերոնշյալները", true))
        quizList.add(
            Quiz(
                number = 26,
                question = "Ինչպե՞ս կարող եք պայքարել ԶԼՄ-ներում մարմնի անիրատեսական իդեալական ստանդարտների դեմ:",
                answer = answer26
            )
        )
        val answer27: ArrayList<Answer> = ArrayList(3)
        answer27.add(Answer("Եթե նրանք ցածր ինքնագնահատական ունեն"))
        answer27.add(Answer("Եթե նրանք իրենց համեմատեն մոդելների ու հայտնիների հետ։"))
        answer27.add(Answer("Բոլոր վերոնշյալները", true))
        quizList.add(
            Quiz(
                number = 27,
                question = "Ինչն է ստիպում ինչ-որ մեկին ենթարկվել մարմնի կերպարի վրա նորաձևության ամսագրերի ազդեցությանը:",
                answer = answer27
            )
        )
        val answer28: ArrayList<Answer> = ArrayList(3)
        answer28.add(Answer("Մարդիկ, ովքեր աշխատում են խոշոր կորպորացիաներում, որոնք տիրապետում են մեր օգտագործած լրատվամիջոցներին"))
        answer28.add(Answer("Մարդիկ, ովքեր օգտագործում են մեդիա հաղորդագրություններ ուղարկելու, թվիթերյան գրառման, հրապարակելու կամ առցանց տեղեկատվություն տարածելու համար:"))
        answer28.add(Answer("Բոլոր վերոնշյալները", true))
        quizList.add(
            Quiz(
                number = 28,
                question = "Ո՞վ է ստեղծում մեդիա հաղորդագրություններ:",
                answer = answer28
            )
        )
        val answer29: ArrayList<Answer> = ArrayList(3)
        answer29.add(Answer("Բոլորը", true))
        answer29.add(Answer("Երեխաներ, ովքեր շատ հեռուստացույց են դիտում"))
        answer29.add(Answer("Սննդառության խանգարումներ ունեցող երիտասարդ կանայք"))
        quizList.add(
            Quiz(
                number = 29,
                question = "Ո՞վ է ենթակա մարմնի պատկերի վրա լրատվամիջոցների ազդեցությանը:",
                answer = answer29
            )
        )
        val answer30: ArrayList<Answer> = ArrayList(3)
        answer30.add(Answer("Համոզվեք, որ ձեր գաղտնաբառը տառերի և թվերի համակցություն է, որպեսզի ձեզ չկոտրեն"))
        answer30.add(Answer("Սահմանեք ձեր հաշիվը «մասնավոր», որպեսզի միայն ընկերները կարողանան դիտել ձեր պրոֆիլը"))
        answer30.add(
            Answer(
                "Իրականում ոչ մի միջոց չկա ապահովելու, որ այն, ինչ դուք տեղադրում եք առցանց, մնում է գաղտնի:",
                true
            )
        )
        quizList.add(
            Quiz(
                number = 30,
                question = "Ինչպե՞ս կարող եք վստահ լինել, որ ձեր առցանց հրապարակած տեսանյութերն ու նկարները դիտում են միայն այն մարդիկ, ում ցանկանում եք տեսնել դրանք:",
                answer = answer30
            )
        )
        val answer31: ArrayList<Answer> = ArrayList(4)
        answer31.add(Answer("Դա մեր հիմնարար իրավունքներից է։"))
        answer31.add(Answer("Մեր իրավունքն է մեր մտահոգությունները հայտնել կառավարությանը:"))
        answer31.add(Answer("Նշված տարբերակները ճիշտ են։", true))
        answer31.add(Answer("Դա իրավունք է արտահայտելու սեփական գաղափարն ու կարծիքը։"))
        quizList.add(
            Quiz(
                number = 31,
                question = "Ի՞նչ է խոսքի ազատությունը ",
                answer = answer31
            )
        )
        val answer32: ArrayList<Answer> = ArrayList(2)
        answer32.add(Answer("Խմբագրություն", true))
        answer32.add(Answer("editorial board"))
        quizList.add(
            Quiz(
                number = 32,
                question = "________ խորհուրդը կարծիք գրողների խումբ է, որը պարբերաբար հանդիպում է առանձին՝ քննարկելու նորությունները և գրելու հոդվածներ, որոնք ներկայացնում են լրատվամիջոցի կարծիքը՝ որպես կազմակերպություն կամ հաստատություն:",
                answer = answer32
            )
        )
        val answer33: ArrayList<Answer> = ArrayList(2)
        answer33.add(Answer("Ճիշտ"))
        answer33.add(Answer("Կեղծ", true))
        quizList.add(
            Quiz(
                number = 33,
                question = "Երբ լրատվական կազմակերպությունը լուրջ սխալ է թույլ տալիս կամ չի հետևում որակյալ լրագրության էթիկային և չափանիշներին, մյուս լրատվականներն անտեսում են դա՝ համերաշխությունից դրդված:",
                answer = answer33
            )
        )
        val answer34: ArrayList<Answer> = ArrayList(3)
        answer34.add(Answer("Առաջինը ես"))
        answer34.add(Answer("հաստատում", true))
        answer34.add(Answer("էգո"))
        quizList.add(
            Quiz(
                number = 34,
                question = "Մարդկանց բնածին սովորությունը՝ պատճառներ փնտրելու վարկաբեկելու կամ մերժելու տեղեկատվությունը, որը բարդացնում է իրենց գոյություն ունեցող համոզմունքները, և պատճառներ փնտրելու՝ ընդունելու տեղեկատվություն, որը պաշտպանում է իրենց գոյություն ունեցող համոզմունքները, կոչվում է __________ կողմնակալություն:",
                answer = answer34
            )
        )
        val answer35: ArrayList<Answer> = ArrayList(4)
        answer35.add(Answer("Twitter"))
        answer35.add(Answer("Facebook", true))
        answer35.add(Answer("Snapchat"))
        answer35.add(Answer("TikTok"))
        quizList.add(
            Quiz(
                number = 35,
                question = "Ո՞ր սոցիալական մեդիայի հարթակն է ազատում քաղաքական գործիչների գրառումներն ու գովազդները փաստերի ստուգման իր անկախ ծրագրից:",
                answer = answer35
            )
        )
        val answer36: ArrayList<Answer> = ArrayList(4)
        answer36.add(Answer("Twitter", true))
        answer36.add(Answer("Facebook"))
        answer36.add(Answer("Snapchat"))
        answer36.add(Answer("Instagram"))
        quizList.add(
            Quiz(
                number = 36,
                question = "Ո՞ր սոցիալական մեդիայի հարթակն է արգելել բոլոր քաղաքական գովազդները:",
                answer = answer36
            )
        )
        val answer37: ArrayList<Answer> = ArrayList(2)
        answer37.add(Answer("Ճիշտ", true))
        answer37.add(Answer("Կեղծ"))
        quizList.add(
            Quiz(
                number = 37,
                question = "ԱՄՆ-ում Twitter-ի օգտատերերը կարող են հաղորդել թվիթների մասին, որոնք պարունակում են ապակողմնորոշիչ տեղեկություններ ընտրությունների վերաբերյալ: Ճիշտ կամ սխալ?",
                answer = answer37
            )
        )
        val answer38: ArrayList<Answer> = ArrayList(4)
        answer38.add(Answer("Facebook"))
        answer38.add(Answer("Instagram"))
        answer38.add(Answer("Pinterest"))
        answer38.add(Answer("Բոլոր վերոնշյալները", true))
        quizList.add(
            Quiz(
                number = 38,
                question = "Ո՞ր սոցիալական մեդիա հարթակն է ուղղորդում պատվաստանյութերի հետ կապված տերմիններ փնտրող օգտվողներին առողջապահական տեղեկատվության համար հեղինակավոր աղբյուրներ:",
                answer = answer38
            )
        )
        val answer39: ArrayList<Answer> = ArrayList(5)
        answer39.add(Answer("Facebook"))
        answer39.add(Answer("Instagram"))
        answer39.add(Answer("Twitter"))
        answer39.add(Answer("Pinterest"))
        answer39.add(Answer("Բոլոր վերոնշյալները", true))
        quizList.add(
            Quiz(
                number = 39,
                question = "Ո՞ր սոցիալական մեդիա հարթակն է ուղղորդում օգտատերերին, ովքեր COVID-19-ի մասին տեղեկատվություն են փնտրում, դեպի հանրային առողջության հավաստի ռեսուրսներ:",
                answer = answer39
            )
        )
        val answer40: ArrayList<Answer> = ArrayList(2)
        answer40.add(Answer("Ճիշտ"))
        answer40.add(Answer("Կեղծ"))
        quizList.add(
            Quiz(
                number = 40,
                question = "Սոցիալական ցանցերում տեսանյութեր պարունակող ժամանակային դրոշմանիշները ցույց են տալիս, թե երբ է նկարահանվել կադրը: Ճիշտ կամ սխալ?",
                answer = answer40
            )
        )
        val answer41: ArrayList<Answer> = ArrayList(2)
        answer41.add(Answer("Ճիշտ", true))
        answer41.add(Answer("Կեղծ"))
        quizList.add(
            Quiz(
                number = 41,
                question = "Facebook-ի Գովազդային գրադարանում կարելի է փնտրել ակտիվ և ոչ ակտիվ գովազդներ խնդիրների, ընտրությունների և քաղաքականության վերաբերյալ, ներառյալ գովազդները, որոնք կարող են հեռացվել հարթակի կանոնները խախտելու համար: Ճիշտ կամ սխալ?",
                answer = answer41
            )
        )
        val answer42: ArrayList<Answer> = ArrayList(5)
        answer42.add(Answer("Facebook"))
        answer42.add(Answer("Twitter"))
        answer42.add(Answer("Snapchat"))
        answer42.add(Answer("WhatsApp"))
        answer42.add(Answer("Pinterest", true))
        quizList.add(
            Quiz(
                number = 42,
                question = "Հետևյալ հարթակներից ո՞րն է հնարավորություն տալիս հաղորդել «բժշկական ապատեղեկատվություն», օրինակ՝ հակապատվաստումների քարոզչություն կամ վտանգավոր «հրաշք բուժումներ»:",
                answer = answer42
            )
        )
        val answer43: ArrayList<Answer> = ArrayList(2)
        answer43.add(Answer("Ճիշտ"))
        answer43.add(Answer("Կեղծ", true))
        quizList.add(
            Quiz(
                number = 43,
                question = "Բոլորն ամեն օր օգտագործում են նույն քանակությամբ լրատվամիջոցներ:",
                answer = answer43
            )
        )
        val answer44: ArrayList<Answer> = ArrayList(2)
        answer44.add(Answer("Ճիշտ", true))
        answer44.add(Answer("Կեղծ"))
        quizList.add(
            Quiz(
                number = 44,
                question = "Մարդկանց վրա կարող է ազդել մեդիա հաղորդագրությունն առանց գիտակցելու:",
                answer = answer44
            )
        )
        val answer45: ArrayList<Answer> = ArrayList(3)
        answer45.add(Answer("Ես կհետևեմ հղմանը"))
        answer45.add(Answer("Ասացեք, թե ինչ տեսանյութ է սա:"))
        answer45.add(Answer("Չեմ բացում հղումը", true))
        quizList.add(
            Quiz(
                number = 45,
                question = "Դուք ստացել եք հաղորդագրություն. «Նայեք շուտով»: և տեսանյութի հղում: Ո՞րն է ձեր առաջին արձագանքը: ",
                answer = answer45
            )
        )
        val answer46: ArrayList<Answer> = ArrayList(3)
        answer46.add(Answer("Կիսվեք ընկերների հետ "))
        answer46.add(Answer("Ես կփնտրեմ սկզբնաղբյուրը", true))
        answer46.add(Answer("Ստուգեք սոցիալական լրատվամիջոցները"))
        quizList.add(
            Quiz(
                number = 46,
                question = "Հանկարծ բախվում ես ցնցող նորության. Կարդալուց հետո ի՞նչ եք անելու։",
                answer = answer46
            )
        )
        val answer47: ArrayList<Answer> = ArrayList(4)
        answer47.add(Answer("Պետական թերթեր, հեռուստաալիքներ և ռադիո "))
        answer47.add(Answer("Սոցիալական ցանցեր, ինտերնետային պորտալներ "))
        answer47.add(Answer("Ես վստահում եմ բոլոր աղբյուրներին"))
        answer47.add(Answer("Ես ոչ մեկին լիովին չեմ վստահում", true))
        quizList.add(
            Quiz(
                number = 47,
                question = "Ո՞ր լրատվական աղբյուրներին եք ամենաշատը վստահում:",
                answer = answer47
            )
        )
        val answer48: ArrayList<Answer> = ArrayList(2)
        answer48.add(Answer("Մի կիսվեք"))
        answer48.add(Answer("Կիսվել", true))
        quizList.add(
            Quiz(
                number = 48,
                question = "Փետրվարի 3-ին Նուր-Սուլթանում տեղի է ունեցել հանրապետության բոլոր մարզերի հասարակական ակտիվիստների, ակտիվիստների, կամավորների, պետական կառույցների, միջազգային կազմակերպությունների ներկայացուցիչների առաջին հանրապետական էկո հավաքը, հայտնում է zakon.kz-ը։ Կիսվե՞լ այս նորությամբ",
                answer = answer48
            )
        )
        val answer49: ArrayList<Answer> = ArrayList(2)
        answer49.add(Answer("Մի կիսվեք", true))
        answer49.add(Answer("Կիսվել"))
        quizList.add(
            Quiz(
                number = 49,
                question = "Այս պատկերը տարածվում է սոցիալական ցանցերում։ Աշխարհի քարտեզ հին ղազախական դասագրքից դպրոցականների համար։ Կիսվե՞լ այս նորությամբ",
                answer = answer49
            )
        )
        val answer50: ArrayList<Answer> = ArrayList(2)
        answer50.add(Answer("Մի կիսվեք", true))
        answer50.add(Answer("Կիսվել"))
        quizList.add(
            Quiz(
                number = 50,
                question = "2020 թվականի փետրվարի 8-ին Twitter-ում տեղեկություն է տարածվել, որ Ղազախստանում սկսվել են չինական ռեստորանների և տների ջարդերն ու հրկիզումները՝ երկրում կորոնավիրուսի տարածման հետ կապված խուճապի պատճառով։Որոշ հաղորդագրություններ նաև պնդում էին, որ խթան է հանդիսացել կորոնավիրուսից ղազախստանցու մահը Կիսվե՞լ այս նորությամբ",
                answer = answer50
            )
        )
        val answer51: ArrayList<Answer> = ArrayList(2)
        answer51.add(Answer("Մի կիսվեք", true))
        answer51.add(Answer("Կիսվել"))
        quizList.add(
            Quiz(
                number = 51,
                question = "Սոցցանցերում հրապարակվում է Ղազախստանի նոր ռազմական դրոշի լուսանկարը։ Կիսվե՞լ այս նորությամբ",
                answer = answer51
            )
        )
        val answer52: ArrayList<Answer> = ArrayList(2)
        answer52.add(Answer("Մի կիսվեք", true))
        answer52.add(Answer("Կիսվել"))
        quizList.add(
            Quiz(
                number = 52,
                question = "Համացանցում և սոցիալական ցանցերում, մասնավորապես, ակտիվորեն տարածվում է դեղերի գովազդը, որին մասնակցում է ղազախստանցի հայտնի սրտային վիրաբույժ Յուրի Վլադիմիրովիչ Պյան։ Կիսվե՞լ այս նորությամբ",
                answer = answer52
            )
        )
        val answer53: ArrayList<Answer> = ArrayList(2)
        answer53.add(Answer("Մի կիսվեք"))
        answer53.add(Answer("Կիսվել", true))
        quizList.add(
            Quiz(
                number = 53,
                question = "Տեմիրթաուի բնակիչները սոցիալական ցանցերում տեղադրել են սևացած ձյան լուսանկարներ և տեսանյութեր։ Կիսվե՞լ այս նորությամբ",
                answer = answer53
            )
        )
        val answer54: ArrayList<Answer> = ArrayList(2)
        answer54.add(Answer("Դարձրեք ձեր պրոֆիլը հանրային "))
        answer54.add(Answer("Դարձրեք ձեր պրոֆիլը մասնավոր", true))
        quizList.add(
            Quiz(
                number = 54,
                question = "Ինչպե՞ս կարող եք ձեր էջի գաղտնիության կարգավորումներ սահմանել՝ ավելի լավ վերահսկելու համար, թե ով կարող է տեսնել և մեկնաբանել ձեր գրառումները: ",
                answer = answer54
            )
        )
        val answer55: ArrayList<Answer> = ArrayList(4)
        answer55.add(Answer("Ինչքան շատ ինֆորմացիա լինի իմ էջում, այնքան ավելի զով"))
        answer55.add(
            Answer(
                "Ինչ-որ բան հրապարակելուց առաջ միշտ պետք է մտածել՝ արժե՞ արդյոք դա, քանի որ ձեր լուսանկարները կամ այլ տվյալները հասանելի կլինեն բացարձակապես բոլորին, և բոլորը կկարողանան պահպանել ձեր հրապարակումը կամ ուղարկել այն մեկ ուրիշին։",
                true
            )
        )
        answer55.add(Answer("Ես պետք է թարմացնեմ իմ տեղեկությունները, որպեսզի բոլորն իմանան, թե ինչ եմ անում և որտեղ եմ:"))
        answer55.add(Answer("Արժե ձեր էջում ավելացնել ընկերների լուսանկարները՝ նրանց զարմացնելու համար"))
        quizList.add(
            Quiz(
                number = 55,
                question = "Սոցիալական ցանցերում դուք կարող եք կիսվել ձեր լուսանկարներով և այլ տվյալներով: Ինչպե՞ս պետք է վարվեք սոցիալական ցանցերում:",
                answer = answer55
            )
        )
        val answer56: ArrayList<Answer> = ArrayList(3)
        answer56.add(Answer("Պետք չէ մտածել այդ մասին, քանի որ համացանցում գործնականում կեղծ տեղեկատվություն չկա։"))
        answer56.add(Answer("Ինտերնետում դուք կարող եք գտնել միայն հավաստի տեղեկատվություն"))
        answer56.add(
            Answer(
                "Սոցիալական մեդիան հավաստի տեղեկատվության աղբյուր չէ, այնպես որ դուք պետք է համեմատեք և ստուգեք փաստերը՝ կարդալով նորություններ տարբեր աղբյուրներից:",
                true
            )
        )
        quizList.add(
            Quiz(
                number = 56,
                question = "Ինչպե՞ս ճանաչել «կեղծ լուրերը».",
                answer = answer56
            )
        )
        val answer57: ArrayList<Answer> = ArrayList(3)
        answer57.add(Answer("Օգտագործողը չի կարող տեղեկացնել նրանց"))
        answer57.add(Answer("Օգտագործողը կարող է տեղեկացնել նրանց՝ սեղմելով «արգելափակել» կոճակը"))
        answer57.add(
            Answer(
                "Օգտագործողը կարող է հաղորդել նման բովանդակության մասին՝ սեղմելով «զեկուցել» կոճակը:",
                true
            )
        )
        quizList.add(
            Quiz(
                number = 57,
                question = "Ինչպե՞ս կարող են սոցիալական լրատվամիջոցների աջակցության ծառայություններն ահազանգել խախտող կամ ոչ պատշաճ բովանդակության մասին:",
                answer = answer57
            )
        )
        val answer58: ArrayList<Answer> = ArrayList(4)
        answer58.add(Answer("Բողոք ներկայացնելուց հետո "))
        answer58.add(
            Answer(
                "Անմիջապես, հենց որ տեսնեմ / և խախտում եմ մարդու իրավունքները և/կամ վիրավորական բովանդակությունը",
                true
            )
        )
        answer58.add(Answer("Դուք միշտ կարող եք դա անել ավելի ուշ"))
        answer58.add(Answer("Պետք չէ դա անել, քանի որ այն միշտ կարող եք ստանալ ինտերնետից"))
        quizList.add(
            Quiz(
                number = 58,
                question = "Ե՞րբ է արժի սքրինշոթ անել որպես ինչ-որ բանի ապացույց (վիրավորական մեկնաբանություններ, անպատշաճ բովանդակություն,անծանոթի սպառնալիքներ ինտերնետում և այլն):",
                answer = answer58
            )
        )
        val answer59: ArrayList<Answer> = ArrayList(3)
        answer59.add(
            Answer(
                "չորեքշաբթի (կոնկրետ սոցիալական ցանց կամ այլ տեղեկատվական ալիք) ամսաթիվ, ուղարկողի օգտանուն, բովանդակություն",
                true
            )
        )
        answer59.add(Answer("Չորեքշաբթի, ամսաթիվ, ուղարկող"))
        answer59.add(Answer("Չորեքշաբթի, ամսաթիվ"))
        quizList.add(
            Quiz(
                number = 59,
                question = "Ինչ-որ մեկը ձեզ վիրավորական մեկնաբանություններ է ուղարկում: Ցանկանու՞մ եք ապացույցներ հավաքել. ի՞նչ պետք է լինի սքրինշոթում:",
                answer = answer59
            )
        )
        val answer60: ArrayList<Answer> = ArrayList(3)
        answer60.add(Answer("Սոցցանցերում իմ լուսանկարի տակ անծանոթ մարդիկ գովում են իմ արտաքինը"))
        answer60.add(
            Answer(
                "Սեռական բնույթի չպահանջված նամակներ կամ վիրավորական հաղորդագրություններ",
                true
            )
        )
        answer60.add(Answer("Մեկ անգամ վիրավորական հաղորդագրություն կամ մեկնաբանություն է ստացել"))
        quizList.add(
            Quiz(
                number = 60,
                question = "Ո՞ր դեպքում գործ ունենք կիբերհարձակման (ինտերնետային ոտնձգությունների) հետ:",
                answer = answer60
            )
        )
        val answer61: ArrayList<Answer> = ArrayList(3)
        answer61.add(Answer("Ինտերնետում ինչ-որ մեկը միշտ հարցնում է, թե ինչպես եք ձեր գործերը"))
        answer61.add(Answer("Ինչ-որ մեկը ձեզ խնդրում է ուղարկել ձեր լուսանկարը"))
        answer61.add(
            Answer(
                "Ինչ-որ մեկը մշտապես վերահսկում է ձեր գործունեությունը սոցիալական ցանցերում եւ ընդհանրապես համացանցում",
                true
            )
        )
        quizList.add(Quiz(number = 61, question = "Թվային չարաշահման օրինակ", answer = answer61))
        val answer62: ArrayList<Answer> = ArrayList(2)
        answer62.add(Answer("Պատերազմ երկու մարդկանց միջև՝ հիմնված որևէ տեսակի տեղեկատվության վրա"))
        answer62.add(
            Answer(
                "Տեղեկատվական պատերազմը քարոզչության վրա հիմնված պայքար է, երբ հիմնականում կեղծ կամ խեղաթյուրված տեղեկատվություն է տարածվում մարդկանց վրա ավելի արդյունավետ ազդելու նպատակով։ Համակարգչային խաղ",
                true
            )
        )
        quizList.add(
            Quiz(
                number = 62,
                question = "Ի՞նչ է տեղեկատվական պատերազմը:",
                answer = answer62
            )
        )
        val answer63: ArrayList<Answer> = ArrayList(3)
        answer63.add(Answer("Ինքներդ ոչինչ մի արեք"))
        answer63.add(
            Answer(
                "Նախ, համոզվեք, որ նկարեք սքրինշոթը, որպեսզի պահպանեք հրապարակումը անպատշաճ բովանդակությամբ կամ ուրիշի կողմից ահաբեկելու ապացույցներով:",
                true
            )
        )
        answer63.add(Answer("Սկսեք խոսել այն անձի հետ, ով տեղադրեց անհամապատասխան բովանդակություն՝ իրավիճակը շտկելու համար"))
        quizList.add(
            Quiz(
                number = 63,
                question = "Ի՞նչ անել, եթե նկատում եք անպարկեշտ բովանդակությամբ գրառում:",
                answer = answer63
            )
        )
        val answer64: ArrayList<Answer> = ArrayList(3)
        answer64.add(Answer("Հանդիպումը կարող էր տեղի ունենալ ինչ-որ մեկուսի վայրում, միայն մենք երկուսով"))
        answer64.add(Answer("Ինչի՞ մասին ենք խոսելու առաջին հանդիպմանը, ինչ անել միասին, ինչ հագնել՝ նրան տպավորելու համար և այլն:"))
        answer64.add(Answer("Գուգլեք և գտեք մանրամասն տեղեկություններ այս մարդու մասին, արժե նաև իրական կյանքում հանդիպելուց առաջ զանգահարել կամ տեսահանդիպում կազմակերպել՝ համոզվելու համար, թե ում հետ գործ ունեք."))
        quizList.add(
            Quiz(
                number = 64,
                question = "Ինչի մասին մտածել, երբ ինչ-որ մեկին հանդիպում եք ինտերնետում և մտածում եք հանդիպել այս մարդուն իրական կյանքում.",
                answer = answer64
            )
        )
        val answer65: ArrayList<Answer> = ArrayList(3)
        answer65.add(Answer("Խաբեություն, որը բավականին տարածված է համացանցում"))
        answer65.add(
            Answer(
                "Ինտերնետային էթիկետը, կամ պարզապես կանոնների մի շարք, որոնց պետք է հետեւի ինտերնետի յուրաքանչյուր օգտատեր",
                true
            )
        )
        answer65.add(Answer("Նոր և եզակի ծառայություն ինտերնետում"))
        quizList.add(Quiz(number = 65, question = "Ի՞նչ է ցանցային էթիկետը:", answer = answer65))
        val answer66: ArrayList<Answer> = ArrayList(4)
        answer66.add(Answer("«20 տարի շուկայում»"))
        answer66.add(Answer("«Միջազգային ապացուցված փորձագետներ»"))
        answer66.add(Answer("«Սենսացիաներ և սկանդալներ»", true))
        answer66.add(Answer("«Գիտություն և փաստեր»"))
        quizList.add(
            Quiz(
                number = 66,
                question = "Ձեր առջև չորս լրատվամիջոց կա. Ո՞րն է կասկածելի:",
                answer = answer66
            )
        )
        val answer67: ArrayList<Answer> = ArrayList(4)
        answer67.add(Answer("Իվանը պաղպաղակ չի գողացել՝ անանուն վկաներ"))
        answer67.add(Answer("Իվանը գողացել է պաղպաղակ՝ կադրեր տեսահսկումից", true))
        answer67.add(Answer("Իվանը գողացել է պաղպաղակը` վաճառողուհին"))
        answer67.add(Answer("Իվանը պաղպաղակ չի գողացել՝ Իվանի կնքահայրը"))
        quizList.add(
            Quiz(
                number = 67,
                question = "Թվարկված լուրերից որի՞ն կարելի է հավատալ։",
                answer = answer67
            )
        )
        val answer68: ArrayList<Answer> = ArrayList(4)
        answer68.add(Answer("Բնօրինակ աղբյուրի բացակայություն"))
        answer68.add(Answer("Զանգվածային վերահրատարակություններ բազմաթիվ լրատվամիջոցներում"))
        answer68.add(Answer("Փոփոխված պատկերներ և տեսանյութեր"))
        answer68.add(Answer("Փաստ ստուգողները դա վերլուծել են ու չեն հերքել", true))
        quizList.add(
            Quiz(
                number = 68,
                question = "Նշված նշաններից ո՞րն է նյութի իսկության երաշխիքը։",
                answer = answer68
            )
        )
        val answer69: ArrayList<Answer> = ArrayList(4)
        answer69.add(Answer("Ջոն Սմիթ, Սանիտարական ասոցիացիայի ամերիկյան ներկայացուցիչ"))
        answer69.add(
            Answer(
                "Իվաննա Կովալենկո, վիրուսային հիվանդությունների ինստիտուտի տնօրեն",
                true
            )
        )
        answer69.add(Answer("Պյոտր Շուշենկո, «Փորձավարների խաղեր» շոուի մասնակից."))
        answer69.add(Answer("Սոֆյա Կլոպիտը՝ առաջին հիվանդի հարեւանուհին"))
        quizList.add(
            Quiz(
                number = 69,
                question = "Նոր առեղծվածային վիրուսային հիվանդության մասին լուրերը տարբեր մարդիկ են մեկնաբանում։ Ո՞ւմ կարծիքն է ամենակարևորը:",
                answer = answer69
            )
        )
        val answer70: ArrayList<Answer> = ArrayList(4)
        answer70.add(
            Answer(
                "Հիդրոօդերեւութաբանության կենտրոնը փոթորկի նախազգուշացում է արել ՇՈԿ!!! Դռան մոտ մոխրակույտ եկավ, այն ինչ եղավ հետո զարմացրեց բոլորին",
                true
            )
        )
        answer70.add(Answer("Խարկովի մարզում 100 երկնաքար է ընկել"))
        answer70.add(Answer("Ռոզալինդա Զվիզդենկոյի սիրեկանին բռնել են ուրիշի հետ"))
        quizList.add(
            Quiz(
                number = 70,
                question = "Այս վերնագրերից ո՞րն է արժանի ուշադրության։",
                answer = answer70
            )
        )
        val answer71: ArrayList<Answer> = ArrayList(3)
        answer71.add(Answer("Որ գլխավոր խմբագիրը և քաղաքական գործիչը/ընկերության սեփականատերը աջակցում են նույն ֆուտբոլային թիմին"))
        answer71.add(Answer("Որ հրատարակությունը սրա համար գումար է ստանում", true))
        answer71.add(Answer("Որ քաղաքական գործիչը/ընկերությունը քննադատելու բան չունի"))
        quizList.add(
            Quiz(
                number = 71,
                question = "Եթե որոշակի հրապարակում անընդհատ գովում է քաղաքական գործչի կամ ընկերության, իսկ քննադատում միայն մյուսներին, ապա ի՞նչ կարելի է ենթադրել։",
                answer = answer71
            )
        )
        val answer72: ArrayList<Answer> = ArrayList(4)
        answer72.add(Answer("Ժաննան է կերել ձմերուկը,- ասում են ականատեսները, ուստի գործը բացահայտված է"))
        answer72.add(Answer("Ժաննան էր, որ կերավ ձմերուկը, միայն նայեք նրա գոհ աչքերին"))
        answer72.add(Answer("Ժաննան է կերել ձմերուկը, սեխի վրա էր աշխատում"))
        answer72.add(
            Answer(
                "Հենց Ժաննան է կերել ձմերուկը, դա վկայում են մաշկի վրա եղած մատնահետքերը",
                true
            )
        )
        quizList.add(
            Quiz(
                number = 72,
                question = "Տեղեկատվության ո՞ր ներկայացումն է ամենաքիչը մանիպուլյատիվ:",
                answer = answer72
            )
        )
        val answer73: ArrayList<Answer> = ArrayList(3)
        answer73.add(Answer("Հեռացրեք խաղը կամ հավելվածը"))
        answer73.add(Answer("Թույլտվություն խնդրեք ձեր ծնողներից", true))
        answer73.add(Answer("Անմիջապես կատարեք գնումը"))
        quizList.add(
            Quiz(
                number = 73,
                question = "Ի՞նչ պետք է անեք, երբ խաղային կայքը կամ հավելվածը ձեզ առաջարկում է առցանց գնումներ կատարել:",
                answer = answer73
            )
        )
        val answer74: ArrayList<Answer> = ArrayList(2)
        answer74.add(Answer("Ճիշտ", true))
        answer74.add(Answer("Կեղծ"))
        quizList.add(
            Quiz(
                number = 74,
                question = "Մենք կարող ենք հստակ իմանալ, թե ով եք դուք սոցիալական ցանցերում ձեր կամ այլոց թողած տեղեկություններից:",
                answer = answer74
            )
        )
        val answer75: ArrayList<Answer> = ArrayList(3)
        answer75.add(Answer("Փակեք ձեզ ձեր սենյակում"))
        answer75.add(Answer("Չեղարկել բաժանորդագրությունը"))
        answer75.add(Answer("Կարգավորեք ձեր անվտանգության կարգավորումները", true))
        quizList.add(
            Quiz(
                number = 75,
                question = "Երբ ներբեռնում եք նոր հավելված, ի՞նչ պետք է անեք ձեր գաղտնիությունը պաշտպանելու համար:",
                answer = answer75
            )
        )
        val answer76: ArrayList<Answer> = ArrayList(3)
        answer76.add(Answer("Էլֆ"))
        answer76.add(Answer("տրոլ", true))
        answer76.add(Answer("Մի կոկորդ"))
        quizList.add(
            Quiz(
                number = 76,
                question = "Ինչպե՞ս եք անվանում ինտերնետ օգտագործողին, ով իրեն ոչ պատշաճ, բռնի կամ ագրեսիվ է պահում:",
                answer = answer76
            )
        )
        val answer77: ArrayList<Answer> = ArrayList(3)
        answer77.add(Answer("չաղ լուրեր"))
        answer77.add(Answer("կեղծ լուրեր", true))
        answer77.add(Answer("խեղկատակ լուրեր"))
        quizList.add(
            Quiz(
                number = 77,
                question = "ո՞ր արտահայտությունն է վերաբերում համացանցում դիտավորյալ բացահայտված կեղծ տեղեկատվությանը:",
                answer = answer77
            )
        )
        val answer78: ArrayList<Answer> = ArrayList(3)
        answer78.add(Answer("տառեր և թվեր"))
        answer78.add(Answer("հատուկ կերպարներ"))
        answer78.add(Answer("Տառեր, թվեր և հատուկ նիշեր"))
        quizList.add(
            Quiz(
                number = 78,
                question = "Ի՞նչ նիշեր պետք է օգտագործեք ամուր գաղտնաբառ ստեղծելու համար՝ ձեր էլ.",
                answer = answer78
            )
        )
        val answer79: ArrayList<Answer> = ArrayList(2)
        answer79.add(Answer("Ճիշտ", true))
        answer79.add(Answer("Կեղծ"))
        quizList.add(
            Quiz(
                number = 79,
                question = "Երբ ձեր սիրելի յութուբերը տեսահոլովակում գովազդում է ապրանքանիշի շապիկը, նա թաքնված գովազդ է անում:",
                answer = answer79
            )
        )
        val answer80: ArrayList<Answer> = ArrayList(3)
        answer80.add(Answer("Ոչինչ"))
        answer80.add(Answer("Խնդրեք այն հրապարակողին ջնջել այն:", true))
        answer80.add(Answer("Փակեք ձեզ ձեր սենյակում"))
        quizList.add(
            Quiz(
                number = 80,
                question = "Ի՞նչ անել առաջին հերթին, եթե սոցիալական ցանցում հայտնաբերեք ձեր սարսափելի լուսանկարը:",
                answer = answer80
            )
        )
        val answer81: ArrayList<Answer> = ArrayList(2)
        answer81.add(Answer("Ճիշտ", true))
        answer81.add(Answer("Կեղծ"))
        quizList.add(
            Quiz(
                number = 81,
                question = "Ձեր հեռախոսահամարը «անձնական տվյալներ» է:",
                answer = answer81
            )
        )
        val answer82: ArrayList<Answer> = ArrayList(3)
        answer82.add(Answer("թող մարդը"))
        answer82.add(Answer("Իր հերթին զայրացրեք մարդուն"))
        answer82.add(Answer("Արգելափակել մարդուն", true))
        quizList.add(
            Quiz(
                number = 82,
                question = "Ի՞նչ պետք է անի երեխան, եթե իր դպրոցում ինչ-որ մեկն անհանգստացնի նրան Instagram-ում:",
                answer = answer82
            )
        )
        val answer83: ArrayList<Answer> = ArrayList(2)
        answer83.add(Answer("Ճիշտ"))
        answer83.add(Answer("Կեղծ", true))
        quizList.add(
            Quiz(
                number = 83,
                question = "Ընկերն իրավունք ունի առանց ձեր թույլտվության տեղադրել ձեր միասին արված սելֆին Snapchat-ի իր հաշվում:",
                answer = answer83
            )
        )
        val answer84: ArrayList<Answer> = ArrayList(2)
        answer84.add(Answer("Ճիշտ"))
        answer84.add(Answer("Կեղծ", true))
        quizList.add(
            Quiz(
                number = 84,
                question = "Ծնողական վերահսկողությունը թույլ չի տալիս ձեզ ogtagorcel ինտերնետը:",
                answer = answer84
            )
        )
        val answer85: ArrayList<Answer> = ArrayList(3)
        answer85.add(Answer("Իմ համաձայնությունը", true))
        answer85.add(Answer("Ընդհանրապես ոչինչ"))
        answer85.add(Answer("իմ գաղտնաբառը"))
        quizList.add(
            Quiz(
                number = 85,
                question = "Լրացրե՛ք նախադասությունը. «Իմ նկարը համացանցում տեղադրելու համար իմ լավագույն ընկերը պետք է ինձ հարցնի…»:",
                answer = answer85
            )
        )
        val answer86: ArrayList<Answer> = ArrayList(3)
        answer86.add(Answer("Անվանակից"))
        answer86.add(Answer("Հոմանիշ"))
        answer86.add(Answer("կեղծանուն", true))
        quizList.add(
            Quiz(
                number = 86,
                question = "Ինչպե՞ս եք անվանում հորինված անուն, որը թույլ է տալիս Ձեզ չճանաչել համացանցում:",
                answer = answer86
            )
        )
        val answer87: ArrayList<Answer> = ArrayList(3)
        answer87.add(Answer("Ձեր կյանքի պատմությունը"))
        answer87.add(Answer("Կենդանի հիշողություն"))
        answer87.add(Answer("Զննման պատմություն", true))
        quizList.add(
            Quiz(
                number = 87,
                question = "Ինչպե՞ս է կոչվում այն բոլոր կայքերի ցանկը, որոնք դուք վերջերս այցելել եք:",
                answer = answer87
            )
        )
        val answer88: ArrayList<Answer> = ArrayList(2)
        answer88.add(Answer("Ճիշտ", true))
        answer88.add(Answer("Կեղծ"))
        quizList.add(
            Quiz(
                number = 88,
                question = "Օրենքը պահանջում է կայքերից տեղեկացնել համացանցի օգտատերերին և ստանալ նրանց համաձայնությունը գովազդային թխուկներ տեղադրելուց առաջ",
                answer = answer88
            )
        )
        val answer89: ArrayList<Answer> = ArrayList(2)
        answer89.add(Answer("Ճիշտ", true))
        answer89.add(Answer("Կեղծ"))
        quizList.add(
            Quiz(
                number = 89,
                question = "Ծնողները կարող են խնդրել կայքից ջնջել մինչև 15 տարեկան իրենց երեխայի հաշիվը, եթե նրանք գրանցվել են առանց իրենց համաձայնության:",
                answer = answer89
            )
        )
        val answer90: ArrayList<Answer> = ArrayList(2)
        answer90.add(Answer("Ճիշտ", true))
        answer90.add(Answer("Կեղծ"))
        quizList.add(
            Quiz(
                number = 90,
                question = "Դուք կարող եք բողոք ներկայացնել կիբերհարձակման համար:",
                answer = answer90
            )
        )
        val answer91: ArrayList<Answer> = ArrayList(2)
        answer91.add(Answer("Ճիշտ"))
        answer91.add(Answer("Կեղծ", true))
        quizList.add(
            Quiz(
                number = 91,
                question = "Կայքում գրանցվելու ամենաանվտանգ միջոցը ձեր Facebook-ի կամ Instagram-ի հաշվի միջոցով է:",
                answer = answer91
            )
        )
        val answer92: ArrayList<Answer> = ArrayList(2)
        answer92.add(Answer("Ճիշտ", true))
        answer92.add(Answer("Կեղծ"))
        quizList.add(
            Quiz(
                number = 92,
                question = "Հնարավոր է կարգավորել ձեր սոցիալական ցանցի հաշիվները՝ սահմանափակելու ձեր հրապարակումներին հասանելիություն ունեցող մարդկանց թիվը:",
                answer = answer92
            )
        )
        val answer93: ArrayList<Answer> = ArrayList(3)
        answer93.add(Answer("Դպրոցի մուտքի մոտ", true))
        answer93.add(Answer("Ուսուցիչների սենյակում"))
        answer93.add(Answer("Դասարանում"))
        quizList.add(
            Quiz(
                number = 93,
                question = "Որտե՞ղ է թույլատրվում CCTV տեսախցիկներ տեղադրել անվտանգության նպատակներով:",
                answer = answer93
            )
        )
        val answer94: ArrayList<Answer> = ArrayList(3)
        answer94.add(Answer("«Ընկերական հաղորդագրություն»"))
        answer94.add(Answer("«Հովանավորվող բովանդակություն»", true))
        answer94.add(Answer("«Դադարեցնել գովազդը»"))
        quizList.add(
            Quiz(
                number = 94,
                question = "Սոցցանցերի թելերում ո՞ր նշումն է թույլ տալիս իմանալ, որ դա գովազդ է։",
                answer = answer94
            )
        )
        val answer95: ArrayList<Answer> = ArrayList(2)
        answer95.add(Answer("Ճիշտ", true))
        answer95.add(Answer("Կեղծ"))
        quizList.add(
            Quiz(
                number = 95,
                question = "Ինտերնետում հրապարակված տեղեկատվությունը կարող է հասանելի մնալ ողջ կյանքի ընթացքում:",
                answer = answer95
            )
        )
        val answer96: ArrayList<Answer> = ArrayList(4)
        answer96.add(Answer("Դա արեք, որպեսզի հետո ձեզ չնեղեն"))
        answer96.add(Answer("Հրաժարվեք դրանից և ասեք ձեր ծնողներին", true))
        answer96.add(Answer("Մարտահրավերը փոխանցեք ընկերոջը"))
        quizList.add(
            Quiz(
                number = 96,
                question = "Ինչպե՞ս վարվել, եթե ձեզ վտանգավոր մարտահրավեր են ներկայացնում ինտերնետում:",
                answer = answer96
            )
        )
        return ComposeView(requireContext()).apply {
            setContent {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .background(Teal200)
                ) {
                    var isRightAnswer by remember { mutableStateOf(-1) }

                    ToolbarWithMenu("Text Tasks ${args.quizNumber}") {
                        requireActivity().onBackPressed()
                    }
                    if (isRightAnswer != -1) {
                        AlertDialog(
                            onDismissRequest = {},
                            confirmButton = {
                                TextButton(
                                    isRightAnswer,
                                    onClick = { requireActivity().onBackPressed() })
                            },
                            modifier = Modifier
                                .height(100.dp)
                                .width(800.dp)
                        )
                    }
                    for (quiz in quizList) {
                        if (quiz.number == args.quizNumber) {
                            Description(text = quiz.question)

                            LazyColumn(
                                modifier = Modifier
                                    .padding(top = 20.dp, bottom = 8.dp, start = 8.dp, end = 8.dp)
                                    .fillMaxHeight()
                                    .fillMaxWidth(),
                            ) {
                                items(quiz.answer) {
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                    ) {
                                        RadioButton(
                                            selected = false,
                                            onClick = { isRightAnswer = if (it.isRight) 1 else 0 }
                                        )
                                        Text(
                                            text = it.title,
                                            modifier = Modifier.padding(8.dp),
                                            style = TextStyle(Color.White)
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Composable
    fun TextButton(
        isRight: Int,
        onClick: () -> Unit
    ) {
        Column(
            modifier = Modifier
                .height(100.dp)
                .width(800.dp)
                .clickable { onClick() },
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            if (isRight == 1) {
                Row(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_correct),
                        contentDescription = null
                    )
                    Text(
                        text = "Ճիշտ է",
                        modifier = Modifier.padding(start = 16.dp),
                        style = TextStyle(
                            Color.Black,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
            } else if (isRight == 0) {
                Row(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_wrong),
                        contentDescription = null
                    )
                    Text(
                        text = "Սխալ է",
                        modifier = Modifier.padding(start = 16.dp),
                        style = TextStyle(
                            Color.Black,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
            }
        }
    }
}

data class Quiz(
    val number: Int,
    val question: String,
    val answer: ArrayList<Answer>
)

data class Answer(
    val title: String,
    val isRight: Boolean = false
)