package dinocodeacadmey.doesyoudo.com.apppiano

import android.app.Activity
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import android.media.MediaRecorder
import android.media.SoundPool
import android.os.Build
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.HorizontalScrollView
import android.widget.TextView
import android.widget.Toast

import java.io.IOException

class MainActivity : AppCompatActivity(), View.OnClickListener {


    /// The code for the recording of the audio of Piano Keys


    private var mediaRecorder: MediaRecorder? = null


    internal var mStartRecording = true


    var recordingno: Int = 0


    private var soundPool: SoundPool? = null


    internal lateinit var left_navigation: Button
    internal lateinit var right_navigation: Button
    internal lateinit var recordbutton: Button
    internal lateinit var playbutton: Button


    private var c3: Int = 0
    private var c3black: Int = 0
    private var d3: Int = 0
    private var d3black: Int = 0
    private var e3: Int = 0
    private var f3: Int = 0
    private var f3black: Int = 0
    private var g3: Int = 0
    private var g3black: Int = 0
    private var a3: Int = 0
    private var a3black: Int = 0
    private var b3: Int = 0
    private var c4: Int = 0
    private var c4black: Int = 0
    private var d4: Int = 0
    private var d4black: Int = 0
    private var e4: Int = 0
    private var f4: Int = 0
    private var f4black: Int = 0
    private var g4: Int = 0
    private var g4black: Int = 0
    private var a4: Int = 0
    private var a4black: Int = 0
    private var b4: Int = 0
    private var c5: Int = 0
    private var c5black: Int = 0
    private var d5: Int = 0
    private var d5black: Int = 0
    private var e5: Int = 0
    private var f5: Int = 0
    private var f5black: Int = 0
    private var g5: Int = 0
    private var g5black: Int = 0
    private var a5: Int = 0
    private var a5black: Int = 0
    private var b5: Int = 0
    private var c6: Int = 0
    private var c6black: Int = 0
    private var d6: Int = 0
    private var d6black: Int = 0
    private var e6: Int = 0
    private var f6: Int = 0
    private var f6black: Int = 0
    private var g6: Int = 0
    private var g6black: Int = 0
    private var a6: Int = 0
    private var a6black: Int = 0
    private var b6: Int = 0
    private var c7: Int = 0
    private var c7black: Int = 0
    private var d7: Int = 0
    private var d7black: Int = 0
    private var e7: Int = 0
    private var f7: Int = 0
    private val f7black: Int = 0
    private var g7: Int = 0
    private var g7black: Int = 0
    private var a7: Int = 0
    private var a7black: Int = 0
    private var b7: Int = 0


    private var scrollView: HorizontalScrollView? = null

    private var buttonC3: Button? = null
    private var buttonC3black: Button? = null

    private var buttonD3: Button? = null
    private var buttonD3black: Button? = null

    private var buttonE3: Button? = null

    private var buttonF3: Button? = null
    private var buttonF3black: Button? = null

    private var buttonG3: Button? = null
    private var buttonG3black: Button? = null

    private var buttonA3: Button? = null
    private var buttonA3black: Button? = null

    private var buttonB3: Button? = null

    private var buttonC4: Button? = null
    private var buttonC4black: Button? = null

    private var buttonD4: Button? = null
    private var buttonD4black: Button? = null

    private var buttonE4: Button? = null

    private var buttonF4: Button? = null
    private var buttonF4black: Button? = null

    private var buttonG4: Button? = null
    private var buttonG4black: Button? = null

    private var buttonA4: Button? = null
    private var buttonA4black: Button? = null

    private var buttonB4: Button? = null


    private var buttonC5: Button? = null
    private var buttonC5black: Button? = null

    private var buttonD5: Button? = null
    private var buttonD5black: Button? = null

    private var buttonE5: Button? = null

    private var buttonF5: Button? = null
    private var buttonF5black: Button? = null

    private var buttonG5: Button? = null
    private var buttonG5black: Button? = null

    private var buttonA5: Button? = null
    private var buttonA5black: Button? = null

    private var buttonB5: Button? = null

    private var buttonC6: Button? = null
    private var buttonC6black: Button? = null

    private var buttonD6: Button? = null
    private var buttonD6black: Button? = null

    private var buttonE6: Button? = null

    private var buttonF6: Button? = null
    private var buttonF6black: Button? = null

