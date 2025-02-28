package com.samsong.rewardWeb

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import java.util.*


@SpringBootApplication
class RewardWebApplication

fun main(args: Array<String>) {
	runApplication<RewardWebApplication>(*args)
}

@Bean
fun commandLineRunner(ctx: ApplicationContext): CommandLineRunner {
	return CommandLineRunner { args: Array<String?>? ->
		println("inspect all beans")
		val beanNames = ctx.beanDefinitionNames
		Arrays.sort(beanNames)
		for (beanName in beanNames) {
			println(beanName)
		}
	}
}
