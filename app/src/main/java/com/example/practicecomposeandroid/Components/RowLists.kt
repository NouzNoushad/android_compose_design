import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
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
fun FoodRowLists(){
    Column {
        LazyRow {
            items(20){
                FoodRowList(Color(0, 153, 0))
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        LazyRow {
            items(20){
                FoodRowList(Color(0, 102, 255, ))
            }
        }
    }
}

@Composable
fun FoodRowList(color: Color){
    Row {
        Box (
            modifier = Modifier
                .border(2.dp, color, shape = RoundedCornerShape(8.dp))
                .height(180.dp)
                .width(200.dp)
                .padding(10.dp)
        ){
            Column {
                Box (modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent),
                    contentAlignment = Alignment.Center){
                    Image(
                        modifier = Modifier.width(100.dp),
                        painter = painterResource(id = R.drawable.ramen),
                        contentDescription = "Food")
                }
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    modifier = Modifier.weight(1f),
                    verticalAlignment = Alignment.CenterVertically
                )
                {
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .background(Color.Transparent),
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Text(text = "Ramen Noodles", fontSize = 17.sp,
                            fontWeight = FontWeight.Medium)
                        Text(text = "Hot ramen noodles", fontSize = 14.sp,
                            color = PurpleGrey40
                        )
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "$40", fontSize = 25.sp,
                        color = color,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
        Spacer(modifier = Modifier.width(10.dp))
    }
}