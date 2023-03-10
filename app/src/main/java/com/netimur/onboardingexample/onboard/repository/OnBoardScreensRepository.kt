package com.netimur.onboardingexample.onboard.repository

import androidx.fragment.app.Fragment
import com.netimur.onboardingexample.onboard.screens.FirstFragment
import com.netimur.onboardingexample.onboard.screens.SecondFragment
import com.netimur.onboardingexample.onboard.screens.ThirdFragment

class OnBoardScreensRepository : ViewPager2ScreensRepository {
    override fun getScreens(): List<Fragment> {
        val firstScreen = FirstFragment()
        val secondScreen = SecondFragment()
        val thirdScreen = ThirdFragment()
        return listOf(firstScreen, secondScreen, thirdScreen)
    }
}