    private var buttonG6: Button? = null
    private var buttonG6black: Button? = null

    private var buttonA6: Button? = null
    private var buttonA6black: Button? = null

    private var buttonB6: Button? = null

    private var buttonC7: Button? = null
    private var buttonC7black: Button? = null

    private var buttonD7: Button? = null
    private var buttonD7black: Button? = null

    private var buttonE7: Button? = null

    private var buttonF7: Button? = null
    private var buttonF7black: Button? = null

    private var buttonG7: Button? = null
    private var buttonG7black: Button? = null

    private var buttonA7: Button? = null
    private var buttonA7black: Button? = null

    private var buttonB7: Button? = null

    // variables for TextViews

    private var tc3: TextView? = null
    private var td3: TextView? = null
    private var te3: TextView? = null
    private var tf3: TextView? = null
    private var tg3: TextView? = null
    private var ta3: TextView? = null
    private var tb3: TextView? = null

    private var tc4: TextView? = null
    private var td4: TextView? = null
    private var te4: TextView? = null
    private var tf4: TextView? = null
    private var tg4: TextView? = null
    private var ta4: TextView? = null
    private var tb4: TextView? = null

    private var tc5: TextView? = null
    private var td5: TextView? = null
    private var te5: TextView? = null
    private var tf5: TextView? = null
    private var tg5: TextView? = null
    private var ta5: TextView? = null
    private var tb5: TextView? = null

    private var tc6: TextView? = null
    private var td6: TextView? = null
    private var te6: TextView? = null
    private var tf6: TextView? = null
    private var tg6: TextView? = null
    private var ta6: TextView? = null
    private var tb6: TextView? = null

    private var tc7: TextView? = null
    private var td7: TextView? = null
    private var te7: TextView? = null
    private var tf7: TextView? = null
    private var tg7: TextView? = null
    private var ta7: TextView? = null
    private var tb7: TextView? = null


    @RequiresApi(Build.VERSION_CODES.FROYO)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Intilize the scroll view
        scrollView = findViewById(R.id.scrollView)

        // Intilize the navigation's button


        // Method for all PianoKey Buttons
        intilizeAllPianoKeys()

        // Method for all PianoKey Lables TextViews
        intilizeTextViewLablesOnPianoKeys()


