package br.com.orgs

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.orgs.ui.theme.OrgsTheme

@Composable
fun ProductSection() {
    Column {
        Text(
            modifier = Modifier
                .padding(start = 16.dp, top = 16.dp, end = 16.dp),
            text = "Promoções",
            fontSize = 20.sp,
            fontWeight = FontWeight(400)
        )
        Row(
            modifier = Modifier
                .padding(
                    top = 8.dp,
                    bottom = 16.dp
                )
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            ProductCard()
            ProductCard()
            ProductCard()
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductSectionPreview() {
    OrgsTheme {
        ProductSection()
    }
}