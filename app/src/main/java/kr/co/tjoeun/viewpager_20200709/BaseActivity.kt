package kr.co.tjoeun.viewpager_20200709

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity:AppCompatActivity() {

    val mContext = this

    abstract fun setupEvents()
    abstract fun setValues()


}