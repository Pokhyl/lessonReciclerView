package com.example.lessonreciclerview

import android.app.Application
import com.example.lessonreciclerview.model.UsersService


class App : Application() {

    val usersService = UsersService()
}