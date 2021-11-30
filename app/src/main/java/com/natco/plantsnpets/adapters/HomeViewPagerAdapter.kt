package com.natco.plantsnpets.adapters
/*
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.natco.plantsnpets.view.home.fragment.SearchFragment
import com.natco.plantsnpets.view.home.fragment.SuggestionFragment

const val MY_SEARCH_PAGE_INDEX = 0
const val MY_SUGGESTION_PAGE_INDEX = 1

class HomeViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    /**
     * Mapping of the ViewPager page indexes to their respective Fragments
     */
    private val tabFragmentsCreators: Map<Int, () -> Fragment> = mapOf(
        MY_SEARCH_PAGE_INDEX to { SearchFragment() },
        MY_SUGGESTION_PAGE_INDEX to { SuggestionFragment() }
    )

    override fun getItemCount() = tabFragmentsCreators.size

    override fun createFragment(position: Int): Fragment {
        return tabFragmentsCreators[position]?.invoke() ?: throw IndexOutOfBoundsException()
    }
}*/