package com.example.one_month_app.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.one_month_app.R

data class DayData(
    @StringRes val dayRes: Int,
    @StringRes val goalRes: Int,
    @DrawableRes val imageRes: Int,
    @StringRes val descriptionRes: Int
){
    val day = listOf(
        DayData(
            dayRes = R.string.day_name,
            goalRes = R.string.day_goal,
            imageRes = R.drawable.rising_sun,
            descriptionRes = R.string.day_description
        ),
        DayData(
            dayRes = R.string.day_name,
            goalRes = R.string.day_goal,
            imageRes = R.drawable.rising_sun,
            descriptionRes = R.string.day_description
        ),
        DayData(
            dayRes = R.string.day_name,
            goalRes = R.string.day_goal,
            imageRes = R.drawable.rising_sun,
            descriptionRes = R.string.day_description
        ),
        DayData(
            dayRes = R.string.day_name,
            goalRes = R.string.day_goal,
            imageRes = R.drawable.rising_sun,
            descriptionRes = R.string.day_description
        ),
        DayData(
            dayRes = R.string.day_name,
            goalRes = R.string.day_goal,
            imageRes = R.drawable.rising_sun,
            descriptionRes = R.string.day_description
        ),
        DayData(
            dayRes = R.string.day_name,
            goalRes = R.string.day_goal,
            imageRes = R.drawable.rising_sun,
            descriptionRes = R.string.day_description
        ),
        DayData(
            dayRes = R.string.day_name,
            goalRes = R.string.day_goal,
            imageRes = R.drawable.rising_sun,
            descriptionRes = R.string.day_description
        ),
        DayData(
            dayRes = R.string.day_name,
            goalRes = R.string.day_goal,
            imageRes = R.drawable.rising_sun,
            descriptionRes = R.string.day_description
        ),
        DayData(
            dayRes = R.string.day_name,
            goalRes = R.string.day_goal,
            imageRes = R.drawable.rising_sun,
            descriptionRes = R.string.day_description
        ),
        DayData(
            dayRes = R.string.day_name,
            goalRes = R.string.day_goal,
            imageRes = R.drawable.rising_sun,
            descriptionRes = R.string.day_description
        ),
        DayData(
            dayRes = R.string.day_name,
            goalRes = R.string.day_goal,
            imageRes = R.drawable.rising_sun,
            descriptionRes = R.string.day_description
        ),
        DayData(
            dayRes = R.string.day_name,
            goalRes = R.string.day_goal,
            imageRes = R.drawable.rising_sun,
            descriptionRes = R.string.day_description
        ),
        DayData(
            dayRes = R.string.day_name,
            goalRes = R.string.day_goal,
            imageRes = R.drawable.rising_sun,
            descriptionRes = R.string.day_description
        ),
    )
}