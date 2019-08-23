package com.example.myfirstandroid

import dagger.Component

@Component
interface MagicBox {
    fun poke(app: MainActivity)
}