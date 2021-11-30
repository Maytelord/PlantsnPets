package com.natco.plantsnpets.ui.theme

import androidx.compose.foundation.layout.padding
import androidx.compose.material.SnackbarHost
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.navArgument
import com.google.accompanist.insets.ProvideWindowInsets
import com.google.accompanist.insets.systemBarsPadding
import com.natco.composeexampleapp.ui.theme.PlantsnPetsTheme
import com.natco.plantsnpets.ui.MainDestinations
import com.natco.plantsnpets.ui.components.JetsnackScaffold
import com.natco.plantsnpets.ui.components.PlantsnPetsSnackbar
import com.natco.plantsnpets.ui.home.HomeSections
import com.natco.plantsnpets.ui.home.PlantsnPetsBottomBar
import com.natco.plantsnpets.ui.home.addHomeGraph
import com.natco.plantsnpets.ui.remembePlantsnPetsAppState

@Composable
fun PlantsnPetsApp() {
    ProvideWindowInsets {
        PlantsnPetsTheme {
            val appState = remembePlantsnPetsAppState()
            JetsnackScaffold(
                bottomBar = {
                    if (appState.shouldShowBottomBar) {
                        PlantsnPetsBottomBar(
                            tabs = appState.bottomBarTabs,
                            currentRoute = appState.currentRoute!!,
                            navigateToRoute = appState::navigateToBottomBarRoute
                        )
                    }
                },
                snackbarHost = {
                    SnackbarHost(
                        hostState = it,
                        modifier = Modifier.systemBarsPadding(),
                        snackbar = { snackbarData -> PlantsnPetsSnackbar(snackbarData) }
                    )
                },
                scaffoldState = appState.scaffoldState
            ) { innerPaddingModifier ->
                NavHost(
                    navController = appState.navController,
                    startDestination = MainDestinations.HOME_ROUTE,
                    modifier = Modifier.padding(innerPaddingModifier)
                ) {
                    jetsnackNavGraph(
                        onSnackSelected = appState::navigateToSnackDetail,
                        upPress = appState::upPress
                    )
                }
            }
        }
    }
}

private fun NavGraphBuilder.jetsnackNavGraph(
    onSnackSelected: (Long, NavBackStackEntry) -> Unit,
    upPress: () -> Unit
) {
    navigation(
        route = MainDestinations.HOME_ROUTE,
        startDestination = HomeSections.SEARCH.route
    ) {
        addHomeGraph(onSnackSelected)
    }
    composable(
        "${MainDestinations.SNACK_DETAIL_ROUTE}/{${MainDestinations.SNACK_ID_KEY}}",
        arguments = listOf(navArgument(MainDestinations.SNACK_ID_KEY) { type = NavType.LongType })
    ) { backStackEntry ->
        val arguments = requireNotNull(backStackEntry.arguments)
        val snackId = arguments.getLong(MainDestinations.SNACK_ID_KEY)
        //SnackDetail(snackId, upPress)
    }
}