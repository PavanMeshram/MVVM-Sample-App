package com.example.mvvmsampleapp.data.network.responses

import com.example.mvvmsampleapp.data.db.entities.Quote

data class QuotesResponse(
    val isSuccessful: Boolean,
    val quotes: List<Quote>
)