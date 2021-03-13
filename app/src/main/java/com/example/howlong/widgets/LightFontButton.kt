package com.example.howlong.widgets

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet

class LightFontButton: androidx.appcompat.widget.AppCompatButton {

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
    {
        typeface = Typeface.createFromAsset(context.assets, "Roboto-Light.ttf")
    }
}
