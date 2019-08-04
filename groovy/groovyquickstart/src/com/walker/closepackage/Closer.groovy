package closepackage


//闭包的定义和调用
def closer = { println "Hello groovy" }
closer()
closer.call()


//带单个参数的闭包和调用
def closer2 = { String name -> println "Hello ${name}" }
closer2("wusd")
closer2.call("wusd")

//带多个参数的闭包和调用
def closer3 = { name, sex, age -> println "Hello ${name} ${sex} ${age}" }
closer3("wusd", "男", 13)

//默认隐式参数it
def closer4 = { println "Hello ${it}" }
closer4('groovy')


