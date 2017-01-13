package org.addictive.science.service

import org.addictive.science.model.Greeting

object Main {

  def main( args : Array[ String ] ) = {
    val g = Greeting( "hello world" )
    println( g.text )
  }

}
