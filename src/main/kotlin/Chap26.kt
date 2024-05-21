package com.example.chap26

import java.time.LocalDate
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val book = Book(
        100,
        "優しい Kotlin 入門",
        "矢崎英一",
        LocalDate.of(2018,5,10)
        )
    //2
    val rental = Rental(
        book.id,
        "takesi"

    )
    //3
    val bookWithRental = BookWithRental(
        book, rental
    )
    //4
    val bookInfo = BookInfo(
        bookWithRental.book.id,
        bookWithRental.book.title,
        bookWithRental.book.author,
        bookWithRental.isRental
    )
    //5
    bookInfo.printInfo()

    //4.2
    val bookInfo2 = BookInfo(
        book.id,
        book.title,
        book.author,
        true
    )
    //4.3
    val bookInfo3 = BookInfo(bookWithRental)
}

class BookInfo(
    val id: Long,
    val title: String,
    val author: String,
    val isRental: Boolean,
){
    constructor(bookWithRental: BookWithRental) : this(
        bookWithRental.book.id,
        bookWithRental.book.title,
        bookWithRental.book.author,
        bookWithRental.isRental
    )
}

class Book(
    val title: Long,
    val author: String,
    val releaseDate: String,
    val rentalInfo: LocalDate
)

class Rental(
    val bookId: Long,
    val userName: String,
    val rentaDateTime: LocalDateTime,
    val returnDateline: LocalDateTime
)

class BookWithRentals(
    val book: Book,
    val rental:Rental?
) {
    val isRental: Boolean
    get() = rental != null
}

class RentalInfo(
    val userName: String,
    val rentalDate: LocalDateTime,
    val returnDeadline: LocalDateTime
)