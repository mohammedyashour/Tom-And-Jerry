package com.mohammed.tom_and_jerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mohammed.tom_and_jerry.R
import com.mohammed.tom_and_jerry.ui.theme.Primary
import com.mohammed.tom_and_jerry.ui.theme.TextGrey
import com.mohammed.tom_and_jerry.ui.theme.TextMain

@Composable
fun CustomAppBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        UserProfileCard(
            username = "Jerry",
            subtitle = "Which Tom do you want to buy?",
            imageRes = R.drawable.tom_avatar
        )
        NotificationBell(notificationCount = 3)
    }
}


@Preview(showBackground = true)
@Composable
fun CustomAppBarPreview() {
    CustomAppBar()
}

@Composable
fun NotificationBell(
    modifier: Modifier = Modifier,
    notificationCount: Int = 3
) {
    Box(modifier = modifier) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color(0xFFF5F9FC))
                .border(1.dp, Color(0x261F1F1E), RoundedCornerShape(12.dp)),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.notification),
                contentDescription = "Notifications",
                modifier = Modifier.size(20.dp)
            )
        }

        if (notificationCount > 0) {
            Box(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .offset(x = 6.dp, y = (-3).dp)
                    .size(16.dp)
                    .background(Primary, CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = notificationCount.toString(),
                    color = Color.White,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
fun UserProfileCard(
    username: String = "Jerry",
    subtitle: String = "Which Tom do you want to buy?",
    imageRes: Int
) {
    Row(
        modifier = Modifier
            .wrapContentWidth()
            .height(56.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = "$username Avatar",
            modifier = Modifier
                .size(48.dp)
                .clip(RoundedCornerShape(12.dp))
                .border(1.dp, Color(0x261F1F1E), RoundedCornerShape(12.dp))
        )

        Spacer(modifier = Modifier.width(12.dp))

        Column {
            Text(
                text = "Hi, $username 👋",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = TextMain
            )
            Text(
                text = subtitle,
                fontSize = 12.sp,
                color = TextGrey,
                fontWeight = FontWeight.Normal
            )
        }
    }
}

