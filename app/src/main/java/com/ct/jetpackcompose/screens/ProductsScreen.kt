package com.ct.jetpackcompose.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ct.jetpackcompose.R
import com.ct.jetpackcompose.datamodels.Product
import com.ct.jetpackcompose.screens.components.ProductItem

@Composable
fun ProductsScreen() {
    val products = remember {
        getProductList()
    }

    LazyVerticalGrid(columns = GridCells.Fixed(2), modifier = Modifier.padding(8.dp)) {
        items(products) { product ->
            ProductItem(product = product)
        }
    }
}

fun getProductList(): List<Product>{
    return listOf(
        Product(id = "1", name = "Dummy", color = Color.Magenta, price = 10.11f, discountedPrice = 15.00f, size = 12.0f, rating = 4.3f, imageRes = R.drawable.two_shoe),
        Product(id = "2", name = "Dummy", color = Color.Red, price = 10.11f, discountedPrice = 15.00f, size = 12.0f, rating = 4.3f, imageRes = R.drawable.two_shoe),
        Product(id = "3", name = "Dummy", color = Color.Cyan, price = 10.11f, discountedPrice = 15.00f, size = 12.0f, rating = 4.3f, imageRes = R.drawable.two_shoe),
        Product(id = "4", name = "Dummy", color = Color.Blue, price = 10.11f, discountedPrice = 15.00f, size = 12.0f, rating = 4.3f, imageRes = R.drawable.two_shoe),
        Product(id = "5", name = "Dummy", color = Color.Green, price = 10.11f, discountedPrice = 15.00f, size = 12.0f, rating = 4.3f, imageRes = R.drawable.two_shoe),
        Product(id = "6", name = "Dummy", color = Color.LightGray, price = 10.11f, discountedPrice = 15.00f, size = 12.0f, rating = 4.3f, imageRes = R.drawable.two_shoe),
        Product(id = "7", name = "Dummy", color = Color.Magenta, price = 10.11f, discountedPrice = 15.00f, size = 12.0f, rating = 4.3f, imageRes = R.drawable.two_shoe),
        Product(id = "8", name = "Dummy", color = Color.Magenta, price = 10.11f, discountedPrice = 15.00f, size = 12.0f, rating = 4.3f, imageRes = R.drawable.two_shoe),
    )
}