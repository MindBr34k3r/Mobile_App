package vn.edu.usth.stocks

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsInfoScreen() {
    Column {
        ListItem(
            headlineText = { Text("App version")},
            supportingText = { Text(BuildConfig.VERSION_NAME)}
        )
        ListItem(
            headlineText = { Text("Creators")},
            supportingText = { Text(text = "Nguyen Duc Minh BI11-180" +
                    "\nNguyen Xuan Thai BI11-239" +
                    "\nKieu Tuan Phuong BI11-222" +
                    "\nNguyen Bao LOng BI11-156" +
                    "\nNguyen Duc Minh BI11-163" +
                    "\nLe Duc Bach BI11-035")}
        )
    }
}