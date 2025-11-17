<details>
<summary>🇧🇷 Versão em Português</summary>

# Jetpack Compose Basics - Codelab

## 📱 Sobre o Projeto

Este projeto foi desenvolvido como parte da atividade acadêmica para consolidar os conhecimentos básicos de desenvolvimento de interfaces de usuário (UI) para Android utilizando **Jetpack Compose**.

O aplicativo implementa todas as funcionalidades propostas no codelab oficial do Android Developers: [Noções básicas do Jetpack Compose](https://developer.android.com/codelabs/jetpack-compose-basics).

## 🎯 Objetivos da Atividade

- Compreender a estrutura e paradigma declarativo do Jetpack Compose
- Implementar funções combináveis (@Composable)
- Gerenciar estados e recomposição
- Trabalhar com listas eficientes (LazyColumn)
- Aplicar animações e transições
- Seguir boas práticas de desenvolvimento com Compose

## ✨ Funcionalidades Implementadas

### 1. Tela de Onboarding
- Tela inicial de boas-vindas
- Botão "Continue" que navega para a tela principal
- Estado persistente usando `rememberSaveable`

### 2. Lista Animada de Saudações
- Lista com 1000 itens renderizada eficientemente com `LazyColumn`
- Cards expansíveis ao clicar no botão
- Animações suaves usando `animateContentSize`
- Ícones que mudam dinamicamente (ExpandMore/ExpandLess)

### 3. Gerenciamento de Estado
- Elevação de estado (State Hoisting)
- Persistência de estado durante rotações de tela
- Estados locais para controle de expansão dos cards

### 4. Design Material 3
- Tema personalizado com suporte a modo claro e escuro
- Componentes Material 3 (Card, Button, IconButton, Surface)
- Tipografia e cores seguindo o Material Design

## 🛠️ Tecnologias Utilizadas

- **Kotlin** - Linguagem de programação
- **Jetpack Compose** - Toolkit moderno para UI
- **Material 3** - Sistema de design
- **Android Studio** - IDE de desenvolvimento

## 📦 Dependências Principais

```gradle
androidx.compose.ui:ui
androidx.compose.material3:material3
androidx.compose.ui:ui-tooling-preview
androidx.activity:activity-compose
```

## 🎨 Conceitos do Compose Aplicados

### Funções Combináveis
Todas as funções de UI são marcadas com `@Composable`:
```kotlin
@Composable
fun MyApp(modifier: Modifier = Modifier) { ... }
```

### Gerenciamento de Estado
- `mutableStateOf` - Cria estado observável
- `rememberSaveable` - Persiste estado durante configurações
- State Hoisting - Elevação de estado para componentes pai

### Layouts
- **Column** - Organização vertical
- **Row** - Organização horizontal
- **LazyColumn** - Lista eficiente para grandes datasets

### Animações
```kotlin
.animateContentSize(
    animationSpec = spring(
        dampingRatio = Spring.DampingRatioMediumBouncy,
        stiffness = Spring.StiffnessLow
    )
)
```

## 🚀 Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/natsalete/BasicsCodelab.git
```

2. Abra o projeto no Android Studio

3. Sincronize as dependências Gradle

4. Execute o aplicativo em um emulador ou dispositivo físico:
   - Clique em "Run" ou pressione `Shift + F10`

## 📱 Requisitos do Sistema

- Android Studio Hedgehog | 2023.1.1 ou superior
- JDK 17
- Android SDK mínimo: API 24 (Android 7.0)
- Android SDK alvo: API 34

## 📸 Screenshots

<p align="center">
  <img src="https://github.com/user-attachments/assets/c4e98a46-db8f-4d44-918d-dea6a34ca827" width="200" />
  <img src="https://github.com/user-attachments/assets/da2aaf6a-0128-4eb3-8d74-5448debb232f" width="200" />
</p>

## 📚 Principais Aprendizados

1. **Paradigma Declarativo** - Descrever "o que" exibir, não "como" exibir
2. **Recomposição** - UI atualiza automaticamente quando o estado muda
3. **Performance** - LazyColumn renderiza apenas itens visíveis
4. **Modularidade** - Componentes reutilizáveis e testáveis
5. **Menos Boilerplate** - Menos código comparado ao sistema tradicional de Views

## 🔍 Boas Práticas Implementadas

- ✅ Elevação de estado (State Hoisting)
- ✅ Uso de `rememberSaveable` para persistência
- ✅ Componentes sem estado (stateless) quando possível
- ✅ Previews para diferentes configurações
- ✅ Separação de responsabilidades
- ✅ Uso adequado de Modifiers
- ✅ Acessibilidade com contentDescription

## 👨‍💻 Autor

Desenvolvido com ☕ e 💙

- GitHub: [@natsalete](https://github.com/natsalete)
- LinkedIn: [Natália Salete](https://www.linkedin.com/in/natalia-salete-rodrigues/)
- Email: natsalete14@gmail.com

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

## 🙏 Agradecimentos

- Android Developers Team pelo excelente codelab
- Comunidade Jetpack Compose

---

<div align="center">

### ⭐ Se gostou, deixe uma estrela! ⭐

</div>


</details>

# Jetpack Compose Basics - Codelab

## 📱 About the Project

This project was developed as part of an academic activity to consolidate basic knowledge of Android user interface (UI) development using **Jetpack Compose**.

The application implements all the functionalities proposed in the official Android Developers codelab: [Jetpack Compose Basics](https://developer.android.com/codelabs/jetpack-compose-basics).

## 🎯 Activity Objectives

- Understand the structure and declarative paradigm of Jetpack Compose
- Implement combinable functions (@Composable)
- Manage states and recomposition
- Work with efficient lists (LazyColumn)
- Apply animations and transitions
- Follow good development practices with Compose

## ✨ Implemented Features

### 1. Onboarding Screen
- Welcome initial screen
- "Continue" button that navigates to the main screen
- Persistent state using `rememberSaveable`

### 2. Animated Greeting List
- List with 1000 items efficiently rendered with `LazyColumn`
- Expandable cards when clicking the button
- Smooth animations using `animateContentSize`
- Icons that change dynamically (ExpandMore/ExpandLess)

### 3. State Management
- State elevation (State Hoisting)

- State persistence during screen rotations
- Local states for card expansion control

### 4. Material Design 3
- Custom theme with light and dark mode support
- Material 3 components (Card, Button, IconButton, Surface)
- Typography and colors following Material Design

## 🛠️ Technologies Used

- **Kotlin** - Programming language
- **Jetpack Compose** - Modern UI toolkit
- **Material 3** - Design system
- **Android Studio** - Development IDE

## 📦 Main Dependencies

```gradle
androidx.compose.ui:ui
androidx.compose.material3:material3
androidx.compose.ui:ui-tooling-preview
androidx.activity:activity-compose
```

## 🎨 Compose Concepts Applied

### Composable Functions
All UI functions are marked with `@Composable`:

```kotlin
@Composable
fun MyApp(modifier: Modifier = Modifier) ​​{ ... }
```

### State Management
- `mutableStateOf` - Creates observable state
- `rememberSaveable` - Persists state during configurations
- State Hoisting - Elevation of state to parent components

### Layouts
- **Column** - Vertical organization
- **Row** - Horizontal organization
- **LazyColumn** - Efficient list for large datasets

### Animations
```kotlin
.animateContentSize(
animationSpec = spring(
dampingRatio = Spring.DampingRatioMediumBouncy,
stiffness = Spring.StiffnessLow

)

```

## 🚀 How to Run

1. Clone the Repository:

```bash
git clone https://github.com/natsalete/BasicsCodelab.git

```

2. Open the project in Android Studio

3. Synchronize Gradle dependencies

4. Run the application on an emulator or physical device:

- Click "Run" or press `Shift + F10`

## 📱 System Requirements

- Android Studio Hedgehog | 2023.1.1 or higher
- JDK 17
- Minimum Android SDK: API 24 (Android 7.0)
- Target Android SDK: API 34

## 📸 Screenshots

<p align="center">

<img src="https://github.com/user-attachments/assets/c4e98a46-db8f-4d44-918d-dea6a34ca827" width="200" />
<img src="https://github.com/user-attachments/assets/da2aaf6a-0128-4eb3-8d74-5448debb232f" width="200" />
</p>

## 📚 Key Learnings

1. **Declarative Paradigm** - Describe "what" to display, not "how" Display
2. **Recomposition** - UI automatically updates when the state changes
3. **Performance** - LazyColumn renders only visible items
4. **Modularity** - Reusable and testable components
5. **Less Boilerplate** - Less code compared to the traditional View system

## 🔍 Implemented Best Practices

- ✅ State Hoisting
- ✅ Use of `rememberSaveable` for persistence
- ✅ Stateless components when possible
- ✅ Previews for different configurations
- ✅ Separation of responsibilities
- ✅ Proper use of Modifiers
- ✅ Accessibility with contentDescription

## 👨‍💻 Author

Developed with ☕ and 💙

- GitHub: [@natsalete](https://github.com/natsalete)

- LinkedIn: [Natália Salete](https://www.linkedin.com/in/natalia-salete-rodrigues/)

- Email: natsalete14@gmail.com

## 📄 License

This project is under the MIT license. See the [LICENSE](LICENSE) file for more details.

---

## 🙏 Acknowledgements

- Android Developers Team for the excellent codelab
- Jetpack Compose Community

---

<div align="center">

### ⭐ Se gostou, deixe uma estrela! ⭐

</div>
