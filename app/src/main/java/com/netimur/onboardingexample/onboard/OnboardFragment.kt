package com.netimur.onboardingexample.onboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.netimur.onboardingexample.databinding.FragmentOnboardBinding
import com.netimur.onboardingexample.onboard.pagetransformer.ZoomOutPageTransformer
import com.netimur.onboardingexample.onboard.repository.OnBoardScreensRepository
import com.netimur.onboardingexample.onboard.repository.ViewPager2ScreensRepository


class OnboardFragment : Fragment() {
    private lateinit var binding: FragmentOnboardBinding
    private lateinit var pager: ViewPager2


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnboardBinding.inflate(inflater, container, false)
        val view: View = binding.root
        pager = binding.pager
        val screensRepository: ViewPager2ScreensRepository = OnBoardScreensRepository()
        val screens = screensRepository.getScreens()
        pager.adapter = OnBoardAdapter(this, screens)
        val pageTransformer = ZoomOutPageTransformer()
        pager.setPageTransformer(pageTransformer)
        val indicator = binding.indicator
        indicator.setViewPager(pager)
        return view
    }

}