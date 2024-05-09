import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicecomposeandroid.R
import com.example.practicecomposeandroid.ui.theme.PurpleGrey40

@Composable
fun FoodColumnLists(paddingValues: PaddingValues){
    LazyColumn(
        modifier = androidx.compose.ui.Modifier.padding(paddingValues),
    ) {
        items(20){
            FoodColumnList()
        }
    }
}

@Composable
fun FoodColumnList(){
    Column {
        Box (
            modifier = Modifier
                .height(80.dp)
                .fillMaxWidth()
                .background(Color.Transparent)
                .border(2.dp, Color.Red, shape = RoundedCornerShape(8.dp))
                .padding(10.dp)

        ){
            Row(
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    modifier = Modifier.width(100.dp),
                    painter = painterResource(id = R.drawable.ramen),
                    contentDescription = "Food")
                Spacer(modifier = Modifier.width(10.dp))
                Column(modifier = Modifier
                    .weight(1f)
                    .background(Color.Transparent)
                    .fillMaxHeight(),
                    verticalArrangement = Arrangement.SpaceEvenly) {
                    Text(text = "Ramen Noodles", fontSize = 17.sp,
                        fontWeight = FontWeight.Medium)
                    Text(text = "Hot ramen noodles", fontSize = 14.sp,
                        color = PurpleGrey40
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "$40", fontSize = 25.sp,
                    color = Color.Red,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
    }
}