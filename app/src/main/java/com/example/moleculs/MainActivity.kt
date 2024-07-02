package com.example.moleculs

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UIkitExample()
        }
    }
}

@SuppressLint("Range")
@Composable
fun UIkitExample() {
    val scrollState = rememberScrollState()
    val darkerPurple = Color(red = 0x9C, green = 0x27, blue = 0xB0, alpha = 0xFF)
    val slightlyMutedPinkPurple = Color(red = 0xE1, green = 0x7E, blue = 0xEE, alpha = 0xCC) // Слегка розоватый оттенок и уменьшенная прозрачность

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
            .verticalScroll(scrollState), // Добавляем вертикальную прокрутку
        verticalArrangement = Arrangement.spacedBy(16.dp) // Расстояние между элементами
    ) {
        // Buttons Section
        // First Row
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp) // Расстояние между кнопками
        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(containerColor = darkerPurple)
            ) {
                Text("Button", color = Color.White)
            }
            OutlinedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = darkerPurple),
                border = BorderStroke(1.dp, darkerPurple)
            ) {
                Text("Button")
            }
            OutlinedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.White),
                border = BorderStroke(1.dp, Color.White)
            ) {
                Text(
                    "Button",
                    color = darkerPurple
                )
            }
        }

        // Second Row
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp),

            ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Magenta)
            ) {
                Text("Button", color = Color.White)
            }
            OutlinedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Magenta),
                border = BorderStroke(1.dp, Color.Magenta)
            ) {
                Text("Button")
            }
            OutlinedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.White),
                border = BorderStroke(1.dp, Color.White)
            ) {
                Text(
                    "Button",
                    color = Color.Magenta
                )
            }
        }

        // Third Row
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(containerColor = slightlyMutedPinkPurple)
            ) {
                Text("Button", color = Color.White)
            }
            OutlinedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = slightlyMutedPinkPurple),
                border = BorderStroke(1.dp, slightlyMutedPinkPurple)
            ) {
                Text("Button")
            }
            OutlinedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.White),
                border = BorderStroke(1.dp, Color.White)
            ) {
                Text(
                    "Button",
                    color = slightlyMutedPinkPurple
                )
            }
        }

        // Заголовок и Описание
        Text(
            text = "Typography",
            style = MaterialTheme.typography.titleLarge,
            color = Color.Black
        )
        //Heading 1
        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp) // Расстояние между элементами
            ) {
                Text(
                    text = "Heading 1",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "SF Pro Display/32/Bold",
                    style = MaterialTheme.typography.labelSmall,
                    color = Color.Gray
                )
            }
            Text(
                text = "The quick brown fox jumps over the lazy dog",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
        }
        //Heading 2
        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp) // Расстояние между элементами
            ) {
                Text(
                    text = "Heading 2",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "SF Pro Display/24/Bold",
                    style = MaterialTheme.typography.labelSmall,
                    color = Color.Gray
                )
            }
            Text(
                text = "The quick brown fox jumps over the lazy dog",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )
        }

        //Subheading 1
        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp) // Расстояние между элементами
            ) {
                Text(
                    text = "Subheading 1",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "SF Pro Display18/SemiBold",
                    style = MaterialTheme.typography.labelSmall,
                    color = Color.Gray
                )
            }
            Text(
                text = "The quick brown fox jumps over the lazy dog",
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.Bold
            )
        }

        //Subheading 2
        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp) // Расстояние между элементами
            ) {
                Text(
                    text = "Subheading 2",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "SF Pro Display16/SemiBold",
                    style = MaterialTheme.typography.labelSmall,
                    color = Color.Gray
                )
            }
            Text(
                text = "The quick brown fox jumps over the lazy dog",
                fontWeight = FontWeight.Bold
            )
        }

        //Body Text 1
        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp) // Расстояние между элементами
            ) {
                Text(
                    text = "Body Text 1",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "SF Pro Display/14/SemiBold",
                    style = MaterialTheme.typography.labelSmall,
                    color = Color.Gray
                )
            }
            Text(
                text = "The quick brown fox jumps over the lazy dog",
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp
            )
        }

        //Body Text 2
        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp) // Расстояние между элементами
            ) {
                Text(
                    text = "Body Text 2",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "SF Pro Display14/Regular",
                    style = MaterialTheme.typography.labelSmall,
                    color = Color.Gray
                )
            }
            Text(
                text = "The quick brown fox jumps over the lazy dog",
                fontSize = 12.sp
            )
        }

        //Metadata 1
        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp) // Расстояние между элементами
            ) {
                Text(
                    text = "Metadata 1",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "SF Pro Display/12/Regular",
                    style = MaterialTheme.typography.labelSmall,
                    color = Color.Gray
                )
            }
            Text(
                text = "The quick brown fox jumps over the lazy dog",
                fontSize = 12.sp,
                color = Color.Gray
            )
        }

        //Metadata 2
        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp) // Расстояние между элементами
            ) {
                Text(
                    text = "Metadata 2",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "SF Pro Display/12/Medium",
                    style = MaterialTheme.typography.labelSmall,
                    color = Color.Gray
                )
            }
            Text(
                text = "The quick brown fox jumps over the lazy dog",
                fontSize = 10.sp,
                color = Color.Gray
            )
        }

        //Metadata 3
        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp) // Расстояние между элементами
            ) {
                Text(
                    text = "Metadata 3",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "SF Pro Display10/SemiBold",
                    style = MaterialTheme.typography.labelSmall,
                    color = Color.Gray
                )
            }
            Text(
                text = "The quick brown fox jumps over the lazy dog",
                fontWeight = FontWeight.Bold,
                fontSize = 8.sp
            )
        }

        // Components Section
        // Avatar at the top
        AvatarImage(imageRes = R.drawable.avatar, contentDescription = "Profile Avatar")

        // Header and Description
        Text(
            text = "Events",
            style = MaterialTheme.typography.titleLarge,
            color = Color.Black
        )

        Column {
            EventRow(
                imageRes = R.drawable.avatar_meeting,
                title = "Developer meeting",
                dateLocation = "13.09.2024 - Москва",
                status = "Закончилась",
                chips = listOf("Python", "Junior", "Moscow")
            )

            EventRow(
                imageRes = R.drawable.avatar_meeting,
                title = "Developer meeting",
                dateLocation = "13.09.2024 - Москва",
                status = null,
                chips = listOf("Python", "Junior", "Moscow")
            )

            EventRow(
                imageRes = R.drawable.designa,
                title = "Designa",
                dateLocation = "10 000 человек",
                status = null,
                chips = emptyList()
            )

            // Example usage of AvatarRow
            Text(
                text = "Participants",
                style = MaterialTheme.typography.titleLarge,
                color = Color.Black
            )
            AvatarRow(
                avatars = listOf(
                    R.drawable.avatar1,
                    R.drawable.avatar1,
                    R.drawable.avatar1,
                    R.drawable.avatar1,
                    R.drawable.avatar1,
                    R.drawable.avatar1,
                    R.drawable.avatar1,
                    R.drawable.avatar1,
                    R.drawable.avatar1,
                    R.drawable.avatar1,
                    R.drawable.avatar1,
                    R.drawable.avatar1
                )
            )
        }
    }
}

