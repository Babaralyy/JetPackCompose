package com.ct.jetpackcompose.screens.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ct.jetpackcompose.R
import com.ct.jetpackcompose.datamodels.Product


@Composable
fun ProductItem(product: Product = Product(id = "1", name = "Dummy", color = Color.Magenta, price = 10.11f,
    discountedPrice = 15.00f, size = 12.0f, rating = 4.3f, imageRes = R.drawable.two_shoe)) {
    val color by remember {
        mutableStateOf(product.color)
    }

    Box(modifier = Modifier
        .padding(20.dp)
        .size(168.dp, 210.dp)){
        Box(modifier = Modifier
            .fillMaxSize()
            .alpha(.2f)
            .background(color, shape = RoundedCornerShape(22.dp)))
    }
}

@Preview(showBackground = true)
@Composable
fun ShowPreview(){
    ProductItem()
}