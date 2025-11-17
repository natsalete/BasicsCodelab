package com.example.basicscodelab

// Imports necessários para trabalhar com modo noturno
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
// ComponentActivity é a classe base para Activities que usam Compose
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
// Imports para animações
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
// Imports para layouts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
// LazyColumn é como um RecyclerView no Compose
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
// Imports de ícones do Material Design
import androidx.compose.material.icons.Icons.Filled
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
// Imports de componentes Material 3
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
// Imports para gerenciamento de estado
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
// Imports para UI
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basicscodelab.ui.theme.BasicsCodelabTheme


// Activity principal do app - ponto de entrada
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContent define o conteúdo da UI usando Compose
        setContent {
            // BasicsCodelabTheme aplica o tema Material 3 do app
            BasicsCodelabTheme {
                // MyApp é o componente raiz com fillMaxSize ocupando toda a tela
                MyApp(modifier = Modifier.fillMaxSize())
            }
        }
    }
}

// Componente principal do app que gerencia a navegação entre telas
@Composable
fun MyApp(modifier: Modifier = Modifier) {
    // rememberSaveable mantém o estado mesmo após rotação de tela
    // Controla se deve mostrar a tela de onboarding ou não
    var shouldShowOnboarding by rememberSaveable { mutableStateOf(true) }

    // Surface é um container que aplica cor de fundo do tema
    Surface(modifier, color = MaterialTheme.colorScheme.background) {
        // Lógica condicional: se shouldShowOnboarding for true, mostra onboarding
        if (shouldShowOnboarding) {
            // Passa uma função lambda que altera o estado quando o botão é clicado
            OnboardingScreen(onContinueClicked = { shouldShowOnboarding = false })
        } else {
            // Caso contrário, mostra a lista de saudações
            Greetings()
        }
    }
}

// Tela de boas-vindas inicial do app
@Composable
fun OnboardingScreen(
    onContinueClicked: () -> Unit, // Callback que será executado ao clicar no botão
    modifier: Modifier = Modifier
) {
    // Column organiza os elementos verticalmente
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center, // Centraliza verticalmente
        horizontalAlignment = Alignment.CenterHorizontally // Centraliza horizontalmente
    ) {
        Text("Welcome to the Basics Codelab!")
        Button(
            modifier = Modifier.padding(vertical = 24.dp), // 24dp de espaçamento vertical
            onClick = onContinueClicked // Executa o callback ao clicar
        ) {
            Text("Continue")
        }
    }
}

// Componente que exibe uma lista de saudações
@Composable
private fun Greetings(
    modifier: Modifier = Modifier,
    // Cria uma lista com 1000 itens numerados de 0 a 999
    names: List<String> = List(1000) { "$it" }
) {
    // LazyColumn renderiza apenas os itens visíveis (como RecyclerView)
    LazyColumn(modifier = modifier.padding(vertical = 4.dp)) {
        // items itera sobre a lista e cria um Greeting para cada nome
        items(items = names) { name ->
            Greeting(name = name)
        }
    }
}

// Card individual com saudação
@Composable
private fun Greeting(name: String, modifier: Modifier = Modifier) {
    Card(
        // Define as cores do card usando o esquema de cores do tema
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primary
        ),
        // Espaçamento entre os cards
        modifier = modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        CardContent(name)
    }
}

// Conteúdo expansível do card
@Composable
private fun CardContent(name: String) {
    // Estado local que controla se o card está expandido
    var expanded by rememberSaveable { mutableStateOf(false) }

    // Row organiza os elementos horizontalmente
    Row(
        modifier = Modifier
            .padding(12.dp)
            // Anima o tamanho do conteúdo quando expanded muda
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioMediumBouncy, // Animação com bounce
                    stiffness = Spring.StiffnessLow // Velocidade da animação
                )
            )
    ) {
        // Column com o texto
        Column(
            modifier = Modifier
                .weight(1f) // Ocupa todo o espaço disponível menos o botão
                .padding(12.dp)
        ) {
            Text(text = "Hello, ")
            Text(
                text = name,
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontWeight = FontWeight.ExtraBold // Texto em negrito
                )
            )
            // Mostra texto adicional apenas se expanded for true
            if (expanded) {
                Text(
                    text = ("Composem ipsum color sit lazy, " +
                            "padding theme elit, sed do bouncy. ").repeat(4), // Repete 4x
                )
            }
        }
        // Botão que alterna o estado expanded
        IconButton(onClick = { expanded = !expanded }) {
            Icon(
                // Muda o ícone baseado no estado
                imageVector = if (expanded) Filled.ExpandLess else Filled.ExpandMore,
                // Descrição de acessibilidade que muda baseado no estado
                contentDescription = if (expanded) {
                    stringResource(R.string.show_less)
                } else {
                    stringResource(R.string.show_more)
                }
            )
        }
    }
}

// Preview para visualizar no Android Studio em modo escuro
@Preview(
    showBackground = true,
    widthDp = 320,
    uiMode = UI_MODE_NIGHT_YES, // Ativa o modo escuro
    name = "GreetingPreviewDark"
)
// Preview padrão em modo claro
@Preview(showBackground = true, widthDp = 320)
@Composable
fun GreetingPreview() {
    BasicsCodelabTheme {
        Greetings()
    }
}

// Preview da tela de onboarding
@Preview(showBackground = true, widthDp = 320, heightDp = 320)
@Composable
fun OnboardingPreview() {
    BasicsCodelabTheme {
        OnboardingScreen(onContinueClicked = {}) // Callback vazio para preview
    }
}

// Preview do app completo
@Preview
@Composable
fun MyAppPreview() {
    BasicsCodelabTheme {
        MyApp(Modifier.fillMaxSize())
    }
}