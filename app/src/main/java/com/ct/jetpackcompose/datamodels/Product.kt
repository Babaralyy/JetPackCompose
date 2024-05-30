package com.ct.jetpackcompose.datamodels

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Product (
    var id : String,
    var name : String,
    var color : Color,
    var price : Float,
    var discountedPrice : Float,
    var size : Float,
    var rating : Float,
    @DrawableRes val imageRes : Int? = null,
)