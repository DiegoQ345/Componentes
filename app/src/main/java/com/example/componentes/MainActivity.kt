package com.example.jetpackcomponents

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import androidx.compose.runtime.Composable
import com.example.componentes.ui.theme.ComponentesTheme


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComponentesTheme {
                Scaffold(
                    topBar = { TopAppBar(title = { Text("Componentes Jetpack") }) },
                    bottomBar = { BottomNavigationBar() }
                ) { padding ->
                    LazyColumn(modifier = Modifier.padding(padding)) {
                        item { ShowLazyColumn() }
                        item { ShowLazyRow() }
                        item { ShowGrid() }
                        item { ShowConstraintLayout() }
                        item { ShowScaffoldExample() }
                        item { ShowSurface() }
                        item { ShowChip() }
                        item { ShowBackdropScaffoldExample() }
                        item { ShowFlowRow() }
                        item { ShowFlowColumn() }
                        item { ShowAlertDialog() }
                        item { ShowCard() }
                        item { ShowCheckbox() }
                        item { ShowFloatingActionButton() }
                        item { ShowIcon() }
                        item { ShowImage() }
                        item { ShowProgressBar() }
                        item { ShowRadioButton() }
                        item { ShowSlider() }
                        item { ShowSpacer() }
                        item { ShowSwitch() }
                        item { ShowDialog() }
                        item { ShowDivider() }
                        item { ShowDropDownMenu() }
                        item { ShowLazyVerticalGrid() }
                        item { ShowNavigationRail() }
                        item { ShowOutlinedTextField() }
                        item { ShowPager() }
                        item { ShowSnackbar() }
                        item { ShowTabRow() }
                        item { ShowTooltip() }
                    }
                }
            }
        }
    }

    @Composable
    fun ShowLazyColumn() {
        LazyColumn(modifier = Modifier.height(100.dp)) {
            items(3) { Text("Item #$it", modifier = Modifier.padding(8.dp)) }
        }
    }

    @Composable
    fun ShowLazyRow() {
        LazyRow(modifier = Modifier.height(100.dp)) {
            items(3) { Text("Fila #$it", modifier = Modifier.padding(8.dp)) }
        }
    }

    @Composable
    fun ShowGrid() {
        Text("Grid aún no implementado como tal")
    }

    @Composable
    fun ShowConstraintLayout() {
        Text("ConstraintLayout requiere dependencia adicional")
    }

    @Composable
    fun ShowScaffoldExample() {
        Text("Scaffold ya está implementado arriba")
    }

    @Composable
    fun ShowSurface() {
        Surface(modifier = Modifier.padding(8.dp), color = Color.LightGray) {
            Text("Surface")
        }
    }

    @Composable
    fun ShowChip() {
        AssistChip(onClick = {}, label = { Text("Chip") })
    }

    @Composable
    fun ShowBackdropScaffoldExample() {
        Text("BackdropScaffold requiere configuración más extensa")
    }

    @Composable
    fun ShowFlowRow() {
        Row { Text("FlowRow simulado") }
    }

    @Composable
    fun ShowFlowColumn() {
        Column { Text("FlowColumn simulado") }
    }

    @Composable
    fun ShowAlertDialog() {
        var show by remember { mutableStateOf(false) }
        Button(onClick = { show = true }) { Text("Mostrar Alerta") }
        if (show) {
            AlertDialog(onDismissRequest = { show = false }, confirmButton = {
                Button(onClick = { show = false }) { Text("OK") }
            }, title = { Text("Alerta") }, text = { Text("Esto es un AlertDialog") })
        }
    }

    @Composable
    fun ShowCard() {
        Card(modifier = Modifier.padding(8.dp)) {
            Text("Soy una Card", modifier = Modifier.padding(16.dp))
        }
    }

    @Composable
    fun ShowCheckbox() {
        var checked by remember { mutableStateOf(false) }
        Checkbox(checked = checked, onCheckedChange = { checked = it })
    }

    @Composable
    fun ShowFloatingActionButton() {
        FloatingActionButton(onClick = {}) { Icon(Icons.Default.Add, contentDescription = "FAB") }
    }

    @Composable
    fun ShowIcon() {
        Icon(Icons.Default.Star, contentDescription = "Icono")
    }

    @Composable
    fun ShowImage() {
        Icon(Icons.Default.Face, contentDescription = "Imagen simulada")
    }

    @Composable
    fun ShowProgressBar() {
        CircularProgressIndicator()
    }

    @Composable
    fun ShowRadioButton() {
        var selected by remember { mutableStateOf(false) }
        RadioButton(selected = selected, onClick = { selected = !selected })
    }

    @Composable
    fun ShowSlider() {
        var value by remember { mutableStateOf(0f) }
        Slider(value = value, onValueChange = { value = it })
    }

    @Composable
    fun ShowSpacer() {
        Spacer(modifier = Modifier.height(8.dp))
    }

    @Composable
    fun ShowSwitch() {
        var checked by remember { mutableStateOf(false) }
        Switch(checked = checked, onCheckedChange = { checked = it })
    }

    @Composable
    fun ShowDialog() {
        Text("Dialog mostrado como AlertDialog arriba")
    }

    @Composable
    fun ShowDivider() {
        Divider(color = Color.Gray, thickness = 1.dp)
    }

    @Composable
    fun ShowDropDownMenu() {
        var expanded by remember { mutableStateOf(false) }
        Box {
            Button(onClick = { expanded = true }) { Text("Menú") }
            DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
                DropdownMenuItem(text = { Text("Opción 1") }, onClick = { expanded = false })
                DropdownMenuItem(text = { Text("Opción 2") }, onClick = { expanded = false })
            }
        }
    }

    @Composable
    fun ShowLazyVerticalGrid() {
        Text("LazyVerticalGrid requiere dependencia experimental")
    }

    @Composable
    fun ShowNavigationRail() {
        Text("NavigationRail se usa con pantallas grandes")
    }

    @Composable
    fun ShowOutlinedTextField() {
        var text by remember { mutableStateOf("") }
        OutlinedTextField(value = text, onValueChange = { text = it }, label = { Text("Texto") })
    }

    @Composable
    fun ShowPager() {
        Text("Pager requiere dependencia adicional de Accompanist")
    }

    @Composable
    fun ShowSnackbar() {
        val snackbarHostState = remember { SnackbarHostState() }
        val scope = rememberCoroutineScope()
        Button(onClick = {
            scope.launch { snackbarHostState.showSnackbar("Hola Snackbar") }
        }) { Text("Mostrar Snackbar") }
        SnackbarHost(hostState = snackbarHostState)
    }

    @Composable
    fun ShowTabRow() {
        var selectedTabIndex by remember { mutableStateOf(0) }
        TabRow(selectedTabIndex = selectedTabIndex) {
            Tab(selected = true, onClick = {}, text = { Text("Tab 1") })
            Tab(selected = false, onClick = {}, text = { Text("Tab 2") })
        }
    }

    @Composable
    fun ShowTooltip() {
        Text("Tooltip aún no tiene API oficial completa")
    }

    @Composable
    fun BottomNavigationBar() {
        NavigationBar {
            NavigationBarItem(icon = { Icon(Icons.Default.Home, null) }, label = { Text("Inicio") }, selected = true, onClick = {})
            NavigationBarItem(icon = { Icon(Icons.Default.Settings, null) }, label = { Text("Ajustes") }, selected = false, onClick = {})
        }
    }
}
