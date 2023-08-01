package com.descritas.testtask

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.descritas.testtask.ui.theme.TestTaskTheme
import com.google.relay.compose.ColumnScopeInstanceImpl.weight


class MainActivity : ComponentActivity() {


    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            TestTaskTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//                }
//            }
//        }
//    }
//}
//            val count = remember{mutableStateOf(0)}
//
//            Text("Clicks: ${count.value}",
//                fontSize = 28.sp,
//                modifier = Modifier.clickable( onClick = { count.value += 1 })
//            )
//
//        }
//    }
//}
//            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
//            {
//                Box(modifier = Modifier.background(Color.Blue).size(300.dp))
//                Box(modifier = Modifier.background(Color.LightGray).size(200.dp))
//                Text("Hello METANIT.COM!", style = TextStyle(fontSize = 22.sp))
//            }
//        }
//    }
//}
            //        Column(modifier = Modifier.height(250.dp).width(250.dp))
            //        {
            //            Box(modifier = Modifier.background(Color.Red).fillMaxWidth().weight(1f))
            //            Box(modifier = Modifier.background(Color.Yellow).fillMaxWidth().weight(3f))
            //            Box(modifier = Modifier.background(Color.Green).fillMaxWidth().weight(2f))
            //        }
            //    }
            //}
//            val message = remember{mutableStateOf("Hello Jetpack")}
//
//            Text(
//                text = message.value,
//                fontSize = 28.sp,
//                modifier = Modifier.clickable( onClick = { message.value = "Hello Work!" })
//            )
//        }
//    }
//}
//            Column {
//                Text(text = "Hello Jetpack Compose!",  fontSize=22.sp, fontWeight= FontWeight.Thin)
//                Text(text = "Hello Jetpack Compose!",  fontSize=22.sp, fontWeight= FontWeight.W700)
//                Text(text = "Hello Jetpack Compose!",  fontSize=22.sp, fontWeight= FontWeight(700),letterSpacing= 6.sp)
//
//            }
//        }
//    }
//}
//            val message = remember{mutableStateOf("")}
//
//            Column {
//                Text(message.value, fontSize = 28.sp)
//                TextField(
//                    value = message.value,
//                    textStyle = TextStyle(fontSize=25.sp),
//                    onValueChange = {newText -> message.value = newText}
//                )
//            }
//        }
//    }
//}
//            val phone = remember{mutableStateOf("")}
//
//            TextField(
//                phone.value,
//                {phone.value = it},
//                textStyle = TextStyle(fontSize =  28.sp),
//                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
//                placeholder = { Text("Hello Work!") }
//            )
//        }
//    }
//}
//            val selected = remember { mutableStateOf(true) }
//
//            Text(
//                text= selected.value.toString(),
//                fontSize = 30.sp,
//                modifier = Modifier.selectable(
//                    selected = selected.value,
//                    onClick = { selected.value = !selected.value }
//                )
//            )
//        }
//    }
//}
//            val languages = listOf("Kotlin", "Java", "Javascript", "Rust")
//            val (selectedOption, onOptionSelected) = remember { mutableStateOf(languages[0]) }
//
//            Column(Modifier.selectableGroup()) {
//                languages.forEach { text ->
//                    Row(
//                        Modifier
//                            .fillMaxWidth()
//                            .height(56.dp)
//                            .selectable(
//                                selected = (text == selectedOption),
//                                onClick = { onOptionSelected(text) }
//                            ),
//                        verticalAlignment = Alignment.CenterVertically
//                    ) {
//                        RadioButton(
//                            selected = (text == selectedOption),
//                            onClick = null
//                        )
//                        Text( text = text, fontSize = 22.sp )
//                    }
//                }
//            }
//        }
//    }
//}
//            Row(verticalAlignment = Alignment.Bottom, modifier = Modifier.fillMaxHeight()) {
//                BottomAppBar {
//                    IconButton(onClick = { }) {
//                        Icon(Icons.Filled.Menu, contentDescription = "Меню")
//                    }
//                    Spacer(Modifier.weight(1f, true))
//
//                    IconButton(onClick = { }) {
//                        Icon(Icons.Filled.Info, contentDescription = "Информация о приложении")
//                    }
//                    IconButton(onClick = { }) {
//                        Icon(Icons.Filled.Search, contentDescription = "Избранное")
//                    }
//                }
//            }
//        }
//    }
//}
            Scaffold(
                topBar = {
                    TopAppBar(title = { Text(text = "") }, actions = {
                        IconButton(onClick = { }) {
                            Icon(
                                Icons.Filled.Menu,
                                contentDescription = "Меню"
                            )
                        }
                        Text("METANIT.COM", fontSize = 22.sp)
                        Spacer(Modifier.weight(1f, true))
                        IconButton(onClick = { }) {
                            Icon(
                                Icons.Filled.Search,
                                contentDescription = "Поиск"
                            )
                        }
                    })
                },
                bottomBar = {
                    BottomAppBar {
                        IconButton(onClick = { }) {
                            Icon(
                                Icons.Filled.Favorite,
                                contentDescription = "Избранное"
                            )
                        }
                        Spacer(Modifier.weight(1f, true))
                        IconButton(onClick = { }) {
                            Icon(
                                Icons.Filled.Info,
                                contentDescription = "Информация о приложении"
                            )
                        }
                    }
                },
                content = { innerPadding ->
                    //LazyColumn(
                    //    contentPadding = innerPadding,
                    //    verticalArrangement = Arrangement.spacedBy(8.dp)
                    //) {
                    //    val list = (0..75).map { it.toString() }
                    //    items(count = list.size) {
                    //        Text(
                    //            text = list[it],
                    //            style = MaterialTheme.typography.bodyLarge,
                    //            modifier = Modifier
                    //                .fillMaxWidth()
                    //                .padding(horizontal = 16.dp)
                    //        )
                    //    }
                    //}
                    Text("Hello Scaffold", fontSize = 22.sp, modifier = Modifier.padding(innerPadding))


                })
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TestTaskTheme {
        Greeting("Android")
    }
}
