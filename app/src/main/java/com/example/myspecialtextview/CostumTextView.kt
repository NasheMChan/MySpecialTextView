package com.example.myspecialtextview

import android.content.Context
import android.util.AttributeSet


class CustomTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : androidx.appcompat.widget.AppCompatTextView(context, attrs, defStyleAttr) {

    init {
        context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.CustomTextView,
            0, 0
        ).apply {
            try {
                // Set the minimum height and width of the TextView to 44dp
                minimumHeight = getDimensionPixelSize(
                    R.styleable.CustomTextView_android_minHeight,
                    resources.getDimensionPixelSize(R.dimen.min_height_text_view_costum)
                )
                minimumWidth = getDimensionPixelSize(
                    R.styleable.CustomTextView_android_minWidth,
                    resources.getDimensionPixelSize(R.dimen.min_width_text_view_costum)
                )

                // Set the content description of the TextView
                contentDescription = getString(R.styleable.CustomTextView_android_contentDescription)


            } finally {
                recycle()
            }
        }
    }
}
