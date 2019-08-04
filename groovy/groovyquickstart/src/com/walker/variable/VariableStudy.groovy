def x = 123
println x
println x.class

def y = "hello world"
println y
println y.class

x = y
println x
println x.class

def str
println str == "Are you kidding me?"

def sum = "The sum of 2 and 3 equals ${2 + 3}" //可扩展做任意的表达式
println sum

echo(sum)

String echo(String gString) {
    println gString
}

def value = 'groovy'
echo(value)

println value.center(8, 'A')
println value.center(8)
