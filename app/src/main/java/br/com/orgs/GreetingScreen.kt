package br.com.orgs

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.orgs.ui.theme.OrgsTheme

@Composable
private fun GreetingScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Greeting(
            modifier = Modifier.padding(innerPadding)
        )
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = androidx.core.R.drawable.ic_call_answer),
            contentDescription = "Produto",
            modifier = Modifier
                .size(56.dp)
                .padding(end = 8.dp)
        )
        Column {
            Text(
                text = "Titulo"
            )
            Text(
                text = "R$ 70,00"
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun GreetingPreview() {
    OrgsTheme {
        GreetingScreen()
    }
}