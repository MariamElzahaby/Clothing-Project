package com.example.clothesproject.collectionRecycleView

import com.example.clothesproject.productApis.AllProductResponse

interface productClickInterface {

    fun onClickedproduct(allProductResponse: AllProductResponse)
}