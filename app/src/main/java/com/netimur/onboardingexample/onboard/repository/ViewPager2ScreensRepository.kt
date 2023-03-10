package com.netimur.onboardingexample.onboard.repository

import androidx.fragment.app.Fragment

interface ViewPager2ScreensRepository {
    fun getScreens(): List<Fragment>
}