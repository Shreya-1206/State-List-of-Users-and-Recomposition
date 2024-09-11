package com.kibbcom.bloglist

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kibbcom.bloglist.ui.theme.ListOfBlogsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val categories = getCategories() // Get the list of categories

        setContent {
//            androidx.compose.foundation.layout.Column (
//               modifier = Modifier
//                   .verticalScroll(androidx.compose.foundation.rememberScrollState())
//            ) {
//                categories.forEach { item ->
//                    BlogLists(
//                        imageId = item.img,
//                        title = item.title,
//                        subTitle = item.subTitle
//                    )
//                }
//            }

            com.kibbcom.bloglist.getValue()

        }
    }
}

@Preview
@Composable
fun getValue () {
    var state = remember {
        mutableStateOf(0.0)
    }
    Log.d("Tagged", "Logged intial")
    Button(
        onClick = {
            state.value = Math.random()
        }
    ) {
      Log.d("tagged", "Logged after button click or rendered first time")
        Text(text = state.value.toString())
    }
}

data class Category(val img :Int, val title: String, val subTitle : String)


fun getCategories() :MutableList<Category> {
    var list = mutableListOf<Category>()
    list.add(Category(R.drawable.doctor,"Geetangali", "Doctor"))
    list.add(Category(R.drawable.woman, "Rupali", "Home Maker"))
    list.add(Category(R.drawable.teacher, "Sakshi", "Teacher"))
    list.add(Category(R.drawable.user, "Riya", "Software Engineer"))
    list.add(Category(R.drawable.doctor, "Geetangali", "Doctor"))
    list.add(Category(R.drawable.woman, "Rupali", "Home Maker"))
    list.add(Category(R.drawable.teacher, "Sakshi", "Teacher"))
    list.add(Category(R.drawable.user, "Riya", "Software Engineer"))
    list.add(Category(R.drawable.doctor,"Geetangali", "Doctor"))
    list.add(Category(R.drawable.woman, "Rupali", "Home Maker"))
    list.add(Category(R.drawable.teacher, "Sakshi", "Teacher"))
    list.add(Category(R.drawable.user, "Riya", "Software Engineer"))
    list.add(Category(R.drawable.doctor, "Geetangali", "Doctor"))
    list.add(Category(R.drawable.woman, "Rupali", "Home Maker"))
    list.add(Category(R.drawable.teacher, "Sakshi", "Teacher"))
    list.add(Category(R.drawable.user, "Riya", "Software Engineer"))
    list.add(Category(R.drawable.doctor,"Geetangali", "Doctor"))
    list.add(Category(R.drawable.woman, "Rupali", "Home Maker"))
    list.add(Category(R.drawable.teacher, "Sakshi", "Teacher"))
    list.add(Category(R.drawable.user, "Riya", "Software Engineer"))
    list.add(Category(R.drawable.doctor, "Geetangali", "Doctor"))
    list.add(Category(R.drawable.woman, "Rupali", "Home Maker"))
    list.add(Category(R.drawable.teacher, "Sakshi", "Teacher"))
    list.add(Category(R.drawable.user, "Riya", "Software Engineer"))
    list.add(Category(R.drawable.doctor,"Geetangali", "Doctor"))
    list.add(Category(R.drawable.woman, "Rupali", "Home Maker"))
    list.add(Category(R.drawable.teacher, "Sakshi", "Teacher"))
    list.add(Category(R.drawable.user, "Riya", "Software Engineer"))
    list.add(Category(R.drawable.doctor, "Geetangali", "Doctor"))
    list.add(Category(R.drawable.woman, "Rupali", "Home Maker"))
    list.add(Category(R.drawable.teacher, "Sakshi", "Teacher"))
    list.add(Category(R.drawable.user, "Riya", "software Engineer"))
    return list

}