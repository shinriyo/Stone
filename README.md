## chapter5

```
even = 0
odd = 0
i = 0
while i < 10 {          // even number?
    if i % 2 == 0 {
        even = even + i
    } else {
        odd = odd + i
    }
    i = i + 1
}
even + odd
```

## chapter6

### List6.6

```
sum = 0
i = 1
while i < 10 {
    sum = sum + i
    i = i + 1
}
sum
```

## chap7

def fact (n) {
    f = 1
    while m > 0 {
    f
    }
}

### 7.12

```
def fib (n) {
    if n < 2 {
        n
    } else {
        fib(n - 1) + fib(n - 2)
    }
}
fib(10)
```

### 7.5

inc = fun (x) { x + 1 }
inc(3)

### p113

```
def counter (c) {
    fun () { c = c + 1 }
}

c1 = counter(0)
c2 = counter(0);
c1()
c1()
c2()
```

### 7.12

```
def fib (n) {
    if n < 2 {
        n
    } else {
        fib(n - 1) + fib(n - 2)
    }
}
fib(10)
```
### P118

```
x = 1
def foo (i) { x = i; x + x }
```

### 8.8

```
def fib (n) {
    if n < 2 {
        n
    } else {
        fib(n - 1) + fib(n - 2)
    }
}
t = currentTime()
fib 15
print currentTime() - t + " msec"
```

### 9.1
```
class Position {
    x = y = 0
    def move(nx, ny) {
        x = nx; y = ny
    }
}
p = Position.new
p.move(3, 4)
p.x = 10
print p.x + p.y
```

### P140

```
def position () {
    x = y = 0
    fun (nx, ny) {
        x = nx; y = ny
    }
}
```

### P146

```
a["apple"] = 100
```

### 10.1

```
a = [2, 3, 4]
print a[1]
a[1] = "three"
print "a[1]: " + a[1]
b = [["one", 1], ["two", 2]]
print b[0][1] + ": " + b[1][1]
b = [["one", 1], ["two", 2]]
```

### 11.8 Ruby

```
def fib (n)
    if n < 2
        n
    else
        fib(n - 1) + fib(n - 2)
    end
end
t = Time.now; fib(33); puts Time.now - t
```

### Stone版

```
def fib (n) {
    if n < 2 {
        n
    } else {
        fib(n - 1) + fib(n - 2)
    }
}
t = currentTime(); fib(33); print currentTime() - t
```

### 12.11

```
class Fib {
    fib0 = 0
    fib1 = 1
    def fib (n) {
        if n == 0 {
            fib0
        } else {
            if n == 0 {
                this.fib1
            } else {
                fib(n - 1) + this.fib(n - 2)
            }
        }
    }
}
t = currentTime()
f = Fib.new
f.fib(33)
print currentTime() - t + " msec"
```

### P181

```
class Position {
    x = y = 1
    def xmove(dx) { x = x + dx }
}
class Position3D extends Position {
    z = 1
}
```
