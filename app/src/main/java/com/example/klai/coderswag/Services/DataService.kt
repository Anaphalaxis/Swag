package com.example.klai.coderswag.Services

import com.example.klai.coderswag.Model.Category
import com.example.klai.coderswag.Model.Product

object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18","hat01"),
            Product("Devslopes Hat Black", "$20","hat02"),
            Product("Devslopes Hat White", "$18","hat03"),
            Product("Devslopes Devslope Hat Snapback", "$22","hat04")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28","hoodie01"),
            Product("Devslopes Hoodie Red", "$32","hoodie02"),
            Product("Devslopes Hoodie Blue", "$28","hoodie03"),
            Product("Devslopes Hoodie Black", "$28","hoodie04"),
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$18","shirt01"),
            Product("Devslopes Shirt Gray", "$20","shirt02"),
            Product("Devslopes Shirt Hustle", "$22","shirt03"),
            Product("Devslopes Shirt red", "$18","shirt04"),
            Product("Devslopes Kickflip", "$22","shirt05"),
            )

}