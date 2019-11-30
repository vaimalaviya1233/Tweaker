package com.rw.tweaks.views

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView


open class DisableableImageView : AppCompatImageView {
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun setEnabled(enabled: Boolean) {
        if (this.isEnabled != enabled) {
            this.imageAlpha = if (enabled) 0xFF else 0x3F
        }
        isClickable = enabled
        super.setEnabled(enabled)
    }
}