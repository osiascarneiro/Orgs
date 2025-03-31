package br.com.orgs

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.orgs.ui.theme.OrgsTheme
import br.com.orgs.ui.theme.Purple500
import br.com.orgs.ui.theme.Teal200

@Composable
fun ProductCard(
    description: String = ""
) {
    Surface(
        shape = RoundedCornerShape(15.dp),
        shadowElevation = 4.dp
    ) {
        ProductItem(
            description = description
        )
    }
}

@Composable
private fun ProductItem(
    description: String = ""
) {
    Column(
        Modifier
            .heightIn(250.dp, 270.dp)
            .width(200.dp)
            .verticalScroll(rememberScrollState())
    ) {
        val imageSize = 100.dp

        Box(
            modifier = Modifier
                .height(imageSize)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Purple500, Teal200
                        )
                    )
                )
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null,
                Modifier
                    .size(imageSize)
                    .offset(y = imageSize / 2)
                    .clip(shape = CircleShape)
                    .align(BottomCenter)
            )
        }
        Spacer(modifier = Modifier.height(imageSize / 2))
        Column(Modifier.padding(16.dp)) {
            Text(
                text = LoremIpsum(50).values.first(),
                fontSize = 18.sp,
                fontWeight = FontWeight(700),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = "R$ 14,99",
                Modifier.padding(top = 8.dp),
                fontSize = 14.sp,
                fontWeight = FontWeight(400)
            )
        }
        if (description.isNotBlank()) {
            Text(
                modifier = Modifier
                    .background(Purple500)
                    .padding(16.dp),
                text = description
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductCardPreview() {
    OrgsTheme {
        ProductCard(LoremIpsum(50).values.first())
    }
}