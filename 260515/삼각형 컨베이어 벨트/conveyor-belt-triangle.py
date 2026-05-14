n, t = map(int, input().split())

l = list(map(int, input().split()))
r = list(map(int, input().split()))
d = list(map(int, input().split()))

# Please write your code here.
tl = l[:]
tr = r[:]
td = d[:]

for i in range(t):
    l = td[-1:] + tl[:-1]
    r = tl[-1:] + tr[:-1]
    d = tr[-1:] + td[:-1]

    tl = l[:]
    tr = r[:]
    td = d[:]


for i in range(n):
    print(l[i], end = ' ')
print()
for i in range(n):
    print(r[i], end = ' ')
print()
for i in range(n):
    print(d[i], end = ' ') 