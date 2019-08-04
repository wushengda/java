def x = 1.23
def result
switch (x)
{
    case 'foo':
        result = 'found foo'
        break
    case 'bar':
        result = 'bar'
        break
    case [1.23,4,5,6,'inlist']://列表
        result = 'list'
        break
    case 12..30:
        result = 'range' //范围
        break
    case Integer:
        result = 'integer'
        break
}

println result

def sum = 0
for (i in 0..9) 
{
    sum += i
}
println sum

//数组的循环
for (i in [1, 2, 3, 4, 5, 6, 7, 8, 9]) 
{
    sum += i
}
println sum

//List的循环用法
for (i in [key1: 1, key4: 2, key122: 3]) 
{
    //直接取key和value
    println(i.key + ":" + i.value)
}