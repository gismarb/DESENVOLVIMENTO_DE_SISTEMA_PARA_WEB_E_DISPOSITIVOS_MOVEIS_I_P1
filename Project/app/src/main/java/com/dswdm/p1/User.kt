package com.dswdm.p1

class User constructor(name: String, CPF: String, email: String, pwd: String) {
    var name: String
    var CPF: String
    var email: String
    var pwd: String

    init {
        this.name = name
        this.CPF = CPF
        this.email = email
        this.pwd = pwd

    }

}