        // code for the soundpool

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundPool = SoundPool.Builder()
                    .setMaxStreams(6)
                    .build()
        }


        c3 = soundPool!!.load(this, R.raw.c3, 1)
        c3black = soundPool!!.load(this, R.raw.c3black, 1)
        d3 = soundPool!!.load(this, R.raw.d3, 1)
        d3black = soundPool!!.load(this, R.raw.d3black, 1)
        e3 = soundPool!!.load(this, R.raw.e3, 1)
        f3 = soundPool!!.load(this, R.raw.f3, 1)
        f3black = soundPool!!.load(this, R.raw.f3black, 1)
        g3 = soundPool!!.load(this, R.raw.g3, 1)
        g3black = soundPool!!.load(this, R.raw.g3black, 1)
        a3 = soundPool!!.load(this, R.raw.a3, 1)
        a3black = soundPool!!.load(this, R.raw.a3black, 1)
        b3 = soundPool!!.load(this, R.raw.b3, 1)


        c4 = soundPool!!.load(this, R.raw.c4, 1)
        c4black = soundPool!!.load(this, R.raw.c4black, 1)
        d4 = soundPool!!.load(this, R.raw.d4, 1)
        d4black = soundPool!!.load(this, R.raw.d4black, 1)
        e4 = soundPool!!.load(this, R.raw.e4, 1)
        f4 = soundPool!!.load(this, R.raw.f4, 1)
        f4black = soundPool!!.load(this, R.raw.f4black, 1)
        g4 = soundPool!!.load(this, R.raw.c4, 1)
        g4black = soundPool!!.load(this, R.raw.g4black, 1)
        a4 = soundPool!!.load(this, R.raw.a4, 1)
        a4black = soundPool!!.load(this, R.raw.a4black, 1)
        b4 = soundPool!!.load(this, R.raw.b4, 1)

        c5 = soundPool!!.load(this, R.raw.c5, 1)
        c5black = soundPool!!.load(this, R.raw.c5black, 1)
        d5 = soundPool!!.load(this, R.raw.d5, 1)
        d5black = soundPool!!.load(this, R.raw.d5black, 1)
        e5 = soundPool!!.load(this, R.raw.e5, 1)
        f5 = soundPool!!.load(this, R.raw.f5, 1)
        f5black = soundPool!!.load(this, R.raw.f5black, 1)
        g5 = soundPool!!.load(this, R.raw.c5, 1)
        g5black = soundPool!!.load(this, R.raw.g5black, 1)
        a5 = soundPool!!.load(this, R.raw.a5, 1)
        a5black = soundPool!!.load(this, R.raw.a5black, 1)
        b5 = soundPool!!.load(this, R.raw.b5, 1)

        c6 = soundPool!!.load(this, R.raw.c6, 1)
        c6black = soundPool!!.load(this, R.raw.c6black, 1)
        d6 = soundPool!!.load(this, R.raw.d6, 1)
        d6black = soundPool!!.load(this, R.raw.d6black, 1)
        e6 = soundPool!!.load(this, R.raw.e6, 1)
        f6 = soundPool!!.load(this, R.raw.f6, 1)
        f6black = soundPool!!.load(this, R.raw.f6black, 1)
        g6 = soundPool!!.load(this, R.raw.g6, 1)
        g6black = soundPool!!.load(this, R.raw.g6black, 1)
        a6 = soundPool!!.load(this, R.raw.a6, 1)
        a6black = soundPool!!.load(this, R.raw.a6black, 1)
        b6 = soundPool!!.load(this, R.raw.b6, 1)

        c7 = soundPool!!.load(this, R.raw.c7, 1)
        c7black = soundPool!!.load(this, R.raw.c7black, 1)
        d7 = soundPool!!.load(this, R.raw.d7, 1)
        d7black = soundPool!!.load(this, R.raw.d7black, 1)
        e7 = soundPool!!.load(this, R.raw.e7, 1)
        f7 = soundPool!!.load(this, R.raw.f7, 1)
        f3black = soundPool!!.load(this, R.raw.f3black, 1)
        g7 = soundPool!!.load(this, R.raw.g7, 1)
        g7black = soundPool!!.load(this, R.raw.g7black, 1)
        a7 = soundPool!!.load(this, R.raw.a7, 1)
        a7black = soundPool!!.load(this, R.raw.a7black, 1)
        b7 = soundPool!!.load(this, R.raw.b7, 1)


        // The recording code for the piano keys

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO) {
            mFileName1 = externalCacheDir!!.absolutePath
        }
        mFileName1 += "/audiorecordtest1.3gp"
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO) {
            mFileName2 = externalCacheDir!!.absolutePath
        }
        mFileName2 += "/audiorecordtest2.3gp"

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO) {
            mFileName3 = externalCacheDir!!.absolutePath
        }
        mFileName3 += "/audiorecordtest3.3gp"

        mFileName4 = externalCacheDir!!.absolutePath
        mFileName4 += "/audiorecordtest4.3gp"

        mFileName5 = externalCacheDir!!.absolutePath
        mFileName5 += "/audiorecordtest5.3gp"

        mFileName6 = externalCacheDir!!.absolutePath
        mFileName6 += "/audiorecordtest6.3gp"

        val prefs = getSharedPreferences("FILENO", Context.MODE_PRIVATE)
        recordingno = prefs.getInt("fileno", 1)


        // Initialize the Record button,Play Button and navigation button

        left_navigation = findViewById<View>(R.id.bt_left_navigation) as Button
        right_navigation = findViewById<View>(R.id.bt_right_navigation) as Button
        recordbutton = findViewById<View>(R.id.bt_record) as Button
        playbutton = findViewById<View>(R.id.bt_play_recording) as Button


        left_navigation.setOnClickListener { scrollView!!.scrollTo(scrollView!!.scrollX - 30, scrollView!!.scrollX) }

        right_navigation.setOnClickListener { scrollView!!.scrollTo(scrollView!!.scrollX + 30, scrollView!!.scrollY) }

    }


    internal fun intilizeTextViewLablesOnPianoKeys() {

        tc3 = findViewById<View>(R.id.tc3) as TextView
        tc3!!.setOnClickListener(this)
        td3 = findViewById<View>(R.id.td3) as TextView
        td3!!.setOnClickListener(this)
        te3 = findViewById<View>(R.id.te3) as TextView
        te3!!.setOnClickListener(this)
        tf3 = findViewById<View>(R.id.tf3) as TextView
        tf3!!.setOnClickListener(this)
        tg3 = findViewById<View>(R.id.tg3) as TextView
        tg3!!.setOnClickListener(this)
        ta3 = findViewById<View>(R.id.ta3) as TextView
        ta3!!.setOnClickListener(this)
        tb3 = findViewById<View>(R.id.tb3) as TextView
        tb3!!.setOnClickListener(this)

        tc4 = findViewById<View>(R.id.tc4) as TextView
        tc4!!.setOnClickListener(this)
        td4 = findViewById<View>(R.id.td4) as TextView
        td4!!.setOnClickListener(this)
        te4 = findViewById<View>(R.id.te4) as TextView
        te4!!.setOnClickListener(this)
        tf4 = findViewById<View>(R.id.tf4) as TextView
        tf4!!.setOnClickListener(this)
        tg4 = findViewById<View>(R.id.tg4) as TextView
        tg4!!.setOnClickListener(this)
        ta4 = findViewById<View>(R.id.ta4) as TextView
        ta4!!.setOnClickListener(this)
        tb4 = findViewById<View>(R.id.tb4) as TextView
        tb4!!.setOnClickListener(this)

        tc5 = findViewById<View>(R.id.tc5) as TextView
        tc5!!.setOnClickListener(this)
        td5 = findViewById<View>(R.id.td5) as TextView
        td5!!.setOnClickListener(this)
        te5 = findViewById<View>(R.id.te5) as TextView
        te5!!.setOnClickListener(this)
        tf5 = findViewById<View>(R.id.tf5) as TextView
        tf5!!.setOnClickListener(this)
        tg5 = findViewById<View>(R.id.tg5) as TextView
        tg5!!.setOnClickListener(this)
        ta5 = findViewById<View>(R.id.ta5) as TextView
        ta5!!.setOnClickListener(this)
        tb5 = findViewById<View>(R.id.tb5) as TextView
        tb5!!.setOnClickListener(this)


        tc6 = findViewById<View>(R.id.tc6) as TextView
        tc6!!.setOnClickListener(this)
        td6 = findViewById<View>(R.id.td6) as TextView
        td6!!.setOnClickListener(this)
        te6 = findViewById<View>(R.id.te6) as TextView
        te6!!.setOnClickListener(this)
        tf6 = findViewById<View>(R.id.tf6) as TextView
        tf6!!.setOnClickListener(this)
        tg6 = findViewById<View>(R.id.tg6) as TextView
        tg6!!.setOnClickListener(this)
        ta6 = findViewById<View>(R.id.ta6) as TextView
        ta6!!.setOnClickListener(this)
        tb6 = findViewById<View>(R.id.tb6) as TextView
        tb6!!.setOnClickListener(this)


        tc7 = findViewById<View>(R.id.tc7) as TextView
        tc7!!.setOnClickListener(this)
        td7 = findViewById<View>(R.id.td7) as TextView
        td7!!.setOnClickListener(this)
        te7 = findViewById<View>(R.id.te7) as TextView
        te7!!.setOnClickListener(this)
        tf7 = findViewById<View>(R.id.tf7) as TextView
        tf7!!.setOnClickListener(this)
        tg7 = findViewById<View>(R.id.tg7) as TextView
        tg7!!.setOnClickListener(this)
        ta7 = findViewById<View>(R.id.ta7) as TextView
        ta7!!.setOnClickListener(this)
        tb7 = findViewById<View>(R.id.tb7) as TextView
        tb7!!.setOnClickListener(this)


    }


    internal fun intilizeAllPianoKeys() {

        buttonC3 = findViewById<View>(R.id.p1) as Button
        buttonC3!!.setOnClickListener(this)
        buttonC3black = findViewById<View>(R.id.b1) as Button
        buttonC3black!!.setOnClickListener(this)
        buttonD3 = findViewById<View>(R.id.p2) as Button
        buttonD3!!.setOnClickListener(this)
        buttonD3black = findViewById<View>(R.id.b2) as Button
        buttonD3black!!.setOnClickListener(this)
        buttonE3 = findViewById<View>(R.id.p3) as Button
        buttonE3!!.setOnClickListener(this)
        buttonF3 = findViewById<View>(R.id.p4) as Button
        buttonF3!!.setOnClickListener(this)
        buttonF3black = findViewById<View>(R.id.b3) as Button
        buttonF3black!!.setOnClickListener(this)
        buttonG3 = findViewById<View>(R.id.p5) as Button
        buttonG3!!.setOnClickListener(this)
        buttonG3black = findViewById<View>(R.id.b4) as Button
        buttonG3black!!.setOnClickListener(this)
        buttonA3 = findViewById<View>(R.id.p6) as Button
        buttonA3!!.setOnClickListener(this)
        buttonA3black = findViewById<View>(R.id.b5) as Button
        buttonA3black!!.setOnClickListener(this)
        buttonB3 = findViewById<View>(R.id.p7) as Button
        buttonB3!!.setOnClickListener(this)


        buttonC4 = findViewById<View>(R.id.p8) as Button
        buttonC4!!.setOnClickListener(this)
        buttonC4black = findViewById<View>(R.id.b6) as Button
        buttonC4black!!.setOnClickListener(this)
        buttonD4 = findViewById<View>(R.id.p9) as Button
        buttonD4!!.setOnClickListener(this)
        buttonD4black = findViewById<View>(R.id.b7) as Button
        buttonD4black!!.setOnClickListener(this)
        buttonE4 = findViewById<View>(R.id.p10) as Button
        buttonE4!!.setOnClickListener(this)
        buttonF4 = findViewById<View>(R.id.p11) as Button
        buttonF4!!.setOnClickListener(this)
        buttonF4black = findViewById<View>(R.id.b8) as Button
        buttonF4black!!.setOnClickListener(this)
        buttonG4 = findViewById<View>(R.id.p12) as Button
        buttonG4!!.setOnClickListener(this)
        buttonG4black = findViewById<View>(R.id.b9) as Button
        buttonG4black!!.setOnClickListener(this)
        buttonA4 = findViewById<View>(R.id.p13) as Button
        buttonA4!!.setOnClickListener(this)
        buttonA4black = findViewById<View>(R.id.b10) as Button
        buttonA4black!!.setOnClickListener(this)
        buttonB4 = findViewById<View>(R.id.p14) as Button
        buttonB4!!.setOnClickListener(this)


        buttonC5 = findViewById<View>(R.id.p15) as Button
        buttonC5!!.setOnClickListener(this)
        buttonC5black = findViewById<View>(R.id.b11) as Button
        buttonC5black!!.setOnClickListener(this)
        buttonD5 = findViewById<View>(R.id.p16) as Button
        buttonD5!!.setOnClickListener(this)
        buttonD5black = findViewById<View>(R.id.b12) as Button
        buttonD5black!!.setOnClickListener(this)
        buttonE5 = findViewById<View>(R.id.p17) as Button
        buttonE5!!.setOnClickListener(this)
        buttonF5 = findViewById<View>(R.id.p18) as Button
        buttonF5!!.setOnClickListener(this)
        buttonF5black = findViewById<View>(R.id.b13) as Button
        buttonF5black!!.setOnClickListener(this)
        buttonG5 = findViewById<View>(R.id.p19) as Button
        buttonG5!!.setOnClickListener(this)
        buttonG5black = findViewById<View>(R.id.b14) as Button
        buttonG5black!!.setOnClickListener(this)
        buttonA5 = findViewById<View>(R.id.p20) as Button
        buttonA5!!.setOnClickListener(this)
        buttonA5black = findViewById<View>(R.id.b15) as Button
        buttonA5black!!.setOnClickListener(this)
        buttonB5 = findViewById<View>(R.id.p21) as Button
        buttonB5!!.setOnClickListener(this)


        buttonC6 = findViewById<View>(R.id.p22) as Button
        buttonC6!!.setOnClickListener(this)
        buttonC6black = findViewById<View>(R.id.b16) as Button
        buttonC6black!!.setOnClickListener(this)
        buttonD6 = findViewById<View>(R.id.p23) as Button
        buttonD6!!.setOnClickListener(this)
        buttonD6black = findViewById<View>(R.id.b17) as Button
        buttonD6black!!.setOnClickListener(this)
        buttonE6 = findViewById<View>(R.id.p24) as Button
        buttonE6!!.setOnClickListener(this)
        buttonF6 = findViewById<View>(R.id.p25) as Button
        buttonF6!!.setOnClickListener(this)
        buttonF6black = findViewById<View>(R.id.b18) as Button
        buttonF6black!!.setOnClickListener(this)
        buttonG6 = findViewById<View>(R.id.p26) as Button
        buttonG6!!.setOnClickListener(this)
        buttonG6black = findViewById<View>(R.id.b19) as Button
        buttonG6black!!.setOnClickListener(this)
        buttonA6 = findViewById<View>(R.id.p27) as Button
        buttonA6!!.setOnClickListener(this)
        buttonA6black = findViewById<View>(R.id.b20) as Button
        buttonA6black!!.setOnClickListener(this)
        buttonB6 = findViewById<View>(R.id.p28) as Button
        buttonB6!!.setOnClickListener(this)


        buttonC7 = findViewById<View>(R.id.p29) as Button
        buttonC7!!.setOnClickListener(this)
        buttonC7black = findViewById<View>(R.id.b21) as Button
        buttonC7black!!.setOnClickListener(this)
        buttonD7 = findViewById<View>(R.id.p30) as Button
        buttonD7!!.setOnClickListener(this)
        buttonD7black = findViewById<View>(R.id.b22) as Button
        buttonD7black!!.setOnClickListener(this)
        buttonE7 = findViewById<View>(R.id.p31) as Button
        buttonE7!!.setOnClickListener(this)
        buttonF7 = findViewById<View>(R.id.p32) as Button
        buttonF7!!.setOnClickListener(this)
        buttonF7black = findViewById<View>(R.id.b23) as Button
        buttonF7black!!.setOnClickListener(this)
        buttonG7 = findViewById<View>(R.id.p33) as Button
        buttonG7!!.setOnClickListener(this)
        buttonG7black = findViewById<View>(R.id.b24) as Button
        buttonG7black!!.setOnClickListener(this)
        buttonA7 = findViewById<View>(R.id.p34) as Button
        buttonA7!!.setOnClickListener(this)
        buttonA7black = findViewById<View>(R.id.b25) as Button
        buttonA7black!!.setOnClickListener(this)
        buttonB7 = findViewById<View>(R.id.p35) as Button
        buttonB7!!.setOnClickListener(this)

    }


    override fun onClick(v: View) {

        when (v.id) {

            R.id.tc3, R.id.p1 -> soundPool!!.play(c3, 1.0f, 1.0f, 0, 0, 1.0f)

            R.id.b1 -> soundPool!!.play(c3black, 1.0f, 1.0f, 0, 0, 1.0f)

            R.id.td3, R.id.p2 -> soundPool!!.play(d3, 1.0f, 1.0f, 0, 0, 1.0f)

            R.id.b2 -> soundPool!!.play(d3black, 1.0f, 1.0f, 0, 0, 1.0f)


            R.id.te3, R.id.p3 -> soundPool!!.play(e3, 1f, 1f, 0, 0, 1f)


            R.id.tf3, R.id.p4 -> soundPool!!.play(f3, 1f, 1f, 0, 0, 1f)


            R.id.b3 -> soundPool!!.play(f3black, 1f, 1f, 0, 0, 1f)


            R.id.tg3, R.id.p5 -> soundPool!!.play(g3, 1f, 1f, 0, 0, 1f)

            R.id.b4 -> soundPool!!.play(g3black, 1f, 1f, 0, 0, 1f)


            R.id.ta3, R.id.p6 -> soundPool!!.play(a3, 1f, 1f, 0, 0, 1f)

            R.id.b5 -> soundPool!!.play(a3black, 1f, 1f, 0, 0, 1f)

            R.id.tb3, R.id.p7 -> soundPool!!.play(b3, 1f, 1f, 0, 0, 1f)


            R.id.tc4, R.id.p8 -> soundPool!!.play(c4, 1f, 1f, 0, 0, 1f)

            R.id.b6 -> soundPool!!.play(c4black, 1f, 1f, 0, 0, 1f)

            R.id.td4, R.id.p9 -> soundPool!!.play(d4, 1f, 1f, 0, 0, 1f)

            R.id.b7 -> soundPool!!.play(d4black, 1f, 1f, 0, 0, 1f)


            R.id.te4, R.id.p10 -> soundPool!!.play(e4, 1f, 1f, 0, 0, 1f)


            R.id.tf4, R.id.p11 -> soundPool!!.play(f4, 1f, 1f, 0, 0, 1f)


            R.id.b8 -> soundPool!!.play(f4black, 1f, 1f, 0, 0, 1f)


            R.id.tg4, R.id.p12 -> soundPool!!.play(g4, 1f, 1f, 0, 0, 1f)

            R.id.b9 -> soundPool!!.play(g4black, 1f, 1f, 0, 0, 1f)


            R.id.ta4, R.id.p13 -> soundPool!!.play(a4, 1f, 1f, 0, 0, 1f)

            R.id.b10 -> soundPool!!.play(a4black, 1f, 1f, 0, 0, 1f)

            R.id.tb4, R.id.p14 -> soundPool!!.play(b4, 1f, 1f, 0, 0, 1f)


            R.id.tc5, R.id.p15 -> soundPool!!.play(c5, 1f, 1f, 0, 0, 1f)

            R.id.b11 -> soundPool!!.play(c5black, 1f, 1f, 0, 0, 1f)

            R.id.td5, R.id.p16 -> soundPool!!.play(d5, 1f, 1f, 0, 0, 1f)

            R.id.b12 -> soundPool!!.play(d5black, 1f, 1f, 0, 0, 1f)


            R.id.te5, R.id.p17 -> soundPool!!.play(e5, 1f, 1f, 0, 0, 1f)


            R.id.tf5, R.id.p18 -> soundPool!!.play(f5, 1f, 1f, 0, 0, 1f)


            R.id.b13 -> soundPool!!.play(f5black, 1f, 1f, 0, 0, 1f)


            R.id.tg5, R.id.p19 -> soundPool!!.play(g5, 1f, 1f, 0, 0, 1f)

            R.id.b14 -> soundPool!!.play(g5black, 1f, 1f, 0, 0, 1f)


            R.id.ta5, R.id.p20 -> soundPool!!.play(a5, 1f, 1f, 0, 0, 1f)

            R.id.b15 -> soundPool!!.play(a5black, 1f, 1f, 0, 0, 1f)

            R.id.tb5, R.id.p21 -> soundPool!!.play(b5, 1f, 1f, 0, 0, 1f)


            R.id.tc6, R.id.p22 -> soundPool!!.play(c6, 1f, 1f, 0, 0, 1f)

            R.id.b16 -> soundPool!!.play(c6black, 1f, 1f, 0, 0, 1f)

            R.id.td6, R.id.p23 -> soundPool!!.play(d6, 1f, 1f, 0, 0, 1f)

            R.id.b17 -> soundPool!!.play(d6black, 1f, 1f, 0, 0, 1f)


            R.id.te6, R.id.p24 -> soundPool!!.play(e6, 1f, 1f, 0, 0, 1f)


            R.id.tf6, R.id.p25 -> soundPool!!.play(f6, 1f, 1f, 0, 0, 1f)


            R.id.b18 -> soundPool!!.play(f6black, 1f, 1f, 0, 0, 1f)


            R.id.tg6, R.id.p26 -> soundPool!!.play(g6, 1f, 1f, 0, 0, 1f)

            R.id.b19 -> soundPool!!.play(g6black, 1f, 1f, 0, 0, 1f)


            R.id.ta6, R.id.p27 -> soundPool!!.play(a6, 1f, 1f, 0, 0, 1f)

            R.id.b20 -> soundPool!!.play(a6black, 1f, 1f, 0, 0, 1f)

            R.id.tb6, R.id.p28 -> soundPool!!.play(b6, 1f, 1f, 0, 0, 1f)


            R.id.tc7, R.id.p29 -> soundPool!!.play(c7, 1f, 1f, 0, 0, 1f)

            R.id.b21 -> soundPool!!.play(c7black, 1f, 1f, 0, 0, 1f)

            R.id.td7, R.id.p30 -> soundPool!!.play(d7, 1f, 1f, 0, 0, 1f)

            R.id.b22 -> soundPool!!.play(d7black, 1f, 1f, 0, 0, 1f)


            R.id.te7, R.id.p31 -> soundPool!!.play(e7, 1f, 1f, 0, 0, 1f)


            R.id.tf7, R.id.p32 -> soundPool!!.play(f7, 1f, 1f, 0, 0, 1f)


            R.id.b23 -> soundPool!!.play(f7black, 1f, 1f, 0, 0, 1f)


            R.id.tg7, R.id.p33 -> soundPool!!.play(g7, 1f, 1f, 0, 0, 1f)

            R.id.b24 -> soundPool!!.play(g7black, 1f, 1f, 0, 0, 1f)


            R.id.ta7, R.id.p34 -> soundPool!!.play(a7, 1f, 1f, 0, 0, 1f)

            R.id.b25 -> soundPool!!.play(a7black, 1f, 1f, 0, 0, 1f)

            R.id.tb7, R.id.p35 -> soundPool!!.play(b7, 1f, 1f, 0, 0, 1f)
        }
    }


    fun play(view: View) {

//        val intent = Intent(this@MainActivity, PLayingActivity::class.java)
//        startActivity(intent)

    }


    fun record(view: View) {
        onRecord(mStartRecording)
        if (mStartRecording) {
            recordbutton.text = "Finish"
        } else {
            recordbutton.text = "Record"
        }
        mStartRecording = !mStartRecording
    }

    /*
     *   The startRecording() method code :::
     *
     * */

    private fun startRecording() {

        mediaRecorder = MediaRecorder()
        mediaRecorder!!.setAudioSource(MediaRecorder.AudioSource.DEFAULT)
        mediaRecorder!!.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP)
        when (recordingno) {


            1 -> {
                mediaRecorder!!.setOutputFile(mFileName1)
                recordingno++
                if (recordingno == 7)
                    recordingno = 1
            }
            2 -> {
                mediaRecorder!!.setOutputFile(mFileName2)
                recordingno++
                if (recordingno == 7)
                    recordingno = 1
            }
            3 -> {
                mediaRecorder!!.setOutputFile(mFileName3)
                recordingno++
                if (recordingno == 7)
                    recordingno = 1
            }
            4 -> {
                mediaRecorder!!.setOutputFile(mFileName4)
                recordingno++
                if (recordingno == 7)
                    recordingno = 1
            }
            5 -> {
                mediaRecorder!!.setOutputFile(mFileName5)
                recordingno++
                if (recordingno == 7)
                    recordingno = 1
            }
            6 -> {
                mediaRecorder!!.setOutputFile(mFileName6)
                recordingno++
                if (recordingno == 7)
                    recordingno = 1
            }
        }

        val editor = getSharedPreferences("FILENO", Context.MODE_PRIVATE).edit()
        editor.putInt("fileno", recordingno)
        editor.commit()
        // mediaRecorder.setOutputFile(mFileName);
        mediaRecorder!!.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB)

        try {
            mediaRecorder!!.prepare()
        } catch (e: IOException) {
            Log.e("prepare fail", "prepare() failed")
        }

        Log.d("recorder has started", "recorder has started")
        mediaRecorder!!.start()
    }


    private fun stopRecording() {
        mediaRecorder!!.stop()
        mediaRecorder!!.release()
        mediaRecorder = null
    }


    private fun onRecord(start: Boolean) {
        if (start) {
            startRecording()
        } else {
            stopRecording()
            if (recordingno == 1) {
                val recordingmsg = Toast.makeText(applicationContext,
                        "Song " + 6 + " saved", Toast.LENGTH_SHORT)

                recordingmsg.show()
            } else {
                val temprecordingno = recordingno - 1
                val recordingmsg = Toast.makeText(applicationContext,
                        "Song $temprecordingno Saved", Toast.LENGTH_LONG)
                recordingmsg.show()
            }
        }
    }


    override fun onBackPressed() {


        AlertDialog.Builder(this)
                .setTitle("Do you want to exit ?")
                .setTitle("Are you sure you want to exit")
                .setNegativeButton(R.string.no, null)
                .setPositiveButton(R.string.yes) { dialog, which ->
                    setResult(Activity.RESULT_OK, Intent().putExtra("EXIT", true))
                    finish()
                }.create().show()

    }

    companion object {
        var mFileName1: String? = null
        var mFileName2: String? = null
        var mFileName3: String? = null
        var mFileName4: String? = null
        var mFileName5: String? = null
        var mFileName6: String? = null
    }
}
