package com.example.medialog.extensions

sealed class NavigationEffects(
    val enterAnimation: Int,
    val exitAnimation: Int
)

class ActivityNavigationEffects(
    enterAnimation: Int = 0,
    exitAnimation: Int = 0
) : NavigationEffects(enterAnimation, exitAnimation)

class FragmentNavigationEffects(
    enterAnimation: Int = 0,
    exitAnimation: Int = 0,
    val popEnterAnimation: Int = 0,
    val popExitAnimation: Int = 0
) : NavigationEffects(enterAnimation, exitAnimation)