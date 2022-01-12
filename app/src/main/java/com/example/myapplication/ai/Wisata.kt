package com.example.myapplication.ai

class Wisata {
    var nama:String ?= null
    var jarak:Double ?= null
    var harga:Double ?= null
    var kualitas:Double ?= null

    constructor(nama: String,jarak:Double,harga:Double,kualitas:Double){
        this.nama = nama
        this.harga = harga
        this.jarak = jarak
        this.kualitas = kualitas
    }
}