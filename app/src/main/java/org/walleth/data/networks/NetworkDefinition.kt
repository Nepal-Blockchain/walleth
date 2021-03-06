package org.walleth.data.networks

import org.walleth.data.blockexplorer.BlockExplorer

interface NetworkDefinition {
    fun getNetworkName(): String
    fun getBlockExplorer(): BlockExplorer
    val chainId: Long
    val genesis: String
    val bootNodes: List<String>
}