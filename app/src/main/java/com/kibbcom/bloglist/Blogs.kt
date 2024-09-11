package com.kibbcom.bloglist

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun BlogLists (imageId: Int, title:String, subTitle : String) {

    Card (
        elevation = CardDefaults.elevatedCardElevation(15.dp),
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
    ){
        Row (
            modifier = Modifier
                .padding(8.dp),
        ){
            Image(
                painter = painterResource(id = imageId),
                contentDescription = "Profile image",
                modifier = Modifier
                    .size(100.dp))

            BlogDescription(title, subTitle)
        }
    }
}

@Composable
 fun BlogDescription( title :String, subTitle : String) {
    Column(
        modifier = Modifier
            .padding(start = 10.dp)
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Medium
        )

        Text(
            text = subTitle,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Medium
        )
    }
}