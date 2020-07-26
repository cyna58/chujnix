package pl.bykowski.kotlinspringbootapiexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringbootApiExampleApplication

fun main(args: Array<String>) {
    runApplication<KotlinSpringbootApiExampleApplication>(*args)
}