@Composable
fun AvatarRow(avatars: List<Int>) {
    Row(horizontalArrangement = Arrangement.spacedBy(-8.dp)) {
        avatars.forEach { imageRes ->
            AvatarImage(imageRes = imageRes, contentDescription = "Avatar")
        }
    }
}

@Composable
fun AvatarImage(imageRes: Int, contentDescription: String) {
    Image(
        painter = painterResource(id = imageRes),
        contentDescription = contentDescription,
        modifier = Modifier
            .size(40.dp)
            .clip(CircleShape)
            .border(1.dp, Color.Gray, CircleShape)
    )
}

@Composable
fun EventRow(
    imageRes: Int,
    title: String,
    dateLocation: String,
    status: String?,
    chips: List<String>
) {
    Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
        AvatarImage(imageRes = imageRes, contentDescription = "Event image")
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp) // Space between elements
        ) {
            EventTitle(title = title, status = status)
            Text(
                text = dateLocation,
                style = MaterialTheme.typography.labelSmall,
                color = Color.Gray
            )
            // Chips
            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                chips.forEach { EventChip(label = it) }
            }
        }
    }
}

@Composable
fun EventTitle(title: String, status: String?) {
    Row(horizontalArrangement = Arrangement.spacedBy(61.dp)) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleSmall,
            fontWeight = FontWeight.Bold
        )
        EventStatus(status = status)
    }
}

@Composable
fun EventStatus(status: String?) {
    if (status != null) {
        Text(
            text = status,
            style = MaterialTheme.typography.labelSmall,
            color = Color.Gray
        )
    }
}

@Composable
fun EventChip(label: String) {
    Surface(
        modifier = Modifier.padding(4.dp),
        shape = RoundedCornerShape(8.dp),
        color = Color.Transparent
    ) {
        Text(
            text = label,
            modifier = Modifier.padding(4.dp),
            fontWeight = FontWeight.Bold,
            color = Color(red = 0x4B, green = 0x00, blue = 0x82, alpha = 0xFF) // Темно-фиолетовый цвет

        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewUIkitExample() {
    UIkitExample()
}
